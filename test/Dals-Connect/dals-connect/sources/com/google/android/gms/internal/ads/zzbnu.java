package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnu implements zzdti<zzbuz<zzbrw>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbot> f13424b;

    public zzbnu(zzbnk zzbnkVar, zzdtu<zzbot> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13424b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13424b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
