package Q6;

import P6.W;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class e {
    public static final int a(int[] iArr, int i8, int i9, int i10) {
        AbstractC3159y.i(iArr, "<this>");
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i8) {
                i9 = i12 + 1;
            } else if (i13 > i8) {
                i11 = i12 - 1;
            } else {
                return i12;
            }
        }
        return (-i9) - 1;
    }

    public static final int b(W w8, int i8) {
        AbstractC3159y.i(w8, "<this>");
        int a8 = a(w8.O(), i8 + 1, 0, w8.P().length);
        if (a8 < 0) {
            return ~a8;
        }
        return a8;
    }
}
