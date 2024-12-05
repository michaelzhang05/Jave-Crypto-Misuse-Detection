package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m3315constructorimpl(0);
    private static final int Repeated = m3315constructorimpl(1);
    private static final int Mirror = m3315constructorimpl(2);
    private static final int Decal = m3315constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m3321getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m3322getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m3323getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m3324getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ TileMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m3314boximpl(int i8) {
        return new TileMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3315constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3316equalsimpl(int i8, Object obj) {
        return (obj instanceof TileMode) && i8 == ((TileMode) obj).m3320unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3317equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3318hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3319toStringimpl(int i8) {
        if (m3317equalsimpl0(i8, Clamp)) {
            return "Clamp";
        }
        if (m3317equalsimpl0(i8, Repeated)) {
            return "Repeated";
        }
        if (m3317equalsimpl0(i8, Mirror)) {
            return "Mirror";
        }
        if (m3317equalsimpl0(i8, Decal)) {
            return "Decal";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3316equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3318hashCodeimpl(this.value);
    }

    public String toString() {
        return m3319toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3320unboximpl() {
        return this.value;
    }
}
