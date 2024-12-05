package kotlin.jvm.internal;

import h6.InterfaceC2963c;
import h6.InterfaceC2964d;
import h6.InterfaceC2965e;
import h6.InterfaceC2967g;
import h6.InterfaceC2968h;

/* loaded from: classes5.dex */
public class V {
    public InterfaceC2963c b(Class cls) {
        return new C3245n(cls);
    }

    public InterfaceC2964d c(Class cls, String str) {
        return new G(cls, str);
    }

    public String i(InterfaceC3250t interfaceC3250t) {
        String obj = interfaceC3250t.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String j(AbstractC3256z abstractC3256z) {
        return i(abstractC3256z);
    }

    public InterfaceC2965e a(AbstractC3251u abstractC3251u) {
        return abstractC3251u;
    }

    public InterfaceC2967g d(B b8) {
        return b8;
    }

    public InterfaceC2968h e(D d8) {
        return d8;
    }

    public h6.j f(H h8) {
        return h8;
    }

    public h6.k g(J j8) {
        return j8;
    }

    public h6.l h(L l8) {
        return l8;
    }
}
