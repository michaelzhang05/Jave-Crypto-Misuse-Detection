package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbme implements zzbrl, zzbrw, zzbsr, zzxr {

    /* renamed from: f, reason: collision with root package name */
    private final zzcxu f13354f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcxm f13355g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdae f13356h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13357i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13358j;

    public zzbme(zzcxu zzcxuVar, zzcxm zzcxmVar, zzdae zzdaeVar) {
        this.f13354f = zzcxuVar;
        this.f13355g = zzcxmVar;
        this.f13356h = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void a(zzasr zzasrVar, String str, String str2) {
        zzdae zzdaeVar = this.f13356h;
        zzcxu zzcxuVar = this.f13354f;
        zzcxm zzcxmVar = this.f13355g;
        zzdaeVar.b(zzcxuVar, zzcxmVar, zzcxmVar.f14553h, zzasrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() {
        zzdae zzdaeVar = this.f13356h;
        zzcxu zzcxuVar = this.f13354f;
        zzcxm zzcxmVar = this.f13355g;
        zzdaeVar.a(zzcxuVar, zzcxmVar, zzcxmVar.f14548c);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        if (!this.f13358j) {
            zzdae zzdaeVar = this.f13356h;
            zzcxu zzcxuVar = this.f13354f;
            zzcxm zzcxmVar = this.f13355g;
            zzdaeVar.a(zzcxuVar, zzcxmVar, zzcxmVar.f14549d);
            this.f13358j = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f13357i) {
            ArrayList arrayList = new ArrayList(this.f13355g.f14549d);
            arrayList.addAll(this.f13355g.f14551f);
            this.f13356h.c(this.f13354f, this.f13355g, true, arrayList);
        } else {
            zzdae zzdaeVar = this.f13356h;
            zzcxu zzcxuVar = this.f13354f;
            zzcxm zzcxmVar = this.f13355g;
            zzdaeVar.a(zzcxuVar, zzcxmVar, zzcxmVar.m);
            zzdae zzdaeVar2 = this.f13356h;
            zzcxu zzcxuVar2 = this.f13354f;
            zzcxm zzcxmVar2 = this.f13355g;
            zzdaeVar2.a(zzcxuVar2, zzcxmVar2, zzcxmVar2.f14551f);
        }
        this.f13357i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
        zzdae zzdaeVar = this.f13356h;
        zzcxu zzcxuVar = this.f13354f;
        zzcxm zzcxmVar = this.f13355g;
        zzdaeVar.a(zzcxuVar, zzcxmVar, zzcxmVar.f14554i);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
        zzdae zzdaeVar = this.f13356h;
        zzcxu zzcxuVar = this.f13354f;
        zzcxm zzcxmVar = this.f13355g;
        zzdaeVar.a(zzcxuVar, zzcxmVar, zzcxmVar.f14552g);
    }
}
