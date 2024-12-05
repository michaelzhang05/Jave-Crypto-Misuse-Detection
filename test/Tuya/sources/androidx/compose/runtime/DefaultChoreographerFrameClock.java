package androidx.compose.runtime;

import L5.s;
import L5.t;
import P5.g;
import X5.n;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.C2839p;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) AbstractC2825i.e(C2812b0.c().E(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <R> R fold(R r8, n nVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, nVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g
    public P5.g plus(P5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final Function1 function1, P5.d dVar) {
        final C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b8;
                InterfaceC2837o interfaceC2837o = InterfaceC2837o.this;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                Function1 function12 = function1;
                try {
                    s.a aVar = s.f6511b;
                    b8 = s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = s.f6511b;
                    b8 = s.b(t.a(th));
                }
                interfaceC2837o.resumeWith(b8);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c2839p.j(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
