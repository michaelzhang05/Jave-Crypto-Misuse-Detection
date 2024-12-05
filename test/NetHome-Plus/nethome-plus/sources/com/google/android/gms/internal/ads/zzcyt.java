package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyt implements zzdti<zzawu> {
    private final zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcym> f14612b;

    private zzcyt(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.a = zzcyoVar;
        this.f14612b = zzdtuVar;
    }

    public static zzcyt a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyt(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzawu) zzdto.b(this.f14612b.get().f14603c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
