package I6;

import L6.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f4425g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), J6.c.B("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    private final int f4426a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4427b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f4428c;

    /* renamed from: d, reason: collision with root package name */
    private final Deque f4429d;

    /* renamed from: e, reason: collision with root package name */
    final L6.d f4430e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4431f;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a8 = i.this.a(System.nanoTime());
                if (a8 == -1) {
                    return;
                }
                if (a8 > 0) {
                    long j8 = a8 / 1000000;
                    long j9 = a8 - (1000000 * j8);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j8, (int) j9);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int e(L6.c cVar, long j8) {
        List list = cVar.f6295n;
        int i8 = 0;
        while (i8 < list.size()) {
            Reference reference = (Reference) list.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                Q6.f.i().q("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f6324a);
                list.remove(i8);
                cVar.f6292k = true;
                if (list.isEmpty()) {
                    cVar.f6296o = j8 - this.f4427b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j8) {
        synchronized (this) {
            try {
                L6.c cVar = null;
                long j9 = Long.MIN_VALUE;
                int i8 = 0;
                int i9 = 0;
                for (L6.c cVar2 : this.f4429d) {
                    if (e(cVar2, j8) > 0) {
                        i9++;
                    } else {
                        i8++;
                        long j10 = j8 - cVar2.f6296o;
                        if (j10 > j9) {
                            cVar = cVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f4427b;
                if (j9 < j11 && i8 <= this.f4426a) {
                    if (i8 > 0) {
                        return j11 - j9;
                    }
                    if (i9 > 0) {
                        return j11;
                    }
                    this.f4431f = false;
                    return -1L;
                }
                this.f4429d.remove(cVar);
                J6.c.e(cVar.q());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(L6.c cVar) {
        if (!cVar.f6292k && this.f4426a != 0) {
            notifyAll();
            return false;
        }
        this.f4429d.remove(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket c(C1263a c1263a, L6.g gVar) {
        for (L6.c cVar : this.f4429d) {
            if (cVar.k(c1263a, null) && cVar.m() && cVar != gVar.c()) {
                return gVar.l(cVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L6.c d(C1263a c1263a, L6.g gVar, B b8) {
        for (L6.c cVar : this.f4429d) {
            if (cVar.k(c1263a, b8)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(L6.c cVar) {
        if (!this.f4431f) {
            this.f4431f = true;
            f4425g.execute(this.f4428c);
        }
        this.f4429d.add(cVar);
    }

    public i(int i8, long j8, TimeUnit timeUnit) {
        this.f4428c = new a();
        this.f4429d = new ArrayDeque();
        this.f4430e = new L6.d();
        this.f4426a = i8;
        this.f4427b = timeUnit.toNanos(j8);
        if (j8 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j8);
    }
}
