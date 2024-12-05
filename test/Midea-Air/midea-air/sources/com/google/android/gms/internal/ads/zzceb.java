package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzceb implements zzdti<zzcdn> {
    private final zzdtu<zzbhf> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13952b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13953c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzdh> f13954d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbai> f13955e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f13956f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<zzwj> f13957g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<zzbtb> f13958h;

    private zzceb(zzdtu<zzbhf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzdh> zzdtuVar4, zzdtu<zzbai> zzdtuVar5, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar6, zzdtu<zzwj> zzdtuVar7, zzdtu<zzbtb> zzdtuVar8) {
        this.a = zzdtuVar;
        this.f13952b = zzdtuVar2;
        this.f13953c = zzdtuVar3;
        this.f13954d = zzdtuVar4;
        this.f13955e = zzdtuVar5;
        this.f13956f = zzdtuVar6;
        this.f13957g = zzdtuVar7;
        this.f13958h = zzdtuVar8;
    }

    public static zzceb a(zzdtu<zzbhf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzdh> zzdtuVar4, zzdtu<zzbai> zzdtuVar5, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar6, zzdtu<zzwj> zzdtuVar7, zzdtu<zzbtb> zzdtuVar8) {
        return new zzceb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcdn(this.a.get(), this.f13952b.get(), this.f13953c.get(), this.f13954d.get(), this.f13955e.get(), this.f13956f.get(), this.f13957g.get(), this.f13958h.get());
    }
}
