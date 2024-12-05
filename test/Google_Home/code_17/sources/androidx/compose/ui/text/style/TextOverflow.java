package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m5127constructorimpl(1);
    private static final int Ellipsis = m5127constructorimpl(2);
    private static final int Visible = m5127constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5133getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5134getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5135getVisiblegIe3tQ8$annotations() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m5136getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5137getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m5138getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ TextOverflow(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m5126boximpl(int i8) {
        return new TextOverflow(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5127constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5128equalsimpl(int i8, Object obj) {
        return (obj instanceof TextOverflow) && i8 == ((TextOverflow) obj).m5132unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5129equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5130hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5131toStringimpl(int i8) {
        if (m5129equalsimpl0(i8, Clip)) {
            return "Clip";
        }
        if (m5129equalsimpl0(i8, Ellipsis)) {
            return "Ellipsis";
        }
        if (m5129equalsimpl0(i8, Visible)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5128equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5130hashCodeimpl(this.value);
    }

    public String toString() {
        return m5131toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5132unboximpl() {
        return this.value;
    }
}
