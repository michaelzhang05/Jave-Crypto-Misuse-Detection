package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2454v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2465w3 f17856a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AbstractC2461w f17857b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2454v(AbstractC2461w abstractC2461w, InterfaceC2465w3 interfaceC2465w3) {
        this.f17856a = interfaceC2465w3;
        this.f17857b = abstractC2461w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17856a.y();
        if (C2329d.a()) {
            this.f17856a.e().D(this);
            return;
        }
        boolean e8 = this.f17857b.e();
        this.f17857b.f17877c = 0L;
        if (e8) {
            this.f17857b.d();
        }
    }
}
