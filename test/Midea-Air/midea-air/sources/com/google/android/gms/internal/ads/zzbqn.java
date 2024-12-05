package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqn implements zzdti<com.google.android.gms.ads.internal.zzb> {
    private final zzbqm a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13514b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzavb> f13515c;

    private zzbqn(zzbqm zzbqmVar, zzdtu<Context> zzdtuVar, zzdtu<zzavb> zzdtuVar2) {
        this.a = zzbqmVar;
        this.f13514b = zzdtuVar;
        this.f13515c = zzdtuVar2;
    }

    public static zzbqn a(zzbqm zzbqmVar, zzdtu<Context> zzdtuVar, zzdtu<zzavb> zzdtuVar2) {
        return new zzbqn(zzbqmVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zzb) zzdto.b(new com.google.android.gms.ads.internal.zzb(this.f13514b.get(), this.f13515c.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
