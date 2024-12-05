package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2488z5 {

    /* renamed from: a, reason: collision with root package name */
    private final V.d f17990a;

    /* renamed from: b, reason: collision with root package name */
    private long f17991b;

    public C2488z5(V.d dVar) {
        AbstractC1400p.l(dVar);
        this.f17990a = dVar;
    }

    public final void a() {
        this.f17991b = 0L;
    }

    public final boolean b(long j8) {
        if (this.f17991b == 0 || this.f17990a.elapsedRealtime() - this.f17991b >= 3600000) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.f17991b = this.f17990a.elapsedRealtime();
    }
}
