package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2383k4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2475y f17673a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17674b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2383k4(A3 a32, C2475y c2475y) {
        this.f17673a = c2475y;
        this.f17674b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17674b.f().A(this.f17673a)) {
            this.f17674b.c().K().b("Setting DMA consent(FE)", this.f17673a);
            if (this.f17674b.q().j0()) {
                this.f17674b.q().e0();
                return;
            } else {
                this.f17674b.q().U(false);
                return;
            }
        }
        this.f17674b.c().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f17673a.a()));
    }
}
