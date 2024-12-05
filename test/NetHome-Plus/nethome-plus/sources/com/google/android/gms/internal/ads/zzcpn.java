package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcpn implements zzdti<zzcpm> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzyz> f14330b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f14331c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbnf> f14332d;

    public zzcpn(zzdtu<Context> zzdtuVar, zzdtu<zzyz> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbnf> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14330b = zzdtuVar2;
        this.f14331c = zzdtuVar3;
        this.f14332d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpm(this.a.get(), this.f14330b.get(), this.f14331c.get(), this.f14332d.get());
    }
}
