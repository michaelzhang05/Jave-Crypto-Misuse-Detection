package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzboj implements zzdti<zzcjv<zzbnf>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f13440b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzckm> f13441c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcoc> f13442d;

    public zzboj(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzckm> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13440b = zzdtuVar2;
        this.f13441c = zzdtuVar3;
        this.f13442d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.b(new zzcoe(this.a.get(), this.f13440b.get(), this.f13442d.get(), this.f13441c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
