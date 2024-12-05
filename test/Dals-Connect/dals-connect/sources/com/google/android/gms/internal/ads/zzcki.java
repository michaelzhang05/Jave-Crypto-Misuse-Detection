package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcki implements zzdti<zzckb> {
    private final zzdtu<zzboc> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14143b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f14144c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcdn> f14145d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxv> f14146e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbam<zzcxm, zzayb>> f14147f;

    public zzcki(zzdtu<zzboc> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcdn> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5, zzdtu<zzbam<zzcxm, zzayb>> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f14143b = zzdtuVar2;
        this.f14144c = zzdtuVar3;
        this.f14145d = zzdtuVar4;
        this.f14146e = zzdtuVar5;
        this.f14147f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckb(this.a.get(), this.f14143b.get(), this.f14144c.get(), this.f14145d.get(), this.f14146e.get(), this.f14147f.get());
    }
}
