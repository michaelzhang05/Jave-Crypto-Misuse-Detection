package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ O $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<n> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1(State<? extends n> state, O o8, boolean z8) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = o8;
        this.$isRtl = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return I.f6487a;
    }

    public final void invoke(PointerInputChange it) {
        AbstractC3159y.i(it, "it");
        float m2735getXimpl = Offset.m2735getXimpl(PointerEventKt.positionChange(it));
        n value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.f33757a);
        if (this.$isRtl) {
            m2735getXimpl = -m2735getXimpl;
        }
        value.invoke(valueOf, Float.valueOf(m2735getXimpl));
    }
}
