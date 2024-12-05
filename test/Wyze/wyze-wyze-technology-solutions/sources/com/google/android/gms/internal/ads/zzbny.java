package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbny implements zzdti<zzbuz<zzue>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzboz> f13429b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13430c;

    public zzbny(zzbnk zzbnkVar, zzdtu<zzboz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzbnkVar;
        this.f13429b = zzdtuVar;
        this.f13430c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13429b.get(), this.f13430c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
