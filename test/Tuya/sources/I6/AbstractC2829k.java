package i6;

import P5.e;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3482B;
import o6.AbstractC3585a;
import o6.AbstractC3586b;

/* renamed from: i6.k */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC2829k {
    public static final U a(M m8, P5.g gVar, O o8, X5.n nVar) {
        V v8;
        P5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            v8 = new H0(e8, nVar);
        } else {
            v8 = new V(e8, true);
        }
        v8.N0(o8, v8, nVar);
        return v8;
    }

    public static /* synthetic */ U b(M m8, P5.g gVar, O o8, X5.n nVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC2825i.a(m8, gVar, o8, nVar);
    }

    public static final InterfaceC2855x0 c(M m8, P5.g gVar, O o8, X5.n nVar) {
        S0 s02;
        P5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            s02 = new I0(e8, nVar);
        } else {
            s02 = new S0(e8, true);
        }
        s02.N0(o8, s02, nVar);
        return s02;
    }

    public static /* synthetic */ InterfaceC2855x0 d(M m8, P5.g gVar, O o8, X5.n nVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC2825i.c(m8, gVar, o8, nVar);
    }

    public static final Object e(P5.g gVar, X5.n nVar, P5.d dVar) {
        Object O02;
        P5.g context = dVar.getContext();
        P5.g d8 = H.d(context, gVar);
        B0.j(d8);
        if (d8 == context) {
            C3482B c3482b = new C3482B(d8, dVar);
            O02 = AbstractC3586b.b(c3482b, c3482b, nVar);
        } else {
            e.b bVar = P5.e.f7991a0;
            if (AbstractC3159y.d(d8.get(bVar), context.get(bVar))) {
                c1 c1Var = new c1(d8, dVar);
                P5.g context2 = c1Var.getContext();
                Object c8 = n6.J.c(context2, null);
                try {
                    Object b8 = AbstractC3586b.b(c1Var, c1Var, nVar);
                    n6.J.a(context2, c8);
                    O02 = b8;
                } catch (Throwable th) {
                    n6.J.a(context2, c8);
                    throw th;
                }
            } else {
                Y y8 = new Y(d8, dVar);
                AbstractC3585a.d(nVar, y8, y8, null, 4, null);
                O02 = y8.O0();
            }
        }
        if (O02 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return O02;
    }
}
