package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyh implements zzdti<zzbuz<zzbro>> {
    private final zzcyg a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcyi> f14593b;

    private zzcyh(zzcyg zzcygVar, zzdtu<zzcyi> zzdtuVar) {
        this.a = zzcygVar;
        this.f14593b = zzdtuVar;
    }

    public static zzcyh a(zzcyg zzcygVar, zzdtu<zzcyi> zzdtuVar) {
        return new zzcyh(zzcygVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f14593b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
