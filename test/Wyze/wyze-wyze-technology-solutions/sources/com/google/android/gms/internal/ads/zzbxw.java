package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzbxw implements zzdti<zzbpe<zzbnf>> {
    private final zzdtu<zzbjm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqy.zza> f13645b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbtv> f13646c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbxk> f13647d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbtb> f13648e;

    public zzbxw(zzdtu<zzbjm> zzdtuVar, zzdtu<zzbqy.zza> zzdtuVar2, zzdtu<zzbtv> zzdtuVar3, zzdtu<zzbxk> zzdtuVar4, zzdtu<zzbtb> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13645b = zzdtuVar2;
        this.f13646c = zzdtuVar3;
        this.f13647d = zzdtuVar4;
        this.f13648e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbjm zzbjmVar = this.a.get();
        zzbqy.zza zzaVar = this.f13645b.get();
        zzbtv zzbtvVar = this.f13646c.get();
        return (zzbpe) zzdto.b(zzbjmVar.j().f(zzaVar.c()).a(zzbtvVar).g(this.f13647d.get()).e(new zzcow(null)).c(new zzbox(this.f13648e.get())).d(new zzbnc(null)).b().e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
