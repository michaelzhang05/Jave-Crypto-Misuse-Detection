package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzsw implements zzso {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private long f15560b;

    /* renamed from: c, reason: collision with root package name */
    private long f15561c;

    /* renamed from: d, reason: collision with root package name */
    private zzln f15562d = zzln.a;

    public final void a() {
        if (this.a) {
            return;
        }
        this.f15561c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    public final void b() {
        if (this.a) {
            g(e());
            this.a = false;
        }
    }

    public final void c(zzso zzsoVar) {
        g(zzsoVar.e());
        this.f15562d = zzsoVar.f();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzln d(zzln zzlnVar) {
        if (this.a) {
            g(e());
        }
        this.f15562d = zzlnVar;
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final long e() {
        long a;
        long j2 = this.f15560b;
        if (!this.a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15561c;
        zzln zzlnVar = this.f15562d;
        if (zzlnVar.f15254b == 1.0f) {
            a = zzkt.b(elapsedRealtime);
        } else {
            a = zzlnVar.a(elapsedRealtime);
        }
        return j2 + a;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzln f() {
        return this.f15562d;
    }

    public final void g(long j2) {
        this.f15560b = j2;
        if (this.a) {
            this.f15561c = SystemClock.elapsedRealtime();
        }
    }
}
