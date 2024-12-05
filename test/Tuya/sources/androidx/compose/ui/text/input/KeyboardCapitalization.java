package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4885constructorimpl(0);
    private static final int Characters = m4885constructorimpl(1);
    private static final int Words = m4885constructorimpl(2);
    private static final int Sentences = m4885constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4891getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4892getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4893getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4894getWordsIUNYP9k$annotations() {
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m4895getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m4896getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m4897getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m4898getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m4884boximpl(int i8) {
        return new KeyboardCapitalization(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4885constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4886equalsimpl(int i8, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i8 == ((KeyboardCapitalization) obj).m4890unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4887equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4888hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4889toStringimpl(int i8) {
        if (m4887equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4887equalsimpl0(i8, Characters)) {
            return "Characters";
        }
        if (m4887equalsimpl0(i8, Words)) {
            return "Words";
        }
        if (m4887equalsimpl0(i8, Sentences)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4886equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4888hashCodeimpl(this.value);
    }

    public String toString() {
        return m4889toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4890unboximpl() {
        return this.value;
    }
}
