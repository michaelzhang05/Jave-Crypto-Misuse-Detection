package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcug implements zzdti<zzcue> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Bundle> f14456b;

    private zzcug(zzdtu<zzbbl> zzdtuVar, zzdtu<Bundle> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14456b = zzdtuVar2;
    }

    public static zzcug a(zzdtu<zzbbl> zzdtuVar, zzdtu<Bundle> zzdtuVar2) {
        return new zzcug(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcue(this.a.get(), this.f14456b.get());
    }
}
