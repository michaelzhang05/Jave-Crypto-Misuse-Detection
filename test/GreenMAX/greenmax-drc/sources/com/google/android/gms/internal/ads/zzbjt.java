package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbjt implements zzdti<zzcjz<zzams, zzclb>> {
    private final zzbjn a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzclc> f13318b;

    public zzbjt(zzbjn zzbjnVar, zzdtu<zzclc> zzdtuVar) {
        this.a = zzbjnVar;
        this.f13318b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjz) zzdto.b(new zzcnk(this.f13318b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
