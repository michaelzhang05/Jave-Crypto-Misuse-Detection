package z3;

/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(boolean z5, String str) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z5, String str) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }
}
