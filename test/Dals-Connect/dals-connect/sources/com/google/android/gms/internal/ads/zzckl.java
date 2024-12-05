package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzckl implements zzdti<zzckj> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14150b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzboc> f14151c;

    public zzckl(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzboc> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14150b = zzdtuVar2;
        this.f14151c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckj(this.a.get(), this.f14150b.get(), this.f14151c.get());
    }
}
