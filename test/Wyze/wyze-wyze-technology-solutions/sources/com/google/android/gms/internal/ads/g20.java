package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class g20 implements e20 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11452b;

    /* renamed from: c, reason: collision with root package name */
    private final zzst f11453c;

    public g20(b20 b20Var) {
        zzst zzstVar = b20Var.Q0;
        this.f11453c = zzstVar;
        zzstVar.k(12);
        this.a = zzstVar.s();
        this.f11452b = zzstVar.s();
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final boolean a() {
        return this.a != 0;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final int b() {
        return this.f11452b;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final int c() {
        int i2 = this.a;
        return i2 == 0 ? this.f11453c.s() : i2;
    }
}
