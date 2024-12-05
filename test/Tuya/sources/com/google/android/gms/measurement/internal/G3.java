package com.google.android.gms.measurement.internal;

import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
final class G3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3391d f16121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16122b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(J3 j32, InterfaceC3391d interfaceC3391d) {
        this.f16122b = j32;
        this.f16121a = interfaceC3391d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16122b) {
            try {
                this.f16122b.f16183a = false;
                if (!this.f16122b.f16185c.z()) {
                    this.f16122b.f16185c.f16777a.d().q().a("Connected to remote service");
                    this.f16122b.f16185c.x(this.f16121a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
