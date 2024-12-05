package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzbxg implements zzbrl, zzbur {

    /* renamed from: f, reason: collision with root package name */
    private final zzavf f13626f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f13627g;

    /* renamed from: h, reason: collision with root package name */
    private final zzavg f13628h;

    /* renamed from: i, reason: collision with root package name */
    private final View f13629i;

    /* renamed from: j, reason: collision with root package name */
    private String f13630j;

    /* renamed from: k, reason: collision with root package name */
    private final int f13631k;

    public zzbxg(zzavf zzavfVar, Context context, zzavg zzavgVar, View view, int i2) {
        this.f13626f = zzavfVar;
        this.f13627g = context;
        this.f13628h = zzavgVar;
        this.f13629i = view;
        this.f13631k = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void a(zzasr zzasrVar, String str, String str2) {
        if (this.f13628h.D(this.f13627g)) {
            try {
                zzavg zzavgVar = this.f13628h;
                Context context = this.f13627g;
                zzavgVar.g(context, zzavgVar.n(context), this.f13626f.j(), zzasrVar.getType(), zzasrVar.getAmount());
            } catch (RemoteException e2) {
                zzbad.d("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
        this.f13626f.k(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
        View view = this.f13629i;
        if (view != null && this.f13630j != null) {
            this.f13628h.t(view.getContext(), this.f13630j);
        }
        this.f13626f.k(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void y() {
        String F = this.f13628h.F(this.f13627g);
        this.f13630j = F;
        String valueOf = String.valueOf(F);
        String str = this.f13631k == 7 ? "/Rewarded" : "/Interstitial";
        this.f13630j = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}
