package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwi implements zzdti<zzbuz<zzahy>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzccz> f13598b;

    public zzbwi(zzbvz zzbvzVar, zzdtu<zzccz> zzdtuVar) {
        this.a = zzbvzVar;
        this.f13598b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13598b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
