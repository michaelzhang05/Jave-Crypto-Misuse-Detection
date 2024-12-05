package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcap implements zzdti<zzcan> {
    private final zzdtu<zzayu> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Clock> f13809b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13810c;

    public zzcap(zzdtu<zzayu> zzdtuVar, zzdtu<Clock> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13809b = zzdtuVar2;
        this.f13810c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcan(this.a.get(), this.f13809b.get(), this.f13810c.get());
    }
}
