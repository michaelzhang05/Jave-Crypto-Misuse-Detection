package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcww implements zzdti<zzcwu> {
    private final zzdtu<zzaqm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f14542b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f14543c;

    public zzcww(zzdtu<zzaqm> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14542b = zzdtuVar2;
        this.f14543c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwu(this.a.get(), this.f14542b.get(), this.f14543c.get());
    }
}
