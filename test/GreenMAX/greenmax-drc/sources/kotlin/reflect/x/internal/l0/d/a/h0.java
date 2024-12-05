package kotlin.reflect.x.internal.l0.d.a;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.l0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.collections.u0;
import kotlin.collections.v0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.b.x;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.u.e;
import kotlin.s;
import okhttp3.HttpUrl;

/* compiled from: SpecialGenericSignatures.kt */
/* loaded from: classes2.dex */
public class h0 {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List<a.C0286a> f19887b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f19888c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f19889d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<a.C0286a, c> f19890e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, c> f19891f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<f> f19892g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f19893h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.C0286a f19894i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<a.C0286a, f> f19895j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, f> f19896k;
    private static final List<f> l;
    private static final Map<f, f> m;

    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.a.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0286a {
            private final f a;

            /* renamed from: b, reason: collision with root package name */
            private final String f19897b;

            public C0286a(f fVar, String str) {
                l.f(fVar, "name");
                l.f(str, RoomInstalled.SIGNATURE);
                this.a = fVar;
                this.f19897b = str;
            }

            public final f a() {
                return this.a;
            }

            public final String b() {
                return this.f19897b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0286a)) {
                    return false;
                }
                C0286a c0286a = (C0286a) obj;
                return l.a(this.a, c0286a.a) && l.a(this.f19897b, c0286a.f19897b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.f19897b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.a + ", signature=" + this.f19897b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0286a m(String str, String str2, String str3, String str4) {
            f r = f.r(str2);
            l.e(r, "identifier(name)");
            return new C0286a(r, x.a.k(str, str2 + '(' + str3 + ')' + str4));
        }

        public final f b(f fVar) {
            l.f(fVar, "name");
            return f().get(fVar);
        }

        public final List<String> c() {
            return h0.f19888c;
        }

        public final Set<f> d() {
            return h0.f19892g;
        }

        public final Set<String> e() {
            return h0.f19893h;
        }

        public final Map<f, f> f() {
            return h0.m;
        }

        public final List<f> g() {
            return h0.l;
        }

        public final C0286a h() {
            return h0.f19894i;
        }

        public final Map<String, c> i() {
            return h0.f19891f;
        }

        public final Map<String, f> j() {
            return h0.f19896k;
        }

        public final boolean k(f fVar) {
            l.f(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String str) {
            l.f(str, "builtinSignature");
            if (c().contains(str)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            if (((c) l0.j(i(), str)) == c.f19904f) {
                return b.OBJECT_PARAMETER_GENERIC;
            }
            return b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes2.dex */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* renamed from: j, reason: collision with root package name */
        private final String f19902j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f19903k;

        b(String str, boolean z) {
            this.f19902j = str;
            this.f19903k = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: f, reason: collision with root package name */
        public static final c f19904f = new c("NULL", 0, null);

        /* renamed from: g, reason: collision with root package name */
        public static final c f19905g = new c("INDEX", 1, -1);

        /* renamed from: h, reason: collision with root package name */
        public static final c f19906h = new c("FALSE", 2, Boolean.FALSE);

        /* renamed from: i, reason: collision with root package name */
        public static final c f19907i = new a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f19908j = d();

        /* renamed from: k, reason: collision with root package name */
        private final Object f19909k;

        /* compiled from: SpecialGenericSignatures.kt */
        /* loaded from: classes2.dex */
        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            a(java.lang.String r2, int r3) {
                /*
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.d.a.h0.c.a.<init>(java.lang.String, int):void");
            }
        }

        private c(String str, int i2, Object obj) {
            this.f19909k = obj;
        }

        public /* synthetic */ c(String str, int i2, Object obj, g gVar) {
            this(str, i2, obj);
        }

        private static final /* synthetic */ c[] d() {
            return new c[]{f19904f, f19905g, f19906h, f19907i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f19908j.clone();
        }
    }

    static {
        Set<String> g2;
        int t;
        int t2;
        int t3;
        Map<a.C0286a, c> l2;
        int e2;
        Set j2;
        int t4;
        Set<f> C0;
        int t5;
        Set<String> C02;
        Map<a.C0286a, f> l3;
        int e3;
        int t6;
        int t7;
        int t8;
        int e4;
        int b2;
        g2 = u0.g("containsAll", "removeAll", "retainAll");
        t = u.t(g2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (String str : g2) {
            a aVar = a;
            String n = e.BOOLEAN.n();
            l.e(n, "BOOLEAN.desc");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", n));
        }
        f19887b = arrayList;
        t2 = u.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0286a) it.next()).b());
        }
        f19888c = arrayList2;
        List<a.C0286a> list = f19887b;
        t3 = u.t(list, 10);
        ArrayList arrayList3 = new ArrayList(t3);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C0286a) it2.next()).a().f());
        }
        f19889d = arrayList3;
        x xVar = x.a;
        a aVar2 = a;
        String i2 = xVar.i("Collection");
        e eVar = e.BOOLEAN;
        String n2 = eVar.n();
        l.e(n2, "BOOLEAN.desc");
        a.C0286a m2 = aVar2.m(i2, "contains", "Ljava/lang/Object;", n2);
        c cVar = c.f19906h;
        String i3 = xVar.i("Collection");
        String n3 = eVar.n();
        l.e(n3, "BOOLEAN.desc");
        String i4 = xVar.i("Map");
        String n4 = eVar.n();
        l.e(n4, "BOOLEAN.desc");
        String i5 = xVar.i("Map");
        String n5 = eVar.n();
        l.e(n5, "BOOLEAN.desc");
        String i6 = xVar.i("Map");
        String n6 = eVar.n();
        l.e(n6, "BOOLEAN.desc");
        a.C0286a m3 = aVar2.m(xVar.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f19904f;
        String i7 = xVar.i("List");
        e eVar2 = e.INT;
        String n7 = eVar2.n();
        l.e(n7, "INT.desc");
        a.C0286a m4 = aVar2.m(i7, "indexOf", "Ljava/lang/Object;", n7);
        c cVar3 = c.f19905g;
        String i8 = xVar.i("List");
        String n8 = eVar2.n();
        l.e(n8, "INT.desc");
        l2 = o0.l(s.a(m2, cVar), s.a(aVar2.m(i3, "remove", "Ljava/lang/Object;", n3), cVar), s.a(aVar2.m(i4, "containsKey", "Ljava/lang/Object;", n4), cVar), s.a(aVar2.m(i5, "containsValue", "Ljava/lang/Object;", n5), cVar), s.a(aVar2.m(i6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", n6), cVar), s.a(aVar2.m(xVar.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f19907i), s.a(m3, cVar2), s.a(aVar2.m(xVar.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), s.a(m4, cVar3), s.a(aVar2.m(i8, "lastIndexOf", "Ljava/lang/Object;", n8), cVar3));
        f19890e = l2;
        e2 = n0.e(l2.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator<T> it3 = l2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0286a) entry.getKey()).b(), entry.getValue());
        }
        f19891f = linkedHashMap;
        j2 = v0.j(f19890e.keySet(), f19887b);
        t4 = u.t(j2, 10);
        ArrayList arrayList4 = new ArrayList(t4);
        Iterator it4 = j2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a.C0286a) it4.next()).a());
        }
        C0 = b0.C0(arrayList4);
        f19892g = C0;
        t5 = u.t(j2, 10);
        ArrayList arrayList5 = new ArrayList(t5);
        Iterator it5 = j2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((a.C0286a) it5.next()).b());
        }
        C02 = b0.C0(arrayList5);
        f19893h = C02;
        a aVar3 = a;
        e eVar3 = e.INT;
        String n9 = eVar3.n();
        l.e(n9, "INT.desc");
        a.C0286a m5 = aVar3.m("java/util/List", "removeAt", n9, "Ljava/lang/Object;");
        f19894i = m5;
        x xVar2 = x.a;
        String h2 = xVar2.h("Number");
        String n10 = e.BYTE.n();
        l.e(n10, "BYTE.desc");
        String h3 = xVar2.h("Number");
        String n11 = e.SHORT.n();
        l.e(n11, "SHORT.desc");
        String h4 = xVar2.h("Number");
        String n12 = eVar3.n();
        l.e(n12, "INT.desc");
        String h5 = xVar2.h("Number");
        String n13 = e.LONG.n();
        l.e(n13, "LONG.desc");
        String h6 = xVar2.h("Number");
        String n14 = e.FLOAT.n();
        l.e(n14, "FLOAT.desc");
        String h7 = xVar2.h("Number");
        String n15 = e.DOUBLE.n();
        l.e(n15, "DOUBLE.desc");
        String h8 = xVar2.h("CharSequence");
        String n16 = eVar3.n();
        l.e(n16, "INT.desc");
        String n17 = e.CHAR.n();
        l.e(n17, "CHAR.desc");
        l3 = o0.l(s.a(aVar3.m(h2, "toByte", HttpUrl.FRAGMENT_ENCODE_SET, n10), f.r("byteValue")), s.a(aVar3.m(h3, "toShort", HttpUrl.FRAGMENT_ENCODE_SET, n11), f.r("shortValue")), s.a(aVar3.m(h4, "toInt", HttpUrl.FRAGMENT_ENCODE_SET, n12), f.r("intValue")), s.a(aVar3.m(h5, "toLong", HttpUrl.FRAGMENT_ENCODE_SET, n13), f.r("longValue")), s.a(aVar3.m(h6, "toFloat", HttpUrl.FRAGMENT_ENCODE_SET, n14), f.r("floatValue")), s.a(aVar3.m(h7, "toDouble", HttpUrl.FRAGMENT_ENCODE_SET, n15), f.r("doubleValue")), s.a(m5, f.r("remove")), s.a(aVar3.m(h8, "get", n16, n17), f.r("charAt")));
        f19895j = l3;
        e3 = n0.e(l3.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3);
        Iterator<T> it6 = l3.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C0286a) entry2.getKey()).b(), entry2.getValue());
        }
        f19896k = linkedHashMap2;
        Set<a.C0286a> keySet = f19895j.keySet();
        t6 = u.t(keySet, 10);
        ArrayList arrayList6 = new ArrayList(t6);
        Iterator<T> it7 = keySet.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((a.C0286a) it7.next()).a());
        }
        l = arrayList6;
        Set<Map.Entry<a.C0286a, f>> entrySet = f19895j.entrySet();
        t7 = u.t(entrySet, 10);
        ArrayList<Pair> arrayList7 = new ArrayList(t7);
        Iterator<T> it8 = entrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((a.C0286a) entry3.getKey()).a(), entry3.getValue()));
        }
        t8 = u.t(arrayList7, 10);
        e4 = n0.e(t8);
        b2 = kotlin.ranges.f.b(e4, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(b2);
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((f) pair.d(), (f) pair.c());
        }
        m = linkedHashMap3;
    }
}
