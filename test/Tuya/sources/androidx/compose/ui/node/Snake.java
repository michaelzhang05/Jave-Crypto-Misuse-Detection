package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m4401addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        if (m4409getHasAdditionOrRemovalimpl(iArr)) {
            if (m4410getReverseimpl(iArr)) {
                intStack.pushDiagonal(m4411getStartXimpl(iArr), m4412getStartYimpl(iArr), m4406getDiagonalSizeimpl(iArr));
                return;
            } else if (m4414isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m4411getStartXimpl(iArr), m4412getStartYimpl(iArr) + 1, m4406getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m4411getStartXimpl(iArr) + 1, m4412getStartYimpl(iArr), m4406getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m4411getStartXimpl(iArr), m4412getStartYimpl(iArr), m4407getEndXimpl(iArr) - m4411getStartXimpl(iArr));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m4402boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4403constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4404equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && AbstractC3159y.d(iArr, ((Snake) obj).m4416unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4405equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC3159y.d(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m4406getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m4407getEndXimpl(iArr) - m4411getStartXimpl(iArr), m4408getEndYimpl(iArr) - m4412getStartYimpl(iArr));
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m4407getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m4408getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m4409getHasAdditionOrRemovalimpl(int[] iArr) {
        if (m4408getEndYimpl(iArr) - m4412getStartYimpl(iArr) != m4407getEndXimpl(iArr) - m4411getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m4410getReverseimpl(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m4411getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m4412getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4413hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m4414isAdditionimpl(int[] iArr) {
        if (m4408getEndYimpl(iArr) - m4412getStartYimpl(iArr) > m4407getEndXimpl(iArr) - m4411getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4415toStringimpl(int[] iArr) {
        return "Snake(" + m4411getStartXimpl(iArr) + ',' + m4412getStartYimpl(iArr) + ',' + m4407getEndXimpl(iArr) + ',' + m4408getEndYimpl(iArr) + ',' + m4410getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4404equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m4413hashCodeimpl(this.data);
    }

    public String toString() {
        return m4415toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4416unboximpl() {
        return this.data;
    }
}
