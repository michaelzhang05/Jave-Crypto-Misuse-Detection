package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcid implements zzdti<kj> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzavg> f14086b;

    private zzcid(zzdtu<Context> zzdtuVar, zzdtu<zzavg> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14086b = zzdtuVar2;
    }

    public static zzcid a(zzdtu<Context> zzdtuVar, zzdtu<zzavg> zzdtuVar2) {
        return new zzcid(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new kj(this.a.get(), this.f14086b.get());
    }
}
