package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzckz implements zzdti<zzckv> {
    private final zzdtu<zzboc> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzckb> f14165b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbrm> f14166c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14167d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbbl> f14168e;

    public zzckz(zzdtu<zzboc> zzdtuVar, zzdtu<zzckb> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<ScheduledExecutorService> zzdtuVar4, zzdtu<zzbbl> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14165b = zzdtuVar2;
        this.f14166c = zzdtuVar3;
        this.f14167d = zzdtuVar4;
        this.f14168e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckv(this.a.get(), this.f14165b.get(), this.f14166c.get(), this.f14167d.get(), this.f14168e.get());
    }
}
