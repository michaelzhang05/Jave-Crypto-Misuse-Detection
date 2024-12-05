package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqd implements zzdti<zzawj> {
    private final zzdtu<Clock> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzawu> f13504b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13505c;

    private zzbqd(zzdtu<Clock> zzdtuVar, zzdtu<zzawu> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13504b = zzdtuVar2;
        this.f13505c = zzdtuVar3;
    }

    public static zzbqd a(zzdtu<Clock> zzdtuVar, zzdtu<zzawu> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        return new zzbqd(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzawj) zzdto.b(this.f13504b.get().c(this.a.get(), this.f13505c.get().f14575f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
