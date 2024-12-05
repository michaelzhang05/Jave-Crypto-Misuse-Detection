package B0;

import java.util.Set;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1063d {
    public static Object a(InterfaceC1064e interfaceC1064e, F f8) {
        Z0.b e8 = interfaceC1064e.e(f8);
        if (e8 == null) {
            return null;
        }
        return e8.get();
    }

    public static Object b(InterfaceC1064e interfaceC1064e, Class cls) {
        return interfaceC1064e.f(F.b(cls));
    }

    public static Z0.a c(InterfaceC1064e interfaceC1064e, Class cls) {
        return interfaceC1064e.b(F.b(cls));
    }

    public static Z0.b d(InterfaceC1064e interfaceC1064e, Class cls) {
        return interfaceC1064e.e(F.b(cls));
    }

    public static Set e(InterfaceC1064e interfaceC1064e, F f8) {
        return (Set) interfaceC1064e.h(f8).get();
    }

    public static Set f(InterfaceC1064e interfaceC1064e, Class cls) {
        return interfaceC1064e.c(F.b(cls));
    }
}
