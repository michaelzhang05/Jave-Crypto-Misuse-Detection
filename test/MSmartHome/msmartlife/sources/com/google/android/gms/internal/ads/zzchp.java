package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzchp implements zzdti<zzchl> {
    private final zzdtu<zzbtg> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxv> f14069b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcgn> f14070c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbbl> f14071d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14072e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzcji> f14073f;

    private zzchp(zzdtu<zzbtg> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzcgn> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5, zzdtu<zzcji> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f14069b = zzdtuVar2;
        this.f14070c = zzdtuVar3;
        this.f14071d = zzdtuVar4;
        this.f14072e = zzdtuVar5;
        this.f14073f = zzdtuVar6;
    }

    public static zzchp a(zzdtu<zzbtg> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzcgn> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5, zzdtu<zzcji> zzdtuVar6) {
        return new zzchp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzchl(this.a.get(), this.f14069b.get(), this.f14070c.get(), this.f14071d.get(), this.f14072e.get(), this.f14073f.get());
    }
}
