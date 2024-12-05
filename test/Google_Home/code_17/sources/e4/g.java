package e4;

import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import i6.AbstractC3001j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Z;
import p4.G;
import p4.P;
import u4.C4061a;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31628a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0729a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0729a f31629a = new C0729a();

            C0729a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(j6.h it) {
                AbstractC3255y.i(it, "it");
                return it.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f31630a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String it) {
                AbstractC3255y.i(it, "it");
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
            a.C0494a c0494a = new a.C0494a();
            G.b bVar = G.Companion;
            C4061a c4061a = (C4061a) map.get(bVar.p());
            String str6 = null;
            if (c4061a != null) {
                str = c4061a.c();
            } else {
                str = null;
            }
            c0494a.e(str);
            C4061a c4061a2 = (C4061a) map.get(bVar.q());
            if (c4061a2 != null) {
                str2 = c4061a2.c();
            } else {
                str2 = null;
            }
            c0494a.f(str2);
            C4061a c4061a3 = (C4061a) map.get(bVar.k());
            if (c4061a3 != null) {
                str3 = c4061a3.c();
            } else {
                str3 = null;
            }
            c0494a.b(str3);
            C4061a c4061a4 = (C4061a) map.get(bVar.z());
            if (c4061a4 != null) {
                str4 = c4061a4.c();
            } else {
                str4 = null;
            }
            c0494a.h(str4);
            C4061a c4061a5 = (C4061a) map.get(bVar.l());
            if (c4061a5 != null) {
                str5 = c4061a5.c();
            } else {
                str5 = null;
            }
            c0494a.c(str5);
            C4061a c4061a6 = (C4061a) map.get(bVar.u());
            if (c4061a6 != null) {
                str6 = c4061a6.c();
            }
            c0494a.g(str6);
            return c0494a.a();
        }

        private final o.e c(Map map) {
            String str;
            String str2;
            String str3;
            o.e.a aVar = new o.e.a();
            G.b bVar = G.Companion;
            C4061a c4061a = (C4061a) map.get(bVar.r());
            if (c4061a != null) {
                str = c4061a.c();
            } else {
                str = null;
            }
            aVar.d(str);
            C4061a c4061a2 = (C4061a) map.get(bVar.n());
            if (c4061a2 != null) {
                str2 = c4061a2.c();
            } else {
                str2 = null;
            }
            aVar.c(str2);
            C4061a c4061a3 = (C4061a) map.get(bVar.t());
            if (c4061a3 != null) {
                str3 = c4061a3.c();
            } else {
                str3 = null;
            }
            aVar.e(str3);
            aVar.b(b(map));
            o.e a8 = aVar.a();
            if (!a8.a()) {
                return null;
            }
            return a8;
        }

        private final void d(String str, Map map, Map map2) {
            a(map, AbstractC1378t.e("type"), str);
            for (Map.Entry entry : map2.entrySet()) {
                a aVar = g.f31628a;
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
                linkedHashMap3.put(entry2.getKey(), ((C4061a) entry2.getValue()).c());
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
            AbstractC3255y.i(map, "map");
            AbstractC3255y.i(keys, "keys");
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
            AbstractC3255y.i(string, "string");
            return AbstractC3001j.D(AbstractC3001j.p(AbstractC3001j.g(AbstractC3001j.y(j6.j.d(new j6.j("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), C0729a.f31629a)), b.f31630a));
        }

        public final com.stripe.android.model.p g(Map fieldValuePairs, String code, boolean z8, o.b bVar) {
            Map b8;
            AbstractC3255y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3255y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f37213a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                G.b bVar2 = G.Companion;
                if (!AbstractC3255y.d(key, bVar2.x()) && !AbstractC3255y.d(entry2.getKey(), bVar2.f())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            b8 = h.b(f(linkedHashMap2, code));
            return com.stripe.android.model.p.f25636u.o(code, g.f31628a.c(linkedHashMap2), z8, Q.y(b8), a0.d("PaymentSheet"), bVar);
        }

        public final q h(Map fieldValuePairs, String code) {
            String c8;
            AbstractC3255y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3255y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.b.f37217a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            boolean d8 = AbstractC3255y.d(code, o.p.f25593o.f25605a);
            Boolean bool = null;
            if (!d8) {
                return null;
            }
            C4061a c4061a = (C4061a) linkedHashMap.get(G.Companion.c());
            if (c4061a != null && (c8 = c4061a.c()) != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(c8));
            }
            return new q.a(bool);
        }

        public final r i(Map fieldValuePairs, String code) {
            String str;
            String str2;
            AbstractC3255y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3255y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f37214b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (AbstractC3255y.d(code, o.p.f25564B.f25605a)) {
                C4061a c4061a = (C4061a) linkedHashMap.get(G.Companion.e());
                if (c4061a != null) {
                    str2 = c4061a.c();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return new r.a(str2);
            }
            if (AbstractC3255y.d(code, o.p.f25580R.f25605a)) {
                C4061a c4061a2 = (C4061a) linkedHashMap.get(G.Companion.o());
                if (c4061a2 != null) {
                    str = c4061a2.c();
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                return new r.c(str);
            }
            if (!AbstractC3255y.d(code, o.p.f25565C.f25605a)) {
                return null;
            }
            return r.f.f25730c;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
