package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbh implements zzdti<zzcbd> {
    private final zzdtu<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcau> f13837b;

    public zzcbh(zzdtu<Executor> zzdtuVar, zzdtu<zzcau> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f13837b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbd(this.a.get(), this.f13837b.get());
    }
}
