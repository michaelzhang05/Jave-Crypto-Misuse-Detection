package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcei implements zzdti<zzbuz<zzbrw>> {
    private final zzdtu<zzcep> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13967b;

    private zzcei(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13967b = zzdtuVar2;
    }

    public static zzcei a(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcei(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.a.get(), this.f13967b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
