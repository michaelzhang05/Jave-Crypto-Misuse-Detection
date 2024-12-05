package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfs implements zzdti<Set<zzbuz<zzbrx>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14001b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14002c;

    private zzcfs(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14001b = zzdtuVar;
        this.f14002c = zzdtuVar2;
    }

    public static zzcfs a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfs(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.a(this.f14001b.get(), this.f14002c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
