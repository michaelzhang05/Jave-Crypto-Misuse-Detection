package com.mbridge.msdk.foundation.same.report;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f19874a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19875b = false;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f19874a == null) {
                    f19874a = new e();
                }
                eVar = f19874a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized void a(String str) {
    }
}
