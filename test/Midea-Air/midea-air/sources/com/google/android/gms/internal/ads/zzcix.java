package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcix implements zzdti<zzbuz<zzbro>> {
    private final zzdtu<zzcjg> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14106b;

    private zzcix(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14106b = zzdtuVar2;
    }

    public static zzcix a(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcix(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.a.get(), this.f14106b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
