package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyr implements zzdti<Context> {
    private final zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzcym> f14610b;

    private zzcyr(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.a = zzcyoVar;
        this.f14610b = zzdtuVar;
    }

    public static zzcyr a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyr(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Context) zzdto.b(this.f14610b.get().a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
