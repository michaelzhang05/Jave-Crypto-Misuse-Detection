package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final X5.o measure;

    public LayoutElement(X5.o oVar) {
        this.measure = oVar;
    }

    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, X5.o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            oVar = layoutElement.measure;
        }
        return layoutElement.copy(oVar);
    }

    public final X5.o component1() {
        return this.measure;
    }

    public final LayoutElement copy(X5.o oVar) {
        return new LayoutElement(oVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC3159y.d(this.measure, ((LayoutElement) obj).measure);
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
        inspectorInfo.setName(TtmlNode.TAG_LAYOUT);
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
