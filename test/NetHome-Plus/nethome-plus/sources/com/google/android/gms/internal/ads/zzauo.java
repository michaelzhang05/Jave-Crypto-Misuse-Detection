package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzauo implements MediationRewardedAdCallback {
    private final zzamv a;

    public zzauo(zzamv zzamvVar) {
        this.a = zzamvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdFailedToShow.");
        String valueOf = String.valueOf(str);
        zzbad.i(valueOf.length() != 0 ? "Mediation ad failed to show: ".concat(valueOf) : new String("Mediation ad failed to show: "));
        try {
            this.a.E(0);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onUserEarnedReward.");
        try {
            this.a.Y(new zzaup(rewardItem));
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onVideoComplete.");
        try {
            this.a.h7();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onVideoStart.");
        try {
            this.a.H0();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called reportAdClicked.");
        try {
            this.a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called reportAdImpression.");
        try {
            this.a.onAdImpression();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }
}
