package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.h;
import rx.n.c.d;
import rx.n.c.k;
import rx.n.c.n;
import rx.q.c;
import rx.q.f;
import rx.q.g;

/* loaded from: classes.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final h f23256b;

    /* renamed from: c, reason: collision with root package name */
    private final h f23257c;

    /* renamed from: d, reason: collision with root package name */
    private final h f23258d;

    private Schedulers() {
        g f2 = f.c().f();
        h g2 = f2.g();
        if (g2 != null) {
            this.f23256b = g2;
        } else {
            this.f23256b = g.a();
        }
        h i2 = f2.i();
        if (i2 != null) {
            this.f23257c = i2;
        } else {
            this.f23257c = g.c();
        }
        h j2 = f2.j();
        if (j2 != null) {
            this.f23258d = j2;
        } else {
            this.f23258d = g.e();
        }
    }

    private static Schedulers a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = a;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (atomicReference.compareAndSet(null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.b();
        }
    }

    public static h computation() {
        return c.f(a().f23256b);
    }

    public static h from(Executor executor) {
        return new rx.n.c.c(executor);
    }

    public static h immediate() {
        return rx.n.c.f.a;
    }

    public static h io() {
        return c.k(a().f23257c);
    }

    public static h newThread() {
        return c.l(a().f23258d);
    }

    public static void reset() {
        Schedulers andSet = a.getAndSet(null);
        if (andSet != null) {
            andSet.b();
        }
    }

    public static void shutdown() {
        Schedulers a2 = a();
        a2.b();
        synchronized (a2) {
            d.f23028h.shutdown();
        }
    }

    public static void start() {
        Schedulers a2 = a();
        a2.c();
        synchronized (a2) {
            d.f23028h.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static h trampoline() {
        return n.a;
    }

    synchronized void b() {
        Object obj = this.f23256b;
        if (obj instanceof k) {
            ((k) obj).shutdown();
        }
        Object obj2 = this.f23257c;
        if (obj2 instanceof k) {
            ((k) obj2).shutdown();
        }
        Object obj3 = this.f23258d;
        if (obj3 instanceof k) {
            ((k) obj3).shutdown();
        }
    }

    synchronized void c() {
        Object obj = this.f23256b;
        if (obj instanceof k) {
            ((k) obj).start();
        }
        Object obj2 = this.f23257c;
        if (obj2 instanceof k) {
            ((k) obj2).start();
        }
        Object obj3 = this.f23258d;
        if (obj3 instanceof k) {
            ((k) obj3).start();
        }
    }
}
