package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import i6.AbstractC2829k;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class FocusableNode extends DelegatingNode implements FocusEventModifierNode, LayoutAwareModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode {
    private final BringIntoViewRequester bringIntoViewRequester;
    private final BringIntoViewRequesterNode bringIntoViewRequesterNode;
    private FocusState focusState;
    private final FocusableInteractionNode focusableInteractionNode;
    private final FocusableSemanticsNode focusableSemanticsNode = (FocusableSemanticsNode) delegate(new FocusableSemanticsNode());
    private final FocusablePinnableContainerNode focusablePinnableContainer = (FocusablePinnableContainerNode) delegate(new FocusablePinnableContainerNode());
    private final FocusedBoundsNode focusedBoundsNode = (FocusedBoundsNode) delegate(new FocusedBoundsNode());

    public FocusableNode(MutableInteractionSource mutableInteractionSource) {
        this.focusableInteractionNode = (FocusableInteractionNode) delegate(new FocusableInteractionNode(mutableInteractionSource));
        BringIntoViewRequester BringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
        this.bringIntoViewRequester = BringIntoViewRequester;
        this.bringIntoViewRequesterNode = (BringIntoViewRequesterNode) delegate(new BringIntoViewRequesterNode(BringIntoViewRequester));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AbstractC3159y.i(semanticsPropertyReceiver, "<this>");
        this.focusableSemanticsNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return h.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        AbstractC3159y.i(focusState, "focusState");
        if (!AbstractC3159y.d(this.focusState, focusState)) {
            boolean isFocused = focusState.isFocused();
            if (isFocused) {
                AbstractC2829k.d(getCoroutineScope(), null, null, new FocusableNode$onFocusEvent$1(this, null), 3, null);
            }
            if (isAttached()) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            this.focusableInteractionNode.setFocus(isFocused);
            this.focusedBoundsNode.setFocus(isFocused);
            this.focusablePinnableContainer.setFocus(isFocused);
            this.focusableSemanticsNode.setFocus(isFocused);
            this.focusState = focusState;
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        AbstractC3159y.i(coordinates, "coordinates");
        this.focusedBoundsNode.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        AbstractC3159y.i(coordinates, "coordinates");
        this.bringIntoViewRequesterNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public /* synthetic */ void mo337onRemeasuredozmzZPI(long j8) {
        androidx.compose.ui.node.c.b(this, j8);
    }

    public final void update(MutableInteractionSource mutableInteractionSource) {
        this.focusableInteractionNode.update(mutableInteractionSource);
    }
}
