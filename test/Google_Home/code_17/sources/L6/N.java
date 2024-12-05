package l6;

import a6.InterfaceC1668n;
import java.util.concurrent.CancellationException;
import q6.C3861B;
import q6.C3871f;
import r6.AbstractC3976b;

/* loaded from: classes5.dex */
public abstract class N {
    public static final M a(S5.g gVar) {
        InterfaceC3337A b8;
        if (gVar.get(InterfaceC3390x0.f34661n0) == null) {
            b8 = D0.b(null, 1, null);
            gVar = gVar.plus(b8);
        }
        return new C3871f(gVar);
    }

    public static final M b() {
        return new C3871f(U0.b(null, 1, null).plus(C3347b0.c()));
    }

    public static final void c(M m8, CancellationException cancellationException) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) m8.getCoroutineContext().get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(cancellationException);
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

    public static final Object e(InterfaceC1668n interfaceC1668n, S5.d dVar) {
        C3861B c3861b = new C3861B(dVar.getContext(), dVar);
        Object b8 = AbstractC3976b.b(c3861b, c3861b, interfaceC1668n);
        if (b8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b8;
    }

    public static final void f(M m8) {
        B0.j(m8.getCoroutineContext());
    }

    public static final boolean g(M m8) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) m8.getCoroutineContext().get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            return interfaceC3390x0.isActive();
        }
        return true;
    }

    public static final M h(M m8, S5.g gVar) {
        return new C3871f(m8.getCoroutineContext().plus(gVar));
    }
}
