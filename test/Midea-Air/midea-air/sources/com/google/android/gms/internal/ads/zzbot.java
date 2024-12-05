package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbot implements zzbrw, zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13454f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbgz f13455g;

    /* renamed from: h, reason: collision with root package name */
    private final zzcxm f13456h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbai f13457i;

    /* renamed from: j, reason: collision with root package name */
    private IObjectWrapper f13458j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13459k;

    public zzbot(Context context, zzbgz zzbgzVar, zzcxm zzcxmVar, zzbai zzbaiVar) {
        this.f13454f = context;
        this.f13455g = zzbgzVar;
        this.f13456h = zzcxmVar;
        this.f13457i = zzbaiVar;
    }

    private final synchronized void a() {
        if (this.f13456h.J) {
            if (this.f13455g == null) {
                return;
            }
            if (zzk.zzlv().g(this.f13454f)) {
                zzbai zzbaiVar = this.f13457i;
                int i2 = zzbaiVar.f13151g;
                int i3 = zzbaiVar.f13152h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                this.f13458j = zzk.zzlv().b(sb.toString(), this.f13455g.getWebView(), HttpUrl.FRAGMENT_ENCODE_SET, "javascript", this.f13456h.L.optInt("media_type", -1) == 0 ? null : "javascript");
                View view = this.f13455g.getView();
                if (this.f13458j != null && view != null) {
                    zzk.zzlv().d(this.f13458j, view);
                    this.f13455g.H(this.f13458j);
                    zzk.zzlv().e(this.f13458j);
                    this.f13459k = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        zzbgz zzbgzVar;
        if (!this.f13459k) {
            a();
        }
        if (this.f13456h.J && this.f13458j != null && (zzbgzVar = this.f13455g) != null) {
            zzbgzVar.y("onSdkImpression", new c.e.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f13459k) {
            return;
        }
        a();
    }
}
