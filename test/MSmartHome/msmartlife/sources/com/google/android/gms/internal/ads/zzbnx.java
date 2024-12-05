package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbnx implements zzdti<zzavf> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13427b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13428c;

    public zzbnx(zzbnk zzbnkVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.a = zzbnkVar;
        this.f13427b = zzdtuVar;
        this.f13428c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.b(new zzavf(this.f13427b.get(), this.f13428c.get().f14575f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
