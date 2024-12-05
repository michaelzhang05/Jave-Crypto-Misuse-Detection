package com.google.android.gms.measurement.internal;

import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
final class E3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3391d f16098a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16099b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(J3 j32, InterfaceC3391d interfaceC3391d) {
        this.f16099b = j32;
        this.f16098a = interfaceC3391d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16099b) {
            try {
                this.f16099b.f16183a = false;
                if (!this.f16099b.f16185c.z()) {
                    this.f16099b.f16185c.f16777a.d().v().a("Connected to service");
                    this.f16099b.f16185c.x(this.f16098a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
