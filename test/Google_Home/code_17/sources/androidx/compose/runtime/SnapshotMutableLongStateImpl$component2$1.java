package androidx.compose.runtime;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SnapshotMutableLongStateImpl$component2$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ SnapshotMutableLongStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableLongStateImpl$component2$1(SnapshotMutableLongStateImpl snapshotMutableLongStateImpl) {
        super(1);
        this.this$0 = snapshotMutableLongStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return I.f8278a;
    }

    public final void invoke(long j8) {
        this.this$0.setLongValue(j8);
    }
}
