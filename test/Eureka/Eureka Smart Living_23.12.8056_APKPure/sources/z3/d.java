package z3;

import java.util.Set;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static Object a(e eVar, Class cls) {
        return eVar.g(e0.b(cls));
    }

    public static Object b(e eVar, e0 e0Var) {
        k4.b f6 = eVar.f(e0Var);
        if (f6 == null) {
            return null;
        }
        return f6.get();
    }

    public static k4.b c(e eVar, Class cls) {
        return eVar.f(e0.b(cls));
    }

    public static Set d(e eVar, Class cls) {
        return eVar.d(e0.b(cls));
    }

    public static Set e(e eVar, e0 e0Var) {
        return (Set) eVar.e(e0Var).get();
    }
}
