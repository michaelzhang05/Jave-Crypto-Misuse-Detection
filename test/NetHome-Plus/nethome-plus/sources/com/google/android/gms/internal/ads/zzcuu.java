package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuu implements zzdti<zzcus> {
    private final zzdtu<zzavg> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14475b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f14476c;

    private zzcuu(zzdtu<zzavg> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14475b = zzdtuVar2;
        this.f14476c = zzdtuVar3;
    }

    public static zzcuu a(zzdtu<zzavg> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        return new zzcuu(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcus(this.a.get(), this.f14475b.get(), this.f14476c.get());
    }
}
