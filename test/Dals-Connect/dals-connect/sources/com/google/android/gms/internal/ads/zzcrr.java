package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcrr implements zzdti<zzcrp> {
    private final zzdtu<zzcsk<zzcvf>> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxv> f14402b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f14403c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzawm> f14404d;

    private zzcrr(zzdtu<zzcsk<zzcvf>> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<zzawm> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14402b = zzdtuVar2;
        this.f14403c = zzdtuVar3;
        this.f14404d = zzdtuVar4;
    }

    public static zzcrr a(zzdtu<zzcsk<zzcvf>> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<zzawm> zzdtuVar4) {
        return new zzcrr(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrp(this.a.get(), this.f14402b.get(), this.f14403c.get(), this.f14404d.get());
    }
}
