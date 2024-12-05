package l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;
import l6.W;
import q6.C3865F;

/* renamed from: l6.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3361i0 extends AbstractC3363j0 implements W {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34630d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3361i0.class, Object.class, "_queue");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34631e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3361i0.class, Object.class, "_delayed");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34632f = AtomicIntegerFieldUpdater.newUpdater(AbstractC3361i0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: l6.i0$a */
    /* loaded from: classes5.dex */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3372o f34633c;

        public a(long j8, InterfaceC3372o interfaceC3372o) {
            super(j8);
            this.f34633c = interfaceC3372o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34633c.h(AbstractC3361i0.this, O5.I.f8278a);
        }

        @Override // l6.AbstractC3361i0.c
        public String toString() {
            return super.toString() + this.f34633c;
        }
    }

    /* renamed from: l6.i0$b */
    /* loaded from: classes5.dex */
    private static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f34635c;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f34635c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34635c.run();
        }

        @Override // l6.AbstractC3361i0.c
        public String toString() {
            return super.toString() + this.f34635c;
        }
    }

    /* renamed from: l6.i0$c */
    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable, Comparable, InterfaceC3351d0, q6.O {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f34636a;

        /* renamed from: b, reason: collision with root package name */
        private int f34637b = -1;

        public c(long j8) {
            this.f34636a = j8;
        }

        @Override // q6.O
        public void a(q6.N n8) {
            C3865F c3865f;
            Object obj = this._heap;
            c3865f = AbstractC3367l0.f34640a;
            if (obj != c3865f) {
                this._heap = n8;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // q6.O
        public q6.N c() {
            Object obj = this._heap;
            if (obj instanceof q6.N) {
                return (q6.N) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j8 = this.f34636a - cVar.f34636a;
            if (j8 > 0) {
                return 1;
            }
            if (j8 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // l6.InterfaceC3351d0
        public final void dispose() {
            C3865F c3865f;
            d dVar;
            C3865F c3865f2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c3865f = AbstractC3367l0.f34640a;
                    if (obj == c3865f) {
                        return;
                    }
                    if (obj instanceof d) {
                        dVar = (d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    c3865f2 = AbstractC3367l0.f34640a;
                    this._heap = c3865f2;
                    O5.I i8 = O5.I.f8278a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j8, d dVar, AbstractC3361i0 abstractC3361i0) {
            C3865F c3865f;
            synchronized (this) {
                Object obj = this._heap;
                c3865f = AbstractC3367l0.f34640a;
                if (obj == c3865f) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC3361i0.b()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f34638c = j8;
                        } else {
                            long j9 = cVar.f34636a;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.f34638c > 0) {
                                dVar.f34638c = j8;
                            }
                        }
                        long j10 = this.f34636a;
                        long j11 = dVar.f34638c;
                        if (j10 - j11 < 0) {
                            this.f34636a = j11;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean f(long j8) {
            if (j8 - this.f34636a >= 0) {
                return true;
            }
            return false;
        }

        @Override // q6.O
        public int getIndex() {
            return this.f34637b;
        }

        @Override // q6.O
        public void setIndex(int i8) {
            this.f34637b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f34636a + ']';
        }
    }

    /* renamed from: l6.i0$d */
    /* loaded from: classes5.dex */
    public static final class d extends q6.N {

        /* renamed from: c, reason: collision with root package name */
        public long f34638c;

        public d(long j8) {
            this.f34638c = j8;
        }
    }

    private final void U() {
        C3865F c3865f;
        C3865F c3865f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34630d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34630d;
                c3865f = AbstractC3367l0.f34641b;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, c3865f)) {
                    return;
                }
            } else if (!(obj instanceof q6.s)) {
                c3865f2 = AbstractC3367l0.f34641b;
                if (obj == c3865f2) {
                    return;
                }
                q6.s sVar = new q6.s(8, true);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f34630d, this, obj, sVar)) {
                    return;
                }
            } else {
                ((q6.s) obj).d();
                return;
            }
        }
    }

    private final Runnable V() {
        C3865F c3865f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34630d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof q6.s)) {
                c3865f = AbstractC3367l0.f34641b;
                if (obj == c3865f) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f34630d, this, obj, null)) {
                    AbstractC3255y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q6.s sVar = (q6.s) obj;
                Object j8 = sVar.j();
                if (j8 != q6.s.f38418h) {
                    return (Runnable) j8;
                }
                androidx.concurrent.futures.a.a(f34630d, this, obj, sVar.i());
            }
        }
    }

    private final boolean X(Runnable runnable) {
        C3865F c3865f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34630d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (b()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f34630d, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof q6.s)) {
                c3865f = AbstractC3367l0.f34641b;
                if (obj == c3865f) {
                    return false;
                }
                q6.s sVar = new q6.s(8, true);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                sVar.a(runnable);
                if (androidx.concurrent.futures.a.a(f34630d, this, obj, sVar)) {
                    return true;
                }
            } else {
                AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q6.s sVar2 = (q6.s) obj;
                int a8 = sVar2.a(runnable);
                if (a8 == 0) {
                    return true;
                }
                if (a8 != 1) {
                    if (a8 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.a.a(f34630d, this, obj, sVar2.i());
                }
            }
        }
    }

    private final void Z() {
        c cVar;
        AbstractC3348c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f34631e.get(this);
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                R(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        if (f34632f.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final int c0(long j8, c cVar) {
        if (b()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34631e;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, new d(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            AbstractC3255y.f(obj);
            dVar = (d) obj;
        }
        return cVar.e(j8, dVar, this);
    }

    private final void e0(boolean z8) {
        f34632f.set(this, z8 ? 1 : 0);
    }

    private final boolean f0(c cVar) {
        c cVar2;
        d dVar = (d) f34631e.get(this);
        if (dVar != null) {
            cVar2 = (c) dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    @Override // l6.AbstractC3359h0
    protected long I() {
        c cVar;
        C3865F c3865f;
        if (super.I() == 0) {
            return 0L;
        }
        Object obj = f34630d.get(this);
        if (obj != null) {
            if (!(obj instanceof q6.s)) {
                c3865f = AbstractC3367l0.f34641b;
                if (obj != c3865f) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((q6.s) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f34631e.get(this);
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.f34636a;
        AbstractC3348c.a();
        return g6.m.e(j8 - System.nanoTime(), 0L);
    }

    @Override // l6.AbstractC3359h0
    public long N() {
        q6.O o8;
        boolean z8;
        if (O()) {
            return 0L;
        }
        d dVar = (d) f34631e.get(this);
        if (dVar != null && !dVar.d()) {
            AbstractC3348c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        q6.O b8 = dVar.b();
                        o8 = null;
                        if (b8 != null) {
                            c cVar = (c) b8;
                            if (cVar.f(nanoTime)) {
                                z8 = X(cVar);
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                o8 = dVar.h(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) o8) != null);
        }
        Runnable V7 = V();
        if (V7 != null) {
            V7.run();
            return 0L;
        }
        return I();
    }

    public void W(Runnable runnable) {
        if (X(runnable)) {
            S();
        } else {
            S.f34581g.W(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        C3865F c3865f;
        if (!M()) {
            return false;
        }
        d dVar = (d) f34631e.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f34630d.get(this);
        if (obj != null) {
            if (!(obj instanceof q6.s)) {
                c3865f = AbstractC3367l0.f34641b;
                if (obj != c3865f) {
                    return false;
                }
            } else {
                return ((q6.s) obj).g();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a0() {
        f34630d.set(this, null);
        f34631e.set(this, null);
    }

    public final void b0(long j8, c cVar) {
        int c02 = c0(j8, cVar);
        if (c02 != 0) {
            if (c02 != 1) {
                if (c02 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                R(j8, cVar);
                return;
            }
        }
        if (f0(cVar)) {
            S();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3351d0 d0(long j8, Runnable runnable) {
        long c8 = AbstractC3367l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC3348c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c8 + nanoTime, runnable);
            b0(nanoTime, bVar);
            return bVar;
        }
        return M0.f34570a;
    }

    @Override // l6.I
    public final void dispatch(S5.g gVar, Runnable runnable) {
        W(runnable);
    }

    public InterfaceC3351d0 l(long j8, Runnable runnable, S5.g gVar) {
        return W.a.a(this, j8, runnable, gVar);
    }

    @Override // l6.AbstractC3359h0
    public void shutdown() {
        X0.f34587a.c();
        e0(true);
        U();
        do {
        } while (N() <= 0);
        Z();
    }

    @Override // l6.W
    public void v(long j8, InterfaceC3372o interfaceC3372o) {
        long c8 = AbstractC3367l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC3348c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c8 + nanoTime, interfaceC3372o);
            b0(nanoTime, aVar);
            r.a(interfaceC3372o, aVar);
        }
    }
}
