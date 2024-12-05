package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2355g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17593a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2355g4(A3 a32, AtomicReference atomicReference) {
        this.f17593a = atomicReference;
        this.f17594b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17593a) {
            try {
                try {
                    this.f17593a.set(Long.valueOf(this.f17594b.a().C(this.f17594b.m().F(), H.f17081P)));
                } finally {
                    this.f17593a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
