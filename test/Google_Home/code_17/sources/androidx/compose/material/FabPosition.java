package androidx.compose.material;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Center = m1255constructorimpl(0);
    private static final int End = m1255constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-5ygKITE, reason: not valid java name */
        public final int m1261getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE, reason: not valid java name */
        public final int m1262getEnd5ygKITE() {
            return FabPosition.End;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ FabPosition(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m1254boximpl(int i8) {
        return new FabPosition(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1255constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1256equalsimpl(int i8, Object obj) {
        return (obj instanceof FabPosition) && i8 == ((FabPosition) obj).m1260unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1257equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1258hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1259toStringimpl(int i8) {
        if (m1257equalsimpl0(i8, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m1256equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1258hashCodeimpl(this.value);
    }

    public String toString() {
        return m1259toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1260unboximpl() {
        return this.value;
    }
}
