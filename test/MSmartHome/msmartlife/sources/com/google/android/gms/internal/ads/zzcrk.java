package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcrk implements zzcva<Object> {
    private final zzbbh<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14390b;

    public zzcrk(zzbbh<String> zzbbhVar, Executor executor) {
        this.a = zzbbhVar;
        this.f14390b = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<Object> b() {
        return zzbar.c(this.a, pn.a, this.f14390b);
    }
}
