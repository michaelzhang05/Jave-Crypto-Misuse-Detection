package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqc implements zzdti<zzbuz<zzbtk>> {
    private final zzbpx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13503b;

    private zzbqc(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbpxVar;
        this.f13503b = zzdtuVar;
    }

    public static zzbqc a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqc(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13503b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
