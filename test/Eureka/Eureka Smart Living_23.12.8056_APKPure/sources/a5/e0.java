package a5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e0 extends d0 {
    public static Map d() {
        y yVar = y.f79a;
        f5.h.c(yVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return yVar;
    }

    public static final Map e(Map map) {
        f5.h.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : d0.c(map) : b0.d();
    }

    public static final void f(Map map, Iterable iterable) {
        f5.h.e(map, "<this>");
        f5.h.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            z4.g gVar = (z4.g) it.next();
            map.put(gVar.a(), gVar.b());
        }
    }

    public static Map g(Iterable iterable) {
        f5.h.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return b0.d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(b0.a(collection.size())));
        }
        return d0.b((z4.g) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map h(Iterable iterable, Map map) {
        f5.h.e(iterable, "<this>");
        f5.h.e(map, "destination");
        f(map, iterable);
        return map;
    }

    public static Map i(Map map) {
        f5.h.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? j(map) : d0.c(map) : b0.d();
    }

    public static final Map j(Map map) {
        f5.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
