package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfb implements zzbro, zzbsr, zzbtk {

    /* renamed from: f, reason: collision with root package name */
    private final zzcfi f13982f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13983g = (String) zzyt.e().c(zzacu.f0);

    /* renamed from: h, reason: collision with root package name */
    private final zzdae f13984h;

    public zzcfb(zzcfi zzcfiVar, zzdae zzdaeVar) {
        this.f13982f = zzcfiVar;
        this.f13984h = zzdaeVar;
    }

    private final void a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f13983g).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (((Boolean) zzyt.e().c(zzacu.e0)).booleanValue()) {
            this.f13984h.e(uri);
        }
        zzawz.m(uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(zzarx zzarxVar) {
        this.f13982f.b(zzarxVar.f12928f);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        a(this.f13982f.c());
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        a(this.f13982f.c());
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(zzcxu zzcxuVar) {
        this.f13982f.a(zzcxuVar);
    }
}
