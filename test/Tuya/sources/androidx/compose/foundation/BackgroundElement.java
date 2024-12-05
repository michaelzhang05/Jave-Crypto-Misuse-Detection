package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final Function1 inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j8, Brush brush, float f8, Shape shape, Function1 function1, AbstractC3151p abstractC3151p) {
        this(j8, brush, f8, shape, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !Color.m2972equalsimpl0(this.color, backgroundElement.color) || !AbstractC3159y.d(this.brush, backgroundElement.brush) || this.alpha != backgroundElement.alpha || !AbstractC3159y.d(this.shape, backgroundElement.shape)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int m2978hashCodeimpl = Color.m2978hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        if (brush != null) {
            i8 = brush.hashCode();
        } else {
            i8 = 0;
        }
        return ((((m2978hashCodeimpl + i8) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ BackgroundElement(long j8, Brush brush, float f8, Shape shape, Function1 function1, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? null : brush, f8, shape, function1, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BackgroundNode node) {
        AbstractC3159y.i(node, "node");
        node.m284setColor8_81llA(this.color);
        node.setBrush(this.brush);
        node.setAlpha(this.alpha);
        node.setShape(this.shape);
    }

    private BackgroundElement(long j8, Brush brush, float f8, Shape shape, Function1 inspectorInfo) {
        AbstractC3159y.i(shape, "shape");
        AbstractC3159y.i(inspectorInfo, "inspectorInfo");
        this.color = j8;
        this.brush = brush;
        this.alpha = f8;
        this.shape = shape;
        this.inspectorInfo = inspectorInfo;
    }
}
