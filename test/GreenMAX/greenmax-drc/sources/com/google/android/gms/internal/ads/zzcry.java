package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcry implements zzdti<zzcrv> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzawm> f14406b;

    private zzcry(zzdtu<Executor> zzdtuVar, zzdtu<zzawm> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14406b = zzdtuVar2;
    }

    public static zzcry a(zzdtu<Executor> zzdtuVar, zzdtu<zzawm> zzdtuVar2) {
        return new zzcry(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrv(this.a.get(), this.f14406b.get());
    }
}
