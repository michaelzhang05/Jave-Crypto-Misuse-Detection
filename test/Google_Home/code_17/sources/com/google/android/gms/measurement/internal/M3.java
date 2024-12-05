package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17259a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17260b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M3(A3 a32, AtomicReference atomicReference) {
        this.f17259a = atomicReference;
        this.f17260b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17259a) {
            try {
                try {
                    this.f17259a.set(Boolean.valueOf(this.f17260b.a().O(this.f17260b.m().F())));
                } finally {
                    this.f17259a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
