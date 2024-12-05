package androidx.compose.ui.text.style;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4986constructorimpl(1);
    private static final int Auto = m4986constructorimpl(2);
    private static final int Unspecified = m4986constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m4992getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m4993getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m4994getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ Hyphens(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m4985boximpl(int i8) {
        return new Hyphens(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4986constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4987equalsimpl(int i8, Object obj) {
        return (obj instanceof Hyphens) && i8 == ((Hyphens) obj).m4991unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4988equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4989hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4990toStringimpl(int i8) {
        if (m4988equalsimpl0(i8, None)) {
            return "Hyphens.None";
        }
        if (m4988equalsimpl0(i8, Auto)) {
            return "Hyphens.Auto";
        }
        if (m4988equalsimpl0(i8, Unspecified)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4987equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4989hashCodeimpl(this.value);
    }

    public String toString() {
        return m4990toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4991unboximpl() {
        return this.value;
    }
}
