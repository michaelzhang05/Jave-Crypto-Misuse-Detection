package z1;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i6) {
        if (iArr == null) {
            return false;
        }
        for (int i7 : iArr) {
            if (i7 == i6) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            if (!v1.m.a(objArr[i6], obj)) {
                i6++;
            } else if (i6 >= 0) {
                return true;
            }
        }
        return false;
    }
}
