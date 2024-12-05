package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbou implements zzdti<zzbot> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbgz> f13460b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxm> f13461c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbai> f13462d;

    public zzbou(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13460b = zzdtuVar2;
        this.f13461c = zzdtuVar3;
        this.f13462d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbot(this.a.get(), this.f13460b.get(), this.f13461c.get(), this.f13462d.get());
    }
}
