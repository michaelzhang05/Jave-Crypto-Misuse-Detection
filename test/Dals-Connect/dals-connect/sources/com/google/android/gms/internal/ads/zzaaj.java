package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes2.dex */
public final class zzaaj extends zzaah {

    /* renamed from: f, reason: collision with root package name */
    private final MuteThisAdListener f12553f;

    public zzaaj(MuteThisAdListener muteThisAdListener) {
        this.f12553f = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void onAdMuted() {
        this.f12553f.onAdMuted();
    }
}
