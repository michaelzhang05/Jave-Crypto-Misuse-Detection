package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2326c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17525a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17526b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2326c3(W2 w22, b6 b6Var) {
        this.f17525a = b6Var;
        this.f17526b = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        i52 = this.f17526b.f17393a;
        i52.z0();
        i53 = this.f17526b.f17393a;
        i53.h0(this.f17525a);
    }
}