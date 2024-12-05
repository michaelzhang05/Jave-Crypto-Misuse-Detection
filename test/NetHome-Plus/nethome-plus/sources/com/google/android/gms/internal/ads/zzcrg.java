package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class zzcrg implements zzdti<zzcre> {
    private final zzdtu<zzbbl> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14387b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f14388c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<ViewGroup> f14389d;

    public zzcrg(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<ViewGroup> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f14387b = zzdtuVar2;
        this.f14388c = zzdtuVar3;
        this.f14389d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcre(this.a.get(), this.f14387b.get(), this.f14388c.get(), this.f14389d.get());
    }
}
