package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbos implements zzdti<zzbol> {
    private final zzdtu<zzaga> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Runnable> f13447b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13448c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcxu> f13449d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxm> f13450e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbry> f13451f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<zzbso> f13452g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<String> f13453h;

    public zzbos(zzdtu<zzaga> zzdtuVar, zzdtu<Runnable> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcxu> zzdtuVar4, zzdtu<zzcxm> zzdtuVar5, zzdtu<zzbry> zzdtuVar6, zzdtu<zzbso> zzdtuVar7, zzdtu<String> zzdtuVar8) {
        this.a = zzdtuVar;
        this.f13447b = zzdtuVar2;
        this.f13448c = zzdtuVar3;
        this.f13449d = zzdtuVar4;
        this.f13450e = zzdtuVar5;
        this.f13451f = zzdtuVar6;
        this.f13452g = zzdtuVar7;
        this.f13453h = zzdtuVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbol zzbolVar = new zzbol(this.a.get(), this.f13447b.get(), this.f13448c.get());
        zzbql.d(zzbolVar, this.f13449d.get());
        zzbql.c(zzbolVar, this.f13450e.get());
        zzbql.a(zzbolVar, this.f13451f.get());
        zzbql.b(zzbolVar, this.f13452g.get());
        zzbql.e(zzbolVar, this.f13453h.get());
        return zzbolVar;
    }
}
