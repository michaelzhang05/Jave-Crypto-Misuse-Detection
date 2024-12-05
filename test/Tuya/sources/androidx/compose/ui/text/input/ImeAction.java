package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4853constructorimpl(1);
    private static final int None = m4853constructorimpl(0);
    private static final int Go = m4853constructorimpl(2);
    private static final int Search = m4853constructorimpl(3);
    private static final int Send = m4853constructorimpl(4);
    private static final int Previous = m4853constructorimpl(5);
    private static final int Next = m4853constructorimpl(6);
    private static final int Done = m4853constructorimpl(7);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4859getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4860getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4861getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4862getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4863getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4864getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4865getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4866getSendeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m4867getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m4868getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m4869getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m4870getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m4871getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m4872getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m4873getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m4874getSendeUduSuo() {
            return ImeAction.Send;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ ImeAction(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m4852boximpl(int i8) {
        return new ImeAction(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4853constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4854equalsimpl(int i8, Object obj) {
        return (obj instanceof ImeAction) && i8 == ((ImeAction) obj).m4858unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4855equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4856hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4857toStringimpl(int i8) {
        if (m4855equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4855equalsimpl0(i8, Default)) {
            return "Default";
        }
        if (m4855equalsimpl0(i8, Go)) {
            return "Go";
        }
        if (m4855equalsimpl0(i8, Search)) {
            return "Search";
        }
        if (m4855equalsimpl0(i8, Send)) {
            return "Send";
        }
        if (m4855equalsimpl0(i8, Previous)) {
            return "Previous";
        }
        if (m4855equalsimpl0(i8, Next)) {
            return "Next";
        }
        if (m4855equalsimpl0(i8, Done)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4854equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4856hashCodeimpl(this.value);
    }

    public String toString() {
        return m4857toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4858unboximpl() {
        return this.value;
    }
}
