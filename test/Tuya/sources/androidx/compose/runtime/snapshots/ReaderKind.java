package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m2600getComposition6f8NoZ8() {
            return ReaderKind.m2591constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m2601getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m2591constructorimpl(2);
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ ReaderKind(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m2590boximpl(int i8) {
        return new ReaderKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2591constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m2592constructorimpl$default(int i8, int i9, AbstractC3151p abstractC3151p) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return m2591constructorimpl(i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2593equalsimpl(int i8, Object obj) {
        return (obj instanceof ReaderKind) && i8 == ((ReaderKind) obj).m2599unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2594equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2595hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m2596isReadInh_f27i8(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2597toStringimpl(int i8) {
        return "ReaderKind(mask=" + i8 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m2598withReadIn3QSx2Dw(int i8, int i9) {
        return m2591constructorimpl(i8 | i9);
    }

    public boolean equals(Object obj) {
        return m2593equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m2595hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2597toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2599unboximpl() {
        return this.mask;
    }
}
