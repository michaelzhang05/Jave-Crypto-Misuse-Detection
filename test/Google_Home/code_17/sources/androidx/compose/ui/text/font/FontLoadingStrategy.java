package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m4792constructorimpl(0);
    private static final int OptionalLocal = m4792constructorimpl(1);
    private static final int Async = m4792constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m4798getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m4799getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m4800getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m4791boximpl(int i8) {
        return new FontLoadingStrategy(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4792constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4793equalsimpl(int i8, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i8 == ((FontLoadingStrategy) obj).m4797unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4794equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4795hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4796toStringimpl(int i8) {
        if (m4794equalsimpl0(i8, Blocking)) {
            return "Blocking";
        }
        if (m4794equalsimpl0(i8, OptionalLocal)) {
            return "Optional";
        }
        if (m4794equalsimpl0(i8, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4793equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4795hashCodeimpl(this.value);
    }

    public String toString() {
        return m4796toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4797unboximpl() {
        return this.value;
    }
}
