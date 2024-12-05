package androidx.core.util;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(boolean z5, Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i6, int i7, int i8, String str) {
        if (i6 < i7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        if (i6 <= i8) {
            return i6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    public static int c(int i6) {
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException();
    }

    public static int d(int i6, String str) {
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException(str);
    }

    public static int e(int i6, int i7) {
        if ((i6 & i7) == i6) {
            return i6;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i6) + ", but only 0x" + Integer.toHexString(i7) + " are allowed");
    }

    public static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void h(boolean z5, String str) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }
}
