package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwh implements zzdti<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbxa> f13597b;

    private zzbwh(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        this.a = zzbvzVar;
        this.f13597b = zzdtuVar;
    }

    public static zzbwh a(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        return new zzbwh(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13597b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
