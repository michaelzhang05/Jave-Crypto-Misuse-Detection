package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqb implements zzdti<zzbuz<zzbsr>> {
    private final zzbpx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13502b;

    private zzbqb(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbpxVar;
        this.f13502b = zzdtuVar;
    }

    public static zzbqb a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqb(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13502b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
