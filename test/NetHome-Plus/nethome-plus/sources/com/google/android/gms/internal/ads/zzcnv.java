package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnv implements zzdti<zzcnl> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14270b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f14271c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Executor> f14272d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcdf> f14273e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzcdn> f14274f;

    public zzcnv(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4, zzdtu<zzcdf> zzdtuVar5, zzdtu<zzcdn> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f14270b = zzdtuVar2;
        this.f14271c = zzdtuVar3;
        this.f14272d = zzdtuVar4;
        this.f14273e = zzdtuVar5;
        this.f14274f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcnl(this.a.get(), this.f14270b.get(), this.f14271c.get(), this.f14272d.get(), this.f14273e.get(), this.f14274f.get());
    }
}
