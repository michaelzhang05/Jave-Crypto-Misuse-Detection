package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbwj implements zzdti<zzavf> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13599b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13600c;

    private zzbwj(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.a = zzbvzVar;
        this.f13599b = zzdtuVar;
        this.f13600c = zzdtuVar2;
    }

    public static zzbwj a(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        return new zzbwj(zzbvzVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.b(new zzavf(this.f13599b.get(), this.f13600c.get().f14575f), "Cannot return null from a non-@Nullable @Provides method");
    }
}