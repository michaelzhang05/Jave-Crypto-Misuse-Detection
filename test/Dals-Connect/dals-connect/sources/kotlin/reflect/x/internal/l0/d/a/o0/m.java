package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.n;
import kotlin.collections.n0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.ranges.f;
import kotlin.reflect.x.internal.l0.d.b.x;
import kotlin.reflect.x.internal.l0.i.u.e;
import kotlin.s;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes2.dex */
final class m {
    private final Map<String, k> a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* loaded from: classes2.dex */
    public final class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f20179b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.a.o0.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0298a {
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final List<Pair<String, q>> f20180b;

            /* renamed from: c, reason: collision with root package name */
            private Pair<String, q> f20181c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f20182d;

            public C0298a(a aVar, String str) {
                l.f(str, "functionName");
                this.f20182d = aVar;
                this.a = str;
                this.f20180b = new ArrayList();
                this.f20181c = s.a("V", null);
            }

            public final Pair<String, k> a() {
                int t;
                int t2;
                x xVar = x.a;
                String b2 = this.f20182d.b();
                String str = this.a;
                List<Pair<String, q>> list = this.f20180b;
                t = u.t(list, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String k2 = xVar.k(b2, xVar.j(str, arrayList, this.f20181c.c()));
                q d2 = this.f20181c.d();
                List<Pair<String, q>> list2 = this.f20180b;
                t2 = u.t(list2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((q) ((Pair) it2.next()).d());
                }
                return s.a(k2, new k(d2, arrayList2));
            }

            public final void b(String str, e... eVarArr) {
                Iterable<IndexedValue> k0;
                int t;
                int e2;
                int b2;
                q qVar;
                l.f(str, "type");
                l.f(eVarArr, "qualifiers");
                List<Pair<String, q>> list = this.f20180b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    k0 = n.k0(eVarArr);
                    t = u.t(k0, 10);
                    e2 = n0.e(t);
                    b2 = f.b(e2, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                    for (IndexedValue indexedValue : k0) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (e) indexedValue.d());
                    }
                    qVar = new q(linkedHashMap);
                }
                list.add(s.a(str, qVar));
            }

            public final void c(String str, e... eVarArr) {
                Iterable<IndexedValue> k0;
                int t;
                int e2;
                int b2;
                l.f(str, "type");
                l.f(eVarArr, "qualifiers");
                k0 = n.k0(eVarArr);
                t = u.t(k0, 10);
                e2 = n0.e(t);
                b2 = f.b(e2, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                for (IndexedValue indexedValue : k0) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (e) indexedValue.d());
                }
                this.f20181c = s.a(str, new q(linkedHashMap));
            }

            public final void d(e eVar) {
                l.f(eVar, "type");
                String n = eVar.n();
                l.e(n, "type.desc");
                this.f20181c = s.a(n, null);
            }
        }

        public a(m mVar, String str) {
            l.f(str, "className");
            this.f20179b = mVar;
            this.a = str;
        }

        public final void a(String str, Function1<? super C0298a, kotlin.u> function1) {
            l.f(str, "name");
            l.f(function1, "block");
            Map map = this.f20179b.a;
            C0298a c0298a = new C0298a(this, str);
            function1.invoke(c0298a);
            Pair<String, k> a = c0298a.a();
            map.put(a.c(), a.d());
        }

        public final String b() {
            return this.a;
        }
    }

    public final Map<String, k> b() {
        return this.a;
    }
}
