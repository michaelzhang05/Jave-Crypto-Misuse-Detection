package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcvr implements zzdti<zzcvo> {
    private final zzdtu<zzawi> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14511b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14512c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Executor> f14513d;

    public zzcvr(zzdtu<zzawi> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<ScheduledExecutorService> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14511b = zzdtuVar2;
        this.f14512c = zzdtuVar3;
        this.f14513d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvo(this.a.get(), this.f14511b.get(), this.f14512c.get(), this.f14513d.get());
    }
}
