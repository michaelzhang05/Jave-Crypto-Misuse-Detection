package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbwl implements zzdti<zzbuz<zzbrl>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbxg> f13601b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13602c;

    private zzbwl(zzbvz zzbvzVar, zzdtu<zzbxg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzbvzVar;
        this.f13601b = zzdtuVar;
        this.f13602c = zzdtuVar2;
    }

    public static zzbwl a(zzbvz zzbvzVar, zzdtu<zzbxg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbwl(zzbvzVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13601b.get(), this.f13602c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
