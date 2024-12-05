package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbqr implements zzbtk {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13517f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcxv f13518g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbai f13519h;

    /* renamed from: i, reason: collision with root package name */
    private final zzaxb f13520i;

    /* renamed from: j, reason: collision with root package name */
    private final zzcgb f13521j;

    public zzbqr(Context context, zzcxv zzcxvVar, zzbai zzbaiVar, zzaxb zzaxbVar, zzcgb zzcgbVar) {
        this.f13517f = context;
        this.f13518g = zzcxvVar;
        this.f13519h = zzbaiVar;
        this.f13520i = zzaxbVar;
        this.f13521j = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(zzarx zzarxVar) {
        if (((Boolean) zzyt.e().c(zzacu.c3)).booleanValue()) {
            zzk.zzlo().zza(this.f13517f, this.f13519h, this.f13518g.f14575f, this.f13520i.z());
        }
        this.f13521j.k();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(zzcxu zzcxuVar) {
    }
}
