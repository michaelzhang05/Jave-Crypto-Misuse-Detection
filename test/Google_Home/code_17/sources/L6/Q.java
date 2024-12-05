package l6;

import O5.s;
import q6.C3875j;

/* loaded from: classes5.dex */
public abstract class Q {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(S5.d dVar) {
        Object b8;
        if (dVar instanceof C3875j) {
            return dVar.toString();
        }
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (O5.s.e(b8) != null) {
            b8 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b8;
    }
}
