package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static long f2171a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f2172b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f2173c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f2174d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f2175e;

    /* loaded from: classes.dex */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2171a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2172b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f2173c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f2174d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f2175e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e6) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e6);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
