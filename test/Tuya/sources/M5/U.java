package M5;

import f6.InterfaceC2680g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class U extends T {
    public static final Map A(L5.r[] rVarArr, Map destination) {
        AbstractC3159y.i(rVarArr, "<this>");
        AbstractC3159y.i(destination, "destination");
        Q.t(destination, rVarArr);
        return destination;
    }

    public static Map B(Map map) {
        AbstractC3159y.i(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map h() {
        H h8 = H.f7012a;
        AbstractC3159y.g(h8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return h8;
    }

    public static Object i(Map map, Object obj) {
        AbstractC3159y.i(map, "<this>");
        return S.a(map, obj);
    }

    public static HashMap j(L5.r... pairs) {
        AbstractC3159y.i(pairs, "pairs");
        HashMap hashMap = new HashMap(Q.d(pairs.length));
        Q.t(hashMap, pairs);
        return hashMap;
    }

    public static Map k(L5.r... pairs) {
        AbstractC3159y.i(pairs, "pairs");
        if (pairs.length > 0) {
            return A(pairs, new LinkedHashMap(Q.d(pairs.length)));
        }
        return Q.h();
    }

    public static Map l(Map map, Object obj) {
        AbstractC3159y.i(map, "<this>");
        Map B8 = Q.B(map);
        B8.remove(obj);
        return n(B8);
    }

    public static Map m(L5.r... pairs) {
        AbstractC3159y.i(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(pairs.length));
        Q.t(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        AbstractC3159y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return T.f(map);
            }
            return map;
        }
        return Q.h();
    }

    public static Map o(Map map, L5.r pair) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(pair, "pair");
        if (map.isEmpty()) {
            return Q.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static Map p(Map map, Iterable pairs) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(pairs, "pairs");
        if (map.isEmpty()) {
            return Q.w(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Q.s(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map q(Map map, Map map2) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void r(Map map, InterfaceC2680g pairs) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            L5.r rVar = (L5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void s(Map map, Iterable pairs) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            L5.r rVar = (L5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void t(Map map, L5.r[] pairs) {
        AbstractC3159y.i(map, "<this>");
        AbstractC3159y.i(pairs, "pairs");
        for (L5.r rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static Map u(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        return n(v(interfaceC2680g, new LinkedHashMap()));
    }

    public static final Map v(InterfaceC2680g interfaceC2680g, Map destination) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(destination, "destination");
        Q.r(destination, interfaceC2680g);
        return destination;
    }

    public static Map w(Iterable iterable) {
        Object next;
        AbstractC3159y.i(iterable, "<this>");
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
                return Q.e((L5.r) next);
            }
            return Q.h();
        }
        return n(x(iterable, new LinkedHashMap()));
    }

    public static final Map x(Iterable iterable, Map destination) {
        AbstractC3159y.i(iterable, "<this>");
        AbstractC3159y.i(destination, "destination");
        Q.s(destination, iterable);
        return destination;
    }

    public static Map y(Map map) {
        AbstractC3159y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Q.B(map);
            }
            return T.f(map);
        }
        return Q.h();
    }

    public static Map z(L5.r[] rVarArr) {
        AbstractC3159y.i(rVarArr, "<this>");
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
