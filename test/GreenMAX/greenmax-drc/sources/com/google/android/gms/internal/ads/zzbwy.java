package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwy implements zzdti<zzcjv<zzbvx>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f13610b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzclq> f13611c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcoc> f13612d;

    public zzbwy(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzclq> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13610b = zzdtuVar2;
        this.f13611c = zzdtuVar3;
        this.f13612d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.b(new zzcoe(this.a.get(), this.f13610b.get(), this.f13612d.get(), this.f13611c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
