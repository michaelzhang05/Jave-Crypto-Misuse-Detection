package w6;

import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a {
        public static int a(c cVar, v6.f descriptor) {
            AbstractC3159y.i(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, v6.f fVar, int i8, InterfaceC3796a interfaceC3796a, Object obj, int i9, Object obj2) {
            if (obj2 == null) {
                if ((i9 & 8) != 0) {
                    obj = null;
                }
                return cVar.r(fVar, i8, interfaceC3796a, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    e A(v6.f fVar, int i8);

    double B(v6.f fVar, int i8);

    int F(v6.f fVar);

    short G(v6.f fVar, int i8);

    void a(v6.f fVar);

    A6.b b();

    float f(v6.f fVar, int i8);

    char i(v6.f fVar, int i8);

    boolean j(v6.f fVar, int i8);

    byte m(v6.f fVar, int i8);

    int p(v6.f fVar);

    String q(v6.f fVar, int i8);

    Object r(v6.f fVar, int i8, InterfaceC3796a interfaceC3796a, Object obj);

    int u(v6.f fVar, int i8);

    long x(v6.f fVar, int i8);

    Object y(v6.f fVar, int i8, InterfaceC3796a interfaceC3796a, Object obj);

    boolean z();
}
