package s6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.T;

/* renamed from: s6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4019n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39330b = AtomicReferenceFieldUpdater.newUpdater(C4019n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39331c = AtomicIntegerFieldUpdater.newUpdater(C4019n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39332d = AtomicIntegerFieldUpdater.newUpdater(C4019n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39333e = AtomicIntegerFieldUpdater.newUpdater(C4019n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f39334a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final AbstractRunnableC4013h b(AbstractRunnableC4013h abstractRunnableC4013h) {
        if (d() == 127) {
            return abstractRunnableC4013h;
        }
        if (abstractRunnableC4013h.f39318b.b() == 1) {
            f39333e.incrementAndGet(this);
        }
        int i8 = f39331c.get(this) & 127;
        while (this.f39334a.get(i8) != null) {
            Thread.yield();
        }
        this.f39334a.lazySet(i8, abstractRunnableC4013h);
        f39331c.incrementAndGet(this);
        return null;
    }

    private final void c(AbstractRunnableC4013h abstractRunnableC4013h) {
        if (abstractRunnableC4013h != null && abstractRunnableC4013h.f39318b.b() == 1) {
            f39333e.decrementAndGet(this);
        }
    }

    private final int d() {
        return f39331c.get(this) - f39332d.get(this);
    }

    private final AbstractRunnableC4013h i() {
        AbstractRunnableC4013h abstractRunnableC4013h;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39332d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f39331c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (abstractRunnableC4013h = (AbstractRunnableC4013h) this.f39334a.getAndSet(i9, null)) != null) {
                c(abstractRunnableC4013h);
                return abstractRunnableC4013h;
            }
        }
    }

    private final boolean j(C4009d c4009d) {
        AbstractRunnableC4013h i8 = i();
        if (i8 == null) {
            return false;
        }
        c4009d.a(i8);
        return true;
    }

    private final AbstractRunnableC4013h k(boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC4013h abstractRunnableC4013h;
        do {
            atomicReferenceFieldUpdater = f39330b;
            abstractRunnableC4013h = (AbstractRunnableC4013h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC4013h != null) {
                boolean z9 = true;
                if (abstractRunnableC4013h.f39318b.b() != 1) {
                    z9 = false;
                }
                if (z9 == z8) {
                }
            }
            int i8 = f39332d.get(this);
            int i9 = f39331c.get(this);
            while (i8 != i9) {
                if (z8 && f39333e.get(this) == 0) {
                    return null;
                }
                i9--;
                AbstractRunnableC4013h m8 = m(i9, z8);
                if (m8 != null) {
                    return m8;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC4013h, null));
        return abstractRunnableC4013h;
    }

    private final AbstractRunnableC4013h l(int i8) {
        int i9 = f39332d.get(this);
        int i10 = f39331c.get(this);
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        while (i9 != i10) {
            if (z8 && f39333e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            AbstractRunnableC4013h m8 = m(i9, z8);
            if (m8 == null) {
                i9 = i11;
            } else {
                return m8;
            }
        }
        return null;
    }

    private final AbstractRunnableC4013h m(int i8, boolean z8) {
        int i9 = i8 & 127;
        AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) this.f39334a.get(i9);
        if (abstractRunnableC4013h != null) {
            boolean z9 = true;
            if (abstractRunnableC4013h.f39318b.b() != 1) {
                z9 = false;
            }
            if (z9 == z8 && n6.i.a(this.f39334a, i9, abstractRunnableC4013h, null)) {
                if (z8) {
                    f39333e.decrementAndGet(this);
                }
                return abstractRunnableC4013h;
            }
        }
        return null;
    }

    private final long o(int i8, T t8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC4013h abstractRunnableC4013h;
        do {
            atomicReferenceFieldUpdater = f39330b;
            abstractRunnableC4013h = (AbstractRunnableC4013h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC4013h == null) {
                return -2L;
            }
            int i9 = 1;
            if (abstractRunnableC4013h.f39318b.b() != 1) {
                i9 = 2;
            }
            if ((i9 & i8) == 0) {
                return -2L;
            }
            long a8 = AbstractC4017l.f39326f.a() - abstractRunnableC4013h.f39317a;
            long j8 = AbstractC4017l.f39322b;
            if (a8 < j8) {
                return j8 - a8;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC4013h, null));
        t8.f34162a = abstractRunnableC4013h;
        return -1L;
    }

    public final AbstractRunnableC4013h a(AbstractRunnableC4013h abstractRunnableC4013h, boolean z8) {
        if (z8) {
            return b(abstractRunnableC4013h);
        }
        AbstractRunnableC4013h abstractRunnableC4013h2 = (AbstractRunnableC4013h) f39330b.getAndSet(this, abstractRunnableC4013h);
        if (abstractRunnableC4013h2 == null) {
            return null;
        }
        return b(abstractRunnableC4013h2);
    }

    public final int e() {
        if (f39330b.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(C4009d c4009d) {
        AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) f39330b.getAndSet(this, null);
        if (abstractRunnableC4013h != null) {
            c4009d.a(abstractRunnableC4013h);
        }
        do {
        } while (j(c4009d));
    }

    public final AbstractRunnableC4013h g() {
        AbstractRunnableC4013h abstractRunnableC4013h = (AbstractRunnableC4013h) f39330b.getAndSet(this, null);
        if (abstractRunnableC4013h == null) {
            return i();
        }
        return abstractRunnableC4013h;
    }

    public final AbstractRunnableC4013h h() {
        return k(true);
    }

    public final long n(int i8, T t8) {
        AbstractRunnableC4013h l8;
        if (i8 == 3) {
            l8 = i();
        } else {
            l8 = l(i8);
        }
        if (l8 != null) {
            t8.f34162a = l8;
            return -1L;
        }
        return o(i8, t8);
    }
}
