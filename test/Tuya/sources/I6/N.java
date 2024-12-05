package i6;

import java.util.concurrent.CancellationException;
import n6.C3482B;
import n6.C3492f;
import o6.AbstractC3586b;

/* loaded from: classes5.dex */
public abstract class N {
    public static final M a(P5.g gVar) {
        InterfaceC2802A b8;
        if (gVar.get(InterfaceC2855x0.f31809n0) == null) {
            b8 = D0.b(null, 1, null);
            gVar = gVar.plus(b8);
        }
        return new C3492f(gVar);
    }

    public static final M b() {
        return new C3492f(U0.b(null, 1, null).plus(C2812b0.c()));
    }

    public static final void c(M m8, CancellationException cancellationException) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) m8.getCoroutineContext().get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            interfaceC2855x0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + m8).toString());
    }

    public static /* synthetic */ void d(M m8, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        c(m8, cancellationException);
    }

    public static final Object e(X5.n nVar, P5.d dVar) {
        C3482B c3482b = new C3482B(dVar.getContext(), dVar);
        Object b8 = AbstractC3586b.b(c3482b, c3482b, nVar);
        if (b8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b8;
    }

    public static final void f(M m8) {
        B0.j(m8.getCoroutineContext());
    }

    public static final boolean g(M m8) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) m8.getCoroutineContext().get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            return interfaceC2855x0.isActive();
        }
        return true;
    }

    public static final M h(M m8, P5.g gVar) {
        return new C3492f(m8.getCoroutineContext().plus(gVar));
    }
}
