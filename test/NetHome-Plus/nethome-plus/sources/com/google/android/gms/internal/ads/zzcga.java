package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcga implements zzdti<zzcfz> {
    private final zzdtu<zzcfn> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbjm> f14018b;

    private zzcga(zzdtu<zzcfn> zzdtuVar, zzdtu<zzbjm> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14018b = zzdtuVar2;
    }

    public static zzcga a(zzdtu<zzcfn> zzdtuVar, zzdtu<zzbjm> zzdtuVar2) {
        return new zzcga(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfz(this.a.get(), this.f14018b.get());
    }
}
