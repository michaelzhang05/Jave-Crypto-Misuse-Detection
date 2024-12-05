package f5;

import a5.d0;
import a5.e0;
import a5.n;
import e5.l;
import e5.m;
import e5.o;
import e5.p;
import e5.q;
import e5.r;
import e5.s;
import e5.t;
import e5.u;
import e5.v;
import e5.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements h5.a, c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6611b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f6612c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f6613d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f6614e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f6615f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f6616g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f6617a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    static {
        List f6;
        int h6;
        Map g6;
        int a6;
        String m6;
        String m7;
        int i6 = 0;
        f6 = n.f(e5.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, e5.b.class, e5.c.class, e5.d.class, e5.e.class, e5.f.class, e5.g.class, e5.h.class, e5.i.class, e5.j.class, e5.k.class, m.class, e5.n.class, o.class);
        h6 = a5.o.h(f6, 10);
        ArrayList arrayList = new ArrayList(h6);
        for (Object obj : f6) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                n.g();
            }
            arrayList.add(z4.i.a((Class) obj, Integer.valueOf(i6)));
            i6 = i7;
        }
        g6 = e0.g(arrayList);
        f6612c = g6;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f6613d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f6614e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            h.d(str, "kotlinName");
            m7 = i5.m.m(str, '.', null, 2, null);
            sb.append(m7);
            sb.append("CompanionObject");
            z4.g a7 = z4.i.a(sb.toString(), str + ".Companion");
            hashMap3.put(a7.c(), a7.d());
        }
        for (Map.Entry entry : f6612c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f6615f = hashMap3;
        a6 = d0.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a6);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m6 = i5.m.m((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m6);
        }
        f6616g = linkedHashMap;
    }

    public d(Class cls) {
        h.e(cls, "jClass");
        this.f6617a = cls;
    }

    @Override // f5.c
    public Class a() {
        return this.f6617a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && h.a(d5.a.b(this), d5.a.b((h5.a) obj));
    }

    public int hashCode() {
        return d5.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
