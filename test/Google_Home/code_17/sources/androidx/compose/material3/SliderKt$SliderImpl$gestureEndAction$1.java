package androidx.compose.material3;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SliderKt$SliderImpl$gestureEndAction$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ Function0 $onValueChangeFinished;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$gestureEndAction$1(SliderDraggableState sliderDraggableState, Function0 function0) {
        super(0);
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1770invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1770invoke() {
        Function0 function0;
        if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
            return;
        }
        function0.invoke();
    }
}