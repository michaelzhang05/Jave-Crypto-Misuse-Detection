package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcmr implements zzdti<zzcmq> {
    private final zzdtu<zzbjm> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqy.zza> f14230b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcow> f14231c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbtv> f14232d;

    public zzcmr(zzdtu<zzbjm> zzdtuVar, zzdtu<zzbqy.zza> zzdtuVar2, zzdtu<zzcow> zzdtuVar3, zzdtu<zzbtv> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14230b = zzdtuVar2;
        this.f14231c = zzdtuVar3;
        this.f14232d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcmq(this.a.get(), this.f14230b.get(), this.f14231c.get(), this.f14232d.get());
    }
}
