package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwu implements zzdti<zzbbh<zzbvx>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<zzcxu>> f13607b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzblq> f13608c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcmx<zzbvx>> f13609d;

    public zzbwu(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbvx>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13607b = zzdtuVar2;
        this.f13608c = zzdtuVar3;
        this.f13609d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.b(zzbqq.a(this.a.get(), this.f13607b.get(), this.f13608c.get(), this.f13609d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
