package androidx.compose.foundation;

import L5.I;
import P5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode(boolean z8, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData) {
        super(z8, interactionSource, onClick, interactionData, null);
        AbstractC3159y.i(interactionSource, "interactionSource");
        AbstractC3159y.i(onClick, "onClick");
        AbstractC3159y.i(interactionData, "interactionData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    public Object pointerInput(PointerInputScope pointerInputScope, d dVar) {
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m5350getCenterozmzZPI = IntSizeKt.m5350getCenterozmzZPI(pointerInputScope.mo4042getSizeYbymL2g());
        interactionData.m269setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m5302getXimpl(m5350getCenterozmzZPI), IntOffset.m5303getYimpl(m5350getCenterozmzZPI)));
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickablePointerInputNode$pointerInput$2(this, null), new ClickablePointerInputNode$pointerInput$3(this), dVar);
        if (detectTapAndPress == Q5.b.e()) {
            return detectTapAndPress;
        }
        return I.f6487a;
    }

    public final void update(boolean z8, MutableInteractionSource interactionSource, Function0 onClick) {
        AbstractC3159y.i(interactionSource, "interactionSource");
        AbstractC3159y.i(onClick, "onClick");
        setEnabled(z8);
        setOnClick(onClick);
        setInteractionSource(interactionSource);
    }
}
