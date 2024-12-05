package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {
    private final Function1 block;

    public WithAlignmentLineBlockElement(Function1 block) {
        AbstractC3159y.i(block, "block");
        this.block = block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        WithAlignmentLineBlockElement withAlignmentLineBlockElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WithAlignmentLineBlockElement) {
            withAlignmentLineBlockElement = (WithAlignmentLineBlockElement) obj;
        } else {
            withAlignmentLineBlockElement = null;
        }
        if (withAlignmentLineBlockElement == null) {
            return false;
        }
        return AbstractC3159y.d(this.block, withAlignmentLineBlockElement.block);
    }

    public final Function1 getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SiblingsAlignedNode.WithAlignmentLineBlockNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SiblingsAlignedNode.WithAlignmentLineBlockNode node) {
        AbstractC3159y.i(node, "node");
        node.setBlock(this.block);
    }
}
