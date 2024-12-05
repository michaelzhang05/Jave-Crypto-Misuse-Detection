package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfu implements zzdti<Set<zzbuz<zzbtk>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14005b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14006c;

    private zzcfu(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14005b = zzdtuVar;
        this.f14006c = zzdtuVar2;
    }

    public static zzcfu a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfu(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.j(this.f14005b.get(), this.f14006c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
