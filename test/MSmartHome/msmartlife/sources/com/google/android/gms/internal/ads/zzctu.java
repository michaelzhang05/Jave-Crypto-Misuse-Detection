package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzctu implements zzdti<zzctp> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxv> f14444b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<PackageInfo> f14445c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzaxb> f14446d;

    public zzctu(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<PackageInfo> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14444b = zzdtuVar2;
        this.f14445c = zzdtuVar3;
        this.f14446d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctp(this.a.get(), this.f14444b.get(), this.f14445c.get(), this.f14446d.get());
    }
}
