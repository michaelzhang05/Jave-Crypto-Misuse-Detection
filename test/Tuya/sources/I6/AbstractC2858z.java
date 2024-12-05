package i6;

/* renamed from: i6.z */
/* loaded from: classes5.dex */
public abstract class AbstractC2858z {
    public static final InterfaceC2854x a(InterfaceC2855x0 interfaceC2855x0) {
        return new C2856y(interfaceC2855x0);
    }

    public static /* synthetic */ InterfaceC2854x b(InterfaceC2855x0 interfaceC2855x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2855x0 = null;
        }
        return a(interfaceC2855x0);
    }

    public static final boolean c(InterfaceC2854x interfaceC2854x, Object obj) {
        Throwable e8 = L5.s.e(obj);
        if (e8 == null) {
            return interfaceC2854x.x(obj);
        }
        return interfaceC2854x.a(e8);
    }
}
