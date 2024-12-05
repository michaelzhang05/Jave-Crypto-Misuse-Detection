package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcku implements zzdti<zzckr> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14158b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbws> f14159c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcxk> f14160d;

    public zzcku(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzbws> zzdtuVar3, zzdtu<zzcxk> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14158b = zzdtuVar2;
        this.f14159c = zzdtuVar3;
        this.f14160d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckr(this.a.get(), this.f14158b.get(), this.f14159c.get(), this.f14160d.get());
    }
}
