package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyj implements zzdti<zzcyi> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzawu> f14597b;

    private zzcyj(zzdtu<Context> zzdtuVar, zzdtu<zzawu> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14597b = zzdtuVar2;
    }

    public static zzcyj a(zzdtu<Context> zzdtuVar, zzdtu<zzawu> zzdtuVar2) {
        return new zzcyj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcyi(this.a.get(), this.f14597b.get());
    }
}
