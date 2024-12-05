package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class h20 implements e20 {
    private final zzst a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11503b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11504c;

    /* renamed from: d, reason: collision with root package name */
    private int f11505d;

    /* renamed from: e, reason: collision with root package name */
    private int f11506e;

    public h20(b20 b20Var) {
        zzst zzstVar = b20Var.Q0;
        this.a = zzstVar;
        zzstVar.k(12);
        this.f11504c = zzstVar.s() & 255;
        this.f11503b = zzstVar.s();
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final int b() {
        return this.f11503b;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final int c() {
        int i2 = this.f11504c;
        if (i2 == 8) {
            return this.a.g();
        }
        if (i2 == 16) {
            return this.a.h();
        }
        int i3 = this.f11505d;
        this.f11505d = i3 + 1;
        if (i3 % 2 == 0) {
            int g2 = this.a.g();
            this.f11506e = g2;
            return (g2 & 240) >> 4;
        }
        return this.f11506e & 15;
    }
}
