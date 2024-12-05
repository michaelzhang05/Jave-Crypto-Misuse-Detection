package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Process;
import androidx.work.WorkRequest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f17272a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f17273b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17274c = false;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ M2 f17275d;

    public O2(M2 m22, String str, BlockingQueue blockingQueue) {
        this.f17275d = m22;
        AbstractC1400p.l(str);
        AbstractC1400p.l(blockingQueue);
        this.f17272a = new Object();
        this.f17273b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f17275d.c().L().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        O2 o22;
        O2 o23;
        obj = this.f17275d.f17256i;
        synchronized (obj) {
            try {
                if (!this.f17274c) {
                    semaphore = this.f17275d.f17257j;
                    semaphore.release();
                    obj2 = this.f17275d.f17256i;
                    obj2.notifyAll();
                    o22 = this.f17275d.f17250c;
                    if (this == o22) {
                        this.f17275d.f17250c = null;
                    } else {
                        o23 = this.f17275d.f17251d;
                        if (this == o23) {
                            this.f17275d.f17251d = null;
                        } else {
                            this.f17275d.c().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f17274c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f17272a) {
            this.f17272a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i8;
        Object obj;
        boolean z8;
        boolean z9 = false;
        while (!z9) {
            try {
                semaphore = this.f17275d.f17257j;
                semaphore.acquire();
                z9 = true;
            } catch (InterruptedException e8) {
                b(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                P2 p22 = (P2) this.f17273b.poll();
                if (p22 != null) {
                    if (p22.f17282b) {
                        i8 = threadPriority;
                    } else {
                        i8 = 10;
                    }
                    Process.setThreadPriority(i8);
                    p22.run();
                } else {
                    synchronized (this.f17272a) {
                        if (this.f17273b.peek() == null) {
                            z8 = this.f17275d.f17258k;
                            if (!z8) {
                                try {
                                    this.f17272a.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                                } catch (InterruptedException e9) {
                                    b(e9);
                                }
                            }
                        }
                    }
                    obj = this.f17275d.f17256i;
                    synchronized (obj) {
                        if (this.f17273b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
