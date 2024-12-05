package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.T;

/* renamed from: p6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3625n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37131b = AtomicReferenceFieldUpdater.newUpdater(C3625n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37132c = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37133d = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37134e = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f37135a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final AbstractRunnableC3619h b(AbstractRunnableC3619h abstractRunnableC3619h) {
        if (d() == 127) {
            return abstractRunnableC3619h;
        }
        if (abstractRunnableC3619h.f37119b.b() == 1) {
            f37134e.incrementAndGet(this);
        }
        int i8 = f37132c.get(this) & 127;
        while (this.f37135a.get(i8) != null) {
            Thread.yield();
        }
        this.f37135a.lazySet(i8, abstractRunnableC3619h);
        f37132c.incrementAndGet(this);
        return null;
    }

    private final void c(AbstractRunnableC3619h abstractRunnableC3619h) {
        if (abstractRunnableC3619h != null && abstractRunnableC3619h.f37119b.b() == 1) {
            f37134e.decrementAndGet(this);
        }
    }

    private final int d() {
        return f37132c.get(this) - f37133d.get(this);
    }

    private final AbstractRunnableC3619h i() {
        AbstractRunnableC3619h abstractRunnableC3619h;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37133d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f37132c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37135a.getAndSet(i9, null)) != null) {
                c(abstractRunnableC3619h);
                return abstractRunnableC3619h;
            }
        }
    }

    private final boolean j(C3615d c3615d) {
        AbstractRunnableC3619h i8 = i();
        if (i8 == null) {
            return false;
        }
        c3615d.a(i8);
        return true;
    }

    private final AbstractRunnableC3619h k(boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC3619h abstractRunnableC3619h;
        do {
            atomicReferenceFieldUpdater = f37131b;
            abstractRunnableC3619h = (AbstractRunnableC3619h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC3619h != null) {
                boolean z9 = true;
                if (abstractRunnableC3619h.f37119b.b() != 1) {
                    z9 = false;
                }
                if (z9 == z8) {
                }
            }
            int i8 = f37133d.get(this);
            int i9 = f37132c.get(this);
            while (i8 != i9) {
                if (z8 && f37134e.get(this) == 0) {
                    return null;
                }
                i9--;
                AbstractRunnableC3619h m8 = m(i9, z8);
                if (m8 != null) {
                    return m8;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC3619h, null));
        return abstractRunnableC3619h;
    }

    private final AbstractRunnableC3619h l(int i8) {
        int i9 = f37133d.get(this);
        int i10 = f37132c.get(this);
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        while (i9 != i10) {
            if (z8 && f37134e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            AbstractRunnableC3619h m8 = m(i9, z8);
            if (m8 == null) {
                i9 = i11;
            } else {
                return m8;
            }
        }
        return null;
    }

    private final AbstractRunnableC3619h m(int i8, boolean z8) {
        int i9 = i8 & 127;
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37135a.get(i9);
        if (abstractRunnableC3619h != null) {
            boolean z9 = true;
            if (abstractRunnableC3619h.f37119b.b() != 1) {
                z9 = false;
            }
            if (z9 == z8 && k6.i.a(this.f37135a, i9, abstractRunnableC3619h, null)) {
                if (z8) {
                    f37134e.decrementAndGet(this);
                }
                return abstractRunnableC3619h;
            }
        }
        return null;
    }

    private final long o(int i8, T t8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC3619h abstractRunnableC3619h;
        do {
            atomicReferenceFieldUpdater = f37131b;
            abstractRunnableC3619h = (AbstractRunnableC3619h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC3619h == null) {
                return -2L;
            }
            int i9 = 1;
            if (abstractRunnableC3619h.f37119b.b() != 1) {
                i9 = 2;
            }
            if ((i9 & i8) == 0) {
                return -2L;
            }
            long a8 = AbstractC3623l.f37127f.a() - abstractRunnableC3619h.f37118a;
            long j8 = AbstractC3623l.f37123b;
            if (a8 < j8) {
                return j8 - a8;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC3619h, null));
        t8.f33761a = abstractRunnableC3619h;
        return -1L;
    }

    public final AbstractRunnableC3619h a(AbstractRunnableC3619h abstractRunnableC3619h, boolean z8) {
        if (z8) {
            return b(abstractRunnableC3619h);
        }
        AbstractRunnableC3619h abstractRunnableC3619h2 = (AbstractRunnableC3619h) f37131b.getAndSet(this, abstractRunnableC3619h);
        if (abstractRunnableC3619h2 == null) {
            return null;
        }
        return b(abstractRunnableC3619h2);
    }

    public final int e() {
        if (f37131b.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(C3615d c3615d) {
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) f37131b.getAndSet(this, null);
        if (abstractRunnableC3619h != null) {
            c3615d.a(abstractRunnableC3619h);
        }
        do {
        } while (j(c3615d));
    }

    public final AbstractRunnableC3619h g() {
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) f37131b.getAndSet(this, null);
        if (abstractRunnableC3619h == null) {
            return i();
        }
        return abstractRunnableC3619h;
    }

    public final AbstractRunnableC3619h h() {
        return k(true);
    }

    public final long n(int i8, T t8) {
        AbstractRunnableC3619h l8;
        if (i8 == 3) {
            l8 = i();
        } else {
            l8 = l(i8);
        }
        if (l8 != null) {
            t8.f33761a = l8;
            return -1L;
        }
        return o(i8, t8);
    }
}
