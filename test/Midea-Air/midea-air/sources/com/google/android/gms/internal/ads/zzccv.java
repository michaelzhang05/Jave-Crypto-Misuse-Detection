package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzccv implements zzdti<zzccj> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13900b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzdh> f13901c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbai> f13902d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f13903e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzbhf> f13904f;

    public zzccv(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzdh> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar5, zzdtu<zzbhf> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f13900b = zzdtuVar2;
        this.f13901c = zzdtuVar3;
        this.f13902d = zzdtuVar4;
        this.f13903e = zzdtuVar5;
        this.f13904f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccj(this.a.get(), this.f13900b.get(), this.f13901c.get(), this.f13902d.get(), this.f13903e.get(), this.f13904f.get());
    }
}
