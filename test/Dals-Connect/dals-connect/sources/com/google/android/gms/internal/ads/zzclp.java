package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzclp implements zzdti<zzcln> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14196b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbws> f14197c;

    public zzclp(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzbws> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14196b = zzdtuVar2;
        this.f14197c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcln(this.a.get(), this.f14196b.get(), this.f14197c.get());
    }
}
