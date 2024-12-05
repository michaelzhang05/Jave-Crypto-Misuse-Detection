package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnv implements zzdti<zzbuz<zzbsr>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbot> f13425b;

    public zzbnv(zzbnk zzbnkVar, zzdtu<zzbot> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13425b = zzdtuVar;
    }

    public static zzbuz<zzbsr> a(zzbnk zzbnkVar, zzbot zzbotVar) {
        return (zzbuz) zzdto.b(new zzbuz(zzbotVar, zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a, this.f13425b.get());
    }
}
