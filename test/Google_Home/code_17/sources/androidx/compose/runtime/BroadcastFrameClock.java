package androidx.compose.runtime;

import O5.I;
import O5.s;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.C3374p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final Function0 onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {
        private final S5.d continuation;
        private final Function1 onFrame;

        public FrameAwaiter(Function1 function1, S5.d dVar) {
            this.onFrame = function1;
            this.continuation = dVar;
        }

        public final S5.d getContinuation() {
            return this.continuation;
        }

        public final Function1 getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j8) {
            Object b8;
            S5.d dVar = this.continuation;
            try {
                s.a aVar = s.f8302b;
                b8 = s.b(this.onFrame.invoke(Long.valueOf(j8)));
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            dVar.resumeWith(b8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = th;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    S5.d continuation = list.get(i8).getContinuation();
                    s.a aVar = s.f8302b;
                    continuation.resumeWith(s.b(t.a(th)));
                }
                this.awaiters.clear();
                I i9 = I.f8278a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC1668n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        boolean z8;
        synchronized (this.lock) {
            z8 = !this.awaiters.isEmpty();
        }
        return z8;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g
    public S5.g plus(S5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public final void sendFrame(long j8) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list.get(i8).resume(j8);
                }
                list.clear();
                I i9 = I.f8278a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1 function1, S5.d dVar) {
        FrameAwaiter frameAwaiter;
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        T t8 = new T();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                s.a aVar = s.f8302b;
                c3374p.resumeWith(s.b(t.a(th)));
            } else {
                t8.f34162a = new FrameAwaiter(function1, c3374p);
                boolean z8 = !this.awaiters.isEmpty();
                List list = this.awaiters;
                Object obj = t8.f34162a;
                if (obj == null) {
                    AbstractC3255y.y("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) obj;
                }
                list.add(frameAwaiter);
                boolean z9 = !z8;
                c3374p.i(new BroadcastFrameClock$withFrameNanos$2$1(this, t8));
                if (z9 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public BroadcastFrameClock(Function0 function0) {
        this.onNewAwaiters = function0;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : function0);
    }
}
