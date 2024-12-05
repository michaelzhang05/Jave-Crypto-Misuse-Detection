package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzcsk<S extends zzcuz> implements zzcva<S> {
    private final AtomicReference<ao<S>> a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final Clock f14427b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcva<S> f14428c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14429d;

    public zzcsk(zzcva<S> zzcvaVar, long j2, Clock clock) {
        this.f14427b = clock;
        this.f14428c = zzcvaVar;
        this.f14429d = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<S> b() {
        ao<S> aoVar = this.a.get();
        if (aoVar == null || aoVar.a()) {
            aoVar = new ao<>(this.f14428c.b(), this.f14429d, this.f14427b);
            this.a.set(aoVar);
        }
        return aoVar.a;
    }
}
