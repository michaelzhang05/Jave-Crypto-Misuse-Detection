package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmq implements zzdti<zzbmn> {
    private final zzdtu<zzaly> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbml> f13380b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13381c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbmg> f13382d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<Clock> f13383e;

    private zzbmq(zzdtu<zzaly> zzdtuVar, zzdtu<zzbml> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzbmg> zzdtuVar4, zzdtu<Clock> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13380b = zzdtuVar2;
        this.f13381c = zzdtuVar3;
        this.f13382d = zzdtuVar4;
        this.f13383e = zzdtuVar5;
    }

    public static zzbmq a(zzdtu<zzaly> zzdtuVar, zzdtu<zzbml> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzbmg> zzdtuVar4, zzdtu<Clock> zzdtuVar5) {
        return new zzbmq(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbmn(this.a.get(), this.f13380b.get(), this.f13381c.get(), this.f13382d.get(), this.f13383e.get());
    }
}
