package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyp implements zzdti<zzaxb> {
    private final zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcym> f14607b;

    private zzcyp(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.a = zzcyoVar;
        this.f14607b = zzdtuVar;
    }

    public static zzcyp a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyp(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzaxb) zzdto.b(this.f14607b.get().f14602b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
