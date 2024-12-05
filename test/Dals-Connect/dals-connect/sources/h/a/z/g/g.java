package h.a.z.g;

import h.a.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker.java */
/* loaded from: classes2.dex */
public class g extends r.b implements h.a.x.c {

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f18224f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f18225g;

    public g(ThreadFactory threadFactory) {
        this.f18224f = k.a(threadFactory);
    }

    @Override // h.a.r.b
    public h.a.x.c b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // h.a.r.b
    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f18225g) {
            return h.a.z.a.d.INSTANCE;
        }
        return e(runnable, j2, timeUnit, null);
    }

    @Override // h.a.x.c
    public void d() {
        if (this.f18225g) {
            return;
        }
        this.f18225g = true;
        this.f18224f.shutdownNow();
    }

    public j e(Runnable runnable, long j2, TimeUnit timeUnit, h.a.z.a.b bVar) {
        Future<?> schedule;
        j jVar = new j(h.a.a0.a.q(runnable), bVar);
        if (bVar != null && !bVar.b(jVar)) {
            return jVar;
        }
        try {
            if (j2 <= 0) {
                schedule = this.f18224f.submit((Callable) jVar);
            } else {
                schedule = this.f18224f.schedule((Callable) jVar, j2, timeUnit);
            }
            jVar.a(schedule);
        } catch (RejectedExecutionException e2) {
            if (bVar != null) {
                bVar.a(jVar);
            }
            h.a.a0.a.o(e2);
        }
        return jVar;
    }

    @Override // h.a.x.c
    public boolean f() {
        return this.f18225g;
    }

    public h.a.x.c g(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        i iVar = new i(h.a.a0.a.q(runnable));
        try {
            if (j2 <= 0) {
                schedule = this.f18224f.submit(iVar);
            } else {
                schedule = this.f18224f.schedule(iVar, j2, timeUnit);
            }
            iVar.a(schedule);
            return iVar;
        } catch (RejectedExecutionException e2) {
            h.a.a0.a.o(e2);
            return h.a.z.a.d.INSTANCE;
        }
    }

    public void h() {
        if (this.f18225g) {
            return;
        }
        this.f18225g = true;
        this.f18224f.shutdown();
    }
}
