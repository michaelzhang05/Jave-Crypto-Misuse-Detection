package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuj implements zzdti<zzcuh> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<String> f14458b;

    private zzcuj(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14458b = zzdtuVar2;
    }

    public static zzcuj a(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2) {
        return new zzcuj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcuh(this.a.get(), this.f14458b.get());
    }
}
