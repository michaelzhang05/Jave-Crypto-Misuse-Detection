package i6;

import M5.C1238k;
import n6.AbstractC3500n;

/* renamed from: i6.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2824h0 extends I {

    /* renamed from: a, reason: collision with root package name */
    private long f31775a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31776b;

    /* renamed from: c, reason: collision with root package name */
    private C1238k f31777c;

    public static /* synthetic */ void F(AbstractC2824h0 abstractC2824h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC2824h0.E(z8);
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

    public static /* synthetic */ void K(AbstractC2824h0 abstractC2824h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC2824h0.J(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void E(boolean z8) {
        long G8 = this.f31775a - G(z8);
        this.f31775a = G8;
        if (G8 <= 0 && this.f31776b) {
            shutdown();
        }
    }

    public final void H(Z z8) {
        C1238k c1238k = this.f31777c;
        if (c1238k == null) {
            c1238k = new C1238k();
            this.f31777c = c1238k;
        }
        c1238k.g(z8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long I() {
        C1238k c1238k = this.f31777c;
        if (c1238k == null || c1238k.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void J(boolean z8) {
        this.f31775a += G(z8);
        if (!z8) {
            this.f31776b = true;
        }
    }

    public final boolean L() {
        if (this.f31775a >= G(true)) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        C1238k c1238k = this.f31777c;
        if (c1238k != null) {
            return c1238k.isEmpty();
        }
        return true;
    }

    public abstract long N();

    public final boolean O() {
        Z z8;
        C1238k c1238k = this.f31777c;
        if (c1238k == null || (z8 = (Z) c1238k.x()) == null) {
            return false;
        }
        z8.run();
        return true;
    }

    public boolean P() {
        return false;
    }

    @Override // i6.I
    public final I limitedParallelism(int i8) {
        AbstractC3500n.a(i8);
        return this;
    }

    public abstract void shutdown();
}
