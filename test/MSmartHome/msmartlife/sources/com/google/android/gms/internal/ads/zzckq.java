package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzckq implements zzdti<zzckm> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzboc> f14154b;

    public zzckq(zzdtu<Context> zzdtuVar, zzdtu<zzboc> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14154b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckm(this.a.get(), this.f14154b.get());
    }
}
