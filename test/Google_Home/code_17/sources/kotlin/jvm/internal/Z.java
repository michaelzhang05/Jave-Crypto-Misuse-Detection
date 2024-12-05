package kotlin.jvm.internal;

import O5.InterfaceC1351g;
import a6.InterfaceC1655a;
import a6.InterfaceC1656b;
import a6.InterfaceC1658d;
import a6.InterfaceC1659e;
import a6.InterfaceC1660f;
import a6.InterfaceC1661g;
import a6.InterfaceC1662h;
import a6.InterfaceC1663i;
import a6.InterfaceC1664j;
import a6.InterfaceC1665k;
import a6.InterfaceC1666l;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import a6.InterfaceC1671q;
import a6.InterfaceC1672r;
import a6.InterfaceC1673s;
import a6.InterfaceC1674t;
import a6.InterfaceC1675u;
import b6.InterfaceC1985a;
import b6.InterfaceC1986b;
import b6.InterfaceC1987c;
import b6.InterfaceC1988d;
import b6.InterfaceC1989e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class Z {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC1985a) && !(obj instanceof InterfaceC1986b)) {
            o(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC1985a) && !(obj instanceof InterfaceC1987c)) {
            o(obj, "kotlin.collections.MutableIterable");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC1985a) && !(obj instanceof InterfaceC1988d)) {
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
        if (obj instanceof InterfaceC3250t) {
            return ((InterfaceC3250t) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof InterfaceC1668n) {
            return 2;
        }
        if (obj instanceof InterfaceC1669o) {
            return 3;
        }
        if (obj instanceof InterfaceC1670p) {
            return 4;
        }
        if (obj instanceof InterfaceC1671q) {
            return 5;
        }
        if (obj instanceof InterfaceC1672r) {
            return 6;
        }
        if (obj instanceof InterfaceC1673s) {
            return 7;
        }
        if (obj instanceof InterfaceC1674t) {
            return 8;
        }
        if (obj instanceof InterfaceC1675u) {
            return 9;
        }
        if (obj instanceof InterfaceC1655a) {
            return 10;
        }
        if (obj instanceof InterfaceC1656b) {
            return 11;
        }
        if (obj instanceof InterfaceC1658d) {
            return 13;
        }
        if (obj instanceof InterfaceC1659e) {
            return 14;
        }
        if (obj instanceof InterfaceC1660f) {
            return 15;
        }
        if (obj instanceof InterfaceC1661g) {
            return 16;
        }
        if (obj instanceof InterfaceC1662h) {
            return 17;
        }
        if (obj instanceof InterfaceC1663i) {
            return 18;
        }
        if (obj instanceof InterfaceC1664j) {
            return 19;
        }
        if (obj instanceof InterfaceC1665k) {
            return 20;
        }
        if (obj instanceof InterfaceC1666l) {
            return 21;
        }
        return -1;
    }

    public static boolean i(Object obj, int i8) {
        if ((obj instanceof InterfaceC1351g) && h(obj) == i8) {
            return true;
        }
        return false;
    }

    public static boolean j(Object obj) {
        if ((obj instanceof Map) && (!(obj instanceof InterfaceC1985a) || (obj instanceof InterfaceC1988d))) {
            return true;
        }
        return false;
    }

    public static boolean k(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC1985a) || (obj instanceof InterfaceC1988d.a))) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof InterfaceC1985a) || (obj instanceof InterfaceC1989e))) {
            return true;
        }
        return false;
    }

    private static Throwable m(Throwable th) {
        return AbstractC3255y.p(th, Z.class.getName());
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
