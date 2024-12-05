package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdi implements zzdti<zzbbh<zzcdb>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<zzcxu>> f13919b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzblq> f13920c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcmx<zzcdb>> f13921d;

    public zzcdi(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzcdb>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13919b = zzdtuVar2;
        this.f13920c = zzdtuVar3;
        this.f13921d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.b(zzbqq.a(this.a.get(), this.f13919b.get(), this.f13920c.get(), this.f13921d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
