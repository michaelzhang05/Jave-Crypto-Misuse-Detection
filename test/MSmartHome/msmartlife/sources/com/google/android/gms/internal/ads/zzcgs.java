package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcgs implements zzdti<zzcgn> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14036b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzchv> f14037c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcig> f14038d;

    private zzcgs(zzdtu<zzbbl> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzchv> zzdtuVar3, zzdtu<zzcig> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14036b = zzdtuVar2;
        this.f14037c = zzdtuVar3;
        this.f14038d = zzdtuVar4;
    }

    public static zzcgs a(zzdtu<zzbbl> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzchv> zzdtuVar3, zzdtu<zzcig> zzdtuVar4) {
        return new zzcgs(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcgn(this.a.get(), this.f14036b.get(), this.f14037c.get(), zzdth.b(this.f14038d));
    }
}
