package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Process;
import androidx.work.WorkRequest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V1 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16313a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f16314b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16315c = false;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W1 f16316d;

    public V1(W1 w12, String str, BlockingQueue blockingQueue) {
        this.f16316d = w12;
        AbstractC1319p.l(str);
        AbstractC1319p.l(blockingQueue);
        this.f16313a = new Object();
        this.f16314b = blockingQueue;
        setName(str);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        V1 v12;
        V1 v13;
        obj = this.f16316d.f16331i;
        synchronized (obj) {
            try {
                if (!this.f16315c) {
                    semaphore = this.f16316d.f16332j;
                    semaphore.release();
                    obj2 = this.f16316d.f16331i;
                    obj2.notifyAll();
                    W1 w12 = this.f16316d;
                    v12 = w12.f16325c;
                    if (this == v12) {
                        w12.f16325c = null;
                    } else {
                        v13 = w12.f16326d;
                        if (this == v13) {
                            w12.f16326d = null;
                        } else {
                            w12.f16777a.d().r().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f16315c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f16316d.f16777a.d().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f16313a) {
            this.f16313a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i8;
        Object obj;
        boolean z8 = false;
        while (!z8) {
            try {
                semaphore = this.f16316d.f16332j;
                semaphore.acquire();
                z8 = true;
            } catch (InterruptedException e8) {
                c(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                U1 u12 = (U1) this.f16314b.poll();
                if (u12 != null) {
                    if (true != u12.f16302b) {
                        i8 = 10;
                    } else {
                        i8 = threadPriority;
                    }
                    Process.setThreadPriority(i8);
                    u12.run();
                } else {
                    synchronized (this.f16313a) {
                        if (this.f16314b.peek() == null) {
                            W1.B(this.f16316d);
                            try {
                                this.f16313a.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e9) {
                                c(e9);
                            }
                        }
                    }
                    obj = this.f16316d.f16331i;
                    synchronized (obj) {
                        if (this.f16314b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
