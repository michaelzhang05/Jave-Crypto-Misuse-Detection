package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f20631a;

    /* renamed from: b, reason: collision with root package name */
    private static long f20632b;

    /* renamed from: c, reason: collision with root package name */
    private static long f20633c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0398a {

        /* renamed from: a, reason: collision with root package name */
        private static a f20634a = new a();
    }

    public static a a() {
        return C0398a.f20634a;
    }

    public final synchronized void b() {
        try {
            if (f20633c != 0 && f20632b != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f20633c;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f20632b) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f20631a = 1L;
                            } else {
                                f20631a = totalRxBytes;
                            }
                        } else {
                            f20631a = 0L;
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        f20632b = 0L;
        f20633c = 0L;
    }

    public final long d() {
        return f20631a;
    }

    public final synchronized void e() {
        if (f20633c == 0) {
            f20633c = SystemClock.elapsedRealtime();
            f20632b = TrafficStats.getTotalRxBytes();
        }
    }

    private a() {
    }
}
