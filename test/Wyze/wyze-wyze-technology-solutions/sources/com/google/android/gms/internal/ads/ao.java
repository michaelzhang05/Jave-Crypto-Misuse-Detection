package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;

/* loaded from: classes2.dex */
final class ao<S extends zzcuz> {
    public final zzbbh<S> a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11096b;

    /* renamed from: c, reason: collision with root package name */
    private final Clock f11097c;

    public ao(zzbbh<S> zzbbhVar, long j2, Clock clock) {
        this.a = zzbbhVar;
        this.f11097c = clock;
        this.f11096b = clock.b() + j2;
    }

    public final boolean a() {
        return this.f11096b < this.f11097c.b();
    }
}
