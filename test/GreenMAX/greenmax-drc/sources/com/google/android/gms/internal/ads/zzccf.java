package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzccf implements zzdti<zzccd> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbyt> f13874b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbzl> f13875c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbyn> f13876d;

    private zzccf(zzdtu<Context> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzl> zzdtuVar3, zzdtu<zzbyn> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13874b = zzdtuVar2;
        this.f13875c = zzdtuVar3;
        this.f13876d = zzdtuVar4;
    }

    public static zzccf a(zzdtu<Context> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzl> zzdtuVar3, zzdtu<zzbyn> zzdtuVar4) {
        return new zzccf(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccd(this.a.get(), this.f13874b.get(), this.f13875c.get(), this.f13876d.get());
    }
}
