package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class jn implements zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private zzbsr f11659f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzcqj f11660g;

    public jn(zzcqj zzcqjVar, zzbsr zzbsrVar) {
        this.f11660g = zzcqjVar;
        this.f11659f = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f11660g.M7();
        this.f11659f.onAdLoaded();
        this.f11660g.N7();
    }
}
