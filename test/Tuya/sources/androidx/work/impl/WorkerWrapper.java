package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import x0.InterfaceFutureC3857a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class WorkerWrapper implements Runnable {
    static final String TAG = Logger.tagWithPrefix("WorkerWrapper");
    Context mAppContext;
    private Clock mClock;
    private Configuration mConfiguration;
    private DependencyDao mDependencyDao;
    private ForegroundProcessor mForegroundProcessor;
    private WorkerParameters.RuntimeExtras mRuntimeExtras;
    private List<String> mTags;
    private WorkDatabase mWorkDatabase;
    private String mWorkDescription;
    WorkSpec mWorkSpec;
    private WorkSpecDao mWorkSpecDao;
    private final String mWorkSpecId;
    TaskExecutor mWorkTaskExecutor;
    ListenableWorker mWorker;

    @NonNull
    ListenableWorker.Result mResult = ListenableWorker.Result.failure();

    @NonNull
    SettableFuture<Boolean> mFuture = SettableFuture.create();

    @NonNull
    final SettableFuture<ListenableWorker.Result> mWorkerResultFuture = SettableFuture.create();
    private volatile int mInterrupted = -256;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class Builder {

        @NonNull
        Context mAppContext;

        @NonNull
        Configuration mConfiguration;

        @NonNull
        ForegroundProcessor mForegroundProcessor;

        @NonNull
        WorkerParameters.RuntimeExtras mRuntimeExtras = new WorkerParameters.RuntimeExtras();
        private final List<String> mTags;

        @NonNull
        WorkDatabase mWorkDatabase;

        @NonNull
        WorkSpec mWorkSpec;

        @NonNull
        TaskExecutor mWorkTaskExecutor;

        @Nullable
        ListenableWorker mWorker;

        @SuppressLint({"LambdaLast"})
        public Builder(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull ForegroundProcessor foregroundProcessor, @NonNull WorkDatabase workDatabase, @NonNull WorkSpec workSpec, @NonNull List<String> list) {
            this.mAppContext = context.getApplicationContext();
            this.mWorkTaskExecutor = taskExecutor;
            this.mForegroundProcessor = foregroundProcessor;
            this.mConfiguration = configuration;
            this.mWorkDatabase = workDatabase;
            this.mWorkSpec = workSpec;
            this.mTags = list;
        }

        @NonNull
        public WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        @NonNull
        public Builder withRuntimeExtras(@Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.mRuntimeExtras = runtimeExtras;
            }
            return this;
        }

        @NonNull
        @VisibleForTesting
        public Builder withWorker(@NonNull ListenableWorker listenableWorker) {
            this.mWorker = listenableWorker;
            return this;
        }
    }

    WorkerWrapper(@NonNull Builder builder) {
        this.mAppContext = builder.mAppContext;
        this.mWorkTaskExecutor = builder.mWorkTaskExecutor;
        this.mForegroundProcessor = builder.mForegroundProcessor;
        WorkSpec workSpec = builder.mWorkSpec;
        this.mWorkSpec = workSpec;
        this.mWorkSpecId = workSpec.id;
        this.mRuntimeExtras = builder.mRuntimeExtras;
        this.mWorker = builder.mWorker;
        Configuration configuration = builder.mConfiguration;
        this.mConfiguration = configuration;
        this.mClock = configuration.getClock();
        WorkDatabase workDatabase = builder.mWorkDatabase;
        this.mWorkDatabase = workDatabase;
        this.mWorkSpecDao = workDatabase.workSpecDao();
        this.mDependencyDao = this.mWorkDatabase.dependencyDao();
        this.mTags = builder.mTags;
    }

    private String createWorkDescription(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.mWorkSpecId);
        sb.append(", tags={ ");
        boolean z8 = true;
        for (String str : list) {
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            Logger.get().info(TAG, "Worker result SUCCESS for " + this.mWorkDescription);
            if (this.mWorkSpec.isPeriodic()) {
                resetPeriodicAndResolve();
                return;
            } else {
                setSucceededAndResolve();
                return;
            }
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            Logger.get().info(TAG, "Worker result RETRY for " + this.mWorkDescription);
            rescheduleAndResolve();
            return;
        }
        Logger.get().info(TAG, "Worker result FAILURE for " + this.mWorkDescription);
        if (this.mWorkSpec.isPeriodic()) {
            resetPeriodicAndResolve();
        } else {
            setFailedAndResolve();
        }
    }

    private void iterativelyFailWorkAndDependents(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.mWorkSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.mWorkSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.mDependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWorker$0(InterfaceFutureC3857a interfaceFutureC3857a) {
        if (this.mWorkerResultFuture.isCancelled()) {
            interfaceFutureC3857a.cancel(true);
        }
    }

    private void rescheduleAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.setLastEnqueueTime(this.mWorkSpecId, this.mClock.currentTimeMillis());
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(true);
        }
    }

    private void resetPeriodicAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setLastEnqueueTime(this.mWorkSpecId, this.mClock.currentTimeMillis());
            this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.resetWorkSpecRunAttemptCount(this.mWorkSpecId);
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.incrementPeriodCount(this.mWorkSpecId);
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    private void resolve(boolean z8) {
        this.mWorkDatabase.beginTransaction();
        try {
            if (!this.mWorkDatabase.workSpecDao().hasUnfinishedWork()) {
                PackageManagerHelper.setComponentEnabled(this.mAppContext, RescheduleReceiver.class, false);
            }
            if (z8) {
                this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
                this.mWorkSpecDao.setStopReason(this.mWorkSpecId, this.mInterrupted);
                this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            this.mFuture.set(Boolean.valueOf(z8));
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    private void resolveIncorrectStatus() {
        WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
        if (state == WorkInfo.State.RUNNING) {
            Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is RUNNING; not doing any work and rescheduling for later execution");
            resolve(true);
            return;
        }
        Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is " + state + " ; not doing any work");
        resolve(false);
    }

    private void runWorker() {
        Data merge;
        if (tryCheckForInterruptionAndResolve()) {
            return;
        }
        this.mWorkDatabase.beginTransaction();
        try {
            WorkSpec workSpec = this.mWorkSpec;
            if (workSpec.state != WorkInfo.State.ENQUEUED) {
                resolveIncorrectStatus();
                this.mWorkDatabase.setTransactionSuccessful();
                Logger.get().debug(TAG, this.mWorkSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((workSpec.isPeriodic() || this.mWorkSpec.isBackedOff()) && this.mClock.currentTimeMillis() < this.mWorkSpec.calculateNextRunTime()) {
                Logger.get().debug(TAG, String.format("Delaying execution for %s because it is being executed before schedule.", this.mWorkSpec.workerClassName));
                resolve(true);
                this.mWorkDatabase.setTransactionSuccessful();
                return;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            if (this.mWorkSpec.isPeriodic()) {
                merge = this.mWorkSpec.input;
            } else {
                InputMerger createInputMergerWithDefaultFallback = this.mConfiguration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.mWorkSpec.inputMergerClassName);
                if (createInputMergerWithDefaultFallback == null) {
                    Logger.get().error(TAG, "Could not create Input Merger " + this.mWorkSpec.inputMergerClassName);
                    setFailedAndResolve();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.mWorkSpec.input);
                arrayList.addAll(this.mWorkSpecDao.getInputsFromPrerequisites(this.mWorkSpecId));
                merge = createInputMergerWithDefaultFallback.merge(arrayList);
            }
            Data data = merge;
            UUID fromString = UUID.fromString(this.mWorkSpecId);
            List<String> list = this.mTags;
            WorkerParameters.RuntimeExtras runtimeExtras = this.mRuntimeExtras;
            WorkSpec workSpec2 = this.mWorkSpec;
            WorkerParameters workerParameters = new WorkerParameters(fromString, data, list, runtimeExtras, workSpec2.runAttemptCount, workSpec2.getGeneration(), this.mConfiguration.getExecutor(), this.mWorkTaskExecutor, this.mConfiguration.getWorkerFactory(), new WorkProgressUpdater(this.mWorkDatabase, this.mWorkTaskExecutor), new WorkForegroundUpdater(this.mWorkDatabase, this.mForegroundProcessor, this.mWorkTaskExecutor));
            if (this.mWorker == null) {
                this.mWorker = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mAppContext, this.mWorkSpec.workerClassName, workerParameters);
            }
            ListenableWorker listenableWorker = this.mWorker;
            if (listenableWorker == null) {
                Logger.get().error(TAG, "Could not create Worker " + this.mWorkSpec.workerClassName);
                setFailedAndResolve();
                return;
            }
            if (listenableWorker.isUsed()) {
                Logger.get().error(TAG, "Received an already-used Worker " + this.mWorkSpec.workerClassName + "; Worker Factory should return new instances");
                setFailedAndResolve();
                return;
            }
            this.mWorker.setUsed();
            if (trySetRunning()) {
                if (tryCheckForInterruptionAndResolve()) {
                    return;
                }
                WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.mAppContext, this.mWorkSpec, this.mWorker, workerParameters.getForegroundUpdater(), this.mWorkTaskExecutor);
                this.mWorkTaskExecutor.getMainThreadExecutor().execute(workForegroundRunnable);
                final InterfaceFutureC3857a future = workForegroundRunnable.getFuture();
                this.mWorkerResultFuture.addListener(new Runnable() { // from class: androidx.work.impl.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkerWrapper.this.lambda$runWorker$0(future);
                    }
                }, new SynchronousExecutor());
                future.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (WorkerWrapper.this.mWorkerResultFuture.isCancelled()) {
                            return;
                        }
                        try {
                            future.get();
                            Logger.get().debug(WorkerWrapper.TAG, "Starting work for " + WorkerWrapper.this.mWorkSpec.workerClassName);
                            WorkerWrapper workerWrapper = WorkerWrapper.this;
                            workerWrapper.mWorkerResultFuture.setFuture(workerWrapper.mWorker.startWork());
                        } catch (Throwable th) {
                            WorkerWrapper.this.mWorkerResultFuture.setException(th);
                        }
                    }
                }, this.mWorkTaskExecutor.getMainThreadExecutor());
                final String str = this.mWorkDescription;
                this.mWorkerResultFuture.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                ListenableWorker.Result result = WorkerWrapper.this.mWorkerResultFuture.get();
                                if (result == null) {
                                    Logger.get().error(WorkerWrapper.TAG, WorkerWrapper.this.mWorkSpec.workerClassName + " returned a null result. Treating it as a failure.");
                                } else {
                                    Logger.get().debug(WorkerWrapper.TAG, WorkerWrapper.this.mWorkSpec.workerClassName + " returned a " + result + ".");
                                    WorkerWrapper.this.mResult = result;
                                }
                            } catch (InterruptedException e8) {
                                e = e8;
                                Logger.get().error(WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                            } catch (CancellationException e9) {
                                Logger.get().info(WorkerWrapper.TAG, str + " was cancelled", e9);
                            } catch (ExecutionException e10) {
                                e = e10;
                                Logger.get().error(WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                            }
                            WorkerWrapper.this.onWorkFinished();
                        } catch (Throwable th) {
                            WorkerWrapper.this.onWorkFinished();
                            throw th;
                        }
                    }
                }, this.mWorkTaskExecutor.getSerialTaskExecutor());
                return;
            }
            resolveIncorrectStatus();
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    private void setSucceededAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(WorkInfo.State.SUCCEEDED, this.mWorkSpecId);
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, ((ListenableWorker.Result.Success) this.mResult).getOutputData());
            long currentTimeMillis = this.mClock.currentTimeMillis();
            for (String str : this.mDependencyDao.getDependentWorkIds(this.mWorkSpecId)) {
                if (this.mWorkSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.mDependencyDao.hasCompletedAllPrerequisites(str)) {
                    Logger.get().info(TAG, "Setting status to enqueued for " + str);
                    this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                    this.mWorkSpecDao.setLastEnqueueTime(str, currentTimeMillis);
                }
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            resolve(false);
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            resolve(false);
            throw th;
        }
    }

    private boolean tryCheckForInterruptionAndResolve() {
        if (this.mInterrupted == -256) {
            return false;
        }
        Logger.get().debug(TAG, "Work interrupted for " + this.mWorkDescription);
        if (this.mWorkSpecDao.getState(this.mWorkSpecId) == null) {
            resolve(false);
        } else {
            resolve(!r0.isFinished());
        }
        return true;
    }

    private boolean trySetRunning() {
        boolean z8;
        this.mWorkDatabase.beginTransaction();
        try {
            if (this.mWorkSpecDao.getState(this.mWorkSpecId) == WorkInfo.State.ENQUEUED) {
                this.mWorkSpecDao.setState(WorkInfo.State.RUNNING, this.mWorkSpecId);
                this.mWorkSpecDao.incrementWorkSpecRunAttemptCount(this.mWorkSpecId);
                this.mWorkSpecDao.setStopReason(this.mWorkSpecId, -256);
                z8 = true;
            } else {
                z8 = false;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            return z8;
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    @NonNull
    public InterfaceFutureC3857a getFuture() {
        return this.mFuture;
    }

    @NonNull
    public WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.mWorkSpec);
    }

    @NonNull
    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void interrupt(int i8) {
        this.mInterrupted = i8;
        tryCheckForInterruptionAndResolve();
        this.mWorkerResultFuture.cancel(true);
        if (this.mWorker != null && this.mWorkerResultFuture.isCancelled()) {
            this.mWorker.stop(i8);
            return;
        }
        Logger.get().debug(TAG, "WorkSpec " + this.mWorkSpec + " is already done. Not interrupting.");
    }

    void onWorkFinished() {
        if (!tryCheckForInterruptionAndResolve()) {
            this.mWorkDatabase.beginTransaction();
            try {
                WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
                this.mWorkDatabase.workProgressDao().delete(this.mWorkSpecId);
                if (state == null) {
                    resolve(false);
                } else if (state == WorkInfo.State.RUNNING) {
                    handleResult(this.mResult);
                } else if (!state.isFinished()) {
                    this.mInterrupted = WorkInfo.STOP_REASON_UNKNOWN;
                    rescheduleAndResolve();
                }
                this.mWorkDatabase.setTransactionSuccessful();
                this.mWorkDatabase.endTransaction();
            } catch (Throwable th) {
                this.mWorkDatabase.endTransaction();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        this.mWorkDescription = createWorkDescription(this.mTags);
        runWorker();
    }

    @VisibleForTesting
    void setFailedAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            iterativelyFailWorkAndDependents(this.mWorkSpecId);
            Data outputData = ((ListenableWorker.Result.Failure) this.mResult).getOutputData();
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, outputData);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }
}
