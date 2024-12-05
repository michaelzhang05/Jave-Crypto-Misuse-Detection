package i6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n6.AbstractC3489c;

/* renamed from: i6.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2838o0 extends AbstractC2836n0 implements W {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f31792b;

    public C2838o0(Executor executor) {
        this.f31792b = executor;
        AbstractC3489c.a(F());
    }

    private final void E(P5.g gVar, RejectedExecutionException rejectedExecutionException) {
        B0.c(gVar, AbstractC2834m0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture G(ScheduledExecutorService scheduledExecutorService, Runnable runnable, P5.g gVar, long j8) {
        try {
            return scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e8) {
            E(gVar, e8);
            return null;
        }
    }

    public Executor F() {
        return this.f31792b;
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

    @Override // i6.I
    public void dispatch(P5.g gVar, Runnable runnable) {
        try {
            Executor F8 = F();
            AbstractC2813c.a();
            F8.execute(runnable);
        } catch (RejectedExecutionException e8) {
            AbstractC2813c.a();
            E(gVar, e8);
            C2812b0.b().dispatch(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2838o0) && ((C2838o0) obj).F() == F()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(F());
    }

    @Override // i6.W
    public void o(long j8, InterfaceC2837o interfaceC2837o) {
        ScheduledExecutorService scheduledExecutorService;
        Executor F8 = F();
        ScheduledFuture scheduledFuture = null;
        if (F8 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) F8;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = G(scheduledExecutorService, new R0(this, interfaceC2837o), interfaceC2837o.getContext(), j8);
        }
        if (scheduledFuture != null) {
            B0.h(interfaceC2837o, scheduledFuture);
        } else {
            S.f31729g.o(j8, interfaceC2837o);
        }
    }

    @Override // i6.I
    public String toString() {
        return F().toString();
    }

    @Override // i6.W
    public InterfaceC2816d0 w(long j8, Runnable runnable, P5.g gVar) {
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
            return new C2814c0(scheduledFuture);
        }
        return S.f31729g.w(j8, runnable, gVar);
    }
}
