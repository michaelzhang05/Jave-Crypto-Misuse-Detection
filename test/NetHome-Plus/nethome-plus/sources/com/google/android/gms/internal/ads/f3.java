package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
final class f3 implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzapl f11390f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(zzapl zzaplVar) {
        this.f11390f = zzaplVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        zzbad.e("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        zzbad.e("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbad.e("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.f11390f.f12858b;
        mediationInterstitialListener.onAdClosed(this.f11390f);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbad.e("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.f11390f.f12858b;
        mediationInterstitialListener.onAdOpened(this.f11390f);
    }
}
