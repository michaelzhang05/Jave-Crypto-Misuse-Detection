package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class z0 extends a1 implements p0 {

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22303j = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_queue");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22304k = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    private final class a extends b {

        /* renamed from: i, reason: collision with root package name */
        private final l<kotlin.u> f22305i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, l<? super kotlin.u> lVar) {
            super(j2);
            this.f22305i = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22305i.e(z0.this, kotlin.u.a);
        }

        @Override // kotlinx.coroutines.z0.b
        public String toString() {
            return kotlin.jvm.internal.l.m(super.toString(), this.f22305i);
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static abstract class b implements Runnable, Comparable<b>, v0, kotlinx.coroutines.internal.b0 {

        /* renamed from: f, reason: collision with root package name */
        public long f22307f;

        /* renamed from: g, reason: collision with root package name */
        private Object f22308g;

        /* renamed from: h, reason: collision with root package name */
        private int f22309h = -1;

        public b(long j2) {
            this.f22307f = j2;
        }

        public final synchronized int B(long j2, c cVar, z0 z0Var) {
            kotlinx.coroutines.internal.v vVar;
            Object obj = this.f22308g;
            vVar = c1.a;
            if (obj == vVar) {
                return 2;
            }
            synchronized (cVar) {
                b b2 = cVar.b();
                if (z0Var.L0()) {
                    return 1;
                }
                if (b2 == null) {
                    cVar.f22310b = j2;
                } else {
                    long j3 = b2.f22307f;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - cVar.f22310b > 0) {
                        cVar.f22310b = j2;
                    }
                }
                long j4 = this.f22307f;
                long j5 = cVar.f22310b;
                if (j4 - j5 < 0) {
                    this.f22307f = j5;
                }
                cVar.a(this);
                return 0;
            }
        }

        public final boolean C(long j2) {
            return j2 - this.f22307f >= 0;
        }

        @Override // kotlinx.coroutines.v0
        public final synchronized void d() {
            kotlinx.coroutines.internal.v vVar;
            kotlinx.coroutines.internal.v vVar2;
            Object obj = this.f22308g;
            vVar = c1.a;
            if (obj == vVar) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.g(this);
            }
            vVar2 = c1.a;
            this.f22308g = vVar2;
        }

        @Override // kotlinx.coroutines.internal.b0
        public int f() {
            return this.f22309h;
        }

        @Override // kotlinx.coroutines.internal.b0
        public void i(kotlinx.coroutines.internal.a0<?> a0Var) {
            kotlinx.coroutines.internal.v vVar;
            Object obj = this.f22308g;
            vVar = c1.a;
            if (obj != vVar) {
                this.f22308g = a0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.b0
        public kotlinx.coroutines.internal.a0<?> o() {
            Object obj = this.f22308g;
            if (obj instanceof kotlinx.coroutines.internal.a0) {
                return (kotlinx.coroutines.internal.a0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.b0
        public void r(int i2) {
            this.f22309h = i2;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f22307f + ']';
        }

        @Override // java.lang.Comparable
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j2 = this.f22307f - bVar.f22307f;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlinx.coroutines.internal.a0<b> {

        /* renamed from: b, reason: collision with root package name */
        public long f22310b;

        public c(long j2) {
            this.f22310b = j2;
        }
    }

    private final void H0() {
        kotlinx.coroutines.internal.v vVar;
        kotlinx.coroutines.internal.v vVar2;
        if (l0.a() && !L0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22303j;
                vVar = c1.f22141b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.n)) {
                vVar2 = c1.f22141b;
                if (obj == vVar2) {
                    return;
                }
                kotlinx.coroutines.internal.n nVar = new kotlinx.coroutines.internal.n(8, true);
                nVar.a((Runnable) obj);
                if (f22303j.compareAndSet(this, obj, nVar)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.n) obj).d();
                return;
            }
        }
    }

    private final Runnable I0() {
        kotlinx.coroutines.internal.v vVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.n)) {
                vVar = c1.f22141b;
                if (obj == vVar) {
                    return null;
                }
                if (f22303j.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) obj;
                Object j2 = nVar.j();
                if (j2 != kotlinx.coroutines.internal.n.f22231d) {
                    return (Runnable) j2;
                }
                f22303j.compareAndSet(this, obj, nVar.i());
            }
        }
    }

    private final boolean K0(Runnable runnable) {
        kotlinx.coroutines.internal.v vVar;
        while (true) {
            Object obj = this._queue;
            if (L0()) {
                return false;
            }
            if (obj == null) {
                if (f22303j.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.n)) {
                vVar = c1.f22141b;
                if (obj == vVar) {
                    return false;
                }
                kotlinx.coroutines.internal.n nVar = new kotlinx.coroutines.internal.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                if (f22303j.compareAndSet(this, obj, nVar)) {
                    return true;
                }
            } else {
                kotlinx.coroutines.internal.n nVar2 = (kotlinx.coroutines.internal.n) obj;
                int a2 = nVar2.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f22303j.compareAndSet(this, obj, nVar2.i());
                } else if (a2 == 2) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean L0() {
        return this._isCompleted;
    }

    private final void O0() {
        if (e.a() != null) {
            throw null;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            b i2 = cVar == null ? null : cVar.i();
            if (i2 == null) {
                return;
            } else {
                E0(nanoTime, i2);
            }
        }
    }

    private final int R0(long j2, b bVar) {
        if (L0()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            f22304k.compareAndSet(this, null, new c(j2));
            cVar = (c) this._delayed;
            kotlin.jvm.internal.l.c(cVar);
        }
        return bVar.B(j2, cVar, this);
    }

    private final void S0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean T0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar == null ? null : cVar.e()) == bVar;
    }

    public final void J0(Runnable runnable) {
        if (K0(runnable)) {
            F0();
        } else {
            n0.l.J0(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean M0() {
        kotlinx.coroutines.internal.v vVar;
        if (!B0()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.n) {
                return ((kotlinx.coroutines.internal.n) obj).g();
            }
            vVar = c1.f22141b;
            if (obj != vVar) {
                return false;
            }
        }
        return true;
    }

    public long N0() {
        b h2;
        if (C0()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            if (e.a() == null) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (cVar) {
                        b b2 = cVar.b();
                        if (b2 == null) {
                            h2 = null;
                        } else {
                            b bVar = b2;
                            h2 = bVar.C(nanoTime) ? K0(bVar) : false ? cVar.h(0) : null;
                        }
                    }
                } while (h2 != null);
            } else {
                throw null;
            }
        }
        Runnable I0 = I0();
        if (I0 != null) {
            I0.run();
            return 0L;
        }
        return x0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void Q0(long j2, b bVar) {
        int R0 = R0(j2, bVar);
        if (R0 == 0) {
            if (T0(bVar)) {
                F0();
            }
        } else if (R0 == 1) {
            E0(j2, bVar);
        } else if (R0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // kotlinx.coroutines.p0
    public void o(long j2, l<? super kotlin.u> lVar) {
        long c2 = c1.c(j2);
        if (c2 < 4611686018427387903L) {
            if (e.a() == null) {
                long nanoTime = System.nanoTime();
                a aVar = new a(c2 + nanoTime, lVar);
                n.a(lVar, aVar);
                Q0(nanoTime, aVar);
                return;
            }
            throw null;
        }
    }

    @Override // kotlinx.coroutines.c0
    public final void s0(CoroutineContext coroutineContext, Runnable runnable) {
        J0(runnable);
    }

    @Override // kotlinx.coroutines.y0
    protected void shutdown() {
        b2.a.b();
        S0(true);
        H0();
        do {
        } while (N0() <= 0);
        O0();
    }

    @Override // kotlinx.coroutines.y0
    protected long x0() {
        kotlinx.coroutines.internal.v vVar;
        if (super.x0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.n)) {
                vVar = c1.f22141b;
                return obj == vVar ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.n) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        b e2 = cVar == null ? null : cVar.e();
        if (e2 == null) {
            return Long.MAX_VALUE;
        }
        long j2 = e2.f22307f;
        if (e.a() == null) {
            return kotlin.ranges.d.c(j2 - System.nanoTime(), 0L);
        }
        throw null;
    }
}
