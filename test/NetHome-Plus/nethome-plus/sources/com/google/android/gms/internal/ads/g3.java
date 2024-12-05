package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
final class g3 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f11454f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzapl f11455g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g3(zzapl zzaplVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f11455g = zzaplVar;
        this.f11454f = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        zzk.zzlf();
        activity = this.f11455g.a;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.f11454f, true);
    }
}
