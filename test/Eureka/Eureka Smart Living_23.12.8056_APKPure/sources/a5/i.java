package a5;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class i extends h {
    public static final List b(Object[] objArr) {
        f5.h.e(objArr, "<this>");
        List a6 = k.a(objArr);
        f5.h.d(a6, "asList(this)");
        return a6;
    }

    public static final Object[] c(Object[] objArr, Object[] objArr2, int i6, int i7, int i8) {
        f5.h.e(objArr, "<this>");
        f5.h.e(objArr2, "destination");
        System.arraycopy(objArr, i7, objArr2, i6, i8 - i7);
        return objArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i6 = 0;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        return c(objArr, objArr2, i6, i7, i8);
    }

    public static final void e(Object[] objArr, Object obj, int i6, int i7) {
        f5.h.e(objArr, "<this>");
        Arrays.fill(objArr, i6, i7, obj);
    }
}
