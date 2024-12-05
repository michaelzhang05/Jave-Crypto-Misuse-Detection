package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(Y2 y22, AtomicReference atomicReference) {
        this.f16244b = y22;
        this.f16243a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16243a) {
            try {
                try {
                    this.f16243a.set(this.f16244b.f16777a.z().x(this.f16244b.f16777a.B().s(), AbstractC2217k1.f16569N));
                } finally {
                    this.f16243a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
