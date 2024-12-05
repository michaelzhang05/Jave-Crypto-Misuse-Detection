package kotlin.reflect.x.internal.l0.f;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.ranges.f;
import kotlin.s;

/* compiled from: StandardClassIds.kt */
/* loaded from: classes2.dex */
public final class j {
    private static final c a;

    /* renamed from: b, reason: collision with root package name */
    private static final c f20745b;

    static {
        c cVar = new c("java.lang");
        a = cVar;
        c c2 = cVar.c(f.r("annotation"));
        l.e(c2, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f20745b = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b j(String str) {
        return new b(i.a.b(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        return new b(i.a.e(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        return new b(i.a.c(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        return new b(i.a.d(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> n(Map<K, ? extends V> map) {
        int t;
        int e2;
        int b2;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        t = u.t(entrySet, 10);
        e2 = n0.e(t);
        b2 = f.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a2 = s.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(f fVar) {
        i iVar = i.a;
        return new b(iVar.a().h(), f.r(fVar.n() + iVar.a().j().n()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b p(String str) {
        return new b(i.a.f(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(String str) {
        return new b(i.a.g(), f.r(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(b bVar) {
        return new b(i.a.e(), f.r('U' + bVar.j().n()));
    }
}
