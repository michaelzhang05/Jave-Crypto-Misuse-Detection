package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwu implements zzcva<zzcwt> {
    private zzaqm a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f14540b;

    /* renamed from: c, reason: collision with root package name */
    private Context f14541c;

    public zzcwu(zzaqm zzaqmVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.a = zzaqmVar;
        this.f14540b = scheduledExecutorService;
        this.f14541c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcwt> b() {
        return zzbar.d(zzbar.b(this.a.a(this.f14541c), ((Long) zzyt.e().c(zzacu.n3)).longValue(), TimeUnit.MILLISECONDS, this.f14540b), rp.a, zzaxg.a);
    }
}
