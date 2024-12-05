package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2317b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17467a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2308a f17468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2317b1(C2308a c2308a, long j8) {
        this.f17467a = j8;
        this.f17468b = c2308a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17468b.B(this.f17467a);
    }
}
