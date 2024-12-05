package b4;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import f6.AbstractC2683j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Z;
import m4.G;
import m4.P;
import r4.C3688a;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14622a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0361a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0361a f14623a = new C0361a();

            C0361a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(g6.h it) {
                AbstractC3159y.i(it, "it");
                return it.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f14624a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String it) {
                AbstractC3159y.i(it, "it");
                return Boolean.valueOf(it.length() == 0);
            }
        }

        private a() {
        }

        private final com.stripe.android.model.a b(Map map) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            a.C0498a c0498a = new a.C0498a();
            G.b bVar = G.Companion;
            C3688a c3688a = (C3688a) map.get(bVar.p());
            String str6 = null;
            if (c3688a != null) {
                str = c3688a.c();
            } else {
                str = null;
            }
            c0498a.e(str);
            C3688a c3688a2 = (C3688a) map.get(bVar.q());
            if (c3688a2 != null) {
                str2 = c3688a2.c();
            } else {
                str2 = null;
            }
            c0498a.f(str2);
            C3688a c3688a3 = (C3688a) map.get(bVar.k());
            if (c3688a3 != null) {
                str3 = c3688a3.c();
            } else {
                str3 = null;
            }
            c0498a.b(str3);
            C3688a c3688a4 = (C3688a) map.get(bVar.z());
            if (c3688a4 != null) {
                str4 = c3688a4.c();
            } else {
                str4 = null;
            }
            c0498a.h(str4);
            C3688a c3688a5 = (C3688a) map.get(bVar.l());
            if (c3688a5 != null) {
                str5 = c3688a5.c();
            } else {
                str5 = null;
            }
            c0498a.c(str5);
            C3688a c3688a6 = (C3688a) map.get(bVar.u());
            if (c3688a6 != null) {
                str6 = c3688a6.c();
            }
            c0498a.g(str6);
            return c0498a.a();
        }

        private final o.e c(Map map) {
            String str;
            String str2;
            String str3;
            o.e.a aVar = new o.e.a();
            G.b bVar = G.Companion;
            C3688a c3688a = (C3688a) map.get(bVar.r());
            if (c3688a != null) {
                str = c3688a.c();
            } else {
                str = null;
            }
            aVar.d(str);
            C3688a c3688a2 = (C3688a) map.get(bVar.n());
            if (c3688a2 != null) {
                str2 = c3688a2.c();
            } else {
                str2 = null;
            }
            aVar.c(str2);
            C3688a c3688a3 = (C3688a) map.get(bVar.t());
            if (c3688a3 != null) {
                str3 = c3688a3.c();
            } else {
                str3 = null;
            }
            aVar.e(str3);
            aVar.b(b(map));
            o.e a8 = aVar.a();
            if (!a8.b()) {
                return null;
            }
            return a8;
        }

        private final void d(String str, Map map, Map map2) {
            a(map, AbstractC1246t.e("type"), str);
            for (Map.Entry entry : map2.entrySet()) {
                a aVar = g.f14622a;
                aVar.a(map, aVar.e((String) entry.getKey()), (String) entry.getValue());
            }
        }

        private final Map f(Map map, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!((G) entry.getKey()).i0()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(Q.d(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((C3688a) entry2.getValue()).c());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(Q.d(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(((G) entry3.getKey()).j0(), entry3.getValue());
            }
            d(str, linkedHashMap, linkedHashMap4);
            return linkedHashMap;
        }

        public final void a(Map map, List keys, String str) {
            Map map2;
            AbstractC3159y.i(map, "map");
            AbstractC3159y.i(keys, "keys");
            if (!keys.isEmpty()) {
                String str2 = (String) keys.get(0);
                if (keys.size() == 1) {
                    map.put(str2, str);
                    return;
                }
                Object obj = map.get(str2);
                if (Z.j(obj)) {
                    map2 = (Map) obj;
                } else {
                    map2 = null;
                }
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    map.put(str2, map2);
                }
                a(map2, keys.subList(1, keys.size()), str);
            }
        }

        public final List e(String string) {
            AbstractC3159y.i(string, "string");
            return AbstractC2683j.D(AbstractC2683j.p(AbstractC2683j.g(AbstractC2683j.y(g6.j.d(new g6.j("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), C0361a.f14623a)), b.f14624a));
        }

        public final com.stripe.android.model.p g(Map fieldValuePairs, String code, boolean z8, o.b bVar) {
            Map b8;
            AbstractC3159y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3159y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f35187a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                G.b bVar2 = G.Companion;
                if (!AbstractC3159y.d(key, bVar2.x()) && !AbstractC3159y.d(entry2.getKey(), bVar2.f())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            b8 = h.b(f(linkedHashMap2, code));
            return com.stripe.android.model.p.f24581u.o(code, g.f14622a.c(linkedHashMap2), z8, Q.y(b8), a0.d("PaymentSheet"), bVar);
        }

        public final q h(Map fieldValuePairs, String code) {
            String c8;
            AbstractC3159y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3159y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.b.f35191a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            boolean d8 = AbstractC3159y.d(code, o.p.f24538o.f24550a);
            Boolean bool = null;
            if (!d8) {
                return null;
            }
            C3688a c3688a = (C3688a) linkedHashMap.get(G.Companion.c());
            if (c3688a != null && (c8 = c3688a.c()) != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(c8));
            }
            return new q.a(bool);
        }

        public final r i(Map fieldValuePairs, String code) {
            String str;
            String str2;
            AbstractC3159y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3159y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f35188b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (AbstractC3159y.d(code, o.p.f24509B.f24550a)) {
                C3688a c3688a = (C3688a) linkedHashMap.get(G.Companion.e());
                if (c3688a != null) {
                    str2 = c3688a.c();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return new r.a(str2);
            }
            if (AbstractC3159y.d(code, o.p.f24525R.f24550a)) {
                C3688a c3688a2 = (C3688a) linkedHashMap.get(G.Companion.o());
                if (c3688a2 != null) {
                    str = c3688a2.c();
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                return new r.c(str);
            }
            if (!AbstractC3159y.d(code, o.p.f24510C.f24550a)) {
                return null;
            }
            return r.f.f24675c;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
