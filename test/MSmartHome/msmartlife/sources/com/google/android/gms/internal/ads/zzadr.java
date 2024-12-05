package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzard
/* loaded from: classes2.dex */
public final class zzadr extends zzadp {

    /* renamed from: f, reason: collision with root package name */
    private final OnCustomRenderedAdLoadedListener f12655f;

    public zzadr(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f12655f = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void E2(zzadl zzadlVar) {
        this.f12655f.onCustomRenderedAdLoaded(new zzadk(zzadlVar));
    }
}
