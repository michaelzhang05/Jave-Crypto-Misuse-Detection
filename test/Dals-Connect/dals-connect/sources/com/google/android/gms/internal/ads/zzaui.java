package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

@zzard
/* loaded from: classes2.dex */
public final class zzaui extends zzatx {

    /* renamed from: f, reason: collision with root package name */
    private final RewardedAdCallback f12984f;

    public zzaui(RewardedAdCallback rewardedAdCallback) {
        this.f12984f = rewardedAdCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void G1() {
        RewardedAdCallback rewardedAdCallback = this.f12984f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void J6(int i2) {
        RewardedAdCallback rewardedAdCallback = this.f12984f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void Y(zzatq zzatqVar) {
        RewardedAdCallback rewardedAdCallback = this.f12984f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauh(zzatqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void Z0() {
        RewardedAdCallback rewardedAdCallback = this.f12984f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }
}
