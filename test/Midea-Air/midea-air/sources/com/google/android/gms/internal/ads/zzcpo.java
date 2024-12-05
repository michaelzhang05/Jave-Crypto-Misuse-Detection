package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzcpo extends zzzg {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14333f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbjm f14334g;

    /* renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    private final zzcxx f14335h;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    private final zzbze f14336i;

    /* renamed from: j, reason: collision with root package name */
    private zzyz f14337j;

    public zzcpo(zzbjm zzbjmVar, Context context, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.f14335h = zzcxxVar;
        this.f14336i = new zzbze();
        this.f14334g = zzbjmVar;
        zzcxxVar.t(str);
        this.f14333f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void C2(zzaje zzajeVar) {
        this.f14336i.f(zzajeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void C5(zzzy zzzyVar) {
        this.f14335h.o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void C6(zzady zzadyVar) {
        this.f14335h.f(zzadyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void E3(zzafi zzafiVar) {
        this.f14336i.c(zzafiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void O1(PublisherAdViewOptions publisherAdViewOptions) {
        this.f14335h.e(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void O3(zzaiy zzaiyVar) {
        this.f14335h.g(zzaiyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void Q0(zzafu zzafuVar, zzyd zzydVar) {
        this.f14336i.a(zzafuVar);
        this.f14335h.n(zzydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void R5(String str, zzafr zzafrVar, zzafo zzafoVar) {
        this.f14336i.g(str, zzafrVar, zzafoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void U1(zzyz zzyzVar) {
        this.f14337j = zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void Y3(zzafx zzafxVar) {
        this.f14336i.e(zzafxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void n1(zzafl zzaflVar) {
        this.f14336i.d(zzaflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzzc x1() {
        zzbzc b2 = this.f14336i.b();
        this.f14335h.h(b2.f());
        this.f14335h.l(b2.g());
        zzcxx zzcxxVar = this.f14335h;
        if (zzcxxVar.G() == null) {
            zzcxxVar.n(zzyd.J(this.f14333f));
        }
        return new zzcpp(this.f14333f, this.f14334g, this.f14335h, b2, this.f14337j);
    }
}
