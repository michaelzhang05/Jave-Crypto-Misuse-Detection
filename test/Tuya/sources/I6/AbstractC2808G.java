package i6;

import L5.s;
import kotlin.jvm.functions.Function1;

/* renamed from: i6.G */
/* loaded from: classes5.dex */
public abstract class AbstractC2808G {
    public static final Object a(Object obj, P5.d dVar) {
        if (obj instanceof C2804C) {
            s.a aVar = L5.s.f6511b;
            return L5.s.b(L5.t.a(((C2804C) obj).f31678a));
        }
        return L5.s.b(obj);
    }

    public static final Object b(Object obj, InterfaceC2837o interfaceC2837o) {
        Throwable e8 = L5.s.e(obj);
        if (e8 != null) {
            return new C2804C(e8, false, 2, null);
        }
        return obj;
    }

    public static final Object c(Object obj, Function1 function1) {
        Throwable e8 = L5.s.e(obj);
        if (e8 == null) {
            if (function1 != null) {
                return new C2805D(obj, function1);
            }
            return obj;
        }
        return new C2804C(e8, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            function1 = null;
        }
        return c(obj, function1);
    }
}
