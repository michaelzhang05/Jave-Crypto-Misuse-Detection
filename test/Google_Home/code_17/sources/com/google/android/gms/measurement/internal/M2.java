package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
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
public final class M2 extends AbstractC2444t3 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f17249l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private O2 f17250c;

    /* renamed from: d, reason: collision with root package name */
    private O2 f17251d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f17252e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f17253f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f17254g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f17255h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f17256i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f17257j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f17258k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(R2 r22) {
        super(r22);
        this.f17256i = new Object();
        this.f17257j = new Semaphore(2);
        this.f17252e = new PriorityBlockingQueue();
        this.f17253f = new LinkedBlockingQueue();
        this.f17254g = new N2(this, "Thread death: Uncaught exception on worker thread");
        this.f17255h = new N2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void v(P2 p22) {
        synchronized (this.f17256i) {
            try {
                this.f17252e.add(p22);
                O2 o22 = this.f17250c;
                if (o22 == null) {
                    O2 o23 = new O2(this, "Measurement Worker", this.f17252e);
                    this.f17250c = o23;
                    o23.setUncaughtExceptionHandler(this.f17254g);
                    this.f17250c.start();
                } else {
                    o22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future B(Callable callable) {
        m();
        AbstractC1400p.l(callable);
        P2 p22 = new P2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f17250c) {
            p22.run();
        } else {
            v(p22);
        }
        return p22;
    }

    public final void D(Runnable runnable) {
        m();
        AbstractC1400p.l(runnable);
        v(new P2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        m();
        AbstractC1400p.l(runnable);
        v(new P2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        if (Thread.currentThread() == this.f17250c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final void i() {
        if (Thread.currentThread() == this.f17251d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final void k() {
        if (Thread.currentThread() == this.f17250c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object s(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            e().D(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                c().L().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            c().L().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future t(Callable callable) {
        m();
        AbstractC1400p.l(callable);
        P2 p22 = new P2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f17250c) {
            if (!this.f17252e.isEmpty()) {
                c().L().a("Callable skipped the worker queue.");
            }
            p22.run();
        } else {
            v(p22);
        }
        return p22;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }

    public final void z(Runnable runnable) {
        m();
        AbstractC1400p.l(runnable);
        P2 p22 = new P2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f17256i) {
            try {
                this.f17253f.add(p22);
                O2 o22 = this.f17251d;
                if (o22 == null) {
                    O2 o23 = new O2(this, "Measurement Network", this.f17253f);
                    this.f17251d = o23;
                    o23.setUncaughtExceptionHandler(this.f17255h);
                    this.f17251d.start();
                } else {
                    o22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
