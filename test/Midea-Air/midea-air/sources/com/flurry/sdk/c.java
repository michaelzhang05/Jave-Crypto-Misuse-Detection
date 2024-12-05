package com.flurry.sdk;

import java.lang.Thread;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class c extends d7<b> implements Thread.UncaughtExceptionHandler {
    public n7 p;
    public boolean q;

    public c() {
        super("FlurryErrorProvider");
        this.p = new n7();
        this.q = false;
        q7 a = q7.a();
        synchronized (a.f10140c) {
            a.f10140c.put(this, null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        th.printStackTrace();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.q) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (");
                    sb.append(th.getMessage());
                    sb.append(")\n");
                }
                message = sb.toString();
            } else {
                message = th.getMessage() != null ? th.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET;
            }
            t(new b(p7.UNCAUGHT_EXCEPTION_ID.f10123i, currentTimeMillis, message, th.getClass().getName(), th, o7.a(), null, this.p.b()));
        }
    }

    public final void x(String str, long j2, String str2, String str3, Throwable th, Map<String, String> map, Map<String, String> map2) {
        t(new b(str, j2, str2, str3, th, map, map2, Collections.emptyList()));
    }
}
