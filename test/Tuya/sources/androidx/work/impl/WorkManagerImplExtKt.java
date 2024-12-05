package androidx.work.impl;

import M5.AbstractC1246t;
import X5.r;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class WorkManagerImplExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler createBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        AbstractC3159y.h(createBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return AbstractC1246t.p(createBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        AbstractC3159y.h(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, r rVar, int i8, Object obj) {
        TaskExecutor taskExecutor2;
        WorkDatabase workDatabase2;
        Trackers trackers2;
        Processor processor2;
        r rVar2;
        if ((i8 & 4) != 0) {
            taskExecutor2 = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        } else {
            taskExecutor2 = taskExecutor;
        }
        if ((i8 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            AbstractC3159y.h(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            AbstractC3159y.h(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i8 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC3159y.h(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        if ((i8 & 32) != 0) {
            processor2 = new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase2);
        } else {
            processor2 = processor;
        }
        if ((i8 & 64) != 0) {
            rVar2 = WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE;
        } else {
            rVar2 = rVar;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase2, trackers2, processor2, rVar2);
    }

    public static final r schedulers(Scheduler... schedulers) {
        AbstractC3159y.i(schedulers, "schedulers");
        return new WorkManagerImplExtKt$schedulers$1(schedulers);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        AbstractC3159y.i(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        AbstractC3159y.i(workDatabase, "workDatabase");
        AbstractC3159y.i(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        AbstractC3159y.i(workDatabase, "workDatabase");
        AbstractC3159y.i(trackers, "trackers");
        AbstractC3159y.i(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, r schedulersCreator) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(workTaskExecutor, "workTaskExecutor");
        AbstractC3159y.i(workDatabase, "workDatabase");
        AbstractC3159y.i(trackers, "trackers");
        AbstractC3159y.i(processor, "processor");
        AbstractC3159y.i(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
