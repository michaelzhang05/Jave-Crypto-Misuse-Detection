package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbmf implements zzdti<zzbme> {
    private final zzdtu<zzcxu> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxm> f13359b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzdae> f13360c;

    private zzbmf(zzdtu<zzcxu> zzdtuVar, zzdtu<zzcxm> zzdtuVar2, zzdtu<zzdae> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13359b = zzdtuVar2;
        this.f13360c = zzdtuVar3;
    }

    public static zzbmf a(zzdtu<zzcxu> zzdtuVar, zzdtu<zzcxm> zzdtuVar2, zzdtu<zzdae> zzdtuVar3) {
        return new zzbmf(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbme(this.a.get(), this.f13359b.get(), this.f13360c.get());
    }
}
