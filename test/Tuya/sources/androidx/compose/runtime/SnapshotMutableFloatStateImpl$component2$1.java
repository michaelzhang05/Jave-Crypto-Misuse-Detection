package androidx.compose.runtime;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SnapshotMutableFloatStateImpl$component2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ SnapshotMutableFloatStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableFloatStateImpl$component2$1(SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl) {
        super(1);
        this.this$0 = snapshotMutableFloatStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f6487a;
    }

    public final void invoke(float f8) {
        this.this$0.setFloatValue(f8);
    }
}
