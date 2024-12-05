package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17396a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17397b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(A3 a32, AtomicReference atomicReference) {
        this.f17396a = atomicReference;
        this.f17397b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17396a) {
            try {
                try {
                    this.f17396a.set(this.f17397b.a().I(this.f17397b.m().F()));
                } finally {
                    this.f17396a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
