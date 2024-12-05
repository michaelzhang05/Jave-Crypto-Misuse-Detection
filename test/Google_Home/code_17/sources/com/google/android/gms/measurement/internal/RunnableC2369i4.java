package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2369i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17646a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17647b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2369i4(A3 a32, AtomicReference atomicReference) {
        this.f17646a = atomicReference;
        this.f17647b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17646a) {
            try {
                try {
                    this.f17646a.set(Double.valueOf(this.f17647b.a().l(this.f17647b.m().F(), H.f17085R)));
                } finally {
                    this.f17646a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
