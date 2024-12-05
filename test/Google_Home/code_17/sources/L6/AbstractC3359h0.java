package l6;

import P5.C1370k;
import q6.AbstractC3879n;

/* renamed from: l6.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3359h0 extends I {

    /* renamed from: a, reason: collision with root package name */
    private long f34627a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34628b;

    /* renamed from: c, reason: collision with root package name */
    private C1370k f34629c;

    public static /* synthetic */ void F(AbstractC3359h0 abstractC3359h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC3359h0.E(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long G(boolean z8) {
        if (z8) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void K(AbstractC3359h0 abstractC3359h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC3359h0.J(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void E(boolean z8) {
        long G8 = this.f34627a - G(z8);
        this.f34627a = G8;
        if (G8 <= 0 && this.f34628b) {
            shutdown();
        }
    }

    public final void H(Z z8) {
        C1370k c1370k = this.f34629c;
        if (c1370k == null) {
            c1370k = new C1370k();
            this.f34629c = c1370k;
        }
        c1370k.e(z8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long I() {
        C1370k c1370k = this.f34629c;
        if (c1370k == null || c1370k.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void J(boolean z8) {
        this.f34627a += G(z8);
        if (!z8) {
            this.f34628b = true;
        }
    }

    public final boolean L() {
        if (this.f34627a >= G(true)) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        C1370k c1370k = this.f34629c;
        if (c1370k != null) {
            return c1370k.isEmpty();
        }
        return true;
    }

    public abstract long N();

    public final boolean O() {
        Z z8;
        C1370k c1370k = this.f34629c;
        if (c1370k == null || (z8 = (Z) c1370k.v()) == null) {
            return false;
        }
        z8.run();
        return true;
    }

    public boolean P() {
        return false;
    }

    @Override // l6.I
    public final I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        return this;
    }

    public abstract void shutdown();
}
