package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcmf implements zzdti<zzcme> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbxo> f14205b;

    public zzcmf(zzdtu<Context> zzdtuVar, zzdtu<zzbxo> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14205b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcme(this.a.get(), this.f14205b.get());
    }
}
