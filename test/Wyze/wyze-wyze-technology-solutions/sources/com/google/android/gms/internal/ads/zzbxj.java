package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbxj implements zzdti<nf> {
    private final zzdtu<Map<String, zzcjv<zzbph>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Map<String, zzcjv<zzbyn>>> f13636b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Map<String, zzclw<zzbyn>>> f13637c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbpe<zzbnf>> f13638d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbzc> f13639e;

    public zzbxj(zzdtu<Map<String, zzcjv<zzbph>>> zzdtuVar, zzdtu<Map<String, zzcjv<zzbyn>>> zzdtuVar2, zzdtu<Map<String, zzclw<zzbyn>>> zzdtuVar3, zzdtu<zzbpe<zzbnf>> zzdtuVar4, zzdtu<zzbzc> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13636b = zzdtuVar2;
        this.f13637c = zzdtuVar3;
        this.f13638d = zzdtuVar4;
        this.f13639e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new nf(this.a.get(), this.f13636b.get(), this.f13637c.get(), this.f13638d, this.f13639e.get());
    }
}
