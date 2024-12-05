package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzblc implements zzdti<zzbkz> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f13340b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzclc> f13341c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcjz<zzams, zzclb>> f13342d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcpf> f13343e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzcgb> f13344f;

    public zzblc(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzclc> zzdtuVar3, zzdtu<zzcjz<zzams, zzclb>> zzdtuVar4, zzdtu<zzcpf> zzdtuVar5, zzdtu<zzcgb> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f13340b = zzdtuVar2;
        this.f13341c = zzdtuVar3;
        this.f13342d = zzdtuVar4;
        this.f13343e = zzdtuVar5;
        this.f13344f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbkz(this.a.get(), this.f13340b.get(), this.f13341c.get(), this.f13342d.get(), this.f13343e.get(), this.f13344f.get());
    }
}
