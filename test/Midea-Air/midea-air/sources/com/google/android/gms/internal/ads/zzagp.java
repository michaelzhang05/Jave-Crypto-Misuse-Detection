package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagp extends zzafs {

    /* renamed from: f, reason: collision with root package name */
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f12708f;

    public zzagp(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f12708f = onCustomTemplateAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final void U4(zzafe zzafeVar) {
        this.f12708f.onCustomTemplateAdLoaded(zzafh.a(zzafeVar));
    }
}
