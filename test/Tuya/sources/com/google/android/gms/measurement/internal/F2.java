package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16107a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16108b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(Y2 y22, long j8) {
        this.f16108b = y22;
        this.f16107a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16108b.z(this.f16107a, true);
        this.f16108b.f16777a.L().S(new AtomicReference());
    }
}
