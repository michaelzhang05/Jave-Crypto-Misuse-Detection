package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxs implements zzdti<zzbbh<zzbph>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<zzcxu>> f13641b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzblq> f13642c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcmx<zzbph>> f13643d;

    public zzbxs(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbph>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13641b = zzdtuVar2;
        this.f13642c = zzdtuVar3;
        this.f13643d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.b(zzbqq.a(this.a.get(), this.f13641b.get(), this.f13642c.get(), this.f13643d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
