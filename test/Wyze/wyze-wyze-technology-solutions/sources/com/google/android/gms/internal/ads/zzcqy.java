package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcqy implements zzdti<zzbbh<zzcrc>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcqz> f14377b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbbh<zzarx>> f14378c;

    public zzcqy(zzdtu<zzczt> zzdtuVar, zzdtu<zzcqz> zzdtuVar2, zzdtu<zzbbh<zzarx>> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14377b = zzdtuVar2;
        this.f14378c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.b(this.a.get().c(zzczs.GENERATE_SIGNALS, this.f14378c.get()).b(this.f14377b.get()).a(((Integer) zzyt.e().c(zzacu.u4)).intValue(), TimeUnit.SECONDS).f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
