package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzclm implements zzdti<zzcle> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f14189b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f14190c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Executor> f14191d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbws> f14192e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzcdn> f14193f;

    public zzclm(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<Executor> zzdtuVar4, zzdtu<zzbws> zzdtuVar5, zzdtu<zzcdn> zzdtuVar6) {
        this.a = zzdtuVar;
        this.f14189b = zzdtuVar2;
        this.f14190c = zzdtuVar3;
        this.f14191d = zzdtuVar4;
        this.f14192e = zzdtuVar5;
        this.f14193f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcle(this.a.get(), this.f14189b.get(), this.f14190c.get(), this.f14191d.get(), this.f14192e.get(), this.f14193f.get());
    }
}
