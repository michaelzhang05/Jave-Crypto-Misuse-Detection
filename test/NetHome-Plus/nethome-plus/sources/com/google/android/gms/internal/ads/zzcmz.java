package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcmz<AdT> implements zzdti<zzcmx<AdT>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcmu> f14244b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbrm> f14245c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzdae> f14246d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbpe<AdT>> f14247e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<Executor> f14248f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14249g;

    private zzcmz(zzdtu<zzczt> zzdtuVar, zzdtu<zzcmu> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<zzdae> zzdtuVar4, zzdtu<zzbpe<AdT>> zzdtuVar5, zzdtu<Executor> zzdtuVar6, zzdtu<ScheduledExecutorService> zzdtuVar7) {
        this.a = zzdtuVar;
        this.f14244b = zzdtuVar2;
        this.f14245c = zzdtuVar3;
        this.f14246d = zzdtuVar4;
        this.f14247e = zzdtuVar5;
        this.f14248f = zzdtuVar6;
        this.f14249g = zzdtuVar7;
    }

    public static <AdT> zzcmz<AdT> a(zzdtu<zzczt> zzdtuVar, zzdtu<zzcmu> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<zzdae> zzdtuVar4, zzdtu<zzbpe<AdT>> zzdtuVar5, zzdtu<Executor> zzdtuVar6, zzdtu<ScheduledExecutorService> zzdtuVar7) {
        return new zzcmz<>(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcmx(this.a.get(), this.f14244b.get(), this.f14245c.get(), this.f14246d.get(), this.f14247e.get(), this.f14248f.get(), this.f14249g.get());
    }
}
