package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzchd implements zzdti<zzbuz<zzbtk>> {
    private final zzdtu<kj> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14061b;

    private zzchd(zzdtu<kj> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14061b = zzdtuVar2;
    }

    public static zzchd a(zzdtu<kj> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzchd(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.a.get(), this.f14061b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
