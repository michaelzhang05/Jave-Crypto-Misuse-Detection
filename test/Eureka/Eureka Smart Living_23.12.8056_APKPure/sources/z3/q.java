package z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final z3.c f10028a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f10029b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f10030c = new HashSet();

        b(z3.c cVar) {
            this.f10028a = cVar;
        }

        void a(b bVar) {
            this.f10029b.add(bVar);
        }

        void b(b bVar) {
            this.f10030c.add(bVar);
        }

        z3.c c() {
            return this.f10028a;
        }

        Set d() {
            return this.f10029b;
        }

        boolean e() {
            return this.f10029b.isEmpty();
        }

        boolean f() {
            return this.f10030c.isEmpty();
        }

        void g(b bVar) {
            this.f10030c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f10031a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10032b;

        private c(e0 e0Var, boolean z5) {
            this.f10031a = e0Var;
            this.f10032b = z5;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f10031a.equals(this.f10031a) && cVar.f10032b == this.f10032b;
        }

        public int hashCode() {
            return ((this.f10031a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10032b).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List list) {
        Set<b> c6 = c(list);
        Set b6 = b(c6);
        int i6 = 0;
        while (!b6.isEmpty()) {
            b bVar = (b) b6.iterator().next();
            b6.remove(bVar);
            i6++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b6.add(bVar2);
                }
            }
        }
        if (i6 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c6) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.d() && (set = (Set) hashMap.get(new c(rVar.b(), rVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            z3.c cVar = (z3.c) it.next();
            b bVar3 = new b(cVar);
            for (e0 e0Var : cVar.j()) {
                c cVar2 = new c(e0Var, !cVar.p());
                if (!hashMap.containsKey(cVar2)) {
                    hashMap.put(cVar2, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f10032b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
