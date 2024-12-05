package P5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class T extends S {
    public static Map b(Map builder) {
        AbstractC3255y.i(builder, "builder");
        return ((Q5.d) builder).m();
    }

    public static Map c() {
        return new Q5.d();
    }

    public static int d(int i8) {
        if (i8 >= 0) {
            if (i8 < 3) {
                return i8 + 1;
            }
            if (i8 < 1073741824) {
                return (int) ((i8 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i8;
    }

    public static Map e(O5.r pair) {
        AbstractC3255y.i(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.c(), pair.d());
        AbstractC3255y.h(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map f(Map map) {
        AbstractC3255y.i(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC3255y.h(singletonMap, "with(...)");
        return singletonMap;
    }

    public static SortedMap g(Map map, Comparator comparator) {
        AbstractC3255y.i(map, "<this>");
        AbstractC3255y.i(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
