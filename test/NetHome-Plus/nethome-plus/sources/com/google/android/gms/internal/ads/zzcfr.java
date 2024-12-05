package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfr implements zzdti<Set<zzbuz<zzbro>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f13999b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14000c;

    private zzcfr(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f13999b = zzdtuVar;
        this.f14000c = zzdtuVar2;
    }

    public static zzcfr a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfr(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.e(this.f13999b.get(), this.f14000c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
