package kotlin.reflect.x.internal.l0.d.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.s;

/* compiled from: BuiltinSpecialProperties.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<c, f> f19880b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<f, List<f>> f19881c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<c> f19882d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<f> f19883e;

    static {
        c d2;
        c d3;
        c c2;
        c c3;
        c d4;
        c c4;
        c c5;
        c c6;
        Map<c, f> l;
        int t;
        int e2;
        int t2;
        Set<f> C0;
        List K;
        d dVar = k.a.s;
        d2 = h.d(dVar, "name");
        d3 = h.d(dVar, "ordinal");
        c2 = h.c(k.a.U, "size");
        c cVar = k.a.Y;
        c3 = h.c(cVar, "size");
        d4 = h.d(k.a.f19715g, "length");
        c4 = h.c(cVar, "keys");
        c5 = h.c(cVar, "values");
        c6 = h.c(cVar, "entries");
        l = o0.l(s.a(d2, f.r("name")), s.a(d3, f.r("ordinal")), s.a(c2, f.r("size")), s.a(c3, f.r("size")), s.a(d4, f.r("length")), s.a(c4, f.r("keySet")), s.a(c5, f.r("values")), s.a(c6, f.r("entrySet")));
        f19880b = l;
        Set<Map.Entry<c, f>> entrySet = l.entrySet();
        t = u.t(entrySet, 10);
        ArrayList<Pair> arrayList = new ArrayList(t);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            f fVar = (f) pair.d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((f) pair.c());
        }
        e2 = n0.e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            K = b0.K((Iterable) entry2.getValue());
            linkedHashMap2.put(key, K);
        }
        f19881c = linkedHashMap2;
        Set<c> keySet = f19880b.keySet();
        f19882d = keySet;
        t2 = u.t(keySet, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((c) it2.next()).g());
        }
        C0 = b0.C0(arrayList2);
        f19883e = C0;
    }

    private g() {
    }

    public final Map<c, f> a() {
        return f19880b;
    }

    public final List<f> b(f fVar) {
        List<f> i2;
        l.f(fVar, "name1");
        List<f> list = f19881c.get(fVar);
        if (list != null) {
            return list;
        }
        i2 = t.i();
        return i2;
    }

    public final Set<c> c() {
        return f19882d;
    }

    public final Set<f> d() {
        return f19883e;
    }
}
