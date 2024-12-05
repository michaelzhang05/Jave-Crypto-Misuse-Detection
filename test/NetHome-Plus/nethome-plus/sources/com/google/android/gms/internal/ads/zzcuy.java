package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuy implements zzdti<zzcuw> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14484b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f14485c;

    private zzcuy(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbai> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14484b = zzdtuVar2;
        this.f14485c = zzdtuVar3;
    }

    public static zzcuy a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbai> zzdtuVar3) {
        return new zzcuy(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcuw(this.a.get(), this.f14484b.get(), this.f14485c.get());
    }
}
