package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbog implements zzdti<zzbbh<zzbnf>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<zzcxu>> f13437b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzblq> f13438c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcmx<zzbnf>> f13439d;

    public zzbog(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbnf>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13437b = zzdtuVar2;
        this.f13438c = zzdtuVar3;
        this.f13439d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.b(zzbqq.a(this.a.get(), this.f13437b.get(), this.f13438c.get(), this.f13439d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
