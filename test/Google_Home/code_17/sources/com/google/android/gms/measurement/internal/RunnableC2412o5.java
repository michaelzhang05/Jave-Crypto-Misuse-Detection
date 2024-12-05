package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2412o5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17752a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2419p5 f17753b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2412o5(C2419p5 c2419p5, long j8) {
        this.f17752a = j8;
        this.f17753b = c2419p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2419p5.I(this.f17753b, this.f17752a);
    }
}
