package l0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f7269a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f7270b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        boolean isEnabled;
        try {
            if (f7270b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f7270b == null) {
                f7269a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f7270b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f7270b.invoke(null, Long.valueOf(f7269a))).booleanValue();
        } catch (Exception e6) {
            c("isTagEnabled", e6);
            return false;
        }
    }
}
