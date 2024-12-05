package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcji {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f14114b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f14115c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f14116d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Object f14117e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f14118f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f14119g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14120h = new Object();

    public final int a() {
        int i2;
        synchronized (this.f14117e) {
            i2 = this.a;
        }
        return i2;
    }

    public final long b() {
        long j2;
        synchronized (this.f14118f) {
            j2 = this.f14114b;
        }
        return j2;
    }

    public final synchronized long c() {
        long j2;
        synchronized (this.f14119g) {
            j2 = this.f14115c;
        }
        return j2;
    }

    public final synchronized long d() {
        long j2;
        synchronized (this.f14120h) {
            j2 = this.f14116d;
        }
        return j2;
    }

    public final void e(int i2) {
        synchronized (this.f14117e) {
            this.a = i2;
        }
    }

    public final void f(long j2) {
        synchronized (this.f14118f) {
            this.f14114b = j2;
        }
    }

    public final synchronized void g(long j2) {
        synchronized (this.f14120h) {
            this.f14116d = j2;
        }
    }

    public final synchronized void h(long j2) {
        synchronized (this.f14119g) {
            this.f14115c = j2;
        }
    }
}
