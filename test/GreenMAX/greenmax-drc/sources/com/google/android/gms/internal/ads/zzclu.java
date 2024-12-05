package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzclu implements zzdti<zzclq> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbws> f14199b;

    public zzclu(zzdtu<Context> zzdtuVar, zzdtu<zzbws> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14199b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzclq(this.a.get(), this.f14199b.get());
    }
}
