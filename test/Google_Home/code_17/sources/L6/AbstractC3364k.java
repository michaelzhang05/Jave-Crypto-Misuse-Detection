package l6;

import S5.e;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import q6.C3861B;
import r6.AbstractC3975a;
import r6.AbstractC3976b;

/* renamed from: l6.k */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3364k {
    public static final U a(M m8, S5.g gVar, O o8, InterfaceC1668n interfaceC1668n) {
        V v8;
        S5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            v8 = new H0(e8, interfaceC1668n);
        } else {
            v8 = new V(e8, true);
        }
        v8.M0(o8, v8, interfaceC1668n);
        return v8;
    }

    public static /* synthetic */ U b(M m8, S5.g gVar, O o8, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC3360i.a(m8, gVar, o8, interfaceC1668n);
    }

    public static final InterfaceC3390x0 c(M m8, S5.g gVar, O o8, InterfaceC1668n interfaceC1668n) {
        S0 s02;
        S5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            s02 = new I0(e8, interfaceC1668n);
        } else {
            s02 = new S0(e8, true);
        }
        s02.M0(o8, s02, interfaceC1668n);
        return s02;
    }

    public static /* synthetic */ InterfaceC3390x0 d(M m8, S5.g gVar, O o8, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC3360i.c(m8, gVar, o8, interfaceC1668n);
    }

    public static final Object e(S5.g gVar, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        Object N02;
        S5.g context = dVar.getContext();
        S5.g d8 = H.d(context, gVar);
        B0.j(d8);
        if (d8 == context) {
            C3861B c3861b = new C3861B(d8, dVar);
            N02 = AbstractC3976b.b(c3861b, c3861b, interfaceC1668n);
        } else {
            e.b bVar = S5.e.f9822a0;
            if (AbstractC3255y.d(d8.get(bVar), context.get(bVar))) {
                c1 c1Var = new c1(d8, dVar);
                S5.g context2 = c1Var.getContext();
                Object c8 = q6.J.c(context2, null);
                try {
                    Object b8 = AbstractC3976b.b(c1Var, c1Var, interfaceC1668n);
                    q6.J.a(context2, c8);
                    N02 = b8;
                } catch (Throwable th) {
                    q6.J.a(context2, c8);
                    throw th;
                }
            } else {
                Y y8 = new Y(d8, dVar);
                AbstractC3975a.d(interfaceC1668n, y8, y8, null, 4, null);
                N02 = y8.N0();
            }
        }
        if (N02 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return N02;
    }
}
