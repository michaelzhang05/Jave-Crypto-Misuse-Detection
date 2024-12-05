package i6;

import kotlin.jvm.functions.Function1;

/* renamed from: i6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2837o extends P5.d {

    /* renamed from: i6.o$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC2837o interfaceC2837o, Throwable th, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    th = null;
                }
                return interfaceC2837o.v(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void C(Object obj);

    boolean b();

    boolean isActive();

    void j(Function1 function1);

    Object k(Throwable th);

    Object n(Object obj, Object obj2, Function1 function1);

    void q(Object obj, Function1 function1);

    boolean v(Throwable th);

    void w(I i8, Object obj);
}
