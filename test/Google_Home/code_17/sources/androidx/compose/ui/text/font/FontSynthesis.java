package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4816constructorimpl(0);
    private static final int All = m4816constructorimpl(1);
    private static final int Weight = m4816constructorimpl(2);
    private static final int Style = m4816constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m4824getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m4825getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m4826getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m4827getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ FontSynthesis(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m4815boximpl(int i8) {
        return new FontSynthesis(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4816constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4817equalsimpl(int i8, Object obj) {
        return (obj instanceof FontSynthesis) && i8 == ((FontSynthesis) obj).m4823unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4818equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4819hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4820isStyleOnimpl$ui_text_release(int i8) {
        if (!m4818equalsimpl0(i8, All) && !m4818equalsimpl0(i8, Style)) {
            return false;
        }
        return true;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4821isWeightOnimpl$ui_text_release(int i8) {
        if (!m4818equalsimpl0(i8, All) && !m4818equalsimpl0(i8, Weight)) {
            return false;
        }
        return true;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4822toStringimpl(int i8) {
        if (m4818equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4818equalsimpl0(i8, All)) {
            return "All";
        }
        if (m4818equalsimpl0(i8, Weight)) {
            return "Weight";
        }
        if (m4818equalsimpl0(i8, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4817equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4819hashCodeimpl(this.value);
    }

    public String toString() {
        return m4822toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4823unboximpl() {
        return this.value;
    }
}
