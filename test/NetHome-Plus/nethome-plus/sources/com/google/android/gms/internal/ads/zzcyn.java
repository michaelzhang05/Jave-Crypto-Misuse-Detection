package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyn implements zzdti<zzcyk> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14605b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzawm> f14606c;

    public zzcyn(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzawm> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14605b = zzdtuVar2;
        this.f14606c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcyk(this.a.get(), this.f14605b.get(), this.f14606c.get());
    }
}
