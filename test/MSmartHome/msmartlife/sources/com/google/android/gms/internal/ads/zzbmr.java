package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmr implements zzdti<zzbmg> {
    private final zzdtu<zzty> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzaly> f13384b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13385c;

    private zzbmr(zzdtu<zzty> zzdtuVar, zzdtu<zzaly> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13384b = zzdtuVar2;
        this.f13385c = zzdtuVar3;
    }

    public static zzbmr a(zzdtu<zzty> zzdtuVar, zzdtu<zzaly> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        return new zzbmr(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzty zztyVar = this.a.get();
        return (zzbmg) zzdto.b(new zzbmg(zztyVar.d(), this.f13384b.get(), this.f13385c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
