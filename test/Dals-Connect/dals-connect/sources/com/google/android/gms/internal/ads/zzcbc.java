package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcbc implements zzdti<zzcau> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcan> f13824b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzdh> f13825c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbai> f13826d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f13827e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<zzwj> f13828f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<Executor> f13829g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<zzcxv> f13830h;

    /* renamed from: i, reason: collision with root package name */
    private final zzdtu<zzcbi> f13831i;

    /* renamed from: j, reason: collision with root package name */
    private final zzdtu<ScheduledExecutorService> f13832j;

    public zzcbc(zzdtu<Context> zzdtuVar, zzdtu<zzcan> zzdtuVar2, zzdtu<zzdh> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar5, zzdtu<zzwj> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<zzcxv> zzdtuVar8, zzdtu<zzcbi> zzdtuVar9, zzdtu<ScheduledExecutorService> zzdtuVar10) {
        this.a = zzdtuVar;
        this.f13824b = zzdtuVar2;
        this.f13825c = zzdtuVar3;
        this.f13826d = zzdtuVar4;
        this.f13827e = zzdtuVar5;
        this.f13828f = zzdtuVar6;
        this.f13829g = zzdtuVar7;
        this.f13830h = zzdtuVar8;
        this.f13831i = zzdtuVar9;
        this.f13832j = zzdtuVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcau(this.a.get(), this.f13824b.get(), this.f13825c.get(), this.f13826d.get(), this.f13827e.get(), this.f13828f.get(), this.f13829g.get(), this.f13830h.get(), this.f13831i.get(), this.f13832j.get());
    }
}
