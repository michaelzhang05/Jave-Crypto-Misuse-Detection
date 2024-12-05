package l6;

import kotlin.jvm.functions.Function1;

/* renamed from: l6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3372o extends S5.d {

    /* renamed from: l6.o$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC3372o interfaceC3372o, Throwable th, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    th = null;
                }
                return interfaceC3372o.t(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void B(Object obj);

    boolean b();

    void h(I i8, Object obj);

    void i(Function1 function1);

    boolean isActive();

    Object j(Throwable th);

    Object k(Object obj, Object obj2, Function1 function1);

    void r(Object obj, Function1 function1);

    boolean t(Throwable th);
}
