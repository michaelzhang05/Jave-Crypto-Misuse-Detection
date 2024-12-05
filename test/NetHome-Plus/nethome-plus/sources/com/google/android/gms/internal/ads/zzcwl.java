package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcwl implements zzdti<zzcwj> {
    private final zzdtu<zzawe> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14530b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<String> f14531c;

    public zzcwl(zzdtu<zzawe> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<String> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14530b = zzdtuVar2;
        this.f14531c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwj(this.a.get(), this.f14530b.get(), this.f14531c.get());
    }
}
