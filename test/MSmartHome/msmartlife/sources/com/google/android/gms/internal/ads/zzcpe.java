package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcpe implements zzdti<zzcpa> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbws> f14311b;

    public zzcpe(zzdtu<Context> zzdtuVar, zzdtu<zzbws> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14311b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpa(this.a.get(), this.f14311b.get());
    }
}
