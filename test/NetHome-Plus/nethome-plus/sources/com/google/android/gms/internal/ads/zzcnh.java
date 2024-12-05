package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcnh implements zzdti<zzcnd> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcdf> f14255b;

    public zzcnh(zzdtu<Context> zzdtuVar, zzdtu<zzcdf> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14255b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcnd(this.a.get(), this.f14255b.get());
    }
}
