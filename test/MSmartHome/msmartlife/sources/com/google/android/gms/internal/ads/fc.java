package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class fc implements zzboo {
    private zzbop a;

    /* renamed from: b, reason: collision with root package name */
    private zzdtu<zzaga> f11412b;

    /* renamed from: c, reason: collision with root package name */
    private zzdtu<Runnable> f11413c;

    /* renamed from: d, reason: collision with root package name */
    private zzdtu<zzcxu> f11414d;

    /* renamed from: e, reason: collision with root package name */
    private zzdtu<zzcxm> f11415e;

    /* renamed from: f, reason: collision with root package name */
    private zzdtu<Set<zzbuz<zzbrx>>> f11416f;

    /* renamed from: g, reason: collision with root package name */
    private zzdtu<zzbry> f11417g;

    /* renamed from: h, reason: collision with root package name */
    private zzdtu<Set<zzbuz<zzbsr>>> f11418h;

    /* renamed from: i, reason: collision with root package name */
    private zzdtu<zzbso> f11419i;

    /* renamed from: j, reason: collision with root package name */
    private zzdtu<String> f11420j;

    /* renamed from: k, reason: collision with root package name */
    private zzdtu<zzbol> f11421k;
    private final /* synthetic */ dc l;

    private fc(dc dcVar, zzbpr zzbprVar, zzbop zzbopVar) {
        zzdtu zzdtuVar;
        this.l = dcVar;
        this.a = zzbopVar;
        this.f11412b = new zzbor(zzbopVar);
        this.f11413c = new zzboq(zzbopVar);
        this.f11414d = zzbpu.a(zzbprVar);
        this.f11415e = zzbps.a(zzbprVar);
        zzdtq c2 = zzdtq.a(0, 2).b(dc.E(dcVar)).b(dc.D(dcVar)).c();
        this.f11416f = c2;
        this.f11417g = zzdth.a(zzbsd.a(c2));
        zzdtq c3 = zzdtq.a(4, 3).a(dc.A(dcVar)).a(dc.z(dcVar)).a(dc.y(dcVar)).b(dc.l(dcVar)).b(dc.j(dcVar)).b(dc.i(dcVar)).a(dc.v(dcVar)).c();
        this.f11418h = c3;
        this.f11419i = zzdth.a(zzbsq.a(c3));
        this.f11420j = zzbpt.a(zzbprVar);
        zzdtu<zzaga> zzdtuVar2 = this.f11412b;
        zzdtu<Runnable> zzdtuVar3 = this.f11413c;
        zzdtuVar = dcVar.n2.f13321c;
        this.f11421k = zzdth.a(new zzbos(zzdtuVar2, zzdtuVar3, zzdtuVar, this.f11414d, this.f11415e, this.f11417g, this.f11419i, this.f11420j));
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbnf a() {
        return (zzbnf) zzdto.b(this.f11421k.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
