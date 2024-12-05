package z6;

import kotlin.jvm.internal.AbstractC3255y;
import w6.i;

/* loaded from: classes5.dex */
public interface f {
    void D(long j8);

    void E(String str);

    D6.b a();

    d d(y6.f fVar);

    void f();

    void g(i iVar, Object obj);

    void h(double d8);

    void i(short s8);

    d j(y6.f fVar, int i8);

    void k(y6.f fVar, int i8);

    f l(y6.f fVar);

    void m(byte b8);

    void n(boolean z8);

    void r(float f8);

    void t(char c8);

    void u();

    void z(int i8);

    /* loaded from: classes5.dex */
    public static final class a {
        public static d a(f fVar, y6.f descriptor, int i8) {
            AbstractC3255y.i(descriptor, "descriptor");
            return fVar.d(descriptor);
        }

        public static void c(f fVar, i serializer, Object obj) {
            AbstractC3255y.i(serializer, "serializer");
            if (serializer.a().c()) {
                fVar.g(serializer, obj);
            } else if (obj == null) {
                fVar.f();
            } else {
                fVar.u();
                fVar.g(serializer, obj);
            }
        }

        public static void d(f fVar, i serializer, Object obj) {
            AbstractC3255y.i(serializer, "serializer");
            serializer.d(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
