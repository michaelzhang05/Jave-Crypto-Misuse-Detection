package l6;

/* renamed from: l6.z */
/* loaded from: classes5.dex */
public abstract class AbstractC3393z {
    public static final InterfaceC3389x a(InterfaceC3390x0 interfaceC3390x0) {
        return new C3391y(interfaceC3390x0);
    }

    public static /* synthetic */ InterfaceC3389x b(InterfaceC3390x0 interfaceC3390x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3390x0 = null;
        }
        return a(interfaceC3390x0);
    }

    public static final boolean c(InterfaceC3389x interfaceC3389x, Object obj) {
        Throwable e8 = O5.s.e(obj);
        if (e8 == null) {
            return interfaceC3389x.u(obj);
        }
        return interfaceC3389x.a(e8);
    }
}
