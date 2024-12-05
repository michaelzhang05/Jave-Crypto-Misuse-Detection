package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcwa implements zzdti<zzcvy> {
    private final zzdtu<zzasc> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14520b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<String> f14521c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbbl> f14522d;

    public zzcwa(zzdtu<zzasc> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14520b = zzdtuVar2;
        this.f14521c = zzdtuVar3;
        this.f14522d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvy(this.a.get(), this.f14520b.get(), this.f14521c.get(), this.f14522d.get());
    }
}
