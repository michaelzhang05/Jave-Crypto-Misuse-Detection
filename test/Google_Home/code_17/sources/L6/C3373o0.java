package l6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q6.AbstractC3868c;

/* renamed from: l6.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3373o0 extends AbstractC3371n0 implements W {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f34644b;

    public C3373o0(Executor executor) {
        this.f34644b = executor;
        AbstractC3868c.a(F());
    }

    private final void E(S5.g gVar, RejectedExecutionException rejectedExecutionException) {
        B0.c(gVar, AbstractC3369m0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture G(ScheduledExecutorService scheduledExecutorService, Runnable runnable, S5.g gVar, long j8) {
        try {
            return scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e8) {
            E(gVar, e8);
            return null;
        }
    }

    public Executor F() {
        return this.f34644b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor F8 = F();
        if (F8 instanceof ExecutorService) {
            executorService = (ExecutorService) F8;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        try {
            Executor F8 = F();
            AbstractC3348c.a();
            F8.execute(runnable);
        } catch (RejectedExecutionException e8) {
            AbstractC3348c.a();
            E(gVar, e8);
            C3347b0.b().dispatch(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3373o0) && ((C3373o0) obj).F() == F()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(F());
    }

    @Override // l6.W
    public InterfaceC3351d0 l(long j8, Runnable runnable, S5.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor F8 = F();
        ScheduledFuture scheduledFuture = null;
        if (F8 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) F8;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = G(scheduledExecutorService, runnable, gVar, j8);
        }
        if (scheduledFuture != null) {
            return new C3349c0(scheduledFuture);
        }
        return S.f34581g.l(j8, runnable, gVar);
    }

    @Override // l6.I
    public String toString() {
        return F().toString();
    }

    @Override // l6.W
    public void v(long j8, InterfaceC3372o interfaceC3372o) {
        ScheduledExecutorService scheduledExecutorService;
        Executor F8 = F();
        ScheduledFuture scheduledFuture = null;
        if (F8 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) F8;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = G(scheduledExecutorService, new R0(this, interfaceC3372o), interfaceC3372o.getContext(), j8);
        }
        if (scheduledFuture != null) {
            B0.h(interfaceC3372o, scheduledFuture);
        } else {
            S.f34581g.v(j8, interfaceC3372o);
        }
    }
}
