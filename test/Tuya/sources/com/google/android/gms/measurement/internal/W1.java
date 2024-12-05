package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class W1 extends AbstractC2258s2 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f16324l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private V1 f16325c;

    /* renamed from: d, reason: collision with root package name */
    private V1 f16326d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f16327e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f16328f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16329g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16330h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f16331i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f16332j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f16333k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W1(Y1 y12) {
        super(y12);
        this.f16331i = new Object();
        this.f16332j = new Semaphore(2);
        this.f16327e = new PriorityBlockingQueue();
        this.f16328f = new LinkedBlockingQueue();
        this.f16329g = new T1(this, "Thread death: Uncaught exception on worker thread");
        this.f16330h = new T1(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean B(W1 w12) {
        boolean z8 = w12.f16333k;
        return false;
    }

    private final void D(U1 u12) {
        synchronized (this.f16331i) {
            try {
                this.f16327e.add(u12);
                V1 v12 = this.f16325c;
                if (v12 == null) {
                    V1 v13 = new V1(this, "Measurement Worker", this.f16327e);
                    this.f16325c = v13;
                    v13.setUncaughtExceptionHandler(this.f16329g);
                    this.f16325c.start();
                } else {
                    v12.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        D(new U1(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        if (Thread.currentThread() == this.f16325c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2253r2
    public final void g() {
        if (Thread.currentThread() == this.f16326d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2253r2
    public final void h() {
        if (Thread.currentThread() == this.f16325c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object r(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f16777a.f().z(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                this.f16777a.d().w().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f16777a.d().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        k();
        AbstractC1319p.l(callable);
        U1 u12 = new U1(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16325c) {
            if (!this.f16327e.isEmpty()) {
                this.f16777a.d().w().a("Callable skipped the worker queue.");
            }
            u12.run();
        } else {
            D(u12);
        }
        return u12;
    }

    public final Future t(Callable callable) {
        k();
        AbstractC1319p.l(callable);
        U1 u12 = new U1(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16325c) {
            u12.run();
        } else {
            D(u12);
        }
        return u12;
    }

    public final void y(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        U1 u12 = new U1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f16331i) {
            try {
                this.f16328f.add(u12);
                V1 v12 = this.f16326d;
                if (v12 == null) {
                    V1 v13 = new V1(this, "Measurement Network", this.f16328f);
                    this.f16326d = v13;
                    v13.setUncaughtExceptionHandler(this.f16330h);
                    this.f16326d.start();
                } else {
                    v12.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        D(new U1(this, runnable, false, "Task exception on worker thread"));
    }
}
