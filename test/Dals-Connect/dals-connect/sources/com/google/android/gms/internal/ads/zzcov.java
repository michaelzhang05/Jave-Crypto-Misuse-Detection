package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcov<AdT> implements zzdti<zzcor<AdT>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14307b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzado> f14308c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcou<AdT>> f14309d;

    public zzcov(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzado> zzdtuVar3, zzdtu<zzcou<AdT>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14307b = zzdtuVar2;
        this.f14308c = zzdtuVar3;
        this.f14309d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcor(this.a.get(), this.f14307b.get(), this.f14308c.get(), this.f14309d.get());
    }
}
