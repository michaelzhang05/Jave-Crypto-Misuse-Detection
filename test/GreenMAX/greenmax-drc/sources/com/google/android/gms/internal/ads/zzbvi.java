package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbvi implements zzdti<zzbvh> {
    private final zzdtu<zzcxm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzdae> f13576b;

    private zzbvi(zzdtu<zzcxm> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13576b = zzdtuVar2;
    }

    public static zzbvi a(zzdtu<zzcxm> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        return new zzbvi(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbvh(this.a.get(), this.f13576b.get());
    }
}
