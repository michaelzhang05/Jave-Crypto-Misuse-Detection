package D0;

import b1.InterfaceC1955a;
import b1.InterfaceC1956b;
import java.util.Set;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1054d {
    public static Object a(InterfaceC1055e interfaceC1055e, F f8) {
        InterfaceC1956b f9 = interfaceC1055e.f(f8);
        if (f9 == null) {
            return null;
        }
        return f9.get();
    }

    public static Object b(InterfaceC1055e interfaceC1055e, Class cls) {
        return interfaceC1055e.b(F.b(cls));
    }

    public static InterfaceC1955a c(InterfaceC1055e interfaceC1055e, Class cls) {
        return interfaceC1055e.d(F.b(cls));
    }

    public static InterfaceC1956b d(InterfaceC1055e interfaceC1055e, Class cls) {
        return interfaceC1055e.f(F.b(cls));
    }

    public static Set e(InterfaceC1055e interfaceC1055e, F f8) {
        return (Set) interfaceC1055e.g(f8).get();
    }

    public static Set f(InterfaceC1055e interfaceC1055e, Class cls) {
        return interfaceC1055e.h(F.b(cls));
    }
}
