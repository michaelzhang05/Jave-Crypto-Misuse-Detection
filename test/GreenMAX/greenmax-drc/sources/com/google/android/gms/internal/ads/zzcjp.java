package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcjp implements zzdti<zzcjm> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<Bundle>> f14128b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcji> f14129c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcjc> f14130d;

    private zzcjp(zzdtu<Context> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzcji> zzdtuVar3, zzdtu<zzcjc> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14128b = zzdtuVar2;
        this.f14129c = zzdtuVar3;
        this.f14130d = zzdtuVar4;
    }

    public static zzcjp a(zzdtu<Context> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzcji> zzdtuVar3, zzdtu<zzcjc> zzdtuVar4) {
        return new zzcjp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcjm(this.a.get(), this.f14128b.get(), this.f14129c.get(), this.f14130d.get());
    }
}
