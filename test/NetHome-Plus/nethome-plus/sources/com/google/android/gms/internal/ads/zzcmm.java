package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcmm implements zzdti<zzcml> {
    private final zzdtu<zzbjm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbxk> f14212b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbqy.zza> f14213c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbtv> f14214d;

    public zzcmm(zzdtu<zzbjm> zzdtuVar, zzdtu<zzbxk> zzdtuVar2, zzdtu<zzbqy.zza> zzdtuVar3, zzdtu<zzbtv> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14212b = zzdtuVar2;
        this.f14213c = zzdtuVar3;
        this.f14214d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcml(this.a.get(), this.f14212b.get(), this.f14213c.get(), this.f14214d.get());
    }
}
