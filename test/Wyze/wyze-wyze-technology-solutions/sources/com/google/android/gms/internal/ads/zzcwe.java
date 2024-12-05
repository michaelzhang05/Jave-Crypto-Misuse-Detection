package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcwe implements zzdti<zzcwc> {
    private final zzdtu<zzvx> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbl> f14525b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f14526c;

    public zzcwe(zzdtu<zzvx> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14525b = zzdtuVar2;
        this.f14526c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwc(this.a.get(), this.f14525b.get(), this.f14526c.get());
    }
}
