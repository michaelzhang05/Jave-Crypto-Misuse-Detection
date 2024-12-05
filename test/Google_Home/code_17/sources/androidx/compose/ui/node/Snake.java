package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m4406addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        if (m4414getHasAdditionOrRemovalimpl(iArr)) {
            if (m4415getReverseimpl(iArr)) {
                intStack.pushDiagonal(m4416getStartXimpl(iArr), m4417getStartYimpl(iArr), m4411getDiagonalSizeimpl(iArr));
                return;
            } else if (m4419isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m4416getStartXimpl(iArr), m4417getStartYimpl(iArr) + 1, m4411getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m4416getStartXimpl(iArr) + 1, m4417getStartYimpl(iArr), m4411getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m4416getStartXimpl(iArr), m4417getStartYimpl(iArr), m4412getEndXimpl(iArr) - m4416getStartXimpl(iArr));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m4407boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4408constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4409equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && AbstractC3255y.d(iArr, ((Snake) obj).m4421unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4410equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC3255y.d(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m4411getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m4412getEndXimpl(iArr) - m4416getStartXimpl(iArr), m4413getEndYimpl(iArr) - m4417getStartYimpl(iArr));
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m4412getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m4413getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m4414getHasAdditionOrRemovalimpl(int[] iArr) {
        if (m4413getEndYimpl(iArr) - m4417getStartYimpl(iArr) != m4412getEndXimpl(iArr) - m4416getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m4415getReverseimpl(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m4416getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m4417getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4418hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m4419isAdditionimpl(int[] iArr) {
        if (m4413getEndYimpl(iArr) - m4417getStartYimpl(iArr) > m4412getEndXimpl(iArr) - m4416getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4420toStringimpl(int[] iArr) {
        return "Snake(" + m4416getStartXimpl(iArr) + ',' + m4417getStartYimpl(iArr) + ',' + m4412getEndXimpl(iArr) + ',' + m4413getEndYimpl(iArr) + ',' + m4415getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4409equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m4418hashCodeimpl(this.data);
    }

    public String toString() {
        return m4420toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4421unboximpl() {
        return this.data;
    }
}
