package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbqg implements zzdti<zzbuz<zzbvg>> {
    private final zzdtu<zzbvh> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13509b;

    private zzbqg(zzdtu<zzbvh> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13509b = zzdtuVar2;
    }

    public static zzbqg a(zzdtu<zzbvh> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbqg(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.a.get(), this.f13509b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
