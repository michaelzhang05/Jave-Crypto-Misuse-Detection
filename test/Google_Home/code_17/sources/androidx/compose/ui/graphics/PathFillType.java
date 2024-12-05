package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m3230constructorimpl(0);
    private static final int EvenOdd = m3230constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m3236getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m3237getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ PathFillType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m3229boximpl(int i8) {
        return new PathFillType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3230constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3231equalsimpl(int i8, Object obj) {
        return (obj instanceof PathFillType) && i8 == ((PathFillType) obj).m3235unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3232equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3233hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3234toStringimpl(int i8) {
        if (m3232equalsimpl0(i8, NonZero)) {
            return "NonZero";
        }
        if (m3232equalsimpl0(i8, EvenOdd)) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3231equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3233hashCodeimpl(this.value);
    }

    public String toString() {
        return m3234toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3235unboximpl() {
        return this.value;
    }
}
