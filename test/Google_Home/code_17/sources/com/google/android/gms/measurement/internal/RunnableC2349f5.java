package com.google.android.gms.measurement.internal;

import l0.InterfaceC3272g;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2349f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3272g f17574a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2314a5 f17575b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2349f5(ServiceConnectionC2314a5 serviceConnectionC2314a5, InterfaceC3272g interfaceC3272g) {
        this.f17574a = interfaceC3272g;
        this.f17575b = serviceConnectionC2314a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17575b) {
            try {
                this.f17575b.f17450a = false;
                if (!this.f17575b.f17452c.g0()) {
                    this.f17575b.f17452c.c().F().a("Connected to remote service");
                    this.f17575b.f17452c.S(this.f17574a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
