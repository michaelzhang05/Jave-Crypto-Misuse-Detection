package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcgl implements zzdti<zzcgb> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14028b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14029c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzclc> f14030d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14031e;

    public zzcgl(zzdtu<Executor> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzclc> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14028b = zzdtuVar2;
        this.f14029c = zzdtuVar3;
        this.f14030d = zzdtuVar4;
        this.f14031e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcgb(this.a.get(), this.f14028b.get(), this.f14029c.get(), this.f14030d.get(), this.f14031e.get());
    }
}
