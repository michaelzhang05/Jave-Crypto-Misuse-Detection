package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcvm implements zzdti<zzcvk> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14505b;

    private zzcvm(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14505b = zzdtuVar2;
    }

    public static zzcvm a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        return new zzcvm(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvk(this.a.get(), this.f14505b.get());
    }
}
