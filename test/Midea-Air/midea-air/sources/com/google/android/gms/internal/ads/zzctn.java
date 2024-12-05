package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzctn implements zzdti<zzctl> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxk> f14440b;

    private zzctn(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxk> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14440b = zzdtuVar2;
    }

    public static zzctn a(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxk> zzdtuVar2) {
        return new zzctn(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctl(this.a.get(), this.f14440b.get());
    }
}
