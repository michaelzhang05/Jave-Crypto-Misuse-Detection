package i6;

import i6.InterfaceC2855x0;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class D0 {
    public static final InterfaceC2802A a(InterfaceC2855x0 interfaceC2855x0) {
        return new A0(interfaceC2855x0);
    }

    public static /* synthetic */ InterfaceC2802A b(InterfaceC2855x0 interfaceC2855x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2855x0 = null;
        }
        return B0.a(interfaceC2855x0);
    }

    public static final void c(P5.g gVar, CancellationException cancellationException) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            interfaceC2855x0.cancel(cancellationException);
        }
    }

    public static final void d(InterfaceC2855x0 interfaceC2855x0, String str, Throwable th) {
        interfaceC2855x0.cancel(AbstractC2834m0.a(str, th));
    }

    public static /* synthetic */ void e(P5.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        B0.c(gVar, cancellationException);
    }

    public static /* synthetic */ void f(InterfaceC2855x0 interfaceC2855x0, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        B0.d(interfaceC2855x0, str, th);
    }

    public static final Object g(InterfaceC2855x0 interfaceC2855x0, P5.d dVar) {
        InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        Object e8 = interfaceC2855x0.e(dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return L5.I.f6487a;
    }

    public static final InterfaceC2816d0 h(InterfaceC2855x0 interfaceC2855x0, InterfaceC2816d0 interfaceC2816d0) {
        return interfaceC2855x0.u(new C2820f0(interfaceC2816d0));
    }

    public static final void i(P5.g gVar) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            B0.k(interfaceC2855x0);
        }
    }

    public static final void j(InterfaceC2855x0 interfaceC2855x0) {
        if (interfaceC2855x0.isActive()) {
        } else {
            throw interfaceC2855x0.m();
        }
    }

    public static final InterfaceC2855x0 k(P5.g gVar) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            return interfaceC2855x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final boolean l(P5.g gVar) {
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            return interfaceC2855x0.isActive();
        }
        return true;
    }
}
