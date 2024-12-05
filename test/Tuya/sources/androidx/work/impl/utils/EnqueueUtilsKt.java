package androidx.work.impl.utils;

import M5.AbstractC1246t;
import android.os.Build;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class EnqueueUtilsKt {
    public static final void checkContentUriTriggerWorkerLimits(WorkDatabase workDatabase, Configuration configuration, WorkContinuationImpl continuation) {
        int i8;
        AbstractC3159y.i(workDatabase, "workDatabase");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(continuation, "continuation");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        List s8 = AbstractC1246t.s(continuation);
        int i9 = 0;
        while (!s8.isEmpty()) {
            WorkContinuationImpl workContinuationImpl = (WorkContinuationImpl) AbstractC1246t.P(s8);
            List<? extends WorkRequest> work = workContinuationImpl.getWork();
            AbstractC3159y.h(work, "current.work");
            List<? extends WorkRequest> list = work;
            if ((list instanceof Collection) && list.isEmpty()) {
                i8 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i8 = 0;
                while (it.hasNext()) {
                    if (((WorkRequest) it.next()).getWorkSpec().constraints.hasContentUriTriggers() && (i8 = i8 + 1) < 0) {
                        AbstractC1246t.v();
                    }
                }
            }
            i9 += i8;
            List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
            if (parents != null) {
                s8.addAll(parents);
            }
        }
        if (i9 == 0) {
            return;
        }
        int countNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (countNonFinishedContentUriTriggerWorkers + i9 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + countNonFinishedContentUriTriggerWorkers + ";\ncurrent enqueue operation count: " + i9 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final WorkSpec tryDelegateConstrainedWorkSpec(WorkSpec workSpec) {
        AbstractC3159y.i(workSpec, "workSpec");
        Constraints constraints = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (AbstractC3159y.d(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.requiresBatteryNotLow() && !constraints.requiresStorageNotLow()) {
            return workSpec;
        }
        Data build = new Data.Builder().putAll(workSpec.input).putString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        AbstractC3159y.h(build, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        AbstractC3159y.h(name, "name");
        return WorkSpec.copy$default(workSpec, null, null, name, null, build, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388587, null);
    }

    private static final boolean usesScheduler(List<? extends Scheduler> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            List<? extends Scheduler> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((Scheduler) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final WorkSpec wrapInConstraintTrackingWorkerIfNeeded(List<? extends Scheduler> schedulers, WorkSpec workSpec) {
        AbstractC3159y.i(schedulers, "schedulers");
        AbstractC3159y.i(workSpec, "workSpec");
        int i8 = Build.VERSION.SDK_INT;
        if (23 <= i8 && i8 < 26) {
            return tryDelegateConstrainedWorkSpec(workSpec);
        }
        if (i8 <= 22 && usesScheduler(schedulers, Schedulers.GCM_SCHEDULER)) {
            return tryDelegateConstrainedWorkSpec(workSpec);
        }
        return workSpec;
    }
}
