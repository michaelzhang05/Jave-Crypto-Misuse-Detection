package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class ClickableNode extends AbstractClickableNode {
    private final ClickablePointerInputNode clickablePointerInputNode;
    private final ClickableSemanticsNode clickableSemanticsNode;

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, AbstractC3151p abstractC3151p) {
        this(mutableInteractionSource, z8, str, role, function0);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    /* renamed from: update-XHw0xAI, reason: not valid java name */
    public final void m324updateXHw0xAI(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick) {
        AbstractC3159y.i(interactionSource, "interactionSource");
        AbstractC3159y.i(onClick, "onClick");
        m267updateCommonXHw0xAI(interactionSource, z8, str, role, onClick);
        getClickableSemanticsNode().m327updateUMe6uN4(z8, str, role, onClick, null, null);
        getClickablePointerInputNode().update(z8, interactionSource, onClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ClickableNode(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick) {
        super(interactionSource, z8, str, role, onClick, null);
        AbstractC3159y.i(interactionSource, "interactionSource");
        AbstractC3159y.i(onClick, "onClick");
        this.clickableSemanticsNode = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z8, str, role, onClick, null, null, null));
        this.clickablePointerInputNode = (ClickablePointerInputNode) delegate(new ClickablePointerInputNode(z8, interactionSource, onClick, getInteractionData()));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public ClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }
}
