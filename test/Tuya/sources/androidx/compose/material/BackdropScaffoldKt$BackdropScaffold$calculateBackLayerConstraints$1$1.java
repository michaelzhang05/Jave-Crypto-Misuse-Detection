package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f8) {
        super(1);
        this.$headerHeightPx = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Constraints.m5134boximpl(m1118invokeZezNO4M(((Constraints) obj).m5152unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
    public final long m1118invokeZezNO4M(long j8) {
        return ConstraintsKt.m5163offsetNN6EwU$default(Constraints.m5137copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null), 0, -Z5.a.d(this.$headerHeightPx), 1, null);
    }
}
