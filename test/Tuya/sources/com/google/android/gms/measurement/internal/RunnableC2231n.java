package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2231n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2263t2 f16695a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2236o f16696b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2231n(AbstractC2236o abstractC2236o, InterfaceC2263t2 interfaceC2263t2) {
        this.f16696b = abstractC2236o;
        this.f16695a = interfaceC2263t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16695a.b();
        if (C2167c.a()) {
            this.f16695a.f().z(this);
            return;
        }
        boolean e8 = this.f16696b.e();
        this.f16696b.f16712c = 0L;
        if (e8) {
            this.f16696b.c();
        }
    }
}
