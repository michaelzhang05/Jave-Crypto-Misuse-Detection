package androidx.work.impl.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public class n {
    private static final String a = androidx.work.n.f("WorkTimer");

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f2096b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f2097c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, c> f2098d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, b> f2099e;

    /* renamed from: f, reason: collision with root package name */
    final Object f2100f;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private int f2101f = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f2101f);
            this.f2101f = this.f2101f + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final n f2103f;

        /* renamed from: g, reason: collision with root package name */
        private final String f2104g;

        c(n nVar, String str) {
            this.f2103f = nVar;
            this.f2104g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f2103f.f2100f) {
                if (this.f2103f.f2098d.remove(this.f2104g) != null) {
                    b remove = this.f2103f.f2099e.remove(this.f2104g);
                    if (remove != null) {
                        remove.a(this.f2104g);
                    }
                } else {
                    androidx.work.n.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f2104g), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f2096b = aVar;
        this.f2098d = new HashMap();
        this.f2099e = new HashMap();
        this.f2100f = new Object();
        this.f2097c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f2097c.isShutdown()) {
            return;
        }
        this.f2097c.shutdownNow();
    }

    public void b(String str, long j2, b bVar) {
        synchronized (this.f2100f) {
            androidx.work.n.c().a(a, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f2098d.put(str, cVar);
            this.f2099e.put(str, bVar);
            this.f2097c.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f2100f) {
            if (this.f2098d.remove(str) != null) {
                androidx.work.n.c().a(a, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f2099e.remove(str);
            }
        }
    }
}
