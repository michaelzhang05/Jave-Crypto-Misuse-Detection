package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class h10 implements zzmn {
    private final /* synthetic */ zzms a;

    private h10(zzms zzmsVar) {
        this.a = zzmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void a(int i2) {
        zzms.a0(this.a).b(i2);
        zzms.c0(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void b(int i2, long j2, long j3) {
        zzms.a0(this.a).f(i2, j2, j3);
        zzms.e0(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void c() {
        zzms.f0();
        zzms.b0(this.a, true);
    }
}
