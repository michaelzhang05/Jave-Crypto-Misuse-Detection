package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqa implements zzdti<zzbuz<zzbrw>> {
    private final zzbpx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13501b;

    private zzbqa(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbpxVar;
        this.f13501b = zzdtuVar;
    }

    public static zzbqa a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqa(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13501b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
