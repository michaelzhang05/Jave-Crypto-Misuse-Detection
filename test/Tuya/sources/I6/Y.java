package i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n6.AbstractC3497k;
import n6.C3482B;

/* loaded from: classes5.dex */
public final class Y extends C3482B {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31737e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision");
    private volatile int _decision;

    public Y(P5.g gVar, P5.d dVar) {
        super(gVar, dVar);
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31737e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f31737e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Q0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31737e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f31737e.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n6.C3482B, i6.F0
    public void H(Object obj) {
        K0(obj);
    }

    @Override // n6.C3482B, i6.AbstractC2809a
    protected void K0(Object obj) {
        if (P0()) {
            return;
        }
        AbstractC3497k.c(Q5.b.c(this.f36231d), AbstractC2808G.a(obj, this.f36231d), null, 2, null);
    }

    public final Object O0() {
        if (Q0()) {
            return Q5.b.e();
        }
        Object h8 = G0.h(d0());
        if (!(h8 instanceof C2804C)) {
            return h8;
        }
        throw ((C2804C) h8).f31678a;
    }
}
