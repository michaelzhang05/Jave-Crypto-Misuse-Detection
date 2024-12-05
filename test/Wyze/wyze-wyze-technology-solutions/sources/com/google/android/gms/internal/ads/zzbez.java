package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzbez implements zzll {
    private final zzrz a;

    /* renamed from: b, reason: collision with root package name */
    private long f13238b;

    /* renamed from: c, reason: collision with root package name */
    private long f13239c;

    /* renamed from: d, reason: collision with root package name */
    private long f13240d;

    /* renamed from: e, reason: collision with root package name */
    private long f13241e;

    /* renamed from: f, reason: collision with root package name */
    private int f13242f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13243g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbez() {
        this(15000, 30000, 2500L, 5000L);
    }

    @VisibleForTesting
    private final void l(boolean z) {
        this.f13242f = 0;
        this.f13243g = false;
        if (z) {
            this.a.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void a() {
        l(false);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final zzrt b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final synchronized boolean c(long j2, boolean z) {
        long j3;
        j3 = z ? this.f13241e : this.f13240d;
        return j3 <= 0 || j2 >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final synchronized boolean d(long j2) {
        boolean z;
        z = false;
        char c2 = j2 > this.f13239c ? (char) 0 : j2 < this.f13238b ? (char) 2 : (char) 1;
        boolean z2 = this.a.h() >= this.f13242f;
        if (c2 == 2 || (c2 == 1 && this.f13243g && !z2)) {
            z = true;
        }
        this.f13243g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void e() {
        l(true);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void f() {
        l(true);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void g(zzlo[] zzloVarArr, zzrb zzrbVar, zzro zzroVar) {
        this.f13242f = 0;
        for (int i2 = 0; i2 < zzloVarArr.length; i2++) {
            if (zzroVar.a(i2) != null) {
                this.f13242f += zzsy.p(zzloVarArr[i2].s());
            }
        }
        this.a.g(this.f13242f);
    }

    public final synchronized void h(int i2) {
        this.f13240d = i2 * 1000;
    }

    public final synchronized void i(int i2) {
        this.f13241e = i2 * 1000;
    }

    public final synchronized void j(int i2) {
        this.f13238b = i2 * 1000;
    }

    public final synchronized void k(int i2) {
        this.f13239c = i2 * 1000;
    }

    private zzbez(int i2, int i3, long j2, long j3) {
        this.a = new zzrz(true, 65536);
        this.f13238b = 15000000L;
        this.f13239c = 30000000L;
        this.f13240d = 2500000L;
        this.f13241e = 5000000L;
    }
}
