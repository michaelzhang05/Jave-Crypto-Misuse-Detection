package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwq implements zzcva<zzcwp> {
    private zzamg a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f14534b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14535c;

    /* renamed from: d, reason: collision with root package name */
    private ApplicationInfo f14536d;

    public zzcwq(zzamg zzamgVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.a = zzamgVar;
        this.f14534b = scheduledExecutorService;
        this.f14535c = z;
        this.f14536d = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcwp> b() {
        if (!this.f14535c) {
            return zzbar.l(new Exception("Auto Collect Location is false."));
        }
        return zzbar.d(zzbar.b(this.a.a(this.f14536d), ((Long) zzyt.e().c(zzacu.X2)).longValue(), TimeUnit.MILLISECONDS, this.f14534b), qp.a, zzaxg.a);
    }
}
