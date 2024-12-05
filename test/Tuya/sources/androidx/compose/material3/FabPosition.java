package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC3151p;

@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Center = m1632constructorimpl(0);
    private static final int End = m1632constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m1638getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m1639getEndERTFSPs() {
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
    public static final /* synthetic */ FabPosition m1631boximpl(int i8) {
        return new FabPosition(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1632constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1633equalsimpl(int i8, Object obj) {
        return (obj instanceof FabPosition) && i8 == ((FabPosition) obj).m1637unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1634equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1635hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1636toStringimpl(int i8) {
        if (m1634equalsimpl0(i8, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m1633equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1635hashCodeimpl(this.value);
    }

    public String toString() {
        return m1636toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1637unboximpl() {
        return this.value;
    }
}
