package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2403n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ G f17732a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17733b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W2 f17734c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2403n3(W2 w22, G g8, String str) {
        this.f17732a = g8;
        this.f17733b = str;
        this.f17734c = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        i52 = this.f17734c.f17393a;
        i52.z0();
        i53 = this.f17734c.f17393a;
        i53.s(this.f17732a, this.f17733b);
    }
}
