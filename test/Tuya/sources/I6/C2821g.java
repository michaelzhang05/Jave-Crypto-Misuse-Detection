package i6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2821g extends AbstractC2809a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f31771d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC2824h0 f31772e;

    public C2821g(P5.g gVar, Thread thread, AbstractC2824h0 abstractC2824h0) {
        super(gVar, true, true);
        this.f31771d = thread;
        this.f31772e = abstractC2824h0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i6.F0
    public void H(Object obj) {
        if (!AbstractC3159y.d(Thread.currentThread(), this.f31771d)) {
            Thread thread = this.f31771d;
            AbstractC2813c.a();
            LockSupport.unpark(thread);
        }
    }

    public final Object O0() {
        long j8;
        AbstractC2813c.a();
        try {
            AbstractC2824h0 abstractC2824h0 = this.f31772e;
            C2804C c2804c = null;
            if (abstractC2824h0 != null) {
                AbstractC2824h0.K(abstractC2824h0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC2824h0 abstractC2824h02 = this.f31772e;
                    if (abstractC2824h02 != null) {
                        j8 = abstractC2824h02.N();
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (!b()) {
                        AbstractC2813c.a();
                        LockSupport.parkNanos(this, j8);
                    } else {
                        AbstractC2824h0 abstractC2824h03 = this.f31772e;
                        if (abstractC2824h03 != null) {
                            AbstractC2824h0.F(abstractC2824h03, false, 1, null);
                        }
                        AbstractC2813c.a();
                        Object h8 = G0.h(d0());
                        if (h8 instanceof C2804C) {
                            c2804c = (C2804C) h8;
                        }
                        if (c2804c == null) {
                            return h8;
                        }
                        throw c2804c.f31678a;
                    }
                } catch (Throwable th) {
                    AbstractC2824h0 abstractC2824h04 = this.f31772e;
                    if (abstractC2824h04 != null) {
                        AbstractC2824h0.F(abstractC2824h04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            K(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC2813c.a();
            throw th2;
        }
    }

    @Override // i6.F0
    protected boolean i0() {
        return true;
    }
}
