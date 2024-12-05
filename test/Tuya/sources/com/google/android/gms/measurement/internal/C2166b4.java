package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2166b4 {

    /* renamed from: a, reason: collision with root package name */
    private final W.d f16436a;

    /* renamed from: b, reason: collision with root package name */
    private long f16437b;

    public C2166b4(W.d dVar) {
        AbstractC1319p.l(dVar);
        this.f16436a = dVar;
    }

    public final void a() {
        this.f16437b = 0L;
    }

    public final void b() {
        this.f16437b = this.f16436a.elapsedRealtime();
    }

    public final boolean c(long j8) {
        if (this.f16437b == 0 || this.f16436a.elapsedRealtime() - this.f16437b >= 3600000) {
            return true;
        }
        return false;
    }
}
