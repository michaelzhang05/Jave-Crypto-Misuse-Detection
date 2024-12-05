package androidx.compose.ui.text.style;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4991constructorimpl(1);
    private static final int Auto = m4991constructorimpl(2);
    private static final int Unspecified = m4991constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m4997getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m4998getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m4999getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Hyphens(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m4990boximpl(int i8) {
        return new Hyphens(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4991constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4992equalsimpl(int i8, Object obj) {
        return (obj instanceof Hyphens) && i8 == ((Hyphens) obj).m4996unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4993equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4994hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4995toStringimpl(int i8) {
        if (m4993equalsimpl0(i8, None)) {
            return "Hyphens.None";
        }
        if (m4993equalsimpl0(i8, Auto)) {
            return "Hyphens.Auto";
        }
        if (m4993equalsimpl0(i8, Unspecified)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4992equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4994hashCodeimpl(this.value);
    }

    public String toString() {
        return m4995toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4996unboximpl() {
        return this.value;
    }
}
