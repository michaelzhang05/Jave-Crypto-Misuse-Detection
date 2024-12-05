package androidx.work.impl;

import X5.r;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends C3156v implements r {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // X5.r
    public final List<Scheduler> invoke(Context p02, Configuration p12, TaskExecutor p22, WorkDatabase p32, Trackers p42, Processor p52) {
        List<Scheduler> createSchedulers;
        AbstractC3159y.i(p02, "p0");
        AbstractC3159y.i(p12, "p1");
        AbstractC3159y.i(p22, "p2");
        AbstractC3159y.i(p32, "p3");
        AbstractC3159y.i(p42, "p4");
        AbstractC3159y.i(p52, "p5");
        createSchedulers = WorkManagerImplExtKt.createSchedulers(p02, p12, p22, p32, p42, p52);
        return createSchedulers;
    }
}
