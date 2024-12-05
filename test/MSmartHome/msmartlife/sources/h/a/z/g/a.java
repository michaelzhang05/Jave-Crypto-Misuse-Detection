package h.a.z.g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask.java */
/* loaded from: classes2.dex */
abstract class a extends AtomicReference<Future<?>> implements h.a.x.c {

    /* renamed from: f, reason: collision with root package name */
    protected static final FutureTask<Void> f18165f;

    /* renamed from: g, reason: collision with root package name */
    protected static final FutureTask<Void> f18166g;

    /* renamed from: h, reason: collision with root package name */
    protected final Runnable f18167h;

    /* renamed from: i, reason: collision with root package name */
    protected Thread f18168i;

    static {
        Runnable runnable = h.a.z.b.a.f17979b;
        f18165f = new FutureTask<>(runnable, null);
        f18166g = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Runnable runnable) {
        this.f18167h = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f18165f) {
                return;
            }
            if (future2 == f18166g) {
                future.cancel(this.f18168i != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // h.a.x.c
    public final void d() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f18165f || future == (futureTask = f18166g) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f18168i != Thread.currentThread());
    }

    @Override // h.a.x.c
    public final boolean f() {
        Future<?> future = get();
        return future == f18165f || future == f18166g;
    }
}
