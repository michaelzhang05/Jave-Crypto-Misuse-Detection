package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzic implements zzip {
    private final sz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzhm f15129b = new zzhm(0);

    /* renamed from: c, reason: collision with root package name */
    private boolean f15130c = true;

    /* renamed from: d, reason: collision with root package name */
    private long f15131d = Long.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private long f15132e = Long.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f15133f = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    private volatile zzhj f15134g;

    public zzic(zzjl zzjlVar) {
        this.a = new sz(zzjlVar);
    }

    private final boolean m() {
        boolean f2 = this.a.f(this.f15129b);
        if (this.f15130c) {
            while (f2 && !this.f15129b.b()) {
                this.a.j();
                f2 = this.a.f(this.f15129b);
            }
        }
        if (!f2) {
            return false;
        }
        long j2 = this.f15132e;
        return j2 == Long.MIN_VALUE || this.f15129b.f15105e < j2;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final int a(zzie zzieVar, int i2) throws IOException, InterruptedException {
        return this.a.d(zzieVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void b(zzhj zzhjVar) {
        this.f15134g = zzhjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void c(zzkm zzkmVar, int i2) {
        this.a.e(zzkmVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public void d(long j2, int i2, int i3, int i4, byte[] bArr) {
        this.f15133f = Math.max(this.f15133f, j2);
        sz szVar = this.a;
        szVar.b(j2, i2, (szVar.k() - i3) - i4, i3, bArr);
    }

    public final void e() {
        this.a.a();
        this.f15130c = true;
        this.f15131d = Long.MIN_VALUE;
        this.f15132e = Long.MIN_VALUE;
        this.f15133f = Long.MIN_VALUE;
    }

    public final boolean f() {
        return !m();
    }

    public final boolean g(zzhm zzhmVar) {
        if (!m()) {
            return false;
        }
        this.a.g(zzhmVar);
        this.f15130c = false;
        this.f15131d = zzhmVar.f15105e;
        return true;
    }

    public final void h(long j2) {
        while (this.a.f(this.f15129b) && this.f15129b.f15105e < j2) {
            this.a.j();
            this.f15130c = true;
        }
        this.f15131d = Long.MIN_VALUE;
    }

    public final boolean i(long j2) {
        return this.a.h(j2);
    }

    public final boolean j() {
        return this.f15134g != null;
    }

    public final zzhj k() {
        return this.f15134g;
    }

    public final long l() {
        return this.f15133f;
    }
}
