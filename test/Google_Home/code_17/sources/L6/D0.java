package l6;

import java.util.concurrent.CancellationException;
import l6.InterfaceC3390x0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class D0 {
    public static final InterfaceC3337A a(InterfaceC3390x0 interfaceC3390x0) {
        return new A0(interfaceC3390x0);
    }

    public static /* synthetic */ InterfaceC3337A b(InterfaceC3390x0 interfaceC3390x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3390x0 = null;
        }
        return B0.a(interfaceC3390x0);
    }

    public static final void c(S5.g gVar, CancellationException cancellationException) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(cancellationException);
        }
    }

    public static final void d(InterfaceC3390x0 interfaceC3390x0, String str, Throwable th) {
        interfaceC3390x0.cancel(AbstractC3369m0.a(str, th));
    }

    public static /* synthetic */ void e(S5.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        B0.c(gVar, cancellationException);
    }

    public static /* synthetic */ void f(InterfaceC3390x0 interfaceC3390x0, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        B0.d(interfaceC3390x0, str, th);
    }

    public static final Object g(InterfaceC3390x0 interfaceC3390x0, S5.d dVar) {
        InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        Object y8 = interfaceC3390x0.y(dVar);
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    public static final InterfaceC3351d0 h(InterfaceC3390x0 interfaceC3390x0, InterfaceC3351d0 interfaceC3351d0) {
        return interfaceC3390x0.s(new C3355f0(interfaceC3351d0));
    }

    public static final void i(S5.g gVar) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            B0.k(interfaceC3390x0);
        }
    }

    public static final void j(InterfaceC3390x0 interfaceC3390x0) {
        if (interfaceC3390x0.isActive()) {
        } else {
            throw interfaceC3390x0.o();
        }
    }

    public static final InterfaceC3390x0 k(S5.g gVar) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            return interfaceC3390x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final boolean l(S5.g gVar) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            return interfaceC3390x0.isActive();
        }
        return true;
    }
}
