package androidx.compose.ui.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class IntermediateLayoutElement extends ModifierNodeElement<IntermediateLayoutModifierNode> {
    private final InterfaceC1669o measure;

    public IntermediateLayoutElement(InterfaceC1669o interfaceC1669o) {
        this.measure = interfaceC1669o;
    }

    public static /* synthetic */ IntermediateLayoutElement copy$default(IntermediateLayoutElement intermediateLayoutElement, InterfaceC1669o interfaceC1669o, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1669o = intermediateLayoutElement.measure;
        }
        return intermediateLayoutElement.copy(interfaceC1669o);
    }

    public final InterfaceC1669o component1() {
        return this.measure;
    }

    public final IntermediateLayoutElement copy(InterfaceC1669o interfaceC1669o) {
        return new IntermediateLayoutElement(interfaceC1669o);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntermediateLayoutElement) && AbstractC3255y.d(this.measure, ((IntermediateLayoutElement) obj).measure);
    }

    public final InterfaceC1669o getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("intermediateLayout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "IntermediateLayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntermediateLayoutModifierNode create() {
        return new IntermediateLayoutModifierNode(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntermediateLayoutModifierNode intermediateLayoutModifierNode) {
        intermediateLayoutModifierNode.setMeasureBlock$ui_release(this.measure);
    }
}
