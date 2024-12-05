package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;
    private final Function1 inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j8, long j9, Function1 function1, AbstractC3151p abstractC3151p) {
        this(alignmentLine, j8, j9, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetTextUnitElement) {
            alignmentLineOffsetTextUnitElement = (AlignmentLineOffsetTextUnitElement) obj;
        } else {
            alignmentLineOffsetTextUnitElement = null;
        }
        if (alignmentLineOffsetTextUnitElement != null && AbstractC3159y.d(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m5362equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m5362equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m498getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m499getBeforeXSAIIZE() {
        return this.before;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m5366hashCodeimpl(this.before)) * 31) + TextUnit.m5366hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j8, long j9, Function1 inspectorInfo) {
        AbstractC3159y.i(alignmentLine, "alignmentLine");
        AbstractC3159y.i(inspectorInfo, "inspectorInfo");
        this.alignmentLine = alignmentLine;
        this.before = j8;
        this.after = j9;
        this.inspectorInfo = inspectorInfo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetTextUnitNode node) {
        AbstractC3159y.i(node, "node");
        node.setAlignmentLine(this.alignmentLine);
        node.m503setBeforeR2X_6o(this.before);
        node.m502setAfterR2X_6o(this.after);
    }
}
