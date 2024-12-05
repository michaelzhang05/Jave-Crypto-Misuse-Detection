package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbv implements zzdti<zzcbi> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcxv> f13845b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13846c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcdn> f13847d;

    public zzcbv(zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcdn> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13845b = zzdtuVar2;
        this.f13846c = zzdtuVar3;
        this.f13847d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbi(this.a.get(), this.f13845b.get(), this.f13846c.get(), this.f13847d.get());
    }
}
