package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2354g3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2350g f17591a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17592b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2354g3(W2 w22, C2350g c2350g) {
        this.f17591a = c2350g;
        this.f17592b = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        I5 i54;
        i52 = this.f17592b.f17393a;
        i52.z0();
        if (this.f17591a.f17580c.p() == null) {
            i54 = this.f17592b.f17393a;
            i54.p(this.f17591a);
        } else {
            i53 = this.f17592b.f17393a;
            i53.W(this.f17591a);
        }
    }
}
