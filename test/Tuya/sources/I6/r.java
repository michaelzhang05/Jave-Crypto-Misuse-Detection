package i6;

import n6.C3496j;

/* loaded from: classes5.dex */
public abstract class r {
    public static final void a(InterfaceC2837o interfaceC2837o, InterfaceC2816d0 interfaceC2816d0) {
        interfaceC2837o.j(new C2818e0(interfaceC2816d0));
    }

    public static final C2839p b(P5.d dVar) {
        if (!(dVar instanceof C3496j)) {
            return new C2839p(dVar, 1);
        }
        C2839p l8 = ((C3496j) dVar).l();
        if (l8 != null) {
            if (!l8.L()) {
                l8 = null;
            }
            if (l8 != null) {
                return l8;
            }
        }
        return new C2839p(dVar, 2);
    }
}
