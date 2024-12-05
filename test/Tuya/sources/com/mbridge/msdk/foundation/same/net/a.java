package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f19576a;

    /* renamed from: b, reason: collision with root package name */
    private static long f19577b;

    /* renamed from: c, reason: collision with root package name */
    private static long f19578c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0402a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19579a = new a();
    }

    public static a a() {
        return C0402a.f19579a;
    }

    public final synchronized void b() {
        try {
            if (f19578c != 0 && f19577b != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f19578c;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f19577b) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f19576a = 1L;
                            } else {
                                f19576a = totalRxBytes;
                            }
                        } else {
                            f19576a = 0L;
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
        f19577b = 0L;
        f19578c = 0L;
    }

    public final long d() {
        return f19576a;
    }

    public final synchronized void e() {
        if (f19578c == 0) {
            f19578c = SystemClock.elapsedRealtime();
            f19577b = TrafficStats.getTotalRxBytes();
        }
    }

    private a() {
    }
}
