package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m5122constructorimpl(1);
    private static final int Ellipsis = m5122constructorimpl(2);
    private static final int Visible = m5122constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5128getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5129getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5130getVisiblegIe3tQ8$annotations() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m5131getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5132getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m5133getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ TextOverflow(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m5121boximpl(int i8) {
        return new TextOverflow(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5122constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5123equalsimpl(int i8, Object obj) {
        return (obj instanceof TextOverflow) && i8 == ((TextOverflow) obj).m5127unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5124equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5125hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5126toStringimpl(int i8) {
        if (m5124equalsimpl0(i8, Clip)) {
            return "Clip";
        }
        if (m5124equalsimpl0(i8, Ellipsis)) {
            return "Ellipsis";
        }
        if (m5124equalsimpl0(i8, Visible)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5123equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5125hashCodeimpl(this.value);
    }

    public String toString() {
        return m5126toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5127unboximpl() {
        return this.value;
    }
}
