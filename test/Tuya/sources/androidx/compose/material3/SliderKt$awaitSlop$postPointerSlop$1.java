package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class SliderKt$awaitSlop$postPointerSlop$1 extends AbstractC3160z implements n {
    final /* synthetic */ P $initialDelta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(P p8) {
        super(2);
        this.$initialDelta = p8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PointerInputChange) obj, ((Number) obj2).floatValue());
        return I.f6487a;
    }

    public final void invoke(PointerInputChange pointerInput, float f8) {
        AbstractC3159y.i(pointerInput, "pointerInput");
        pointerInput.consume();
        this.$initialDelta.f33758a = f8;
    }
}
