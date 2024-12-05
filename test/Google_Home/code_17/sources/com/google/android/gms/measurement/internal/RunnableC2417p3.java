package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2417p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ V5 f17759a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17760b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W2 f17761c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2417p3(W2 w22, V5 v52, b6 b6Var) {
        this.f17759a = v52;
        this.f17760b = b6Var;
        this.f17761c = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        I5 i54;
        i52 = this.f17761c.f17393a;
        i52.z0();
        if (this.f17759a.p() == null) {
            i54 = this.f17761c.f17393a;
            i54.G(this.f17759a.f17387b, this.f17760b);
        } else {
            i53 = this.f17761c.f17393a;
            i53.v(this.f17759a, this.f17760b);
        }
    }
}
