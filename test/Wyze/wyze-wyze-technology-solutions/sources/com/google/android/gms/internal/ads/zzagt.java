package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes2.dex */
public final class zzagt extends zzage {

    /* renamed from: f, reason: collision with root package name */
    private final UnifiedNativeAd.UnconfirmedClickListener f12711f;

    public zzagt(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f12711f = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void onUnconfirmedClickCancelled() {
        this.f12711f.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void onUnconfirmedClickReceived(String str) {
        this.f12711f.onUnconfirmedClickReceived(str);
    }
}
