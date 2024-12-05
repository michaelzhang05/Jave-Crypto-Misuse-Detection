package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcft implements zzdti<Set<zzbuz<zzbsr>>> {
    private final zzcfp a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcfz> f14003b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14004c;

    private zzcft(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcfpVar;
        this.f14003b = zzdtuVar;
        this.f14004c = zzdtuVar2;
    }

    public static Set<zzbuz<zzbsr>> a(zzcfp zzcfpVar, zzcfz zzcfzVar, Executor executor) {
        return (Set) zzdto.b(zzcfp.c(zzcfzVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static zzcft b(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcft(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a, this.f14003b.get(), this.f14004c.get());
    }
}
