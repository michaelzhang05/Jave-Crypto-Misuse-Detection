package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class dn implements zzban<zzcdb> {
    private final /* synthetic */ zzcdf a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcqf f11318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dn(zzcqf zzcqfVar, zzcdf zzcdfVar) {
        this.f11318b = zzcqfVar;
        this.a = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        synchronized (this.f11318b) {
            zzcqf.I7(this.f11318b, null);
            this.a.b().onAdFailedToLoad(zzcgm.b(th));
            zzcya.a(th, "NonagonRewardedAdImpl.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(zzcdb zzcdbVar) {
        zzcdb zzcdbVar2 = zzcdbVar;
        synchronized (this.f11318b) {
            zzcqf.I7(this.f11318b, null);
            this.f11318b.f14365g = zzcdbVar2;
            zzcdbVar2.c();
        }
    }
}
