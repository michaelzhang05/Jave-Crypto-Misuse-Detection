package androidx.compose.foundation.relocation;

import O5.I;
import S5.d;
import T5.b;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.AbstractC3255y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends BringIntoViewChildNode {
    private BringIntoViewRequester requester;

    public BringIntoViewRequesterNode(BringIntoViewRequester requester) {
        AbstractC3255y.i(requester, "requester");
        this.requester = requester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            AbstractC3255y.g(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    public final Object bringIntoView(Rect rect, d dVar) {
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return I.f8278a;
        }
        Object bringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new BringIntoViewRequesterNode$bringIntoView$2(rect, this), dVar);
        if (bringChildIntoView == b.e()) {
            return bringChildIntoView;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    public final void updateRequester(BringIntoViewRequester requester) {
        AbstractC3255y.i(requester, "requester");
        disposeRequester();
        if (requester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) requester).getModifiers().add(this);
        }
        this.requester = requester;
    }
}
