package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16268b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(Y2 y22, AtomicReference atomicReference) {
        this.f16268b = y22;
        this.f16267a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16267a) {
            try {
                try {
                    this.f16267a.set(Double.valueOf(this.f16268b.f16777a.z().k(this.f16268b.f16777a.B().s(), AbstractC2217k1.f16572Q)));
                } finally {
                    this.f16267a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
