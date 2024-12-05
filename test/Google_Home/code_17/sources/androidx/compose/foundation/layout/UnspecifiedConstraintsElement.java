package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f8, float f9, AbstractC3247p abstractC3247p) {
        this(f8, f9);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!Dp.m5188equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) || !Dp.m5188equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight)) {
            return false;
        }
        return true;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m669getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m670getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Dp.m5189hashCodeimpl(this.minWidth) * 31) + Dp.m5189hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", Dp.m5181boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", Dp.m5181boximpl(this.minHeight));
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f8, float f9, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f9, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode node) {
        AbstractC3255y.i(node, "node");
        node.m674setMinWidth0680j_4(this.minWidth);
        node.m673setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f8, float f9) {
        this.minWidth = f8;
        this.minHeight = f9;
    }
}
