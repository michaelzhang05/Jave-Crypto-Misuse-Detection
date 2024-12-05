package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
/* loaded from: classes2.dex */
public class zzyv extends AdListener {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private AdListener f15837b;

    public final void a(AdListener adListener) {
        synchronized (this.a) {
            this.f15837b = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        synchronized (this.a) {
            AdListener adListener = this.f15837b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i2) {
        synchronized (this.a) {
            AdListener adListener = this.f15837b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(i2);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
        synchronized (this.a) {
            AdListener adListener = this.f15837b;
            if (adListener != null) {
                adListener.onAdLeftApplication();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.a) {
            AdListener adListener = this.f15837b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        synchronized (this.a) {
            AdListener adListener = this.f15837b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}
