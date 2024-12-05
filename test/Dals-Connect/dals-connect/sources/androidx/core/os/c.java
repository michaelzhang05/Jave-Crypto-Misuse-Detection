package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class c {
    private static long a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f949b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f950c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f951d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f952e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 18 || i2 >= 29) {
            return;
        }
        try {
            a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f949b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f950c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f951d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f952e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
