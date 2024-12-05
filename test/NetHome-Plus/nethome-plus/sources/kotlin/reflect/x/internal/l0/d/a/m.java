package kotlin.reflect.x.internal.l0.d.a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.i;
import kotlin.s;

/* compiled from: FakePureImplementationsProvider.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final m a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<b, b> f20104b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<c, c> f20105c;

    static {
        Map<c, c> q;
        m mVar = new m();
        a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f20104b = linkedHashMap;
        i iVar = i.a;
        mVar.c(iVar.j(), mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(iVar.l(), mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(iVar.k(), mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b m = b.m(new c("java.util.function.Function"));
        l.e(m, "topLevel(FqName(\"java.util.function.Function\"))");
        mVar.c(m, mVar.a("java.util.function.UnaryOperator"));
        b m2 = b.m(new c("java.util.function.BiFunction"));
        l.e(m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        mVar.c(m2, mVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(s.a(((b) entry.getKey()).b(), ((b) entry.getValue()).b()));
        }
        q = o0.q(arrayList);
        f20105c = q;
    }

    private m() {
    }

    private final List<b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b.m(new c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(b bVar, List<b> list) {
        Map<b, b> map = f20104b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final c b(c cVar) {
        l.f(cVar, "classFqName");
        return f20105c.get(cVar);
    }
}
