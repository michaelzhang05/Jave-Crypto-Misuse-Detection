package i6;

/* renamed from: i6.j */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC2827j {
    public static final Object a(P5.g gVar, X5.n nVar) {
        AbstractC2824h0 abstractC2824h0;
        AbstractC2824h0 a8;
        P5.g e8;
        Thread currentThread = Thread.currentThread();
        P5.e eVar = (P5.e) gVar.get(P5.e.f7991a0);
        if (eVar == null) {
            a8 = X0.f31735a.b();
            e8 = H.e(C2842q0.f31799a, gVar.plus(a8));
        } else {
            AbstractC2824h0 abstractC2824h02 = null;
            if (eVar instanceof AbstractC2824h0) {
                abstractC2824h0 = (AbstractC2824h0) eVar;
            } else {
                abstractC2824h0 = null;
            }
            if (abstractC2824h0 != null) {
                if (abstractC2824h0.P()) {
                    abstractC2824h02 = abstractC2824h0;
                }
                if (abstractC2824h02 != null) {
                    a8 = abstractC2824h02;
                    e8 = H.e(C2842q0.f31799a, gVar);
                }
            }
            a8 = X0.f31735a.a();
            e8 = H.e(C2842q0.f31799a, gVar);
        }
        C2821g c2821g = new C2821g(e8, currentThread, a8);
        c2821g.N0(O.DEFAULT, c2821g, nVar);
        return c2821g.O0();
    }

    public static /* synthetic */ Object b(P5.g gVar, X5.n nVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        return AbstractC2825i.e(gVar, nVar);
    }
}
