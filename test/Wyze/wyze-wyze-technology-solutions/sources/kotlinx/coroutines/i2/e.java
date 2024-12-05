package kotlinx.coroutines.i2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.d1;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
final class e extends d1 implements j, Executor {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22186h = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: i, reason: collision with root package name */
    private final c f22187i;

    /* renamed from: j, reason: collision with root package name */
    private final int f22188j;

    /* renamed from: k, reason: collision with root package name */
    private final String f22189k;
    private final int l;
    private final ConcurrentLinkedQueue<Runnable> m = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int i2, String str, int i3) {
        this.f22187i = cVar;
        this.f22188j = i2;
        this.f22189k = str;
        this.l = i3;
    }

    private final void u0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22186h;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f22188j) {
                this.f22187i.v0(runnable, this, z);
                return;
            }
            this.m.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f22188j) {
                return;
            } else {
                runnable = this.m.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.i2.j
    public int P() {
        return this.l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        u0(runnable, false);
    }

    @Override // kotlinx.coroutines.c0
    public void s0(CoroutineContext coroutineContext, Runnable runnable) {
        u0(runnable, false);
    }

    @Override // kotlinx.coroutines.c0
    public String toString() {
        String str = this.f22189k;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f22187i + ']';
    }

    @Override // kotlinx.coroutines.i2.j
    public void w() {
        Runnable poll = this.m.poll();
        if (poll != null) {
            this.f22187i.v0(poll, this, true);
            return;
        }
        f22186h.decrementAndGet(this);
        Runnable poll2 = this.m.poll();
        if (poll2 == null) {
            return;
        }
        u0(poll2, true);
    }
}
