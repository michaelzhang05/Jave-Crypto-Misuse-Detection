package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@zzard
/* loaded from: classes2.dex */
public final class zzxy extends zzzq {

    /* renamed from: f, reason: collision with root package name */
    private final AdMetadataListener f15790f;

    public zzxy(AdMetadataListener adMetadataListener) {
        this.f15790f = adMetadataListener;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.f15790f;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
