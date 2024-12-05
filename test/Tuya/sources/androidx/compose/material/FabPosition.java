package androidx.compose.material;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Center = m1250constructorimpl(0);
    private static final int End = m1250constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-5ygKITE, reason: not valid java name */
        public final int m1256getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE, reason: not valid java name */
        public final int m1257getEnd5ygKITE() {
            return FabPosition.End;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ FabPosition(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m1249boximpl(int i8) {
        return new FabPosition(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1250constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1251equalsimpl(int i8, Object obj) {
        return (obj instanceof FabPosition) && i8 == ((FabPosition) obj).m1255unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1252equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1253hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1254toStringimpl(int i8) {
        if (m1252equalsimpl0(i8, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m1251equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1253hashCodeimpl(this.value);
    }

    public String toString() {
        return m1254toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1255unboximpl() {
        return this.value;
    }
}
