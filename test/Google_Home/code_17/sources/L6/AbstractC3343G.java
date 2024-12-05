package l6;

import O5.s;
import kotlin.jvm.functions.Function1;

/* renamed from: l6.G */
/* loaded from: classes5.dex */
public abstract class AbstractC3343G {
    public static final Object a(Object obj, S5.d dVar) {
        if (obj instanceof C3339C) {
            s.a aVar = O5.s.f8302b;
            return O5.s.b(O5.t.a(((C3339C) obj).f34530a));
        }
        return O5.s.b(obj);
    }

    public static final Object b(Object obj, Function1 function1) {
        Throwable e8 = O5.s.e(obj);
        if (e8 == null) {
            if (function1 != null) {
                return new C3340D(obj, function1);
            }
            return obj;
        }
        return new C3339C(e8, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC3372o interfaceC3372o) {
        Throwable e8 = O5.s.e(obj);
        if (e8 != null) {
            return new C3339C(e8, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            function1 = null;
        }
        return b(obj, function1);
    }
}
