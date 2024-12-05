package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbu implements zzdti<zzcbp> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbmy> f13843b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbva> f13844c;

    public zzcbu(zzdtu<Executor> zzdtuVar, zzdtu<zzbmy> zzdtuVar2, zzdtu<zzbva> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13843b = zzdtuVar2;
        this.f13844c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbp(this.a.get(), this.f13843b.get(), this.f13844c.get());
    }
}
