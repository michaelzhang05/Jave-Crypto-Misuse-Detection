package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbmm implements zzdti<zzbml> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzty> f13368b;

    private zzbmm(zzdtu<Context> zzdtuVar, zzdtu<zzty> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13368b = zzdtuVar2;
    }

    public static zzbmm a(zzdtu<Context> zzdtuVar, zzdtu<zzty> zzdtuVar2) {
        return new zzbmm(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbml(this.a.get(), this.f13368b.get());
    }
}
