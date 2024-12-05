package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m4787constructorimpl(0);
    private static final int OptionalLocal = m4787constructorimpl(1);
    private static final int Async = m4787constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m4793getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m4794getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m4795getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m4786boximpl(int i8) {
        return new FontLoadingStrategy(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4787constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4788equalsimpl(int i8, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i8 == ((FontLoadingStrategy) obj).m4792unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4789equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4790hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4791toStringimpl(int i8) {
        if (m4789equalsimpl0(i8, Blocking)) {
            return "Blocking";
        }
        if (m4789equalsimpl0(i8, OptionalLocal)) {
            return "Optional";
        }
        if (m4789equalsimpl0(i8, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4788equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4790hashCodeimpl(this.value);
    }

    public String toString() {
        return m4791toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4792unboximpl() {
        return this.value;
    }
}
