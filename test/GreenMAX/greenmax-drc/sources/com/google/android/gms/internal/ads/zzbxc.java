package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxc implements zzbrl {

    /* renamed from: f, reason: collision with root package name */
    private final zzbrt f13623f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcxm f13624g;

    public zzbxc(zzbrt zzbrtVar, zzcxm zzcxmVar) {
        this.f13623f = zzbrtVar;
        this.f13624g = zzcxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void a(zzasr zzasrVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
        int i2 = this.f13624g.O;
        if (i2 == 0 || i2 == 1) {
            this.f13623f.Y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }
}
