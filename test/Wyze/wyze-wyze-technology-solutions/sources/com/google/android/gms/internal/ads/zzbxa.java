package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbxa implements com.google.android.gms.ads.internal.overlay.zzo, zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13613f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbgz f13614g;

    /* renamed from: h, reason: collision with root package name */
    private final zzcxm f13615h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbai f13616i;

    /* renamed from: j, reason: collision with root package name */
    private final int f13617j;

    /* renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    private IObjectWrapper f13618k;

    public zzbxa(Context context, zzbgz zzbgzVar, zzcxm zzcxmVar, zzbai zzbaiVar, int i2) {
        this.f13613f = context;
        this.f13614g = zzbgzVar;
        this.f13615h = zzcxmVar;
        this.f13616i = zzbaiVar;
        this.f13617j = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        int i2 = this.f13617j;
        if ((i2 == 7 || i2 == 3) && this.f13615h.J && this.f13614g != null && zzk.zzlv().g(this.f13613f)) {
            zzbai zzbaiVar = this.f13616i;
            int i3 = zzbaiVar.f13151g;
            int i4 = zzbaiVar.f13152h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i3);
            sb.append(".");
            sb.append(i4);
            IObjectWrapper b2 = zzk.zzlv().b(sb.toString(), this.f13614g.getWebView(), HttpUrl.FRAGMENT_ENCODE_SET, "javascript", this.f13615h.L.optInt("media_type", -1) == 0 ? null : "javascript");
            this.f13618k = b2;
            if (b2 == null || this.f13614g.getView() == null) {
                return;
            }
            zzk.zzlv().d(this.f13618k, this.f13614g.getView());
            this.f13614g.H(this.f13618k);
            zzk.zzlv().e(this.f13618k);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f13618k = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        zzbgz zzbgzVar;
        if (this.f13618k == null || (zzbgzVar = this.f13614g) == null) {
            return;
        }
        zzbgzVar.y("onSdkImpression", new HashMap());
    }
}
