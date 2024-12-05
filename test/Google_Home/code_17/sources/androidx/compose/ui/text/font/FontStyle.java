package androidx.compose.ui.text.font;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m4805constructorimpl(0);
    private static final int Italic = m4805constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4811getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4812getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m4813getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m4814getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return AbstractC1378t.p(FontStyle.m4804boximpl(m4814getNormal_LCdwA()), FontStyle.m4804boximpl(m4813getItalic_LCdwA()));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ FontStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m4804boximpl(int i8) {
        return new FontStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4805constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4806equalsimpl(int i8, Object obj) {
        return (obj instanceof FontStyle) && i8 == ((FontStyle) obj).m4810unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4807equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4808hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4809toStringimpl(int i8) {
        if (m4807equalsimpl0(i8, Normal)) {
            return "Normal";
        }
        if (m4807equalsimpl0(i8, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4806equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4808hashCodeimpl(this.value);
    }

    public String toString() {
        return m4809toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4810unboximpl() {
        return this.value;
    }
}
