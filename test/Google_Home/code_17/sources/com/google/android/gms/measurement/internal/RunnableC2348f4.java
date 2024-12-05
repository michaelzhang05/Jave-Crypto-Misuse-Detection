package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2348f4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17572a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17573b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2348f4(A3 a32, AtomicReference atomicReference) {
        this.f17572a = atomicReference;
        this.f17573b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17572a) {
            try {
                try {
                    this.f17572a.set(Integer.valueOf(this.f17573b.a().v(this.f17573b.m().F(), H.f17083Q)));
                } finally {
                    this.f17572a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
