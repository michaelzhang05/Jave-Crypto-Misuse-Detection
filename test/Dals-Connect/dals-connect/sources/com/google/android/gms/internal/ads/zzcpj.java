package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcpj implements zzdti<zzcpf> {
    private final zzdtu<zzclc> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14316b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f14317c;

    public zzcpj(zzdtu<zzclc> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14316b = zzdtuVar2;
        this.f14317c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpf(this.a.get(), this.f14316b.get(), this.f14317c.get());
    }
}
