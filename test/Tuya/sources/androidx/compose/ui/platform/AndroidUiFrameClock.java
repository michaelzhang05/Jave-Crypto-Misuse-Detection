package androidx.compose.ui.platform;

import L5.s;
import P5.g;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.C2839p;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <R> R fold(R r8, X5.n nVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, nVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b
    public /* synthetic */ g.c getKey() {
        return androidx.compose.runtime.h.a(this);
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
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            g.b bVar = dVar.getContext().get(P5.e.f7991a0);
            if (bVar instanceof AndroidUiDispatcher) {
                androidUiDispatcher = (AndroidUiDispatcher) bVar;
            } else {
                androidUiDispatcher = null;
            }
        }
        final C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b8;
                InterfaceC2837o interfaceC2837o = InterfaceC2837o.this;
                Function1 function12 = function1;
                try {
                    s.a aVar = L5.s.f6511b;
                    b8 = L5.s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = L5.s.f6511b;
                    b8 = L5.s.b(L5.t.a(th));
                }
                interfaceC2837o.resumeWith(b8);
            }
        };
        if (androidUiDispatcher != null && AbstractC3159y.d(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c2839p.j(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            c2839p.j(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
