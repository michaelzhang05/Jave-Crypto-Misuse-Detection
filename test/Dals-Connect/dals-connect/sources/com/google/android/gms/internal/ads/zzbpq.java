package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbpq implements zzdti<zzbpk> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f13493b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbbh<zzbph>> f13494c;

    public zzbpq(zzdtu<Executor> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<zzbbh<zzbph>> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13493b = zzdtuVar2;
        this.f13494c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbpk(this.a.get(), this.f13493b.get(), this.f13494c.get());
    }
}
