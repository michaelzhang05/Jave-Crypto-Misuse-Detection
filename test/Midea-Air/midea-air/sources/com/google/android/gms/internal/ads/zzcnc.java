package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnc implements zzdti<zzcna> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14252b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcdf> f14253c;

    public zzcnc(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzcdf> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14252b = zzdtuVar2;
        this.f14253c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcna(this.a.get(), this.f14252b.get(), this.f14253c.get());
    }
}
