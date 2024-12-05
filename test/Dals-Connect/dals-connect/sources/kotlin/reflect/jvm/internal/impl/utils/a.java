package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.l;

/* compiled from: collections.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final <T> void a(Collection<T> collection, T t) {
        l.f(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    private static final int b(int i2) {
        if (i2 < 3) {
            return 3;
        }
        return i2 + (i2 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        List<T> i2;
        List<T> e2;
        l.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            i2 = t.i();
            return i2;
        }
        if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        }
        e2 = s.e(r.R(arrayList));
        return e2;
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        l.f(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i2) {
        return new HashMap<>(b(i2));
    }

    public static final <E> HashSet<E> f(int i2) {
        return new HashSet<>(b(i2));
    }

    public static final <E> LinkedHashSet<E> g(int i2) {
        return new LinkedHashSet<>(b(i2));
    }
}
