package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcuq implements zzdti<zzcul> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14464b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<String> f14465c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcpf> f14466d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<Context> f14467e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzcxv> f14468f;

    private zzcuq(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzcpf> zzdtuVar4, zzdtu<Context> zzdtuVar5, zzdtu<zzcxv> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f14464b = zzdtuVar2;
        this.f14465c = zzdtuVar3;
        this.f14466d = zzdtuVar4;
        this.f14467e = zzdtuVar5;
        this.f14468f = zzdtuVar6;
    }

    public static zzcuq a(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzcpf> zzdtuVar4, zzdtu<Context> zzdtuVar5, zzdtu<zzcxv> zzdtuVar6) {
        return new zzcuq(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcul(this.a.get(), this.f14464b.get(), this.f14465c.get(), this.f14466d.get(), this.f14467e.get(), this.f14468f.get());
    }
}
