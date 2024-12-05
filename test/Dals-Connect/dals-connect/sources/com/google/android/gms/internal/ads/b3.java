package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class b3 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzaos a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzamv f11113b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzapc f11114c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b3(zzapc zzapcVar, zzaos zzaosVar, zzamv zzamvVar) {
        this.f11114c = zzapcVar;
        this.a = zzaosVar;
        this.f11113b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.f11114c.f12854h = mediationRewardedAd;
            this.a.B();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new e3(this.f11113b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.a.j(str);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
