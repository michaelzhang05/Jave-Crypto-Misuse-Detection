package androidx.compose.runtime;

import O5.s;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.jvm.functions.Function1;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.C3374p;
import l6.InterfaceC3372o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) AbstractC3360i.e(C3347b0.c().E(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC1668n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final Function1 function1, S5.d dVar) {
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b8;
                InterfaceC3372o interfaceC3372o = InterfaceC3372o.this;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                Function1 function12 = function1;
                try {
                    s.a aVar = s.f8302b;
                    b8 = s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = s.f8302b;
                    b8 = s.b(t.a(th));
                }
                interfaceC3372o.resumeWith(b8);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c3374p.i(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
