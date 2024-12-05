package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbzp implements zzdti<zzbzl> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzaxb> f13752b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13753c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbyx> f13754d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbyt> f13755e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbzt> f13756f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<Executor> f13757g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<Executor> f13758h;

    private zzbzp(zzdtu<Context> zzdtuVar, zzdtu<zzaxb> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbyx> zzdtuVar4, zzdtu<zzbyt> zzdtuVar5, zzdtu<zzbzt> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<Executor> zzdtuVar8) {
        this.a = zzdtuVar;
        this.f13752b = zzdtuVar2;
        this.f13753c = zzdtuVar3;
        this.f13754d = zzdtuVar4;
        this.f13755e = zzdtuVar5;
        this.f13756f = zzdtuVar6;
        this.f13757g = zzdtuVar7;
        this.f13758h = zzdtuVar8;
    }

    public static zzbzp a(zzdtu<Context> zzdtuVar, zzdtu<zzaxb> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbyx> zzdtuVar4, zzdtu<zzbyt> zzdtuVar5, zzdtu<zzbzt> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<Executor> zzdtuVar8) {
        return new zzbzp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbzl(this.a.get(), this.f13752b.get(), this.f13753c.get(), this.f13754d.get(), this.f13755e.get(), this.f13756f.get(), this.f13757g.get(), this.f13758h.get());
    }
}
