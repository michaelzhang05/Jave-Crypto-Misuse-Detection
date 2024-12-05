package i6;

import i6.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3486F;

/* renamed from: i6.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2826i0 extends AbstractC2828j0 implements W {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31778d = AtomicReferenceFieldUpdater.newUpdater(AbstractC2826i0.class, Object.class, "_queue");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31779e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2826i0.class, Object.class, "_delayed");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31780f = AtomicIntegerFieldUpdater.newUpdater(AbstractC2826i0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: i6.i0$a */
    /* loaded from: classes5.dex */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC2837o f31781c;

        public a(long j8, InterfaceC2837o interfaceC2837o) {
            super(j8);
            this.f31781c = interfaceC2837o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31781c.w(AbstractC2826i0.this, L5.I.f6487a);
        }

        @Override // i6.AbstractC2826i0.c
        public String toString() {
            return super.toString() + this.f31781c;
        }
    }

    /* renamed from: i6.i0$b */
    /* loaded from: classes5.dex */
    private static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f31783c;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f31783c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31783c.run();
        }

        @Override // i6.AbstractC2826i0.c
        public String toString() {
            return super.toString() + this.f31783c;
        }
    }

    /* renamed from: i6.i0$c */
    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable, Comparable, InterfaceC2816d0, n6.O {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f31784a;

        /* renamed from: b, reason: collision with root package name */
        private int f31785b = -1;

        public c(long j8) {
            this.f31784a = j8;
        }

        @Override // n6.O
        public void a(n6.N n8) {
            C3486F c3486f;
            Object obj = this._heap;
            c3486f = AbstractC2832l0.f31788a;
            if (obj != c3486f) {
                this._heap = n8;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // n6.O
        public n6.N c() {
            Object obj = this._heap;
            if (obj instanceof n6.N) {
                return (n6.N) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j8 = this.f31784a - cVar.f31784a;
            if (j8 > 0) {
                return 1;
            }
            if (j8 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // i6.InterfaceC2816d0
        public final void dispose() {
            C3486F c3486f;
            d dVar;
            C3486F c3486f2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c3486f = AbstractC2832l0.f31788a;
                    if (obj == c3486f) {
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
                    c3486f2 = AbstractC2832l0.f31788a;
                    this._heap = c3486f2;
                    L5.I i8 = L5.I.f6487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j8, d dVar, AbstractC2826i0 abstractC2826i0) {
            C3486F c3486f;
            synchronized (this) {
                Object obj = this._heap;
                c3486f = AbstractC2832l0.f31788a;
                if (obj == c3486f) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC2826i0.b()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f31786c = j8;
                        } else {
                            long j9 = cVar.f31784a;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.f31786c > 0) {
                                dVar.f31786c = j8;
                            }
                        }
                        long j10 = this.f31784a;
                        long j11 = dVar.f31786c;
                        if (j10 - j11 < 0) {
                            this.f31784a = j11;
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
            if (j8 - this.f31784a >= 0) {
                return true;
            }
            return false;
        }

        @Override // n6.O
        public int getIndex() {
            return this.f31785b;
        }

        @Override // n6.O
        public void setIndex(int i8) {
            this.f31785b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f31784a + ']';
        }
    }

    /* renamed from: i6.i0$d */
    /* loaded from: classes5.dex */
    public static final class d extends n6.N {

        /* renamed from: c, reason: collision with root package name */
        public long f31786c;

        public d(long j8) {
            this.f31786c = j8;
        }
    }

    private final void U() {
        C3486F c3486f;
        C3486F c3486f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31778d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31778d;
                c3486f = AbstractC2832l0.f31789b;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, c3486f)) {
                    return;
                }
            } else if (!(obj instanceof n6.s)) {
                c3486f2 = AbstractC2832l0.f31789b;
                if (obj == c3486f2) {
                    return;
                }
                n6.s sVar = new n6.s(8, true);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f31778d, this, obj, sVar)) {
                    return;
                }
            } else {
                ((n6.s) obj).d();
                return;
            }
        }
    }

    private final Runnable V() {
        C3486F c3486f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31778d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof n6.s)) {
                c3486f = AbstractC2832l0.f31789b;
                if (obj == c3486f) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f31778d, this, obj, null)) {
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                n6.s sVar = (n6.s) obj;
                Object j8 = sVar.j();
                if (j8 != n6.s.f36290h) {
                    return (Runnable) j8;
                }
                androidx.concurrent.futures.a.a(f31778d, this, obj, sVar.i());
            }
        }
    }

    private final boolean X(Runnable runnable) {
        C3486F c3486f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31778d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (b()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f31778d, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof n6.s)) {
                c3486f = AbstractC2832l0.f31789b;
                if (obj == c3486f) {
                    return false;
                }
                n6.s sVar = new n6.s(8, true);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                sVar.a(runnable);
                if (androidx.concurrent.futures.a.a(f31778d, this, obj, sVar)) {
                    return true;
                }
            } else {
                AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                n6.s sVar2 = (n6.s) obj;
                int a8 = sVar2.a(runnable);
                if (a8 == 0) {
                    return true;
                }
                if (a8 != 1) {
                    if (a8 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.a.a(f31778d, this, obj, sVar2.i());
                }
            }
        }
    }

    private final void Z() {
        c cVar;
        AbstractC2813c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f31779e.get(this);
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                R(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        if (f31780f.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final int c0(long j8, c cVar) {
        if (b()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31779e;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, new d(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            AbstractC3159y.f(obj);
            dVar = (d) obj;
        }
        return cVar.e(j8, dVar, this);
    }

    private final void e0(boolean z8) {
        f31780f.set(this, z8 ? 1 : 0);
    }

    private final boolean f0(c cVar) {
        c cVar2;
        d dVar = (d) f31779e.get(this);
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

    @Override // i6.AbstractC2824h0
    protected long I() {
        c cVar;
        C3486F c3486f;
        if (super.I() == 0) {
            return 0L;
        }
        Object obj = f31778d.get(this);
        if (obj != null) {
            if (!(obj instanceof n6.s)) {
                c3486f = AbstractC2832l0.f31789b;
                if (obj != c3486f) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((n6.s) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f31779e.get(this);
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.f31784a;
        AbstractC2813c.a();
        return d6.m.e(j8 - System.nanoTime(), 0L);
    }

    @Override // i6.AbstractC2824h0
    public long N() {
        n6.O o8;
        boolean z8;
        if (O()) {
            return 0L;
        }
        d dVar = (d) f31779e.get(this);
        if (dVar != null && !dVar.d()) {
            AbstractC2813c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        n6.O b8 = dVar.b();
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
            S.f31729g.W(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        C3486F c3486f;
        if (!M()) {
            return false;
        }
        d dVar = (d) f31779e.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f31778d.get(this);
        if (obj != null) {
            if (!(obj instanceof n6.s)) {
                c3486f = AbstractC2832l0.f31789b;
                if (obj != c3486f) {
                    return false;
                }
            } else {
                return ((n6.s) obj).g();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a0() {
        f31778d.set(this, null);
        f31779e.set(this, null);
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
    public final InterfaceC2816d0 d0(long j8, Runnable runnable) {
        long c8 = AbstractC2832l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC2813c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c8 + nanoTime, runnable);
            b0(nanoTime, bVar);
            return bVar;
        }
        return M0.f31718a;
    }

    @Override // i6.I
    public final void dispatch(P5.g gVar, Runnable runnable) {
        W(runnable);
    }

    @Override // i6.W
    public void o(long j8, InterfaceC2837o interfaceC2837o) {
        long c8 = AbstractC2832l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC2813c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c8 + nanoTime, interfaceC2837o);
            b0(nanoTime, aVar);
            r.a(interfaceC2837o, aVar);
        }
    }

    @Override // i6.AbstractC2824h0
    public void shutdown() {
        X0.f31735a.c();
        e0(true);
        U();
        do {
        } while (N() <= 0);
        Z();
    }

    public InterfaceC2816d0 w(long j8, Runnable runnable, P5.g gVar) {
        return W.a.a(this, j8, runnable, gVar);
    }
}
