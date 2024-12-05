package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcxk {
    private final Clock a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14544b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f14545c = wp.a;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f14546d = 0;

    public zzcxk(Clock clock) {
        this.a = clock;
    }

    private final void a() {
        long a = this.a.a();
        synchronized (this.f14544b) {
            if (this.f14545c == wp.f12342c) {
                if (this.f14546d + ((Long) zzyt.e().c(zzacu.L4)).longValue() <= a) {
                    this.f14545c = wp.a;
                }
            }
        }
    }

    private final void e(int i2, int i3) {
        a();
        long a = this.a.a();
        synchronized (this.f14544b) {
            if (this.f14545c != i2) {
                return;
            }
            this.f14545c = i3;
            if (this.f14545c == wp.f12342c) {
                this.f14546d = a;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f14544b) {
            a();
            z = this.f14545c == wp.f12341b;
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f14544b) {
            a();
            z = this.f14545c == wp.f12342c;
        }
        return z;
    }

    public final void d(boolean z) {
        if (z) {
            e(wp.a, wp.f12341b);
        } else {
            e(wp.f12341b, wp.a);
        }
    }

    public final void f() {
        e(wp.f12341b, wp.f12342c);
    }
}
