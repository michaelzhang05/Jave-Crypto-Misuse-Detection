package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2432r5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17794a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2419p5 f17795b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2432r5(C2419p5 c2419p5, long j8) {
        this.f17794a = j8;
        this.f17795b = c2419p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2419p5.C(this.f17795b, this.f17794a);
    }
}
