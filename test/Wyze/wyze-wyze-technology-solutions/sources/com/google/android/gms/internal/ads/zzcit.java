package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcit implements zzdti<zzcig> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14095b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzasm> f14096c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzblp> f14097d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzasl> f14098e;

    private zzcit(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzasm> zzdtuVar3, zzdtu<zzblp> zzdtuVar4, zzdtu<zzasl> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f14095b = zzdtuVar2;
        this.f14096c = zzdtuVar3;
        this.f14097d = zzdtuVar4;
        this.f14098e = zzdtuVar5;
    }

    public static zzcit a(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzasm> zzdtuVar3, zzdtu<zzblp> zzdtuVar4, zzdtu<zzasl> zzdtuVar5) {
        return new zzcit(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcig(this.a.get(), this.f14095b.get(), this.f14096c.get(), this.f14097d.get(), this.f14098e.get());
    }
}
