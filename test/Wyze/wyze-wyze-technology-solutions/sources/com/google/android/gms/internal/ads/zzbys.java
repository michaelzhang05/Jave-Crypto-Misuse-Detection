package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbys implements zzdti<zzbyn> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyt> f13686b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbzb> f13687c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbzl> f13688d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbyx> f13689e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbzc> f13690f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<zzccb> f13691g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<zzcbz> f13692h;

    /* renamed from: i, reason: collision with root package name */
    private final zzdtu<zzccg> f13693i;

    /* renamed from: j, reason: collision with root package name */
    private final zzdtu<zzcbw> f13694j;

    /* renamed from: k, reason: collision with root package name */
    private final zzdtu<zzccd> f13695k;
    private final zzdtu<zzavf> l;
    private final zzdtu<zzdh> m;
    private final zzdtu<zzbai> n;
    private final zzdtu<Context> o;
    private final zzdtu<zzcxu> p;
    private final zzdtu<zzcxm> q;
    private final zzdtu<zzbry> r;
    private final zzdtu<zzbso> s;
    private final zzdtu<String> t;

    private zzbys(zzdtu<Executor> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzb> zzdtuVar3, zzdtu<zzbzl> zzdtuVar4, zzdtu<zzbyx> zzdtuVar5, zzdtu<zzbzc> zzdtuVar6, zzdtu<zzccb> zzdtuVar7, zzdtu<zzcbz> zzdtuVar8, zzdtu<zzccg> zzdtuVar9, zzdtu<zzcbw> zzdtuVar10, zzdtu<zzccd> zzdtuVar11, zzdtu<zzavf> zzdtuVar12, zzdtu<zzdh> zzdtuVar13, zzdtu<zzbai> zzdtuVar14, zzdtu<Context> zzdtuVar15, zzdtu<zzcxu> zzdtuVar16, zzdtu<zzcxm> zzdtuVar17, zzdtu<zzbry> zzdtuVar18, zzdtu<zzbso> zzdtuVar19, zzdtu<String> zzdtuVar20) {
        this.a = zzdtuVar;
        this.f13686b = zzdtuVar2;
        this.f13687c = zzdtuVar3;
        this.f13688d = zzdtuVar4;
        this.f13689e = zzdtuVar5;
        this.f13690f = zzdtuVar6;
        this.f13691g = zzdtuVar7;
        this.f13692h = zzdtuVar8;
        this.f13693i = zzdtuVar9;
        this.f13694j = zzdtuVar10;
        this.f13695k = zzdtuVar11;
        this.l = zzdtuVar12;
        this.m = zzdtuVar13;
        this.n = zzdtuVar14;
        this.o = zzdtuVar15;
        this.p = zzdtuVar16;
        this.q = zzdtuVar17;
        this.r = zzdtuVar18;
        this.s = zzdtuVar19;
        this.t = zzdtuVar20;
    }

    public static zzbys a(zzdtu<Executor> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzb> zzdtuVar3, zzdtu<zzbzl> zzdtuVar4, zzdtu<zzbyx> zzdtuVar5, zzdtu<zzbzc> zzdtuVar6, zzdtu<zzccb> zzdtuVar7, zzdtu<zzcbz> zzdtuVar8, zzdtu<zzccg> zzdtuVar9, zzdtu<zzcbw> zzdtuVar10, zzdtu<zzccd> zzdtuVar11, zzdtu<zzavf> zzdtuVar12, zzdtu<zzdh> zzdtuVar13, zzdtu<zzbai> zzdtuVar14, zzdtu<Context> zzdtuVar15, zzdtu<zzcxu> zzdtuVar16, zzdtu<zzcxm> zzdtuVar17, zzdtu<zzbry> zzdtuVar18, zzdtu<zzbso> zzdtuVar19, zzdtu<String> zzdtuVar20) {
        return new zzbys(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8, zzdtuVar9, zzdtuVar10, zzdtuVar11, zzdtuVar12, zzdtuVar13, zzdtuVar14, zzdtuVar15, zzdtuVar16, zzdtuVar17, zzdtuVar18, zzdtuVar19, zzdtuVar20);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbyn zzbynVar = new zzbyn(this.a.get(), this.f13686b.get(), this.f13687c.get(), this.f13688d.get(), this.f13689e.get(), this.f13690f.get(), zzdth.b(this.f13691g), zzdth.b(this.f13692h), zzdth.b(this.f13693i), zzdth.b(this.f13694j), zzdth.b(this.f13695k), this.l.get(), this.m.get(), this.n.get(), this.o.get());
        zzbql.d(zzbynVar, this.p.get());
        zzbql.c(zzbynVar, this.q.get());
        zzbql.a(zzbynVar, this.r.get());
        zzbql.b(zzbynVar, this.s.get());
        zzbql.e(zzbynVar, this.t.get());
        return zzbynVar;
    }
}
