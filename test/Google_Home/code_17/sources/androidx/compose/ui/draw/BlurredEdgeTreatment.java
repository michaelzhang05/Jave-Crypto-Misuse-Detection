package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m2634constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m2634constructorimpl(null);
    private final Shape shape;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m2640getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m2641getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m2633boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m2634constructorimpl(Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2635equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && AbstractC3255y.d(shape, ((BlurredEdgeTreatment) obj).m2639unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2636equalsimpl0(Shape shape, Shape shape2) {
        return AbstractC3255y.d(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2637hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2638toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m2635equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m2637hashCodeimpl(this.shape);
    }

    public String toString() {
        return m2638toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m2639unboximpl() {
        return this.shape;
    }
}
