package kotlin.jvm.internal;

import L5.InterfaceC1223g;
import Y5.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class Z {
    public static Collection a(Object obj) {
        if ((obj instanceof Y5.a) && !(obj instanceof Y5.b)) {
            o(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof Y5.a) && !(obj instanceof Y5.c)) {
            o(obj, "kotlin.collections.MutableIterable");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof Y5.a) && !(obj instanceof Y5.d)) {
            o(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i8) {
        if (obj != null && !i(obj, i8)) {
            o(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static Iterable f(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof InterfaceC3154t) {
            return ((InterfaceC3154t) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof X5.n) {
            return 2;
        }
        if (obj instanceof X5.o) {
            return 3;
        }
        if (obj instanceof X5.p) {
            return 4;
        }
        if (obj instanceof X5.q) {
            return 5;
        }
        if (obj instanceof X5.r) {
            return 6;
        }
        if (obj instanceof X5.s) {
            return 7;
        }
        if (obj instanceof X5.t) {
            return 8;
        }
        if (obj instanceof X5.u) {
            return 9;
        }
        if (obj instanceof X5.a) {
            return 10;
        }
        if (obj instanceof X5.b) {
            return 11;
        }
        if (obj instanceof X5.d) {
            return 13;
        }
        if (obj instanceof X5.e) {
            return 14;
        }
        if (obj instanceof X5.f) {
            return 15;
        }
        if (obj instanceof X5.g) {
            return 16;
        }
        if (obj instanceof X5.h) {
            return 17;
        }
        if (obj instanceof X5.i) {
            return 18;
        }
        if (obj instanceof X5.j) {
            return 19;
        }
        if (obj instanceof X5.k) {
            return 20;
        }
        if (obj instanceof X5.l) {
            return 21;
        }
        return -1;
    }

    public static boolean i(Object obj, int i8) {
        if ((obj instanceof InterfaceC1223g) && h(obj) == i8) {
            return true;
        }
        return false;
    }

    public static boolean j(Object obj) {
        if ((obj instanceof Map) && (!(obj instanceof Y5.a) || (obj instanceof Y5.d))) {
            return true;
        }
        return false;
    }

    public static boolean k(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof Y5.a) || (obj instanceof d.a))) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof Y5.a) || (obj instanceof Y5.e))) {
            return true;
        }
        return false;
    }

    private static Throwable m(Throwable th) {
        return AbstractC3159y.p(th, Z.class.getName());
    }

    public static ClassCastException n(ClassCastException classCastException) {
        throw ((ClassCastException) m(classCastException));
    }

    public static void o(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        p(name + " cannot be cast to " + str);
    }

    public static void p(String str) {
        throw n(new ClassCastException(str));
    }
}
