package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxd implements zzdti<zzbxc> {
    private final zzdtu<zzbrt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxm> f13625b;

    private zzbxd(zzdtu<zzbrt> zzdtuVar, zzdtu<zzcxm> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13625b = zzdtuVar2;
    }

    public static zzbxd a(zzdtu<zzbrt> zzdtuVar, zzdtu<zzcxm> zzdtuVar2) {
        return new zzbxd(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxc(this.a.get(), this.f13625b.get());
    }
}
