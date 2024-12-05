package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqf implements zzdti<zzbqe> {
    private final zzdtu<Clock> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzawj> f13508b;

    private zzbqf(zzdtu<Clock> zzdtuVar, zzdtu<zzawj> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13508b = zzdtuVar2;
    }

    public static zzbqf a(zzdtu<Clock> zzdtuVar, zzdtu<zzawj> zzdtuVar2) {
        return new zzbqf(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbqe(this.a.get(), this.f13508b.get());
    }
}
