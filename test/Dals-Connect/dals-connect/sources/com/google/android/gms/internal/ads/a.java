package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends zzyv {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzabb f11038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(zzabb zzabbVar) {
        this.f11038c = zzabbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i2) {
        VideoController videoController;
        videoController = this.f11038c.f12578d;
        videoController.zza(this.f11038c.D());
        super.onAdFailedToLoad(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.f11038c.f12578d;
        videoController.zza(this.f11038c.D());
        super.onAdLoaded();
    }
}
