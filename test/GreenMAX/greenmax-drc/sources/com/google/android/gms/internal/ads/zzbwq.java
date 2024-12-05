package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwq implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f, reason: collision with root package name */
    private final zzbsv f13604f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbuv f13605g;

    public zzbwq(zzbsv zzbsvVar, zzbuv zzbuvVar) {
        this.f13604f = zzbsvVar;
        this.f13605g = zzbuvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        this.f13604f.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        this.f13604f.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f13604f.zzsz();
        this.f13605g.Y();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f13604f.zzta();
        this.f13605g.f0();
    }
}
