package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyq implements zzdti<zzcym> {
    private final zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcyk> f14608b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<String> f14609c;

    private zzcyq(zzcyo zzcyoVar, zzdtu<zzcyk> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.a = zzcyoVar;
        this.f14608b = zzdtuVar;
        this.f14609c = zzdtuVar2;
    }

    public static zzcyq a(zzcyo zzcyoVar, zzdtu<zzcyk> zzdtuVar, zzdtu<String> zzdtuVar2) {
        return new zzcyq(zzcyoVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcym) zzdto.b(this.f14608b.get().b(this.f14609c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
