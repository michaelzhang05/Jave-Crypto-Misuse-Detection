package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2486z3 f17339a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ R2 f17340b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S2(R2 r22, C2486z3 c2486z3) {
        this.f17339a = c2486z3;
        this.f17340b = r22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R2.f(this.f17340b, this.f17339a);
        this.f17340b.b(this.f17339a.f17985g);
    }
}
