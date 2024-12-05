package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2375j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17654a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17655b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2375j3(W2 w22, b6 b6Var) {
        this.f17654a = b6Var;
        this.f17655b = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        i52 = this.f17655b.f17393a;
        i52.z0();
        i53 = this.f17655b.f17393a;
        i53.j0(this.f17654a);
    }
}
