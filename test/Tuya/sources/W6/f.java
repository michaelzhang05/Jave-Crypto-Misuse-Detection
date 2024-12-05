package w6;

import kotlin.jvm.internal.AbstractC3159y;
import t6.i;

/* loaded from: classes5.dex */
public interface f {
    d B(v6.f fVar, int i8);

    void C(long j8);

    void E(String str);

    f F(v6.f fVar);

    A6.b b();

    d d(v6.f fVar);

    void e(v6.f fVar, int i8);

    void f();

    void g(double d8);

    void h(short s8);

    void j(i iVar, Object obj);

    void l(byte b8);

    void n(boolean z8);

    void p(float f8);

    void q(char c8);

    void r();

    void z(int i8);

    /* loaded from: classes5.dex */
    public static final class a {
        public static d a(f fVar, v6.f descriptor, int i8) {
            AbstractC3159y.i(descriptor, "descriptor");
            return fVar.d(descriptor);
        }

        public static void c(f fVar, i serializer, Object obj) {
            AbstractC3159y.i(serializer, "serializer");
            if (serializer.a().c()) {
                fVar.j(serializer, obj);
            } else if (obj == null) {
                fVar.f();
            } else {
                fVar.r();
                fVar.j(serializer, obj);
            }
        }

        public static void d(f fVar, i serializer, Object obj) {
            AbstractC3159y.i(serializer, "serializer");
            serializer.e(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
