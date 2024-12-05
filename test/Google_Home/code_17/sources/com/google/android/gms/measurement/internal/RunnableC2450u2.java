package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2450u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17842a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2429r2 f17843b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2450u2(C2429r2 c2429r2, boolean z8) {
        this.f17842a = z8;
        this.f17843b = c2429r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        i52 = this.f17843b.f17784a;
        i52.J(this.f17842a);
    }
}
