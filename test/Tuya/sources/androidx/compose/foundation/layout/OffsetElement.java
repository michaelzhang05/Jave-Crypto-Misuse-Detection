package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final Function1 inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private final float f13754x;

    /* renamed from: y, reason: collision with root package name */
    private final float f13755y;

    public /* synthetic */ OffsetElement(float f8, float f9, boolean z8, Function1 function1, AbstractC3151p abstractC3151p) {
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
        if (offsetElement != null && Dp.m5183equalsimpl0(this.f13754x, offsetElement.f13754x) && Dp.m5183equalsimpl0(this.f13755y, offsetElement.f13755y) && this.rtlAware == offsetElement.rtlAware) {
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
    public final float m556getXD9Ej5fM() {
        return this.f13754x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m557getYD9Ej5fM() {
        return this.f13755y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m5184hashCodeimpl(this.f13754x) * 31) + Dp.m5184hashCodeimpl(this.f13755y)) * 31) + androidx.compose.foundation.a.a(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m5189toStringimpl(this.f13754x)) + ", y=" + ((Object) Dp.m5189toStringimpl(this.f13755y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetElement(float f8, float f9, boolean z8, Function1 inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "inspectorInfo");
        this.f13754x = f8;
        this.f13755y = f9;
        this.rtlAware = z8;
        this.inspectorInfo = inspectorInfo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.f13754x, this.f13755y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode node) {
        AbstractC3159y.i(node, "node");
        node.m564setX0680j_4(this.f13754x);
        node.m565setY0680j_4(this.f13755y);
        node.setRtlAware(this.rtlAware);
    }
}
