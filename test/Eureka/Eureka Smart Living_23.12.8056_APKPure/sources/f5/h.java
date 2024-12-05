package f5;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class h {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            i();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            j(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) g(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    private static String f(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = h.class.getName();
        int i6 = 0;
        while (!stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        while (stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        StackTraceElement stackTraceElement = stackTrace[i6];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable g(Throwable th) {
        return h(th, h.class.getName());
    }

    static Throwable h(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(stackTrace[i7].getClassName())) {
                i6 = i7;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6 + 1, length));
        return th;
    }

    public static void i() {
        throw ((NullPointerException) g(new NullPointerException()));
    }

    public static void j(String str) {
        throw ((NullPointerException) g(new NullPointerException(str)));
    }

    private static void k(String str) {
        throw ((NullPointerException) g(new NullPointerException(f(str))));
    }
}
