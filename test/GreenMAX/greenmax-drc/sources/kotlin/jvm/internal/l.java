package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* loaded from: classes2.dex */
public class l {
    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) k(new IllegalStateException(str + " must not be null")));
    }

    public static void c(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int h(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private static String i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void j(int i2, String str) {
        s();
    }

    private static <T extends Throwable> T k(T t) {
        return (T) l(t, l.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T l(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    public static void p() {
        throw ((KotlinNullPointerException) k(new KotlinNullPointerException()));
    }

    private static void q(String str) {
        throw ((IllegalArgumentException) k(new IllegalArgumentException(i(str))));
    }

    private static void r(String str) {
        throw ((NullPointerException) k(new NullPointerException(i(str))));
    }

    public static void s() {
        t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void u(String str) {
        throw ((UninitializedPropertyAccessException) k(new UninitializedPropertyAccessException(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
