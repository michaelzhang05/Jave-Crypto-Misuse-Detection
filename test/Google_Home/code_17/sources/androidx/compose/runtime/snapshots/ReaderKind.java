package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m2605getComposition6f8NoZ8() {
            return ReaderKind.m2596constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m2606getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m2596constructorimpl(2);
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ ReaderKind(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m2595boximpl(int i8) {
        return new ReaderKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2596constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m2597constructorimpl$default(int i8, int i9, AbstractC3247p abstractC3247p) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return m2596constructorimpl(i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2598equalsimpl(int i8, Object obj) {
        return (obj instanceof ReaderKind) && i8 == ((ReaderKind) obj).m2604unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2599equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2600hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m2601isReadInh_f27i8(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2602toStringimpl(int i8) {
        return "ReaderKind(mask=" + i8 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m2603withReadIn3QSx2Dw(int i8, int i9) {
        return m2596constructorimpl(i8 | i9);
    }

    public boolean equals(Object obj) {
        return m2598equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m2600hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2602toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2604unboximpl() {
        return this.mask;
    }
}
