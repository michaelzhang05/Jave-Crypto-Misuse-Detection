package androidx.work.impl;

import M5.AbstractC1239l;
import X5.r;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class WorkManagerImplExtKt$schedulers$1 extends AbstractC3160z implements r {
    final /* synthetic */ Scheduler[] $schedulers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerImplExtKt$schedulers$1(Scheduler[] schedulerArr) {
        super(6);
        this.$schedulers = schedulerArr;
    }

    @Override // X5.r
    public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        AbstractC3159y.i(context, "<anonymous parameter 0>");
        AbstractC3159y.i(configuration, "<anonymous parameter 1>");
        AbstractC3159y.i(taskExecutor, "<anonymous parameter 2>");
        AbstractC3159y.i(workDatabase, "<anonymous parameter 3>");
        AbstractC3159y.i(trackers, "<anonymous parameter 4>");
        AbstractC3159y.i(processor, "<anonymous parameter 5>");
        return AbstractC1239l.V0(this.$schedulers);
    }
}
