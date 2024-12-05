package com.google.android.gms.measurement.internal;

import l0.InterfaceC3272g;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2335d5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3272g f17553a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2314a5 f17554b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2335d5(ServiceConnectionC2314a5 serviceConnectionC2314a5, InterfaceC3272g interfaceC3272g) {
        this.f17553a = interfaceC3272g;
        this.f17554b = serviceConnectionC2314a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17554b) {
            try {
                this.f17554b.f17450a = false;
                if (!this.f17554b.f17452c.g0()) {
                    this.f17554b.f17452c.c().K().a("Connected to service");
                    this.f17554b.f17452c.S(this.f17553a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
