package l6;

import a6.InterfaceC1668n;

/* renamed from: l6.j */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3362j {
    public static final Object a(S5.g gVar, InterfaceC1668n interfaceC1668n) {
        AbstractC3359h0 abstractC3359h0;
        AbstractC3359h0 a8;
        S5.g e8;
        Thread currentThread = Thread.currentThread();
        S5.e eVar = (S5.e) gVar.get(S5.e.f9822a0);
        if (eVar == null) {
            a8 = X0.f34587a.b();
            e8 = H.e(C3377q0.f34651a, gVar.plus(a8));
        } else {
            AbstractC3359h0 abstractC3359h02 = null;
            if (eVar instanceof AbstractC3359h0) {
                abstractC3359h0 = (AbstractC3359h0) eVar;
            } else {
                abstractC3359h0 = null;
            }
            if (abstractC3359h0 != null) {
                if (abstractC3359h0.P()) {
                    abstractC3359h02 = abstractC3359h0;
                }
                if (abstractC3359h02 != null) {
                    a8 = abstractC3359h02;
                    e8 = H.e(C3377q0.f34651a, gVar);
                }
            }
            a8 = X0.f34587a.a();
            e8 = H.e(C3377q0.f34651a, gVar);
        }
        C3356g c3356g = new C3356g(e8, currentThread, a8);
        c3356g.M0(O.DEFAULT, c3356g, interfaceC1668n);
        return c3356g.N0();
    }

    public static /* synthetic */ Object b(S5.g gVar, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        return AbstractC3360i.e(gVar, interfaceC1668n);
    }
}
