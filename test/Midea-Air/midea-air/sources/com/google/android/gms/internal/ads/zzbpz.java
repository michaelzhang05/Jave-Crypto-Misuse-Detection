package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpz implements zzdti<zzbuz<zzbrl>> {
    private final zzbpx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13500b;

    private zzbpz(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbpxVar;
        this.f13500b = zzdtuVar;
    }

    public static zzbpz a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbpz(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13500b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
