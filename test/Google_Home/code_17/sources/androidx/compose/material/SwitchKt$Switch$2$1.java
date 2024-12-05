package androidx.compose.material;

import O5.I;
import O5.x;
import P5.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$2$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$1(AnchoredDraggableState<Boolean> anchoredDraggableState, float f8, float f9) {
        super(0);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$minBound = f8;
        this.$maxBound = f9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1373invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1373invoke() {
        AnchoredDraggableState.updateAnchors$material_release$default(this.$anchoredDraggableState, Q.k(x.a(Boolean.FALSE, Float.valueOf(this.$minBound)), x.a(Boolean.TRUE, Float.valueOf(this.$maxBound))), null, 2, null);
    }
}
