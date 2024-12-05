package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdm implements zzdti<zzcjv<zzcdb>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f13922b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcnd> f13923c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcoc> f13924d;

    public zzcdm(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcnd> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13922b = zzdtuVar2;
        this.f13923c = zzdtuVar3;
        this.f13924d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.b(new zzcoe(this.a.get(), this.f13922b.get(), this.f13924d.get(), this.f13923c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
