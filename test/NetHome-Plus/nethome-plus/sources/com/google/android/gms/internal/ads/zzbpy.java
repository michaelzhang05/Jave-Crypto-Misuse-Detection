package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpy implements zzdti<zzbuz<zzxr>> {
    private final zzbpx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13499b;

    private zzbpy(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbpxVar;
        this.f13499b = zzdtuVar;
    }

    public static zzbpy a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbpy(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13499b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
