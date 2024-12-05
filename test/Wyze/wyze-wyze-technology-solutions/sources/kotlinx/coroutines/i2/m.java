package kotlinx.coroutines.i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.l0;

/* compiled from: WorkQueue.kt */
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22200b = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22201c = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22202d = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray<i> f22203e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ i b(m mVar, i iVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return mVar.a(iVar, z);
    }

    private final i c(i iVar) {
        if (iVar.f22193g.P() == 1) {
            f22202d.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f22203e.get(i2) != null) {
            Thread.yield();
        }
        this.f22203e.lazySet(i2, iVar);
        f22200b.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            if (iVar.f22193g.P() == 1) {
                int decrementAndGet = f22202d.decrementAndGet(this);
                if (l0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f22201c.compareAndSet(this, i2, i2 + 1) && (andSet = this.f22203e.getAndSet(i3, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i2 = i();
        if (i2 == null) {
            return false;
        }
        dVar.a(i2);
        return true;
    }

    private final long m(m mVar, boolean z) {
        i iVar;
        do {
            iVar = (i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z) {
                if (!(iVar.f22193g.P() == 1)) {
                    return -2L;
                }
            }
            long a2 = l.f22199f.a() - iVar.f22192f;
            long j2 = l.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!a.compareAndSet(mVar, iVar, null));
        b(this, iVar, false, 2, null);
        return -1L;
    }

    public final i a(i iVar, boolean z) {
        if (z) {
            return c(iVar);
        }
        i iVar2 = (i) a.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) a.getAndSet(this, null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        do {
        } while (j(dVar));
    }

    public final i h() {
        i iVar = (i) a.getAndSet(this, null);
        return iVar == null ? i() : iVar;
    }

    public final long k(m mVar) {
        if (l0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = mVar.f22203e;
        for (int i3 = mVar.consumerIndex; i3 != i2; i3++) {
            int i4 = i3 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f22193g.P() == 1) && atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                    f22202d.decrementAndGet(mVar);
                    b(this, iVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(mVar, true);
    }

    public final long l(m mVar) {
        if (l0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i i2 = mVar.i();
        if (i2 != null) {
            i b2 = b(this, i2, false, 2, null);
            if (!l0.a()) {
                return -1L;
            }
            if (b2 == null) {
                return -1L;
            }
            throw new AssertionError();
        }
        return m(mVar, false);
    }
}
