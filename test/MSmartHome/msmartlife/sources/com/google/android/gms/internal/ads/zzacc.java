package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzacc extends zzaav {

    /* renamed from: f, reason: collision with root package name */
    private final VideoController.VideoLifecycleCallbacks f12608f;

    public zzacc(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f12608f = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void S() {
        this.f12608f.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPause() {
        this.f12608f.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPlay() {
        this.f12608f.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoStart() {
        this.f12608f.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void x0(boolean z) {
        this.f12608f.onVideoMute(z);
    }
}
