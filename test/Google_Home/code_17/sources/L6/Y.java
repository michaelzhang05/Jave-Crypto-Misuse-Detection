package l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q6.AbstractC3876k;
import q6.C3861B;

/* loaded from: classes5.dex */
public final class Y extends C3861B {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34589e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision");
    private volatile int _decision;

    public Y(S5.g gVar, S5.d dVar) {
        super(gVar, dVar);
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34589e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f34589e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34589e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f34589e.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q6.C3861B, l6.F0
    public void H(Object obj) {
        J0(obj);
    }

    @Override // q6.C3861B, l6.AbstractC3344a
    protected void J0(Object obj) {
        if (O0()) {
            return;
        }
        AbstractC3876k.c(T5.b.c(this.f38359d), AbstractC3343G.a(obj, this.f38359d), null, 2, null);
    }

    public final Object N0() {
        if (P0()) {
            return T5.b.e();
        }
        Object h8 = G0.h(d0());
        if (!(h8 instanceof C3339C)) {
            return h8;
        }
        throw ((C3339C) h8).f34530a;
    }
}
