package kotlin.jvm.internal;

import P5.AbstractC1378t;
import a6.InterfaceC1655a;
import a6.InterfaceC1656b;
import a6.InterfaceC1657c;
import a6.InterfaceC1658d;
import a6.InterfaceC1659e;
import a6.InterfaceC1660f;
import a6.InterfaceC1661g;
import a6.InterfaceC1662h;
import a6.InterfaceC1663i;
import a6.InterfaceC1664j;
import a6.InterfaceC1665k;
import a6.InterfaceC1666l;
import a6.InterfaceC1667m;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import a6.InterfaceC1671q;
import a6.InterfaceC1672r;
import a6.InterfaceC1673s;
import a6.InterfaceC1674t;
import a6.InterfaceC1675u;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h6.InterfaceC2963c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlin.jvm.internal.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3245n implements InterfaceC2963c, InterfaceC3244m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34182b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f34183c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f34184d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f34185e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f34186f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f34187g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f34188a;

    /* renamed from: kotlin.jvm.internal.n$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final String a(Class jClass) {
            String str;
            AbstractC3255y.i(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C3245n.f34186f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C3245n.f34186f.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.AbstractC3255y.i(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = j6.n.E0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = j6.n.E0(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.lang.String r1 = j6.n.D0(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C3245n.h()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.C3245n.h()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C3245n.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class jClass) {
            AbstractC3255y.i(jClass, "jClass");
            Map map = C3245n.f34183c;
            AbstractC3255y.g(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return Z.i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = Z5.a.b(Z5.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        int i8 = 0;
        List p8 = AbstractC1378t.p(Function0.class, Function1.class, InterfaceC1668n.class, InterfaceC1669o.class, InterfaceC1670p.class, InterfaceC1671q.class, InterfaceC1672r.class, InterfaceC1673s.class, InterfaceC1674t.class, InterfaceC1675u.class, InterfaceC1655a.class, InterfaceC1656b.class, InterfaceC1657c.class, InterfaceC1658d.class, InterfaceC1659e.class, InterfaceC1660f.class, InterfaceC1661g.class, InterfaceC1662h.class, InterfaceC1663i.class, InterfaceC1664j.class, InterfaceC1665k.class, InterfaceC1666l.class, InterfaceC1667m.class);
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(p8, 10));
        for (Object obj : p8) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            arrayList.add(O5.x.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        f34183c = P5.Q.w(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f34184d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f34185e = hashMap2;
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
        AbstractC3255y.h(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AbstractC3255y.f(str);
            sb.append(j6.n.G0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            O5.r a8 = O5.x.a(sb.toString(), str + ".Companion");
            hashMap3.put(a8.c(), a8.d());
        }
        for (Map.Entry entry : f34183c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f34186f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P5.Q.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), j6.n.G0((String) entry2.getValue(), '.', null, 2, null));
        }
        f34187g = linkedHashMap;
    }

    public C3245n(Class jClass) {
        AbstractC3255y.i(jClass, "jClass");
        this.f34188a = jClass;
    }

    @Override // h6.InterfaceC2963c
    public String a() {
        return f34182b.a(d());
    }

    @Override // h6.InterfaceC2963c
    public String b() {
        return f34182b.b(d());
    }

    @Override // h6.InterfaceC2963c
    public boolean c(Object obj) {
        return f34182b.c(obj, d());
    }

    @Override // kotlin.jvm.internal.InterfaceC3244m
    public Class d() {
        return this.f34188a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3245n) && AbstractC3255y.d(Z5.a.b(this), Z5.a.b((InterfaceC2963c) obj))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Z5.a.b(this).hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
