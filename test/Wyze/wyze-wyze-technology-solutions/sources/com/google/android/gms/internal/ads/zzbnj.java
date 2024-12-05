package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbnj implements zzdti<yc> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxn> f13404b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<View> f13405c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbgz> f13406d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbpb> f13407e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbzc> f13408f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<zzbvd> f13409g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<zzcpm> f13410h;

    /* renamed from: i, reason: collision with root package name */
    private final zzdtu<Executor> f13411i;

    /* renamed from: j, reason: collision with root package name */
    private final zzdtu<zzcxu> f13412j;

    /* renamed from: k, reason: collision with root package name */
    private final zzdtu<zzcxm> f13413k;
    private final zzdtu<zzbry> l;
    private final zzdtu<zzbso> m;
    private final zzdtu<String> n;

    public zzbnj(zzdtu<Context> zzdtuVar, zzdtu<zzcxn> zzdtuVar2, zzdtu<View> zzdtuVar3, zzdtu<zzbgz> zzdtuVar4, zzdtu<zzbpb> zzdtuVar5, zzdtu<zzbzc> zzdtuVar6, zzdtu<zzbvd> zzdtuVar7, zzdtu<zzcpm> zzdtuVar8, zzdtu<Executor> zzdtuVar9, zzdtu<zzcxu> zzdtuVar10, zzdtu<zzcxm> zzdtuVar11, zzdtu<zzbry> zzdtuVar12, zzdtu<zzbso> zzdtuVar13, zzdtu<String> zzdtuVar14) {
        this.a = zzdtuVar;
        this.f13404b = zzdtuVar2;
        this.f13405c = zzdtuVar3;
        this.f13406d = zzdtuVar4;
        this.f13407e = zzdtuVar5;
        this.f13408f = zzdtuVar6;
        this.f13409g = zzdtuVar7;
        this.f13410h = zzdtuVar8;
        this.f13411i = zzdtuVar9;
        this.f13412j = zzdtuVar10;
        this.f13413k = zzdtuVar11;
        this.l = zzdtuVar12;
        this.m = zzdtuVar13;
        this.n = zzdtuVar14;
    }

    public static yc a(Context context, zzcxn zzcxnVar, View view, zzbgz zzbgzVar, zzbpb zzbpbVar, zzbzc zzbzcVar, zzbvd zzbvdVar, zzdte<zzcpm> zzdteVar, Executor executor) {
        return new yc(context, zzcxnVar, view, zzbgzVar, zzbpbVar, zzbzcVar, zzbvdVar, zzdteVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        yc ycVar = new yc(this.a.get(), this.f13404b.get(), this.f13405c.get(), this.f13406d.get(), this.f13407e.get(), this.f13408f.get(), this.f13409g.get(), zzdth.b(this.f13410h), this.f13411i.get());
        zzbql.d(ycVar, this.f13412j.get());
        zzbql.c(ycVar, this.f13413k.get());
        zzbql.a(ycVar, this.l.get());
        zzbql.b(ycVar, this.m.get());
        zzbql.e(ycVar, this.n.get());
        return ycVar;
    }
}
