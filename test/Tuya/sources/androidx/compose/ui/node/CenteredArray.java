package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m4212boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4213constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4214equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && AbstractC3159y.d(iArr, ((CenteredArray) obj).m4221unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4215equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC3159y.d(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m4216getimpl(int[] iArr, int i8) {
        return iArr[i8 + m4217getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m4217getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4218hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4219setimpl(int[] iArr, int i8, int i9) {
        iArr[i8 + m4217getMidimpl(iArr)] = i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4220toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4214equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m4218hashCodeimpl(this.data);
    }

    public String toString() {
        return m4220toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4221unboximpl() {
        return this.data;
    }
}
