package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfx implements zzdti<Set<zzbuz<zzbrw>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14011b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14012c;

    private zzcfx(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14011b = zzdtuVar;
        this.f14012c = zzdtuVar2;
    }

    public static zzcfx a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfx(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.g(this.f14011b.get(), this.f14012c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
