package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqe implements zzbrl, zzbrw, zzbsr, zzbtk, zzxr {

    /* renamed from: f, reason: collision with root package name */
    private final Clock f13506f;

    /* renamed from: g, reason: collision with root package name */
    private final zzawj f13507g;

    public zzbqe(Clock clock, zzawj zzawjVar) {
        this.f13506f = clock;
        this.f13507g = zzawjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void a(zzasr zzasrVar, String str, String str2) {
    }

    public final void b(zzxz zzxzVar) {
        this.f13507g.d(zzxzVar);
    }

    public final String c() {
        return this.f13507g.i();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() {
        this.f13507g.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
        this.f13507g.h();
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() {
        this.f13507g.f();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f13507g.c(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(zzcxu zzcxuVar) {
        this.f13507g.e(this.f13506f.b());
    }
}
