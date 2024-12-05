package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdag implements zzdti<zzdae> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbah> f14654b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcmu> f14655c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbai> f14656d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<String> f14657e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<String> f14658f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<Context> f14659g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<Clock> f14660h;

    private zzdag(zzdtu<Executor> zzdtuVar, zzdtu<zzbah> zzdtuVar2, zzdtu<zzcmu> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<String> zzdtuVar6, zzdtu<Context> zzdtuVar7, zzdtu<Clock> zzdtuVar8) {
        this.a = zzdtuVar;
        this.f14654b = zzdtuVar2;
        this.f14655c = zzdtuVar3;
        this.f14656d = zzdtuVar4;
        this.f14657e = zzdtuVar5;
        this.f14658f = zzdtuVar6;
        this.f14659g = zzdtuVar7;
        this.f14660h = zzdtuVar8;
    }

    public static zzdag a(zzdtu<Executor> zzdtuVar, zzdtu<zzbah> zzdtuVar2, zzdtu<zzcmu> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<String> zzdtuVar6, zzdtu<Context> zzdtuVar7, zzdtu<Clock> zzdtuVar8) {
        return new zzdag(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzdae(this.a.get(), this.f14654b.get(), this.f14655c.get(), this.f14656d.get(), this.f14657e.get(), this.f14658f.get(), this.f14659g.get(), this.f14660h.get());
    }
}
