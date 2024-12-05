package androidx.compose.ui.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final InterfaceC1669o measure;

    public LayoutElement(InterfaceC1669o interfaceC1669o) {
        this.measure = interfaceC1669o;
    }

    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, InterfaceC1669o interfaceC1669o, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1669o = layoutElement.measure;
        }
        return layoutElement.copy(interfaceC1669o);
    }

    public final InterfaceC1669o component1() {
        return this.measure;
    }

    public final LayoutElement copy(InterfaceC1669o interfaceC1669o) {
        return new LayoutElement(interfaceC1669o);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC3255y.d(this.measure, ((LayoutElement) obj).measure);
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
