package l6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3356g extends AbstractC3344a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f34623d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3359h0 f34624e;

    public C3356g(S5.g gVar, Thread thread, AbstractC3359h0 abstractC3359h0) {
        super(gVar, true, true);
        this.f34623d = thread;
        this.f34624e = abstractC3359h0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l6.F0
    public void H(Object obj) {
        if (!AbstractC3255y.d(Thread.currentThread(), this.f34623d)) {
            Thread thread = this.f34623d;
            AbstractC3348c.a();
            LockSupport.unpark(thread);
        }
    }

    public final Object N0() {
        long j8;
        AbstractC3348c.a();
        try {
            AbstractC3359h0 abstractC3359h0 = this.f34624e;
            C3339C c3339c = null;
            if (abstractC3359h0 != null) {
                AbstractC3359h0.K(abstractC3359h0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC3359h0 abstractC3359h02 = this.f34624e;
                    if (abstractC3359h02 != null) {
                        j8 = abstractC3359h02.N();
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (!b()) {
                        AbstractC3348c.a();
                        LockSupport.parkNanos(this, j8);
                    } else {
                        AbstractC3359h0 abstractC3359h03 = this.f34624e;
                        if (abstractC3359h03 != null) {
                            AbstractC3359h0.F(abstractC3359h03, false, 1, null);
                        }
                        AbstractC3348c.a();
                        Object h8 = G0.h(d0());
                        if (h8 instanceof C3339C) {
                            c3339c = (C3339C) h8;
                        }
                        if (c3339c == null) {
                            return h8;
                        }
                        throw c3339c.f34530a;
                    }
                } catch (Throwable th) {
                    AbstractC3359h0 abstractC3359h04 = this.f34624e;
                    if (abstractC3359h04 != null) {
                        AbstractC3359h0.F(abstractC3359h04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            K(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC3348c.a();
            throw th2;
        }
    }

    @Override // l6.F0
    protected boolean h0() {
        return true;
    }
}
