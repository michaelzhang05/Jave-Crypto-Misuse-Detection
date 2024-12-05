package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public class m<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public m(boolean z) {
        this._cur = new n(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            n nVar = (n) this._cur;
            int a2 = nVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, nVar, nVar.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            n nVar = (n) this._cur;
            if (nVar.d()) {
                return;
            } else {
                a.compareAndSet(this, nVar, nVar.i());
            }
        }
    }

    public final int c() {
        return ((n) this._cur).f();
    }

    public final E d() {
        while (true) {
            n nVar = (n) this._cur;
            E e2 = (E) nVar.j();
            if (e2 != n.f22231d) {
                return e2;
            }
            a.compareAndSet(this, nVar, nVar.i());
        }
    }
}
