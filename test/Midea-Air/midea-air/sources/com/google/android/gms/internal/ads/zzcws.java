package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcws implements zzdti<zzcwq> {
    private final zzdtu<zzamg> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14537b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Boolean> f14538c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<ApplicationInfo> f14539d;

    public zzcws(zzdtu<zzamg> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<Boolean> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14537b = zzdtuVar2;
        this.f14538c = zzdtuVar3;
        this.f14539d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwq(this.a.get(), this.f14537b.get(), this.f14538c.get().booleanValue(), this.f14539d.get());
    }
}
