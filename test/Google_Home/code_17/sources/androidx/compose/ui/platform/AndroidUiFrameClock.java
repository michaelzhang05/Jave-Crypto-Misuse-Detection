package androidx.compose.ui.platform;

import O5.s;
import S5.g;
import a6.InterfaceC1668n;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import l6.InterfaceC3372o;

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

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC1668n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b
    public /* synthetic */ g.c getKey() {
        return androidx.compose.runtime.h.a(this);
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
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            g.b bVar = dVar.getContext().get(S5.e.f9822a0);
            if (bVar instanceof AndroidUiDispatcher) {
                androidUiDispatcher = (AndroidUiDispatcher) bVar;
            } else {
                androidUiDispatcher = null;
            }
        }
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b8;
                InterfaceC3372o interfaceC3372o = InterfaceC3372o.this;
                Function1 function12 = function1;
                try {
                    s.a aVar = O5.s.f8302b;
                    b8 = O5.s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = O5.s.f8302b;
                    b8 = O5.s.b(O5.t.a(th));
                }
                interfaceC3372o.resumeWith(b8);
            }
        };
        if (androidUiDispatcher != null && AbstractC3255y.d(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c3374p.i(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            c3374p.i(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
