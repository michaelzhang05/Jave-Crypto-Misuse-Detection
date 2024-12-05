package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsm;

/* loaded from: classes2.dex */
public final class zzcoi<AdT, AdapterT, ListenerT extends zzbsm> implements zzdti<zzcoe<AdT, AdapterT, ListenerT>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14282b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcjz<AdapterT, ListenerT>> f14283c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcka<AdT, AdapterT, ListenerT>> f14284d;

    private zzcoi(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtuVar3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14282b = zzdtuVar2;
        this.f14283c = zzdtuVar3;
        this.f14284d = zzdtuVar4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbsm> zzcoi<AdT, AdapterT, ListenerT> a(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtuVar3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtuVar4) {
        return new zzcoi<>(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcoe(this.a.get(), this.f14282b.get(), this.f14283c.get(), this.f14284d.get());
    }
}
