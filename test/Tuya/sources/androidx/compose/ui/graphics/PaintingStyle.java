package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m3212constructorimpl(0);
    private static final int Stroke = m3212constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m3218getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m3219getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ PaintingStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m3211boximpl(int i8) {
        return new PaintingStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3212constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3213equalsimpl(int i8, Object obj) {
        return (obj instanceof PaintingStyle) && i8 == ((PaintingStyle) obj).m3217unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3214equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3215hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3216toStringimpl(int i8) {
        if (m3214equalsimpl0(i8, Fill)) {
            return "Fill";
        }
        if (m3214equalsimpl0(i8, Stroke)) {
            return "Stroke";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3213equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3215hashCodeimpl(this.value);
    }

    public String toString() {
        return m3216toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3217unboximpl() {
        return this.value;
    }
}
