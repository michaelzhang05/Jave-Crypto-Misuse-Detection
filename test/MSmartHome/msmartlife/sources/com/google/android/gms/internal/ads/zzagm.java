package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagm extends zzafj {

    /* renamed from: f, reason: collision with root package name */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f12705f;

    public zzagm(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f12705f = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void A3(zzaew zzaewVar) {
        this.f12705f.onAppInstallAdLoaded(new zzaez(zzaewVar));
    }
}
