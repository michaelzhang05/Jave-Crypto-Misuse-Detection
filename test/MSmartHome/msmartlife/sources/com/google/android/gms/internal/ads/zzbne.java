package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbne implements zzdti<zzbtb> {
    private final zzdtu<ScheduledExecutorService> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Clock> f13403b;

    public zzbne(zzdtu<ScheduledExecutorService> zzdtuVar, zzdtu<Clock> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13403b = zzdtuVar2;
    }

    public static zzbtb a(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbtb) zzdto.b(new zzbtb(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a.get(), this.f13403b.get());
    }
}
