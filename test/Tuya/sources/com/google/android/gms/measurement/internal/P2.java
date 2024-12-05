package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(Y2 y22, AtomicReference atomicReference) {
        this.f16252b = y22;
        this.f16251a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16251a) {
            try {
                try {
                    this.f16251a.set(Long.valueOf(this.f16252b.f16777a.z().r(this.f16252b.f16777a.B().s(), AbstractC2217k1.f16570O)));
                } finally {
                    this.f16251a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
