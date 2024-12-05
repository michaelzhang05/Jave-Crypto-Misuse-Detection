package androidx.compose.ui.text.style;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m5095constructorimpl(1);
    private static final int Rtl = m5095constructorimpl(2);
    private static final int Content = m5095constructorimpl(3);
    private static final int ContentOrLtr = m5095constructorimpl(4);
    private static final int ContentOrRtl = m5095constructorimpl(5);
    private static final int Unspecified = m5095constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m5101getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m5102getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m5103getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m5104getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m5105getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m5106getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ TextDirection(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m5094boximpl(int i8) {
        return new TextDirection(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5095constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5096equalsimpl(int i8, Object obj) {
        return (obj instanceof TextDirection) && i8 == ((TextDirection) obj).m5100unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5097equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5098hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5099toStringimpl(int i8) {
        if (m5097equalsimpl0(i8, Ltr)) {
            return "Ltr";
        }
        if (m5097equalsimpl0(i8, Rtl)) {
            return "Rtl";
        }
        if (m5097equalsimpl0(i8, Content)) {
            return "Content";
        }
        if (m5097equalsimpl0(i8, ContentOrLtr)) {
            return "ContentOrLtr";
        }
        if (m5097equalsimpl0(i8, ContentOrRtl)) {
            return "ContentOrRtl";
        }
        if (m5097equalsimpl0(i8, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5096equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5098hashCodeimpl(this.value);
    }

    public String toString() {
        return m5099toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5100unboximpl() {
        return this.value;
    }
}
