package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcca implements zzdti<zzcbz> {
    private final zzdtu<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyn> f13863b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbyt> f13864c;

    private zzcca(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13863b = zzdtuVar2;
        this.f13864c = zzdtuVar3;
    }

    public static zzcca a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzcca(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbz(this.a.get(), this.f13863b.get(), this.f13864c.get());
    }
}
