package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2333d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2350g f17549a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17550b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W2 f17551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2333d3(W2 w22, C2350g c2350g, b6 b6Var) {
        this.f17549a = c2350g;
        this.f17550b = b6Var;
        this.f17551c = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        I5 i54;
        i52 = this.f17551c.f17393a;
        i52.z0();
        if (this.f17549a.f17580c.p() == null) {
            i54 = this.f17551c.f17393a;
            i54.q(this.f17549a, this.f17550b);
        } else {
            i53 = this.f17551c.f17393a;
            i53.X(this.f17549a, this.f17550b);
        }
    }
}
