package androidx.compose.foundation.relocation;

import L5.I;
import L5.x;
import P5.d;
import Q5.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import i6.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class BringIntoViewResponderNode extends BringIntoViewChildNode implements BringIntoViewParent {
    private final ModifierLocalMap providedValues;
    private BringIntoViewResponder responder;

    public BringIntoViewResponderNode(BringIntoViewResponder responder) {
        AbstractC3159y.i(responder, "responder");
        this.responder = responder;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(x.a(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        Rect rect;
        Rect localRectOf;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null && (rect = (Rect) function0.invoke()) != null) {
            localRectOf = BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, rect);
            return localRectOf;
        }
        return null;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0 function0, d dVar) {
        Object e8 = N.e(new BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, function0, new BringIntoViewResponderNode$bringChildIntoView$parentRect$1(this, layoutCoordinates, function0), null), dVar);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewChildNode, androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        AbstractC3159y.i(bringIntoViewResponder, "<set-?>");
        this.responder = bringIntoViewResponder;
    }
}
