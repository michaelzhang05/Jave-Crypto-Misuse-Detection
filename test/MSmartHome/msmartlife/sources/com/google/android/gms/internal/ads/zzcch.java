package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcch implements zzdti<zzccg> {
    private final zzdtu<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyn> f13880b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbyt> f13881c;

    private zzcch(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13880b = zzdtuVar2;
        this.f13881c = zzdtuVar3;
    }

    public static zzcch a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzcch(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccg(this.a.get(), this.f13880b.get(), this.f13881c.get());
    }
}
