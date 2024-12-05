package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2168c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16438a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0 f16439b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2168c0(D0 d02, long j8) {
        this.f16439b = d02;
        this.f16438a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16439b.q(this.f16438a);
    }
}
