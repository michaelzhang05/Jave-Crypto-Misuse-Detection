package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcby implements zzdti<zzcbw> {
    private final zzdtu<zzbyn> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyt> f13853b;

    private zzcby(zzdtu<zzbyn> zzdtuVar, zzdtu<zzbyt> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13853b = zzdtuVar2;
    }

    public static zzcby a(zzdtu<zzbyn> zzdtuVar, zzdtu<zzbyt> zzdtuVar2) {
        return new zzcby(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbw(this.a.get(), this.f13853b.get());
    }
}
