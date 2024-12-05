package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

@zzard
/* loaded from: classes2.dex */
public final class zzaul extends zzauc {

    /* renamed from: f, reason: collision with root package name */
    private final RewardedAdLoadCallback f12985f;

    public zzaul(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f12985f = rewardedAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void Y0() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f12985f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void Z4(int i2) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f12985f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i2);
        }
    }
}
