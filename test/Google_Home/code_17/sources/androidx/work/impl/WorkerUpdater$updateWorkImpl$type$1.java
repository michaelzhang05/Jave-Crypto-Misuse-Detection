package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class WorkerUpdater$updateWorkImpl$type$1 extends AbstractC3256z implements Function1 {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(WorkSpec spec) {
        AbstractC3255y.i(spec, "spec");
        return spec.isPeriodic() ? "Periodic" : "OneTime";
    }
}
