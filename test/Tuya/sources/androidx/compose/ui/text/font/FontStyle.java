package androidx.compose.ui.text.font;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m4800constructorimpl(0);
    private static final int Italic = m4800constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4806getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4807getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m4808getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m4809getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return AbstractC1246t.p(FontStyle.m4799boximpl(m4809getNormal_LCdwA()), FontStyle.m4799boximpl(m4808getItalic_LCdwA()));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ FontStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m4799boximpl(int i8) {
        return new FontStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4800constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4801equalsimpl(int i8, Object obj) {
        return (obj instanceof FontStyle) && i8 == ((FontStyle) obj).m4805unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4802equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4803hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4804toStringimpl(int i8) {
        if (m4802equalsimpl0(i8, Normal)) {
            return "Normal";
        }
        if (m4802equalsimpl0(i8, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4801equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4803hashCodeimpl(this.value);
    }

    public String toString() {
        return m4804toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4805unboximpl() {
        return this.value;
    }
}
