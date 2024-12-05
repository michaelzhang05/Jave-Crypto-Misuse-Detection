package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class mb implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f, reason: collision with root package name */
    private zzbgz f11810f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.zzo f11811g;

    public mb(zzbgz zzbgzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.f11810f = zzbgzVar;
        this.f11811g = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f11811g.zzsz();
        this.f11810f.J();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f11811g.zzta();
        this.f11810f.c0();
    }
}
