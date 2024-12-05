package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4858constructorimpl(1);
    private static final int None = m4858constructorimpl(0);
    private static final int Go = m4858constructorimpl(2);
    private static final int Search = m4858constructorimpl(3);
    private static final int Send = m4858constructorimpl(4);
    private static final int Previous = m4858constructorimpl(5);
    private static final int Next = m4858constructorimpl(6);
    private static final int Done = m4858constructorimpl(7);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4864getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4865getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4866getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4867getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4868getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4869getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4870getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4871getSendeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m4872getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m4873getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m4874getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m4875getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m4876getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m4877getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m4878getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m4879getSendeUduSuo() {
            return ImeAction.Send;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ ImeAction(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m4857boximpl(int i8) {
        return new ImeAction(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4858constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4859equalsimpl(int i8, Object obj) {
        return (obj instanceof ImeAction) && i8 == ((ImeAction) obj).m4863unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4860equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4861hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4862toStringimpl(int i8) {
        if (m4860equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4860equalsimpl0(i8, Default)) {
            return "Default";
        }
        if (m4860equalsimpl0(i8, Go)) {
            return "Go";
        }
        if (m4860equalsimpl0(i8, Search)) {
            return "Search";
        }
        if (m4860equalsimpl0(i8, Send)) {
            return "Send";
        }
        if (m4860equalsimpl0(i8, Previous)) {
            return "Previous";
        }
        if (m4860equalsimpl0(i8, Next)) {
            return "Next";
        }
        if (m4860equalsimpl0(i8, Done)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4859equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4861hashCodeimpl(this.value);
    }

    public String toString() {
        return m4862toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4863unboximpl() {
        return this.value;
    }
}
