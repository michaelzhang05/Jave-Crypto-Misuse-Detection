package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DefaultTransactionPerformanceCollector.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class c1 implements u5 {

    /* renamed from: d, reason: collision with root package name */
    private final List<r1> f18841d;

    /* renamed from: e, reason: collision with root package name */
    private final x4 f18842e;
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Timer f18839b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<k3>> f18840c = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f18843f = new AtomicBoolean(false);

    /* compiled from: DefaultTransactionPerformanceCollector.java */
    /* loaded from: classes2.dex */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = c1.this.f18841d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).setup();
            }
        }
    }

    /* compiled from: DefaultTransactionPerformanceCollector.java */
    /* loaded from: classes2.dex */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            k3 k3Var = new k3();
            Iterator it = c1.this.f18841d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).a(k3Var);
            }
            Iterator it2 = c1.this.f18840c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(k3Var);
            }
        }
    }

    public c1(x4 x4Var) {
        this.f18842e = (x4) io.sentry.util.q.c(x4Var, "The options object is required.");
        this.f18841d = x4Var.getCollectors();
    }

    @Override // io.sentry.u5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<k3> f(e2 e2Var) {
        List<k3> remove = this.f18840c.remove(e2Var.k().toString());
        this.f18842e.getLogger().c(s4.DEBUG, "stop collecting performance info for transactions %s (%s)", e2Var.getName(), e2Var.m().k().toString());
        if (this.f18840c.isEmpty() && this.f18843f.getAndSet(false)) {
            synchronized (this.a) {
                if (this.f18839b != null) {
                    this.f18839b.cancel();
                    this.f18839b = null;
                }
            }
        }
        return remove;
    }

    @Override // io.sentry.u5
    public void b(final e2 e2Var) {
        if (this.f18841d.isEmpty()) {
            this.f18842e.getLogger().c(s4.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f18840c.containsKey(e2Var.k().toString())) {
            this.f18840c.put(e2Var.k().toString(), new ArrayList());
            try {
                this.f18842e.getExecutorService().b(new Runnable() { // from class: io.sentry.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1.this.f(e2Var);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e2) {
                this.f18842e.getLogger().b(s4.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e2);
            }
        }
        if (this.f18843f.getAndSet(true)) {
            return;
        }
        synchronized (this.a) {
            if (this.f18839b == null) {
                this.f18839b = new Timer(true);
            }
            this.f18839b.schedule(new a(), 0L);
            this.f18839b.scheduleAtFixedRate(new b(), 100L, 100L);
        }
    }

    @Override // io.sentry.u5
    public void close() {
        this.f18840c.clear();
        this.f18842e.getLogger().c(s4.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        if (this.f18843f.getAndSet(false)) {
            synchronized (this.a) {
                if (this.f18839b != null) {
                    this.f18839b.cancel();
                    this.f18839b = null;
                }
            }
        }
    }
}
