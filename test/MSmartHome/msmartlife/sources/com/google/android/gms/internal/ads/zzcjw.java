package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzcjw<DelegateT, AdapterT> implements zzcjv<AdapterT> {

    @VisibleForTesting
    private final zzcjv<DelegateT> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbam<DelegateT, AdapterT> f14134b;

    public zzcjw(zzcjv<DelegateT> zzcjvVar, zzbam<DelegateT, AdapterT> zzbamVar) {
        this.a = zzcjvVar;
        this.f14134b = zzbamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<AdapterT> a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return zzbar.d(this.a.a(zzcxuVar, zzcxmVar), this.f14134b, zzaxg.a);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return this.a.b(zzcxuVar, zzcxmVar);
    }
}
