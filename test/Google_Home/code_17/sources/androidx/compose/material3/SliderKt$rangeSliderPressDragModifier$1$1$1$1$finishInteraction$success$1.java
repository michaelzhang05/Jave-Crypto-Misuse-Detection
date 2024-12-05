package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ O $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<InterfaceC1668n> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1(State<? extends InterfaceC1668n> state, O o8, boolean z8) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = o8;
        this.$isRtl = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return I.f8278a;
    }

    public final void invoke(PointerInputChange it) {
        AbstractC3255y.i(it, "it");
        float m2740getXimpl = Offset.m2740getXimpl(PointerEventKt.positionChange(it));
        InterfaceC1668n value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.f34158a);
        if (this.$isRtl) {
            m2740getXimpl = -m2740getXimpl;
        }
        value.invoke(valueOf, Float.valueOf(m2740getXimpl));
    }
}
