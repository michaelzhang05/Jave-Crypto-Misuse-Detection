package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4811constructorimpl(0);
    private static final int All = m4811constructorimpl(1);
    private static final int Weight = m4811constructorimpl(2);
    private static final int Style = m4811constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m4819getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m4820getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m4821getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m4822getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ FontSynthesis(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m4810boximpl(int i8) {
        return new FontSynthesis(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4811constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4812equalsimpl(int i8, Object obj) {
        return (obj instanceof FontSynthesis) && i8 == ((FontSynthesis) obj).m4818unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4813equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4814hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4815isStyleOnimpl$ui_text_release(int i8) {
        if (!m4813equalsimpl0(i8, All) && !m4813equalsimpl0(i8, Style)) {
            return false;
        }
        return true;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4816isWeightOnimpl$ui_text_release(int i8) {
        if (!m4813equalsimpl0(i8, All) && !m4813equalsimpl0(i8, Weight)) {
            return false;
        }
        return true;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4817toStringimpl(int i8) {
        if (m4813equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4813equalsimpl0(i8, All)) {
            return "All";
        }
        if (m4813equalsimpl0(i8, Weight)) {
            return "Weight";
        }
        if (m4813equalsimpl0(i8, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4812equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4814hashCodeimpl(this.value);
    }

    public String toString() {
        return m4817toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4818unboximpl() {
        return this.value;
    }
}
