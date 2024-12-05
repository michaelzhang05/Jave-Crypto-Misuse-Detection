package kotlinx.coroutines.i2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.random.Random;
import kotlin.u;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.m0;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: k */
    public final int f22169k;
    public final int l;
    public final long m;
    public final String n;
    public final kotlinx.coroutines.i2.d o;
    public final kotlinx.coroutines.i2.d p;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final AtomicReferenceArray<c> q;

    /* renamed from: f */
    public static final C0383a f22164f = new C0383a(null);

    /* renamed from: j */
    public static final v f22168j = new v("NOT_IN_STACK");

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f22165g = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: h */
    static final /* synthetic */ AtomicLongFieldUpdater f22166h = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22167i = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.i2.a$a */
    /* loaded from: classes2.dex */
    public static final class C0383a {
        private C0383a() {
        }

        public /* synthetic */ C0383a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes2.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public a(int i2, int i3, long j2, String str) {
        this.f22169k = i2;
        this.l = i3;
        this.m = j2;
        this.n = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 > 0) {
            this.o = new kotlinx.coroutines.i2.d();
            this.p = new kotlinx.coroutines.i2.d();
            this.parkedWorkersStack = 0L;
            this.q = new AtomicReferenceArray<>(i3 + 1);
            this.controlState = i2 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
    }

    private final int D(c cVar) {
        Object g2 = cVar.g();
        while (g2 != f22168j) {
            if (g2 == null) {
                return 0;
            }
            c cVar2 = (c) g2;
            int f2 = cVar2.f();
            if (f2 != 0) {
                return f2;
            }
            g2 = cVar2.g();
        }
        return -1;
    }

    private final c L() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c cVar = this.q.get((int) (2097151 & j2));
            if (cVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int D = D(cVar);
            if (D >= 0 && f22165g.compareAndSet(this, j2, D | j3)) {
                cVar.o(f22168j);
                return cVar;
            }
        }
    }

    private final boolean a(i iVar) {
        if (iVar.f22193g.P() == 1) {
            return this.p.a(iVar);
        }
        return this.o.a(iVar);
    }

    private final int b() {
        int b2;
        synchronized (this.q) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            b2 = kotlin.ranges.f.b(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (b2 >= this.f22169k) {
                return 0;
            }
            if (i2 >= this.l) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.q.get(i3) == null) {
                c cVar = new c(i3);
                this.q.set(i3, cVar);
                if (i3 == ((int) (2097151 & f22166h.incrementAndGet(this)))) {
                    cVar.start();
                    return b2 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final void i0(boolean z) {
        long addAndGet = f22166h.addAndGet(this, 2097152L);
        if (z || u0() || s0(addAndGet)) {
            return;
        }
        u0();
    }

    private final c o() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && kotlin.jvm.internal.l.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    private final i q0(c cVar, i iVar, boolean z) {
        if (cVar == null || cVar.f22172h == d.TERMINATED) {
            return iVar;
        }
        if (iVar.f22193g.P() == 0 && cVar.f22172h == d.BLOCKING) {
            return iVar;
        }
        cVar.l = true;
        return cVar.f22171g.a(iVar, z);
    }

    private final boolean s0(long j2) {
        int b2;
        b2 = kotlin.ranges.f.b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0);
        if (b2 < this.f22169k) {
            int b3 = b();
            if (b3 == 1 && this.f22169k > 1) {
                b();
            }
            if (b3 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean t0(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.s0(j2);
    }

    private final boolean u0() {
        c L;
        do {
            L = L();
            if (L == null) {
                return false;
            }
        } while (!c.f22170f.compareAndSet(L, -1, 0));
        LockSupport.unpark(L);
        return true;
    }

    public static /* synthetic */ void z(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = g.f22190f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.w(runnable, jVar, z);
    }

    public final boolean P(c cVar) {
        long j2;
        long j3;
        int f2;
        if (cVar.g() != f22168j) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & (-2097152);
            f2 = cVar.f();
            if (l0.a()) {
                if (!(f2 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.o(this.q.get(i2));
        } while (!f22165g.compareAndSet(this, j2, f2 | j3));
        return true;
    }

    public final void Y(c cVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? D(cVar) : i3;
            }
            if (i4 >= 0 && f22165g.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void c0(i iVar) {
        try {
            iVar.run();
            if (kotlinx.coroutines.e.a() != null) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                if (kotlinx.coroutines.e.a() != null) {
                    throw null;
                }
            } catch (Throwable th2) {
                if (kotlinx.coroutines.e.a() != null) {
                    throw null;
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        z(this, runnable, null, false, 6, null);
    }

    public final i f(Runnable runnable, j jVar) {
        long a = l.f22199f.a();
        if (runnable instanceof i) {
            i iVar = (i) runnable;
            iVar.f22192f = a;
            iVar.f22193g = jVar;
            return iVar;
        }
        return new k(runnable, a, jVar);
    }

    public final void g0(long j2) {
        int i2;
        if (f22167i.compareAndSet(this, 0, 1)) {
            c o = o();
            synchronized (this.q) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    c cVar = this.q.get(i3);
                    kotlin.jvm.internal.l.c(cVar);
                    if (cVar != o) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j2);
                        }
                        d dVar = cVar.f22172h;
                        if (l0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f22171g.g(this.p);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.p.b();
            this.o.b();
            while (true) {
                i e2 = o == null ? null : o.e(true);
                if (e2 == null) {
                    e2 = this.o.d();
                }
                if (e2 == null && (e2 = this.p.d()) == null) {
                    break;
                } else {
                    c0(e2);
                }
            }
            if (o != null) {
                o.r(d.TERMINATED);
            }
            if (l0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f22169k)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void k0() {
        if (u0() || t0(this, 0L, 1, null)) {
            return;
        }
        u0();
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        int length = this.q.length();
        int i6 = 0;
        if (1 < length) {
            i3 = 0;
            int i7 = 0;
            i4 = 0;
            i5 = 0;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                c cVar = this.q.get(i8);
                if (cVar != null) {
                    int f2 = cVar.f22171g.f();
                    int i10 = b.a[cVar.f22172h.ordinal()];
                    if (i10 == 1) {
                        i6++;
                    } else if (i10 == 2) {
                        i3++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(f2);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i10 == 3) {
                        i7++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f2);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i10 == 4) {
                        i4++;
                        if (f2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f2);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i10 == 5) {
                        i5++;
                    }
                }
                if (i9 >= length) {
                    break;
                }
                i8 = i9;
            }
            i2 = i6;
            i6 = i7;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        long j2 = this.controlState;
        return this.n + '@' + m0.b(this) + "[Pool Size {core = " + this.f22169k + ", max = " + this.l + "}, Worker States {CPU = " + i6 + ", blocking = " + i3 + ", parked = " + i2 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.o.c() + ", global blocking queue size = " + this.p.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f22169k - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void w(Runnable runnable, j jVar, boolean z) {
        if (kotlinx.coroutines.e.a() == null) {
            i f2 = f(runnable, jVar);
            c o = o();
            i q0 = q0(o, f2, z);
            if (q0 != null && !a(q0)) {
                throw new RejectedExecutionException(kotlin.jvm.internal.l.m(this.n, " was terminated"));
            }
            boolean z2 = z && o != null;
            if (f2.f22193g.P() != 0) {
                i0(z2);
                return;
            } else {
                if (z2) {
                    return;
                }
                k0();
                return;
            }
        }
        throw null;
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes2.dex */
    public final class c extends Thread {

        /* renamed from: f */
        static final /* synthetic */ AtomicIntegerFieldUpdater f22170f = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: g */
        public final m f22171g;

        /* renamed from: h */
        public d f22172h;

        /* renamed from: i */
        private long f22173i;
        private volatile int indexInArray;

        /* renamed from: j */
        private long f22174j;

        /* renamed from: k */
        private int f22175k;
        public boolean l;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f22171g = new m();
            this.f22172h = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f22168j;
            this.f22175k = Random.f19479f.b();
        }

        private final void a(int i2) {
            if (i2 == 0) {
                return;
            }
            a.f22166h.addAndGet(a.this, -2097152L);
            d dVar = this.f22172h;
            if (dVar != d.TERMINATED) {
                if (l0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f22172h = d.DORMANT;
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(d.BLOCKING)) {
                a.this.k0();
            }
        }

        private final void c(i iVar) {
            int P = iVar.f22193g.P();
            h(P);
            b(P);
            a.this.c0(iVar);
            a(P);
        }

        private final i d(boolean z) {
            i l;
            i l2;
            if (z) {
                boolean z2 = j(a.this.f22169k * 2) == 0;
                if (z2 && (l2 = l()) != null) {
                    return l2;
                }
                i h2 = this.f22171g.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (l = l()) != null) {
                    return l;
                }
            } else {
                i l3 = l();
                if (l3 != null) {
                    return l3;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f22173i = 0L;
            if (this.f22172h == d.PARKING) {
                if (l0.a()) {
                    if (!(i2 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f22172h = d.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f22168j;
        }

        private final void k() {
            if (this.f22173i == 0) {
                this.f22173i = System.nanoTime() + a.this.m;
            }
            LockSupport.parkNanos(a.this.m);
            if (System.nanoTime() - this.f22173i >= 0) {
                this.f22173i = 0L;
                t();
            }
        }

        private final i l() {
            if (j(2) == 0) {
                i d2 = a.this.o.d();
                return d2 == null ? a.this.p.d() : d2;
            }
            i d3 = a.this.p.d();
            return d3 == null ? a.this.o.d() : d3;
        }

        private final void m() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.f22172h != d.TERMINATED) {
                    i e2 = e(this.l);
                    if (e2 != null) {
                        this.f22174j = 0L;
                        c(e2);
                    } else {
                        this.l = false;
                        if (this.f22174j == 0) {
                            q();
                        } else if (z) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f22174j);
                            this.f22174j = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            boolean z;
            if (this.f22172h != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z = false;
                        break;
                    }
                    if (a.f22166h.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f22172h = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.P(this);
                return;
            }
            if (l0.a()) {
                if (!(this.f22171g.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f22172h != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z) {
            long l;
            if (l0.a()) {
                if (!(this.f22171g.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int j2 = j(i2);
            a aVar = a.this;
            long j3 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                j2++;
                if (j2 > i2) {
                    j2 = 1;
                }
                c cVar = aVar.q.get(j2);
                if (cVar != null && cVar != this) {
                    if (l0.a()) {
                        if (!(this.f22171g.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        l = this.f22171g.k(cVar.f22171g);
                    } else {
                        l = this.f22171g.l(cVar.f22171g);
                    }
                    if (l == -1) {
                        return this.f22171g.h();
                    }
                    if (l > 0) {
                        j3 = Math.min(j3, l);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f22174j = j3;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.q) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f22169k) {
                    return;
                }
                if (f22170f.compareAndSet(this, -1, 1)) {
                    int f2 = f();
                    n(0);
                    aVar.Y(this, f2, 0);
                    int andDecrement = (int) (2097151 & a.f22166h.getAndDecrement(aVar));
                    if (andDecrement != f2) {
                        c cVar = aVar.q.get(andDecrement);
                        kotlin.jvm.internal.l.c(cVar);
                        aVar.q.set(f2, cVar);
                        cVar.n(f2);
                        aVar.Y(cVar, andDecrement, f2);
                    }
                    aVar.q.set(andDecrement, null);
                    u uVar = u.a;
                    this.f22172h = d.TERMINATED;
                }
            }
        }

        public final i e(boolean z) {
            i d2;
            if (p()) {
                return d(z);
            }
            if (z) {
                d2 = this.f22171g.h();
                if (d2 == null) {
                    d2 = a.this.p.d();
                }
            } else {
                d2 = a.this.p.d();
            }
            return d2 == null ? s(true) : d2;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f22175k;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f22175k = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.n);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f22172h;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                a.f22166h.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f22172h = dVar;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(int i2) {
            this();
            n(i2);
        }
    }
}
