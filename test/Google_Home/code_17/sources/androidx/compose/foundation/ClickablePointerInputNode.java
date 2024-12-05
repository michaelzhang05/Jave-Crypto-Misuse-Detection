package androidx.compose.foundation;

import O5.I;
import S5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode(boolean z8, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData) {
        super(z8, interactionSource, onClick, interactionData, null);
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(onClick, "onClick");
        AbstractC3255y.i(interactionData, "interactionData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    public Object pointerInput(PointerInputScope pointerInputScope, d dVar) {
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m5355getCenterozmzZPI = IntSizeKt.m5355getCenterozmzZPI(pointerInputScope.mo4047getSizeYbymL2g());
        interactionData.m274setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m5307getXimpl(m5355getCenterozmzZPI), IntOffset.m5308getYimpl(m5355getCenterozmzZPI)));
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickablePointerInputNode$pointerInput$2(this, null), new ClickablePointerInputNode$pointerInput$3(this), dVar);
        if (detectTapAndPress == T5.b.e()) {
            return detectTapAndPress;
        }
        return I.f8278a;
    }

    public final void update(boolean z8, MutableInteractionSource interactionSource, Function0 onClick) {
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(onClick, "onClick");
        setEnabled(z8);
        setOnClick(onClick);
        setInteractionSource(interactionSource);
    }
}
