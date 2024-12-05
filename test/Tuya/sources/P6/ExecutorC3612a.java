package p6;

import L5.I;
import androidx.work.WorkRequest;
import b6.AbstractC1885c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import i6.AbstractC2813c;
import i6.Q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import n6.C3481A;
import n6.C3486F;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3612a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0848a f37081h = new C0848a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37082i = AtomicLongFieldUpdater.newUpdater(ExecutorC3612a.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37083j = AtomicLongFieldUpdater.newUpdater(ExecutorC3612a.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37084k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3612a.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final C3486F f37085l = new C3486F("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f37086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37087b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37088c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f37089d;

    /* renamed from: e, reason: collision with root package name */
    public final C3615d f37090e;

    /* renamed from: f, reason: collision with root package name */
    public final C3615d f37091f;

    /* renamed from: g, reason: collision with root package name */
    public final C3481A f37092g;
    private volatile long parkedWorkersStack;

    /* renamed from: p6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0848a {
        private C0848a() {
        }

        public /* synthetic */ C0848a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: p6.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37093a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37093a = iArr;
        }
    }

    /* renamed from: p6.a$d */
    /* loaded from: classes5.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC3612a(int i8, int i9, long j8, String str) {
        this.f37086a = i8;
        this.f37087b = i9;
        this.f37088c = j8;
        this.f37089d = str;
        if (i8 >= 1) {
            if (i9 >= i8) {
                if (i9 <= 2097150) {
                    if (j8 > 0) {
                        this.f37090e = new C3615d();
                        this.f37091f = new C3615d();
                        this.f37092g = new C3481A((i8 + 1) * 2);
                        this.controlState = i8 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
    }

    private final AbstractRunnableC3619h E(c cVar, AbstractRunnableC3619h abstractRunnableC3619h, boolean z8) {
        if (cVar == null) {
            return abstractRunnableC3619h;
        }
        if (cVar.f37097c == d.TERMINATED) {
            return abstractRunnableC3619h;
        }
        if (abstractRunnableC3619h.f37119b.b() == 0 && cVar.f37097c == d.BLOCKING) {
            return abstractRunnableC3619h;
        }
        cVar.f37101g = true;
        return cVar.f37095a.a(abstractRunnableC3619h, z8);
    }

    private final boolean F(long j8) {
        if (d6.m.d(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f37086a) {
            int e8 = e();
            if (e8 == 1 && this.f37086a > 1) {
                e();
            }
            if (e8 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean G(ExecutorC3612a executorC3612a, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f37083j.get(executorC3612a);
        }
        return executorC3612a.F(j8);
    }

    private final boolean H() {
        c o8;
        do {
            o8 = o();
            if (o8 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(o8, -1, 0));
        LockSupport.unpark(o8);
        return true;
    }

    private final boolean b(AbstractRunnableC3619h abstractRunnableC3619h) {
        if (abstractRunnableC3619h.f37119b.b() == 1) {
            return this.f37091f.a(abstractRunnableC3619h);
        }
        return this.f37090e.a(abstractRunnableC3619h);
    }

    private final int e() {
        synchronized (this.f37092g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f37083j;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                int d8 = d6.m.d(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (d8 >= this.f37086a) {
                    return 0;
                }
                if (i8 >= this.f37087b) {
                    return 0;
                }
                int i9 = ((int) (f37083j.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f37092g.b(i9) == null) {
                    c cVar = new c(this, i9);
                    this.f37092g.c(i9, cVar);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = d8 + 1;
                        cVar.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c g() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3159y.d(ExecutorC3612a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void l(ExecutorC3612a executorC3612a, Runnable runnable, InterfaceC3620i interfaceC3620i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC3620i = AbstractC3623l.f37128g;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        executorC3612a.h(runnable, interfaceC3620i, z8);
    }

    private final int m(c cVar) {
        Object i8 = cVar.i();
        while (i8 != f37085l) {
            if (i8 == null) {
                return 0;
            }
            c cVar2 = (c) i8;
            int h8 = cVar2.h();
            if (h8 != 0) {
                return h8;
            }
            i8 = cVar2.i();
        }
        return -1;
    }

    private final c o() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37082i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f37092g.b((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            int m8 = m(cVar);
            if (m8 >= 0 && f37082i.compareAndSet(this, j8, m8 | j9)) {
                cVar.r(f37085l);
                return cVar;
            }
        }
    }

    private final void x(long j8, boolean z8) {
        if (z8 || H() || F(j8)) {
            return;
        }
        H();
    }

    public final void A() {
        if (H() || G(this, 0L, 1, null)) {
            return;
        }
        H();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        l(this, runnable, null, false, 6, null);
    }

    public final AbstractRunnableC3619h f(Runnable runnable, InterfaceC3620i interfaceC3620i) {
        long a8 = AbstractC3623l.f37127f.a();
        if (runnable instanceof AbstractRunnableC3619h) {
            AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) runnable;
            abstractRunnableC3619h.f37118a = a8;
            abstractRunnableC3619h.f37119b = interfaceC3620i;
            return abstractRunnableC3619h;
        }
        return new C3622k(runnable, a8, interfaceC3620i);
    }

    public final void h(Runnable runnable, InterfaceC3620i interfaceC3620i, boolean z8) {
        boolean z9;
        long j8;
        AbstractC2813c.a();
        AbstractRunnableC3619h f8 = f(runnable, interfaceC3620i);
        boolean z10 = false;
        if (f8.f37119b.b() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j8 = f37083j.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        } else {
            j8 = 0;
        }
        c g8 = g();
        AbstractRunnableC3619h E8 = E(g8, f8, z8);
        if (E8 != null && !b(E8)) {
            throw new RejectedExecutionException(this.f37089d + " was terminated");
        }
        if (z8 && g8 != null) {
            z10 = true;
        }
        if (z9) {
            x(j8, z10);
        } else {
            if (z10) {
                return;
            }
            A();
        }
    }

    public final boolean isTerminated() {
        if (f37084k.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r(c cVar) {
        long j8;
        long j9;
        int h8;
        if (cVar.i() != f37085l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37082i;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            h8 = cVar.h();
            cVar.r(this.f37092g.b((int) (2097151 & j8)));
        } while (!f37082i.compareAndSet(this, j8, j9 | h8));
        return true;
    }

    public final void t(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37082i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            if (i10 == i8) {
                if (i9 == 0) {
                    i10 = m(cVar);
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0 && f37082i.compareAndSet(this, j8, j9 | i10)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a8 = this.f37092g.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a8; i13++) {
            c cVar = (c) this.f37092g.b(i13);
            if (cVar != null) {
                int e8 = cVar.f37095a.e();
                int i14 = b.f37093a[cVar.f37097c.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    i12++;
                                }
                            } else {
                                i11++;
                                if (e8 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(e8);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i8++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e8);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i9++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e8);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                }
            }
        }
        long j8 = f37083j.get(this);
        return this.f37089d + '@' + Q.b(this) + "[Pool Size {core = " + this.f37086a + ", max = " + this.f37087b + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f37090e.c() + ", global blocking queue size = " + this.f37091f.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f37086a - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    public final void u(AbstractRunnableC3619h abstractRunnableC3619h) {
        try {
            abstractRunnableC3619h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void w(long j8) {
        int i8;
        AbstractRunnableC3619h abstractRunnableC3619h;
        if (!f37084k.compareAndSet(this, 0, 1)) {
            return;
        }
        c g8 = g();
        synchronized (this.f37092g) {
            i8 = (int) (f37083j.get(this) & 2097151);
        }
        if (1 <= i8) {
            int i9 = 1;
            while (true) {
                Object b8 = this.f37092g.b(i9);
                AbstractC3159y.f(b8);
                c cVar = (c) b8;
                if (cVar != g8) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j8);
                    }
                    cVar.f37095a.f(this.f37091f);
                }
                if (i9 == i8) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f37091f.b();
        this.f37090e.b();
        while (true) {
            if (g8 != null) {
                abstractRunnableC3619h = g8.g(true);
                if (abstractRunnableC3619h != null) {
                    continue;
                    u(abstractRunnableC3619h);
                }
            }
            abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37090e.d();
            if (abstractRunnableC3619h == null && (abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37091f.d()) == null) {
                break;
            }
            u(abstractRunnableC3619h);
        }
        if (g8 != null) {
            g8.u(d.TERMINATED);
        }
        f37082i.set(this, 0L);
        f37083j.set(this, 0L);
    }

    /* renamed from: p6.a$c */
    /* loaded from: classes5.dex */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f37094i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a, reason: collision with root package name */
        public final C3625n f37095a;

        /* renamed from: b, reason: collision with root package name */
        private final T f37096b;

        /* renamed from: c, reason: collision with root package name */
        public d f37097c;

        /* renamed from: d, reason: collision with root package name */
        private long f37098d;

        /* renamed from: e, reason: collision with root package name */
        private long f37099e;

        /* renamed from: f, reason: collision with root package name */
        private int f37100f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f37101g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f37095a = new C3625n();
            this.f37096b = new T();
            this.f37097c = d.DORMANT;
            this.nextParkedWorker = ExecutorC3612a.f37085l;
            this.f37100f = AbstractC1885c.f14791a.b();
        }

        private final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            ExecutorC3612a.f37083j.addAndGet(ExecutorC3612a.this, -2097152L);
            if (this.f37097c != d.TERMINATED) {
                this.f37097c = d.DORMANT;
            }
        }

        private final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                ExecutorC3612a.this.A();
            }
        }

        private final void d(AbstractRunnableC3619h abstractRunnableC3619h) {
            int b8 = abstractRunnableC3619h.f37119b.b();
            k(b8);
            c(b8);
            ExecutorC3612a.this.u(abstractRunnableC3619h);
            b(b8);
        }

        private final AbstractRunnableC3619h e(boolean z8) {
            boolean z9;
            AbstractRunnableC3619h o8;
            AbstractRunnableC3619h o9;
            if (z8) {
                if (m(ExecutorC3612a.this.f37086a * 2) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && (o9 = o()) != null) {
                    return o9;
                }
                AbstractRunnableC3619h g8 = this.f37095a.g();
                if (g8 != null) {
                    return g8;
                }
                if (!z9 && (o8 = o()) != null) {
                    return o8;
                }
            } else {
                AbstractRunnableC3619h o10 = o();
                if (o10 != null) {
                    return o10;
                }
            }
            return v(3);
        }

        private final AbstractRunnableC3619h f() {
            AbstractRunnableC3619h h8 = this.f37095a.h();
            if (h8 == null) {
                AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) ExecutorC3612a.this.f37091f.d();
                if (abstractRunnableC3619h == null) {
                    return v(1);
                }
                return abstractRunnableC3619h;
            }
            return h8;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f37094i;
        }

        private final void k(int i8) {
            this.f37098d = 0L;
            if (this.f37097c == d.PARKING) {
                this.f37097c = d.BLOCKING;
            }
        }

        private final boolean l() {
            if (this.nextParkedWorker != ExecutorC3612a.f37085l) {
                return true;
            }
            return false;
        }

        private final void n() {
            if (this.f37098d == 0) {
                this.f37098d = System.nanoTime() + ExecutorC3612a.this.f37088c;
            }
            LockSupport.parkNanos(ExecutorC3612a.this.f37088c);
            if (System.nanoTime() - this.f37098d >= 0) {
                this.f37098d = 0L;
                w();
            }
        }

        private final AbstractRunnableC3619h o() {
            if (m(2) == 0) {
                AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) ExecutorC3612a.this.f37090e.d();
                if (abstractRunnableC3619h != null) {
                    return abstractRunnableC3619h;
                }
                return (AbstractRunnableC3619h) ExecutorC3612a.this.f37091f.d();
            }
            AbstractRunnableC3619h abstractRunnableC3619h2 = (AbstractRunnableC3619h) ExecutorC3612a.this.f37091f.d();
            if (abstractRunnableC3619h2 != null) {
                return abstractRunnableC3619h2;
            }
            return (AbstractRunnableC3619h) ExecutorC3612a.this.f37090e.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z8 = false;
                while (!ExecutorC3612a.this.isTerminated() && this.f37097c != d.TERMINATED) {
                    AbstractRunnableC3619h g8 = g(this.f37101g);
                    if (g8 != null) {
                        this.f37099e = 0L;
                        d(g8);
                    } else {
                        this.f37101g = false;
                        if (this.f37099e != 0) {
                            if (!z8) {
                                z8 = true;
                            } else {
                                u(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f37099e);
                                this.f37099e = 0L;
                            }
                        } else {
                            t();
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j8;
            if (this.f37097c == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC3612a executorC3612a = ExecutorC3612a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3612a.f37083j;
            do {
                j8 = atomicLongFieldUpdater.get(executorC3612a);
                if (((int) ((9223367638808264704L & j8) >> 42)) != 0) {
                } else {
                    return false;
                }
            } while (!ExecutorC3612a.f37083j.compareAndSet(executorC3612a, j8, j8 - 4398046511104L));
            this.f37097c = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                ExecutorC3612a.this.r(this);
                return;
            }
            f37094i.set(this, -1);
            while (l() && f37094i.get(this) == -1 && !ExecutorC3612a.this.isTerminated() && this.f37097c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final AbstractRunnableC3619h v(int i8) {
            int i9 = (int) (ExecutorC3612a.f37083j.get(ExecutorC3612a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int m8 = m(i9);
            ExecutorC3612a executorC3612a = ExecutorC3612a.this;
            long j8 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                m8++;
                if (m8 > i9) {
                    m8 = 1;
                }
                c cVar = (c) executorC3612a.f37092g.b(m8);
                if (cVar != null && cVar != this) {
                    long n8 = cVar.f37095a.n(i8, this.f37096b);
                    if (n8 == -1) {
                        T t8 = this.f37096b;
                        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) t8.f33761a;
                        t8.f33761a = null;
                        return abstractRunnableC3619h;
                    }
                    if (n8 > 0) {
                        j8 = Math.min(j8, n8);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.f37099e = j8;
            return null;
        }

        private final void w() {
            ExecutorC3612a executorC3612a = ExecutorC3612a.this;
            synchronized (executorC3612a.f37092g) {
                try {
                    if (executorC3612a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC3612a.f37083j.get(executorC3612a) & 2097151)) <= executorC3612a.f37086a) {
                        return;
                    }
                    if (!f37094i.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i8 = this.indexInArray;
                    q(0);
                    executorC3612a.t(this, i8, 0);
                    int andDecrement = (int) (ExecutorC3612a.f37083j.getAndDecrement(executorC3612a) & 2097151);
                    if (andDecrement != i8) {
                        Object b8 = executorC3612a.f37092g.b(andDecrement);
                        AbstractC3159y.f(b8);
                        c cVar = (c) b8;
                        executorC3612a.f37092g.c(i8, cVar);
                        cVar.q(i8);
                        executorC3612a.t(cVar, andDecrement, i8);
                    }
                    executorC3612a.f37092g.c(andDecrement, null);
                    I i9 = I.f6487a;
                    this.f37097c = d.TERMINATED;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final AbstractRunnableC3619h g(boolean z8) {
            if (s()) {
                return e(z8);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i8) {
            int i9 = this.f37100f;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f37100f = i12;
            int i13 = i8 - 1;
            if ((i13 & i8) == 0) {
                return i12 & i13;
            }
            return (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void q(int i8) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC3612a.this.f37089d);
            sb.append("-worker-");
            if (i8 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i8);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            boolean z8;
            d dVar2 = this.f37097c;
            if (dVar2 == d.CPU_ACQUIRED) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                ExecutorC3612a.f37083j.addAndGet(ExecutorC3612a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f37097c = dVar;
            }
            return z8;
        }

        public c(ExecutorC3612a executorC3612a, int i8) {
            this();
            q(i8);
        }
    }
}
