package androidx.compose.runtime;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SnapshotMutableDoubleStateImpl$component2$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ SnapshotMutableDoubleStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableDoubleStateImpl$component2$1(SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl) {
        super(1);
        this.this$0 = snapshotMutableDoubleStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).doubleValue());
        return I.f8278a;
    }

    public final void invoke(double d8) {
        this.this$0.setDoubleValue(d8);
    }
}