package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdaa implements zzdti<zzczt> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14643b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<lq> f14644c;

    private zzdaa(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<lq> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14643b = zzdtuVar2;
        this.f14644c = zzdtuVar3;
    }

    public static zzdaa a(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<lq> zzdtuVar3) {
        return new zzdaa(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzczt(this.a.get(), this.f14643b.get(), this.f14644c.get());
    }
}
