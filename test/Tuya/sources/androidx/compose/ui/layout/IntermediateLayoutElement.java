package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class IntermediateLayoutElement extends ModifierNodeElement<IntermediateLayoutModifierNode> {
    private final X5.o measure;

    public IntermediateLayoutElement(X5.o oVar) {
        this.measure = oVar;
    }

    public static /* synthetic */ IntermediateLayoutElement copy$default(IntermediateLayoutElement intermediateLayoutElement, X5.o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            oVar = intermediateLayoutElement.measure;
        }
        return intermediateLayoutElement.copy(oVar);
    }

    public final X5.o component1() {
        return this.measure;
    }

    public final IntermediateLayoutElement copy(X5.o oVar) {
        return new IntermediateLayoutElement(oVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntermediateLayoutElement) && AbstractC3159y.d(this.measure, ((IntermediateLayoutElement) obj).measure);
    }

    public final X5.o getMeasure() {
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
