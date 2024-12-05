package l6;

import q6.C3875j;

/* loaded from: classes5.dex */
public abstract class r {
    public static final void a(InterfaceC3372o interfaceC3372o, InterfaceC3351d0 interfaceC3351d0) {
        interfaceC3372o.i(new C3353e0(interfaceC3351d0));
    }

    public static final C3374p b(S5.d dVar) {
        if (!(dVar instanceof C3875j)) {
            return new C3374p(dVar, 1);
        }
        C3374p n8 = ((C3875j) dVar).n();
        if (n8 != null) {
            if (!n8.L()) {
                n8 = null;
            }
            if (n8 != null) {
                return n8;
            }
        }
        return new C3374p(dVar, 2);
    }
}
