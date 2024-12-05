package rx.n.c;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: ScheduledAction.java */
/* loaded from: classes3.dex */
public final class j extends AtomicReference<Thread> implements Runnable, rx.k {

    /* renamed from: f, reason: collision with root package name */
    final rx.n.e.l f23047f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.a f23048g;

    /* compiled from: ScheduledAction.java */
    /* loaded from: classes3.dex */
    final class a implements rx.k {

        /* renamed from: f, reason: collision with root package name */
        private final Future<?> f23049f;

        a(Future<?> future) {
            this.f23049f = future;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23049f.isCancelled();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (j.this.get() != Thread.currentThread()) {
                this.f23049f.cancel(true);
            } else {
                this.f23049f.cancel(false);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* loaded from: classes3.dex */
    static final class b extends AtomicBoolean implements rx.k {

        /* renamed from: f, reason: collision with root package name */
        final j f23051f;

        /* renamed from: g, reason: collision with root package name */
        final rx.n.e.l f23052g;

        public b(j jVar, rx.n.e.l lVar) {
            this.f23051f = jVar;
            this.f23052g = lVar;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23051f.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f23052g.b(this.f23051f);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* loaded from: classes3.dex */
    static final class c extends AtomicBoolean implements rx.k {

        /* renamed from: f, reason: collision with root package name */
        final j f23053f;

        /* renamed from: g, reason: collision with root package name */
        final rx.t.b f23054g;

        public c(j jVar, rx.t.b bVar) {
            this.f23053f = jVar;
            this.f23054g = bVar;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23053f.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f23054g.d(this.f23053f);
            }
        }
    }

    public j(rx.m.a aVar) {
        this.f23048g = aVar;
        this.f23047f = new rx.n.e.l();
    }

    public void a(Future<?> future) {
        this.f23047f.a(new a(future));
    }

    public void b(rx.k kVar) {
        this.f23047f.a(kVar);
    }

    public void c(rx.t.b bVar) {
        this.f23047f.a(new c(this, bVar));
    }

    void d(Throwable th) {
        rx.q.c.j(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23047f.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.f23048g.call();
            } finally {
                unsubscribe();
            }
        } catch (OnErrorNotImplementedException e2) {
            d(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e2));
        } catch (Throwable th) {
            d(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
        }
    }

    @Override // rx.k
    public void unsubscribe() {
        if (this.f23047f.isUnsubscribed()) {
            return;
        }
        this.f23047f.unsubscribe();
    }

    public j(rx.m.a aVar, rx.t.b bVar) {
        this.f23048g = aVar;
        this.f23047f = new rx.n.e.l(new c(this, bVar));
    }

    public j(rx.m.a aVar, rx.n.e.l lVar) {
        this.f23048g = aVar;
        this.f23047f = new rx.n.e.l(new b(this, lVar));
    }
}
