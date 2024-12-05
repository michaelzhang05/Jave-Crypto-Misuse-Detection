package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzccc implements zzdti<zzccb> {
    private final zzdtu<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyn> f13868b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbyt> f13869c;

    private zzccc(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13868b = zzdtuVar2;
        this.f13869c = zzdtuVar3;
    }

    public static zzccc a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzccc(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccb(this.a.get(), this.f13868b.get(), this.f13869c.get());
    }
}
