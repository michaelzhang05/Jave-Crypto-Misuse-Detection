package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class hn implements zzban<zzcdb> {
    private final /* synthetic */ zzcdf a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcqj f11540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hn(zzcqj zzcqjVar, zzcdf zzcdfVar) {
        this.f11540b = zzcqjVar;
        this.a = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        synchronized (this.f11540b) {
            zzcqj.I7(this.f11540b, null);
            this.a.b().onAdFailedToLoad(zzcgm.b(th));
            zzcya.a(th, "NonagonRewardedVideoAdImpl.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(zzcdb zzcdbVar) {
        zzcdb zzcdbVar2 = zzcdbVar;
        synchronized (this.f11540b) {
            zzcqj.I7(this.f11540b, null);
            this.f11540b.f14371g = zzcdbVar2;
            zzcdbVar2.c();
        }
    }
}
