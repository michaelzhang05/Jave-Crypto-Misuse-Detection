package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcgz implements zzdti<zzbbh<zzcxu>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzchl> f14048b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzchq> f14049c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbbh<zzarx>> f14050d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxv> f14051e;

    private zzcgz(zzdtu<zzczt> zzdtuVar, zzdtu<zzchl> zzdtuVar2, zzdtu<zzchq> zzdtuVar3, zzdtu<zzbbh<zzarx>> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14048b = zzdtuVar2;
        this.f14049c = zzdtuVar3;
        this.f14050d = zzdtuVar4;
        this.f14051e = zzdtuVar5;
    }

    public static zzcgz a(zzdtu<zzczt> zzdtuVar, zzdtu<zzchl> zzdtuVar2, zzdtu<zzchq> zzdtuVar3, zzdtu<zzbbh<zzarx>> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        return new zzcgz(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzcze f2;
        zzczt zzcztVar = this.a.get();
        zzchl zzchlVar = this.f14048b.get();
        zzchq zzchqVar = this.f14049c.get();
        zzbbh<zzarx> zzbbhVar = this.f14050d.get();
        zzcxv zzcxvVar = this.f14051e.get();
        zzk.zzlm().l();
        if (zzcxvVar.f14573d.x != null) {
            f2 = zzcztVar.c(zzczs.SERVER_TRANSACTION, zzbbhVar).g(zzchqVar.a()).f();
        } else {
            f2 = zzcztVar.c(zzczs.SERVER_TRANSACTION, zzbbhVar).b(zzchlVar).f();
        }
        return (zzbbh) zzdto.b(f2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
