package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16260a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(Y2 y22, AtomicReference atomicReference) {
        this.f16261b = y22;
        this.f16260a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16260a) {
            try {
                try {
                    this.f16260a.set(Integer.valueOf(this.f16261b.f16777a.z().o(this.f16261b.f16777a.B().s(), AbstractC2217k1.f16571P)));
                } finally {
                    this.f16260a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
