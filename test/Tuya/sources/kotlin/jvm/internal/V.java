package kotlin.jvm.internal;

import e6.InterfaceC2643c;
import e6.InterfaceC2644d;
import e6.InterfaceC2645e;
import e6.InterfaceC2647g;
import e6.InterfaceC2648h;

/* loaded from: classes5.dex */
public class V {
    public InterfaceC2643c b(Class cls) {
        return new C3149n(cls);
    }

    public InterfaceC2644d c(Class cls, String str) {
        return new G(cls, str);
    }

    public String i(InterfaceC3154t interfaceC3154t) {
        String obj = interfaceC3154t.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String j(AbstractC3160z abstractC3160z) {
        return i(abstractC3160z);
    }

    public InterfaceC2645e a(AbstractC3155u abstractC3155u) {
        return abstractC3155u;
    }

    public InterfaceC2647g d(B b8) {
        return b8;
    }

    public InterfaceC2648h e(D d8) {
        return d8;
    }

    public e6.j f(H h8) {
        return h8;
    }

    public e6.k g(J j8) {
        return j8;
    }

    public e6.l h(L l8) {
        return l8;
    }
}
