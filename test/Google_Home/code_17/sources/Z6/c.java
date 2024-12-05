package z6;

import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a {
        public static int a(c cVar, y6.f descriptor) {
            AbstractC3255y.i(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, y6.f fVar, int i8, InterfaceC4150a interfaceC4150a, Object obj, int i9, Object obj2) {
            if (obj2 == null) {
                if ((i9 & 8) != 0) {
                    obj = null;
                }
                return cVar.x(fVar, i8, interfaceC4150a, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    double A(y6.f fVar, int i8);

    int B(y6.f fVar);

    e D(y6.f fVar, int i8);

    float G(y6.f fVar, int i8);

    D6.b a();

    void b(y6.f fVar);

    String e(y6.f fVar, int i8);

    boolean f(y6.f fVar, int i8);

    int g(y6.f fVar);

    byte k(y6.f fVar, int i8);

    short l(y6.f fVar, int i8);

    char m(y6.f fVar, int i8);

    int p(y6.f fVar, int i8);

    Object q(y6.f fVar, int i8, InterfaceC4150a interfaceC4150a, Object obj);

    boolean w();

    Object x(y6.f fVar, int i8, InterfaceC4150a interfaceC4150a, Object obj);

    long y(y6.f fVar, int i8);
}
