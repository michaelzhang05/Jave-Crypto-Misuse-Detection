package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqu implements zzdti<zzbuz<zzbtk>> {
    private final zzbqt a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqr> f13526b;

    private zzbqu(zzbqt zzbqtVar, zzdtu<zzbqr> zzdtuVar) {
        this.a = zzbqtVar;
        this.f13526b = zzdtuVar;
    }

    public static zzbqu a(zzbqt zzbqtVar, zzdtu<zzbqr> zzdtuVar) {
        return new zzbqu(zzbqtVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13526b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
