package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class a3 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzaom a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzamv f11048b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzapc f11049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(zzapc zzapcVar, zzaom zzaomVar, zzamv zzamvVar) {
        this.f11049c = zzapcVar;
        this.a = zzaomVar;
        this.f11048b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        try {
            this.f11049c.f12853g = mediationInterstitialAd;
            this.a.B();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new e3(this.f11048b);
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
