package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbzg implements zzdti<zzavf> {
    private final zzbzf a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13730b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13731c;

    private zzbzg(zzbzf zzbzfVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.a = zzbzfVar;
        this.f13730b = zzdtuVar;
        this.f13731c = zzdtuVar2;
    }

    public static zzbzg a(zzbzf zzbzfVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        return new zzbzg(zzbzfVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.b(new zzavf(this.f13730b.get(), this.f13731c.get().f14575f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
