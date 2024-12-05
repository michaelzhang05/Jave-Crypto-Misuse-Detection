package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcoq implements zzdti<zzcok> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzboc> f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzczt> f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbbl> f14302d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzado> f14303e;

    public zzcoq(zzdtu<Context> zzdtuVar, zzdtu<zzboc> zzdtuVar2, zzdtu<zzczt> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<zzado> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14300b = zzdtuVar2;
        this.f14301c = zzdtuVar3;
        this.f14302d = zzdtuVar4;
        this.f14303e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcok(this.a.get(), this.f14300b.get(), this.f14301c.get(), this.f14302d.get(), this.f14303e.get());
    }
}
