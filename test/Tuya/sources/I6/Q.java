package i6;

import L5.s;
import n6.C3496j;

/* loaded from: classes5.dex */
public abstract class Q {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(P5.d dVar) {
        Object b8;
        if (dVar instanceof C3496j) {
            return dVar.toString();
        }
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (L5.s.e(b8) != null) {
            b8 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b8;
    }
}
