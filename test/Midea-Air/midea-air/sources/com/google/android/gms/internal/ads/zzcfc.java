package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcfc implements zzdti<zzcfb> {
    private final zzdtu<zzcfi> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzdae> f13985b;

    private zzcfc(zzdtu<zzcfi> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13985b = zzdtuVar2;
    }

    public static zzcfc a(zzdtu<zzcfi> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        return new zzcfc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfb(this.a.get(), this.f13985b.get());
    }
}
