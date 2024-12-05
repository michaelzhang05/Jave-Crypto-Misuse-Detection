package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagn extends zzafm {

    /* renamed from: f, reason: collision with root package name */
    private final NativeContentAd.OnContentAdLoadedListener f12706f;

    public zzagn(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f12706f = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void j2(zzafa zzafaVar) {
        this.f12706f.onContentAdLoaded(new zzafd(zzafaVar));
    }
}
