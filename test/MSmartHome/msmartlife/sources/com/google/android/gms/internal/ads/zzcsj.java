package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcsj implements zzdti<zzcsh> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14426b;

    public zzcsj(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14426b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsh(this.a.get(), this.f14426b.get());
    }
}
