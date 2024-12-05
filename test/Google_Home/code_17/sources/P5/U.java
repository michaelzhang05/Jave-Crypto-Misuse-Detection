package P5;

import i6.InterfaceC2998g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class U extends T {
    public static final Map A(O5.r[] rVarArr, Map destination) {
        AbstractC3255y.i(rVarArr, "<this>");
        AbstractC3255y.i(destination, "destination");
        Q.t(destination, rVarArr);
        return destination;
    }

    public static Map B(Map map) {
        AbstractC3255y.i(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map h() {
        H h8 = H.f8836a;
        AbstractC3255y.g(h8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return h8;
    }

    public static Object i(Map map, Object obj) {
        AbstractC3255y.i(map, "<this>");
        return S.a(map, obj);
    }

    public static HashMap j(O5.r... pairs) {
        AbstractC3255y.i(pairs, "pairs");
        HashMap hashMap = new HashMap(Q.d(pairs.length));
        Q.t(hashMap, pairs);
        return hashMap;
    }

    public static Map k(O5.r... pairs) {
        AbstractC3255y.i(pairs, "pairs");
        if (pairs.length > 0) {
            return A(pairs, new LinkedHashMap(Q.d(pairs.length)));
        }
        return Q.h();
    }

    public static Map l(Map map, Object obj) {
        AbstractC3255y.i(map, "<this>");
        Map B8 = Q.B(map);
        B8.remove(obj);
        return n(B8);
    }

    public static Map m(O5.r... pairs) {
        AbstractC3255y.i(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(pairs.length));
        Q.t(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        AbstractC3255y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return T.f(map);
            }
            return map;
        }
        return Q.h();
    }

    public static Map o(Map map, O5.r pair) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(pair, "pair");
        if (map.isEmpty()) {
            return Q.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static Map p(Map map, Iterable pairs) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(pairs, "pairs");
        if (map.isEmpty()) {
            return Q.w(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Q.s(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map q(Map map, Map map2) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void r(Map map, InterfaceC2998g pairs) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            O5.r rVar = (O5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void s(Map map, Iterable pairs) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            O5.r rVar = (O5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void t(Map map, O5.r[] pairs) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(pairs, "pairs");
        for (O5.r rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static Map u(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        return n(v(interfaceC2998g, new LinkedHashMap()));
    }

    public static final Map v(InterfaceC2998g interfaceC2998g, Map destination) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(destination, "destination");
        Q.r(destination, interfaceC2998g);
        return destination;
    }

    public static Map w(Iterable iterable) {
        Object next;
        AbstractC3255y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return x(iterable, new LinkedHashMap(Q.d(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return Q.e((O5.r) next);
            }
            return Q.h();
        }
        return n(x(iterable, new LinkedHashMap()));
    }

    public static final Map x(Iterable iterable, Map destination) {
        AbstractC3255y.i(iterable, "<this>");
        AbstractC3255y.i(destination, "destination");
        Q.s(destination, iterable);
        return destination;
    }

    public static Map y(Map map) {
        AbstractC3255y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Q.B(map);
            }
            return T.f(map);
        }
        return Q.h();
    }

    public static Map z(O5.r[] rVarArr) {
        AbstractC3255y.i(rVarArr, "<this>");
        int length = rVarArr.length;
        if (length != 0) {
            if (length != 1) {
                return A(rVarArr, new LinkedHashMap(Q.d(rVarArr.length)));
            }
            return Q.e(rVarArr[0]);
        }
        return Q.h();
    }
}
