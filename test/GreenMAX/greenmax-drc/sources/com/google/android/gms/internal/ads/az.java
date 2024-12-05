package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
final class az {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private long f11102b;

    /* renamed from: c, reason: collision with root package name */
    private long f11103c;

    private static long d(long j2) {
        return (SystemClock.elapsedRealtime() * 1000) - j2;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f11103c = d(this.f11102b);
    }

    public final void b() {
        if (this.a) {
            this.f11102b = d(this.f11103c);
            this.a = false;
        }
    }

    public final void c(long j2) {
        this.f11102b = j2;
        this.f11103c = d(j2);
    }

    public final long e() {
        return this.a ? d(this.f11103c) : this.f11102b;
    }
}
