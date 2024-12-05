package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.s4;
import io.sentry.w1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ANRWatchDog.java */
/* loaded from: classes2.dex */
public final class e0 extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18635f;

    /* renamed from: g, reason: collision with root package name */
    private final a f18636g;

    /* renamed from: h, reason: collision with root package name */
    private final c1 f18637h;

    /* renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.q f18638i;

    /* renamed from: j, reason: collision with root package name */
    private long f18639j;

    /* renamed from: k, reason: collision with root package name */
    private final long f18640k;
    private final w1 l;
    private volatile long m;
    private final AtomicBoolean n;
    private final Context o;
    private final Runnable p;

    /* compiled from: ANRWatchDog.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(long j2, boolean z, a aVar, w1 w1Var, Context context) {
        this(new io.sentry.transport.q() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.q
            public final long a() {
                long uptimeMillis;
                uptimeMillis = SystemClock.uptimeMillis();
                return uptimeMillis;
            }
        }, j2, 500L, z, aVar, w1Var, new c1(), context);
    }

    private boolean a() {
        ActivityManager activityManager = (ActivityManager) this.o.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.ProcessErrorStateInfo> list = null;
        try {
            list = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.l.b(s4.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
        }
        if (list == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(io.sentry.transport.q qVar) {
        this.m = qVar.a();
        this.n.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.p.run();
        while (!isInterrupted()) {
            this.f18637h.b(this.p);
            try {
                Thread.sleep(this.f18639j);
                if (this.f18638i.a() - this.m > this.f18640k) {
                    if (!this.f18635f && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.l.c(s4.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.n.set(true);
                    } else if (a() && this.n.compareAndSet(false, true)) {
                        this.f18636g.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f18640k + " ms.", this.f18637h.a()));
                    }
                }
            } catch (InterruptedException e2) {
                try {
                    Thread.currentThread().interrupt();
                    this.l.c(s4.WARNING, "Interrupted: %s", e2.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.l.c(s4.WARNING, "Failed to interrupt due to SecurityException: %s", e2.getMessage());
                    return;
                }
            }
        }
    }

    e0(final io.sentry.transport.q qVar, long j2, long j3, boolean z, a aVar, w1 w1Var, c1 c1Var, Context context) {
        super("|ANR-WatchDog|");
        this.m = 0L;
        this.n = new AtomicBoolean(false);
        this.f18638i = qVar;
        this.f18640k = j2;
        this.f18639j = j3;
        this.f18635f = z;
        this.f18636g = aVar;
        this.l = w1Var;
        this.f18637h = c1Var;
        this.o = context;
        this.p = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.d(qVar);
            }
        };
        if (j2 < j3 * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f18639j * 2)));
        }
    }
}
