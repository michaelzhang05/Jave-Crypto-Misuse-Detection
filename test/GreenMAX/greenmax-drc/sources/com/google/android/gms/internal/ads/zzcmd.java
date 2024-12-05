package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcmd implements zzdti<zzclx> {
    private final zzdtu<zzbxo> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14202b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcaq> f14203c;

    public zzcmd(zzdtu<zzbxo> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcaq> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14202b = zzdtuVar2;
        this.f14203c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzclx(this.a.get(), this.f14202b.get(), this.f14203c.get());
    }
}
