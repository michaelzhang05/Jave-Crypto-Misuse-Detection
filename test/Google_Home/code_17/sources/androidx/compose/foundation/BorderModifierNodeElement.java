package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    private final Brush brush;
    private final Shape shape;
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f8, Brush brush, Shape shape, AbstractC3247p abstractC3247p) {
        this(f8, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m307copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f8, Brush brush, Shape shape, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = borderModifierNodeElement.width;
        }
        if ((i8 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i8 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m309copy8Feqmps(f8, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m308component1D9Ej5fM() {
        return this.width;
    }

    public final Brush component2() {
        return this.brush;
    }

    public final Shape component3() {
        return this.shape;
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m309copy8Feqmps(float f8, Brush brush, Shape shape) {
        AbstractC3255y.i(brush, "brush");
        AbstractC3255y.i(shape, "shape");
        return new BorderModifierNodeElement(f8, brush, shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.m5188equalsimpl0(this.width, borderModifierNodeElement.width) && AbstractC3255y.d(this.brush, borderModifierNodeElement.brush) && AbstractC3255y.d(this.shape, borderModifierNodeElement.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m310getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m5189hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "<this>");
        inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", Dp.m5181boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set("color", Color.m2966boximpl(((SolidColor) this.brush).m3288getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m2966boximpl(((SolidColor) this.brush).m3288getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.m5194toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f8, Brush brush, Shape shape) {
        AbstractC3255y.i(brush, "brush");
        AbstractC3255y.i(shape, "shape");
        this.width = f8;
        this.brush = brush;
        this.shape = shape;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BorderModifierNode node) {
        AbstractC3255y.i(node, "node");
        node.m306setWidth0680j_4(this.width);
        node.setBrush(this.brush);
        node.setShape(this.shape);
    }
}
