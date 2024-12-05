package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
/* loaded from: classes2.dex */
public final class zzago extends zzafp {

    /* renamed from: f, reason: collision with root package name */
    private final NativeCustomTemplateAd.OnCustomClickListener f12707f;

    public zzago(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f12707f = onCustomClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    public final void j0(zzafe zzafeVar, String str) {
        this.f12707f.onCustomClick(zzafh.a(zzafeVar), str);
    }
}
