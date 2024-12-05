package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbyk implements zzdti<zzbuz<zzbrw>> {
    private final zzbyc a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcac> f13675b;

    public zzbyk(zzbyc zzbycVar, zzdtu<zzcac> zzdtuVar) {
        this.a = zzbycVar;
        this.f13675b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13675b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
