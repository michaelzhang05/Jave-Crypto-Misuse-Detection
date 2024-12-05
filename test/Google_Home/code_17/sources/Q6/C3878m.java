package q6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l6.InterfaceC3351d0;
import l6.InterfaceC3372o;
import l6.T;
import l6.W;

/* renamed from: q6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3878m extends l6.I implements W {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38400f = AtomicIntegerFieldUpdater.newUpdater(C3878m.class, "runningWorkers");

    /* renamed from: a, reason: collision with root package name */
    private final l6.I f38401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38402b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W f38403c;

    /* renamed from: d, reason: collision with root package name */
    private final r f38404d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f38405e;
    private volatile int runningWorkers;

    /* renamed from: q6.m$a */
    /* loaded from: classes5.dex */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f38406a;

        public a(Runnable runnable) {
            this.f38406a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f38406a.run();
                } catch (Throwable th) {
                    l6.K.a(S5.h.f9825a, th);
                }
                Runnable G8 = C3878m.this.G();
                if (G8 == null) {
                    return;
                }
                this.f38406a = G8;
                i8++;
                if (i8 >= 16 && C3878m.this.f38401a.isDispatchNeeded(C3878m.this)) {
                    C3878m.this.f38401a.dispatch(C3878m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3878m(l6.I i8, int i9) {
        W w8;
        this.f38401a = i8;
        this.f38402b = i9;
        if (i8 instanceof W) {
            w8 = (W) i8;
        } else {
            w8 = null;
        }
        this.f38403c = w8 == null ? T.a() : w8;
        this.f38404d = new r(false);
        this.f38405e = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable G() {
        while (true) {
            Runnable runnable = (Runnable) this.f38404d.d();
            if (runnable == null) {
                synchronized (this.f38405e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38400f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f38404d.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    private final boolean H() {
        synchronized (this.f38405e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38400f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f38402b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f38404d.a(runnable);
        if (f38400f.get(this) < this.f38402b && H() && (G8 = G()) != null) {
            this.f38401a.dispatch(this, new a(G8));
        }
    }

    @Override // l6.I
    public void dispatchYield(S5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f38404d.a(runnable);
        if (f38400f.get(this) < this.f38402b && H() && (G8 = G()) != null) {
            this.f38401a.dispatchYield(this, new a(G8));
        }
    }

    @Override // l6.W
    public InterfaceC3351d0 l(long j8, Runnable runnable, S5.g gVar) {
        return this.f38403c.l(j8, runnable, gVar);
    }

    @Override // l6.I
    public l6.I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        if (i8 >= this.f38402b) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // l6.W
    public void v(long j8, InterfaceC3372o interfaceC3372o) {
        this.f38403c.v(j8, interfaceC3372o);
    }
}
