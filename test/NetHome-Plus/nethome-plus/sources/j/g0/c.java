package j.g0;

import j.a0;
import kotlin.jvm.internal.l;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final int a(int[] iArr, int i2, int i3, int i4) {
        l.f(iArr, "$this$binarySearch");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final int b(a0 a0Var, int i2) {
        l.f(a0Var, "$this$segment");
        int a = a(a0Var.U(), i2 + 1, 0, a0Var.V().length);
        return a >= 0 ? a : a ^ (-1);
    }
}
