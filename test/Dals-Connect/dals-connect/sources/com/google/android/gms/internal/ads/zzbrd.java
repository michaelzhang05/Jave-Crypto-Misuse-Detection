package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbrd implements zzdti<String> {
    private final zzbqy a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbqe> f13536b;

    private zzbrd(zzbqy zzbqyVar, zzdtu<zzbqe> zzdtuVar) {
        this.a = zzbqyVar;
        this.f13536b = zzdtuVar;
    }

    public static zzbrd a(zzbqy zzbqyVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbrd(zzbqyVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (String) zzdto.b(this.f13536b.get().c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
