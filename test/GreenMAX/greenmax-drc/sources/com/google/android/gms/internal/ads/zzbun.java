package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbun implements zzdti<zzcmu> {
    private final zzbtv a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Clock> f13566b;

    private zzbun(zzbtv zzbtvVar, zzdtu<Clock> zzdtuVar) {
        this.a = zzbtvVar;
        this.f13566b = zzdtuVar;
    }

    public static zzbun a(zzbtv zzbtvVar, zzdtu<Clock> zzdtuVar) {
        return new zzbun(zzbtvVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcmu) zzdto.b(this.a.a(this.f13566b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
