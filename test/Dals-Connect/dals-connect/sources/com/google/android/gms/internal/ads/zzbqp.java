package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqp implements zzdti<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzbqo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbpv> f13516b;

    private zzbqp(zzbqo zzbqoVar, zzdtu<zzbpv> zzdtuVar) {
        this.a = zzbqoVar;
        this.f13516b = zzdtuVar;
    }

    public static zzbqp a(zzbqo zzbqoVar, zzdtu<zzbpv> zzdtuVar) {
        return new zzbqp(zzbqoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13516b.get(), zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
