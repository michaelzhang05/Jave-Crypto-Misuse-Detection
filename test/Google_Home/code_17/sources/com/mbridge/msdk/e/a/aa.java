package com.mbridge.msdk.e.a;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    public static String f19823a = "TrackManager_Volley";

    /* renamed from: b, reason: collision with root package name */
    private static final String f19824b = "com.mbridge.msdk.e.a.aa";

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0390a> f19825a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19826b;

        /* renamed from: com.mbridge.msdk.e.a.aa$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static class C0390a {

            /* renamed from: a, reason: collision with root package name */
            public final String f19827a;

            /* renamed from: b, reason: collision with root package name */
            public final long f19828b;

            /* renamed from: c, reason: collision with root package name */
            public final long f19829c;
        }

        protected final void finalize() throws Throwable {
            long j8;
            if (!this.f19826b) {
                this.f19826b = true;
                if (this.f19825a.size() == 0) {
                    j8 = 0;
                } else {
                    long j9 = this.f19825a.get(0).f19829c;
                    List<C0390a> list = this.f19825a;
                    j8 = list.get(list.size() - 1).f19829c - j9;
                }
                if (j8 > 0) {
                    long j10 = this.f19825a.get(0).f19829c;
                    aa.b("(%-4d ms) %s", Long.valueOf(j8), "Request on the loose");
                    for (C0390a c0390a : this.f19825a) {
                        long j11 = c0390a.f19829c;
                        aa.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0390a.f19828b), c0390a.f19827a);
                        j10 = j11;
                    }
                }
                aa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(f19823a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f19823a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 < stackTrace.length) {
                if (!stackTrace[i8].getClassName().equals(f19824b)) {
                    String className = stackTrace[i8].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                    break;
                }
                i8++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f19823a, d(str, objArr), th);
    }
}
