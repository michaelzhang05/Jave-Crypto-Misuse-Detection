package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcaa implements zzdti<zzbzt> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcdn> f13777b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzccj> f13778c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzbmy> f13779d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzbzb> f13780e;

    public zzcaa(zzdtu<Context> zzdtuVar, zzdtu<zzcdn> zzdtuVar2, zzdtu<zzccj> zzdtuVar3, zzdtu<zzbmy> zzdtuVar4, zzdtu<zzbzb> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13777b = zzdtuVar2;
        this.f13778c = zzdtuVar3;
        this.f13779d = zzdtuVar4;
        this.f13780e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbzt(this.a.get(), this.f13777b.get(), this.f13778c.get(), this.f13779d.get(), this.f13780e.get());
    }
}
