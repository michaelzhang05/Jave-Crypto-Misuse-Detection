package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f8, Brush brush, AbstractC3247p abstractC3247p) {
        this(f8, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m311copyD5KLDUw$default(BorderStroke borderStroke, float f8, Brush brush, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = borderStroke.width;
        }
        if ((i8 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m312copyD5KLDUw(f8, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m312copyD5KLDUw(float f8, Brush brush) {
        AbstractC3255y.i(brush, "brush");
        return new BorderStroke(f8, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        if (Dp.m5188equalsimpl0(this.width, borderStroke.width) && AbstractC3255y.d(this.brush, borderStroke.brush)) {
            return true;
        }
        return false;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m313getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m5189hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m5194toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f8, Brush brush) {
        AbstractC3255y.i(brush, "brush");
        this.width = f8;
        this.brush = brush;
    }
}
