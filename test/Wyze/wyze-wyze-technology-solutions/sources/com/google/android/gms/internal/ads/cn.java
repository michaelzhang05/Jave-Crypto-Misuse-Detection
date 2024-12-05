package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class cn implements zzban<zzbvx> {
    private final /* synthetic */ zzbws a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcqd f11252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn(zzcqd zzcqdVar, zzbws zzbwsVar) {
        this.f11252b = zzcqdVar;
        this.a = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        synchronized (this.f11252b) {
            zzcqd.I7(this.f11252b, null);
            this.a.b().onAdFailedToLoad(zzcgm.b(th));
            zzcya.a(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(zzbvx zzbvxVar) {
        zzbvx zzbvxVar2 = zzbvxVar;
        synchronized (this.f11252b) {
            zzcqd.I7(this.f11252b, null);
            this.f11252b.n = zzbvxVar2;
            zzbvxVar2.c();
        }
    }
}
