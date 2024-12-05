package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzdad implements zzdti<zzalr> {
    private final zzdac a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14645b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f14646c;

    public zzdad(zzdac zzdacVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2) {
        this.a = zzdacVar;
        this.f14645b = zzdtuVar;
        this.f14646c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzalr) zzdto.b(new zzalk().b(this.f14645b.get(), this.f14646c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
