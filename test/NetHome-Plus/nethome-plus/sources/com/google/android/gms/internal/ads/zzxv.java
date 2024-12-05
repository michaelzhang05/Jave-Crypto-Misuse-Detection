package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
/* loaded from: classes2.dex */
public final class zzxv extends zzza {

    /* renamed from: f, reason: collision with root package name */
    private final AdListener f15789f;

    public zzxv(AdListener adListener) {
        this.f15789f = adListener;
    }

    public final AdListener H7() {
        return this.f15789f;
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClicked() {
        this.f15789f.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClosed() {
        this.f15789f.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdFailedToLoad(int i2) {
        this.f15789f.onAdFailedToLoad(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdImpression() {
        this.f15789f.onAdImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLeftApplication() {
        this.f15789f.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLoaded() {
        this.f15789f.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdOpened() {
        this.f15789f.onAdOpened();
    }
}
