package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fn implements zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private zzbsr f11432f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzcqf f11433g;

    public fn(zzcqf zzcqfVar, zzbsr zzbsrVar) {
        this.f11433g = zzcqfVar;
        this.f11432f = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f11433g.L7();
        this.f11432f.onAdLoaded();
        this.f11433g.M7();
    }
}
