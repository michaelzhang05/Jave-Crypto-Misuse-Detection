package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfw implements zzdti<Set<zzbuz<zzxr>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14009b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14010c;

    private zzcfw(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14009b = zzdtuVar;
        this.f14010c = zzdtuVar2;
    }

    public static zzcfw a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfw(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(zzcfp.h(this.f14009b.get(), this.f14010c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
