package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wa implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f, reason: collision with root package name */
    private zzbgz f12327f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.zzo f12328g;

    public wa(zzbgz zzbgzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.f12327f = zzbgzVar;
        this.f12328g = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f12328g.zzsz();
        this.f12327f.J();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        this.f12328g.zzta();
        this.f12327f.c0();
    }
}
