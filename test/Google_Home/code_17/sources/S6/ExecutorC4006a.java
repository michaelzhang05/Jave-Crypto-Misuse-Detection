package s6;

import O5.I;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import e6.AbstractC2806c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3348c;
import l6.Q;
import q6.C3860A;
import q6.C3865F;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC4006a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0879a f39280h = new C0879a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39281i = AtomicLongFieldUpdater.newUpdater(ExecutorC4006a.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39282j = AtomicLongFieldUpdater.newUpdater(ExecutorC4006a.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39283k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4006a.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final C3865F f39284l = new C3865F("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f39285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39287c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f39288d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009d f39289e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009d f39290f;

    /* renamed from: g, reason: collision with root package name */
    public final C3860A f39291g;
    private volatile long parkedWorkersStack;

    /* renamed from: s6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0879a {
        private C0879a() {
        }

        public /* synthetic */ C0879a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: s6.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39292a;

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
            f39292a = iArr;
        }
    }

    /* renamed from: s6.a$d */
    /* loaded from: classes5.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC4006a(int i8, int i9, long j8, String str) {
        this.f39285a = i8;
        this.f39286b = i9;
        this.f39287c = j8;
        this.f39288d = str;
        if (i8 >= 1) {
            if (i9 >= i8) {
                if (i9 <= 2097150) {
                    if (j8 > 0) {
                        this.f39289e = new C4009d();
                        this.f39290f = new C4009d();
                        this.f39291g = new C3860A((i8 + 1) * 2);
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

    private final void A(long j8, boolean z8) {
        if (z8 || H() || F(j8)) {
            return;
        }
        H();
    }

    private final AbstractRunnableC4013h E(c cVar, AbstractRunnableC4013h abstractRunnableC4013h, boolean z8) {
        if (cVar == null) {
            return abstractRunnableC4013h;
        }
        if (cVar.f39296c == d.TERMINATED) {
            return abstractRunnableC4013h;
        }
        if (abstractRunnableC4013h.f39318b.b() == 0 && cVar.f39296c == d.BLOCKING) {
            return abstractRunnableC4013h;
        }
        cVar.f39300g = true;
        return cVar.f39294a.a(abstractRunnableC4013h, z8);
    }

    private final boolean F(long j8) {
        if (g6.m.d(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f39285a) {
            int f8 = f();
            if (f8 == 1 && this.f39285a > 1) {
                f();
            }
            if (f8 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean G(ExecutorC4006a executorC4006a, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f39282j.get(executorC4006a);
        }
        return executorC4006a.F(j8);
    }

    private final boolean H() {
        c s8;
        do {
            s8 = s();
            if (s8 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(s8, -1, 0));
        LockSupport.unpark(s8);
        return true;
    }

    private final boolean b(AbstractRunnableC4013h abstractRunnableC4013h) {
        if (abstractRunnableC4013h.f39318b.b() == 1) {
            return this.f39290f.a(abstractRunnableC4013h);
        }
        return this.f39289e.a(abstractRunnableC4013h);
    }

    private final int f() {
        synchronized (this.f39291g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f39282j;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                int d8 = g6.m.d(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (d8 >= this.f39285a) {
                    return 0;
                }
                if (i8 >= this.f39286b) {
                    return 0;
                }
                int i9 = ((int) (f39282j.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f39291g.b(i9) == null) {
                    c cVar = new c(this, i9);
                    this.f39291g.c(i9, cVar);
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

    private final c l() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3255y.d(ExecutorC4006a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void n(ExecutorC4006a executorC4006a, Runnable runnable, InterfaceC4014i interfaceC4014i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC4014i = AbstractC4017l.f39327g;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        executorC4006a.m(runnable, interfaceC4014i, z8);
    }

    private final int o(c cVar) {
        Object i8 = cVar.i();
        while (i8 != f39284l) {
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

    private final c s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39281i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f39291g.b((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            int o8 = o(cVar);
            if (o8 >= 0 && f39281i.compareAndSet(this, j8, o8 | j9)) {
                cVar.r(f39284l);
                return cVar;
            }
        }
    }

    public final void D() {
        if (H() || G(this, 0L, 1, null)) {
            return;
        }
        H();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        n(this, runnable, null, false, 6, null);
    }

    public final AbstractRunnableC4013h g(Runnable runnable, InterfaceC4014i interfaceC4014i) {
        long a8 = AbstractC4017l.f39326f.a();
        if (runnable instanceof AbstractRunnableC4013h) {
            AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) runnable;
            abstractRunnableC4013h.f39317a = a8;
            abstractRunnableC4013h.f39318b = interfaceC4014i;
            return abstractRunnableC4013h;
        }
        return new C4016k(runnable, a8, interfaceC4014i);
    }

    public final boolean isTerminated() {
        if (f39283k.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final void m(Runnable runnable, InterfaceC4014i interfaceC4014i, boolean z8) {
        boolean z9;
        long j8;
        AbstractC3348c.a();
        AbstractRunnableC4013h g8 = g(runnable, interfaceC4014i);
        boolean z10 = false;
        if (g8.f39318b.b() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j8 = f39282j.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        } else {
            j8 = 0;
        }
        c l8 = l();
        AbstractRunnableC4013h E8 = E(l8, g8, z8);
        if (E8 != null && !b(E8)) {
            throw new RejectedExecutionException(this.f39288d + " was terminated");
        }
        if (z8 && l8 != null) {
            z10 = true;
        }
        if (z9) {
            A(j8, z10);
        } else {
            if (z10) {
                return;
            }
            D();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a8 = this.f39291g.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a8; i13++) {
            c cVar = (c) this.f39291g.b(i13);
            if (cVar != null) {
                int e8 = cVar.f39294a.e();
                int i14 = b.f39292a[cVar.f39296c.ordinal()];
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
        long j8 = f39282j.get(this);
        return this.f39288d + '@' + Q.b(this) + "[Pool Size {core = " + this.f39285a + ", max = " + this.f39286b + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f39289e.c() + ", global blocking queue size = " + this.f39290f.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f39285a - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    public final boolean u(c cVar) {
        long j8;
        long j9;
        int h8;
        if (cVar.i() != f39284l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39281i;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            h8 = cVar.h();
            cVar.r(this.f39291g.b((int) (2097151 & j8)));
        } while (!f39281i.compareAndSet(this, j8, j9 | h8));
        return true;
    }

    public final void v(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39281i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            if (i10 == i8) {
                if (i9 == 0) {
                    i10 = o(cVar);
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0 && f39281i.compareAndSet(this, j8, j9 | i10)) {
                return;
            }
        }
    }

    public final void x(AbstractRunnableC4013h abstractRunnableC4013h) {
        try {
            abstractRunnableC4013h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void y(long j8) {
        int i8;
        AbstractRunnableC4013h abstractRunnableC4013h;
        if (!f39283k.compareAndSet(this, 0, 1)) {
            return;
        }
        c l8 = l();
        synchronized (this.f39291g) {
            i8 = (int) (f39282j.get(this) & 2097151);
        }
        if (1 <= i8) {
            int i9 = 1;
            while (true) {
                Object b8 = this.f39291g.b(i9);
                AbstractC3255y.f(b8);
                c cVar = (c) b8;
                if (cVar != l8) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j8);
                    }
                    cVar.f39294a.f(this.f39290f);
                }
                if (i9 == i8) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f39290f.b();
        this.f39289e.b();
        while (true) {
            if (l8 != null) {
                abstractRunnableC4013h = l8.g(true);
                if (abstractRunnableC4013h != null) {
                    continue;
                    x(abstractRunnableC4013h);
                }
            }
            abstractRunnableC4013h = (AbstractRunnableC4013h) this.f39289e.d();
            if (abstractRunnableC4013h == null && (abstractRunnableC4013h = (AbstractRunnableC4013h) this.f39290f.d()) == null) {
                break;
            }
            x(abstractRunnableC4013h);
        }
        if (l8 != null) {
            l8.u(d.TERMINATED);
        }
        f39281i.set(this, 0L);
        f39282j.set(this, 0L);
    }

    /* renamed from: s6.a$c */
    /* loaded from: classes5.dex */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f39293i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a, reason: collision with root package name */
        public final C4019n f39294a;

        /* renamed from: b, reason: collision with root package name */
        private final T f39295b;

        /* renamed from: c, reason: collision with root package name */
        public d f39296c;

        /* renamed from: d, reason: collision with root package name */
        private long f39297d;

        /* renamed from: e, reason: collision with root package name */
        private long f39298e;

        /* renamed from: f, reason: collision with root package name */
        private int f39299f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f39300g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f39294a = new C4019n();
            this.f39295b = new T();
            this.f39296c = d.DORMANT;
            this.nextParkedWorker = ExecutorC4006a.f39284l;
            this.f39299f = AbstractC2806c.f31797a.b();
        }

        private final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            ExecutorC4006a.f39282j.addAndGet(ExecutorC4006a.this, -2097152L);
            if (this.f39296c != d.TERMINATED) {
                this.f39296c = d.DORMANT;
            }
        }

        private final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                ExecutorC4006a.this.D();
            }
        }

        private final void d(AbstractRunnableC4013h abstractRunnableC4013h) {
            int b8 = abstractRunnableC4013h.f39318b.b();
            k(b8);
            c(b8);
            ExecutorC4006a.this.x(abstractRunnableC4013h);
            b(b8);
        }

        private final AbstractRunnableC4013h e(boolean z8) {
            boolean z9;
            AbstractRunnableC4013h o8;
            AbstractRunnableC4013h o9;
            if (z8) {
                if (m(ExecutorC4006a.this.f39285a * 2) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && (o9 = o()) != null) {
                    return o9;
                }
                AbstractRunnableC4013h g8 = this.f39294a.g();
                if (g8 != null) {
                    return g8;
                }
                if (!z9 && (o8 = o()) != null) {
                    return o8;
                }
            } else {
                AbstractRunnableC4013h o10 = o();
                if (o10 != null) {
                    return o10;
                }
            }
            return v(3);
        }

        private final AbstractRunnableC4013h f() {
            AbstractRunnableC4013h h8 = this.f39294a.h();
            if (h8 == null) {
                AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) ExecutorC4006a.this.f39290f.d();
                if (abstractRunnableC4013h == null) {
                    return v(1);
                }
                return abstractRunnableC4013h;
            }
            return h8;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f39293i;
        }

        private final void k(int i8) {
            this.f39297d = 0L;
            if (this.f39296c == d.PARKING) {
                this.f39296c = d.BLOCKING;
            }
        }

        private final boolean l() {
            if (this.nextParkedWorker != ExecutorC4006a.f39284l) {
                return true;
            }
            return false;
        }

        private final void n() {
            if (this.f39297d == 0) {
                this.f39297d = System.nanoTime() + ExecutorC4006a.this.f39287c;
            }
            LockSupport.parkNanos(ExecutorC4006a.this.f39287c);
            if (System.nanoTime() - this.f39297d >= 0) {
                this.f39297d = 0L;
                w();
            }
        }

        private final AbstractRunnableC4013h o() {
            if (m(2) == 0) {
                AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) ExecutorC4006a.this.f39289e.d();
                if (abstractRunnableC4013h != null) {
                    return abstractRunnableC4013h;
                }
                return (AbstractRunnableC4013h) ExecutorC4006a.this.f39290f.d();
            }
            AbstractRunnableC4013h abstractRunnableC4013h2 = (AbstractRunnableC4013h) ExecutorC4006a.this.f39290f.d();
            if (abstractRunnableC4013h2 != null) {
                return abstractRunnableC4013h2;
            }
            return (AbstractRunnableC4013h) ExecutorC4006a.this.f39289e.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z8 = false;
                while (!ExecutorC4006a.this.isTerminated() && this.f39296c != d.TERMINATED) {
                    AbstractRunnableC4013h g8 = g(this.f39300g);
                    if (g8 != null) {
                        this.f39298e = 0L;
                        d(g8);
                    } else {
                        this.f39300g = false;
                        if (this.f39298e != 0) {
                            if (!z8) {
                                z8 = true;
                            } else {
                                u(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f39298e);
                                this.f39298e = 0L;
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
            if (this.f39296c == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC4006a executorC4006a = ExecutorC4006a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4006a.f39282j;
            do {
                j8 = atomicLongFieldUpdater.get(executorC4006a);
                if (((int) ((9223367638808264704L & j8) >> 42)) != 0) {
                } else {
                    return false;
                }
            } while (!ExecutorC4006a.f39282j.compareAndSet(executorC4006a, j8, j8 - 4398046511104L));
            this.f39296c = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                ExecutorC4006a.this.u(this);
                return;
            }
            f39293i.set(this, -1);
            while (l() && f39293i.get(this) == -1 && !ExecutorC4006a.this.isTerminated() && this.f39296c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final AbstractRunnableC4013h v(int i8) {
            int i9 = (int) (ExecutorC4006a.f39282j.get(ExecutorC4006a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int m8 = m(i9);
            ExecutorC4006a executorC4006a = ExecutorC4006a.this;
            long j8 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                m8++;
                if (m8 > i9) {
                    m8 = 1;
                }
                c cVar = (c) executorC4006a.f39291g.b(m8);
                if (cVar != null && cVar != this) {
                    long n8 = cVar.f39294a.n(i8, this.f39295b);
                    if (n8 == -1) {
                        T t8 = this.f39295b;
                        AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) t8.f34162a;
                        t8.f34162a = null;
                        return abstractRunnableC4013h;
                    }
                    if (n8 > 0) {
                        j8 = Math.min(j8, n8);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.f39298e = j8;
            return null;
        }

        private final void w() {
            ExecutorC4006a executorC4006a = ExecutorC4006a.this;
            synchronized (executorC4006a.f39291g) {
                try {
                    if (executorC4006a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC4006a.f39282j.get(executorC4006a) & 2097151)) <= executorC4006a.f39285a) {
                        return;
                    }
                    if (!f39293i.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i8 = this.indexInArray;
                    q(0);
                    executorC4006a.v(this, i8, 0);
                    int andDecrement = (int) (ExecutorC4006a.f39282j.getAndDecrement(executorC4006a) & 2097151);
                    if (andDecrement != i8) {
                        Object b8 = executorC4006a.f39291g.b(andDecrement);
                        AbstractC3255y.f(b8);
                        c cVar = (c) b8;
                        executorC4006a.f39291g.c(i8, cVar);
                        cVar.q(i8);
                        executorC4006a.v(cVar, andDecrement, i8);
                    }
                    executorC4006a.f39291g.c(andDecrement, null);
                    I i9 = I.f8278a;
                    this.f39296c = d.TERMINATED;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final AbstractRunnableC4013h g(boolean z8) {
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
            int i9 = this.f39299f;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f39299f = i12;
            int i13 = i8 - 1;
            if ((i13 & i8) == 0) {
                return i12 & i13;
            }
            return (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void q(int i8) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC4006a.this.f39288d);
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
            d dVar2 = this.f39296c;
            if (dVar2 == d.CPU_ACQUIRED) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                ExecutorC4006a.f39282j.addAndGet(ExecutorC4006a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f39296c = dVar;
            }
            return z8;
        }

        public c(ExecutorC4006a executorC4006a, int i8) {
            this();
            q(i8);
        }
    }
}
