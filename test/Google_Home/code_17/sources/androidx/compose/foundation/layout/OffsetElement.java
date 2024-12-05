package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final Function1 inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private final float f14553x;

    /* renamed from: y, reason: collision with root package name */
    private final float f14554y;

    public /* synthetic */ OffsetElement(float f8, float f9, boolean z8, Function1 function1, AbstractC3247p abstractC3247p) {
        this(f8, f9, z8, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && Dp.m5188equalsimpl0(this.f14553x, offsetElement.f14553x) && Dp.m5188equalsimpl0(this.f14554y, offsetElement.f14554y) && this.rtlAware == offsetElement.rtlAware) {
            return true;
        }
        return false;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m561getXD9Ej5fM() {
        return this.f14553x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m562getYD9Ej5fM() {
        return this.f14554y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m5189hashCodeimpl(this.f14553x) * 31) + Dp.m5189hashCodeimpl(this.f14554y)) * 31) + androidx.compose.foundation.a.a(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m5194toStringimpl(this.f14553x)) + ", y=" + ((Object) Dp.m5194toStringimpl(this.f14554y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetElement(float f8, float f9, boolean z8, Function1 inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "inspectorInfo");
        this.f14553x = f8;
        this.f14554y = f9;
        this.rtlAware = z8;
        this.inspectorInfo = inspectorInfo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.f14553x, this.f14554y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode node) {
        AbstractC3255y.i(node, "node");
        node.m569setX0680j_4(this.f14553x);
        node.m570setY0680j_4(this.f14554y);
        node.setRtlAware(this.rtlAware);
    }
}
