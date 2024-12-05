package kotlin.reflect.x.internal.l0.b.q;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.e;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.f.h;
import kotlin.reflect.x.internal.l0.f.i;

/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f19752b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f19753c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f19754d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f19755e;

    /* renamed from: f, reason: collision with root package name */
    private static final b f19756f;

    /* renamed from: g, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.c f19757g;

    /* renamed from: h, reason: collision with root package name */
    private static final b f19758h;

    /* renamed from: i, reason: collision with root package name */
    private static final b f19759i;

    /* renamed from: j, reason: collision with root package name */
    private static final b f19760j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<d, b> f19761k;
    private static final HashMap<d, b> l;
    private static final HashMap<d, kotlin.reflect.x.internal.l0.f.c> m;
    private static final HashMap<d, kotlin.reflect.x.internal.l0.f.c> n;
    private static final HashMap<b, b> o;
    private static final HashMap<b, b> p;
    private static final List<a> q;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        private final b f19762b;

        /* renamed from: c, reason: collision with root package name */
        private final b f19763c;

        public a(b bVar, b bVar2, b bVar3) {
            l.f(bVar, "javaClass");
            l.f(bVar2, "kotlinReadOnly");
            l.f(bVar3, "kotlinMutable");
            this.a = bVar;
            this.f19762b = bVar2;
            this.f19763c = bVar3;
        }

        public final b a() {
            return this.a;
        }

        public final b b() {
            return this.f19762b;
        }

        public final b c() {
            return this.f19763c;
        }

        public final b d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && l.a(this.f19762b, aVar.f19762b) && l.a(this.f19763c, aVar.f19763c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.f19762b.hashCode()) * 31) + this.f19763c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.f19762b + ", kotlinMutable=" + this.f19763c + ')';
        }
    }

    static {
        List<a> l2;
        c cVar = new c();
        a = cVar;
        StringBuilder sb = new StringBuilder();
        kotlin.reflect.x.internal.l0.b.p.c cVar2 = kotlin.reflect.x.internal.l0.b.p.c.f19742g;
        sb.append(cVar2.i().toString());
        sb.append('.');
        sb.append(cVar2.f());
        f19752b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        kotlin.reflect.x.internal.l0.b.p.c cVar3 = kotlin.reflect.x.internal.l0.b.p.c.f19744i;
        sb2.append(cVar3.i().toString());
        sb2.append('.');
        sb2.append(cVar3.f());
        f19753c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        kotlin.reflect.x.internal.l0.b.p.c cVar4 = kotlin.reflect.x.internal.l0.b.p.c.f19743h;
        sb3.append(cVar4.i().toString());
        sb3.append('.');
        sb3.append(cVar4.f());
        f19754d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        kotlin.reflect.x.internal.l0.b.p.c cVar5 = kotlin.reflect.x.internal.l0.b.p.c.f19745j;
        sb4.append(cVar5.i().toString());
        sb4.append('.');
        sb4.append(cVar5.f());
        f19755e = sb4.toString();
        b m2 = b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.functions.FunctionN"));
        l.e(m2, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f19756f = m2;
        kotlin.reflect.x.internal.l0.f.c b2 = m2.b();
        l.e(b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f19757g = b2;
        i iVar = i.a;
        f19758h = iVar.i();
        f19759i = iVar.h();
        f19760j = cVar.g(Class.class);
        f19761k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        n = new HashMap<>();
        o = new HashMap<>();
        p = new HashMap<>();
        b m3 = b.m(k.a.T);
        l.e(m3, "topLevel(FqNames.iterable)");
        kotlin.reflect.x.internal.l0.f.c cVar6 = k.a.b0;
        kotlin.reflect.x.internal.l0.f.c h2 = m3.h();
        kotlin.reflect.x.internal.l0.f.c h3 = m3.h();
        l.e(h3, "kotlinReadOnly.packageFqName");
        kotlin.reflect.x.internal.l0.f.c g2 = e.g(cVar6, h3);
        b bVar = new b(h2, g2, false);
        b m4 = b.m(k.a.S);
        l.e(m4, "topLevel(FqNames.iterator)");
        kotlin.reflect.x.internal.l0.f.c cVar7 = k.a.a0;
        kotlin.reflect.x.internal.l0.f.c h4 = m4.h();
        kotlin.reflect.x.internal.l0.f.c h5 = m4.h();
        l.e(h5, "kotlinReadOnly.packageFqName");
        b bVar2 = new b(h4, e.g(cVar7, h5), false);
        b m5 = b.m(k.a.U);
        l.e(m5, "topLevel(FqNames.collection)");
        kotlin.reflect.x.internal.l0.f.c cVar8 = k.a.c0;
        kotlin.reflect.x.internal.l0.f.c h6 = m5.h();
        kotlin.reflect.x.internal.l0.f.c h7 = m5.h();
        l.e(h7, "kotlinReadOnly.packageFqName");
        b bVar3 = new b(h6, e.g(cVar8, h7), false);
        b m6 = b.m(k.a.V);
        l.e(m6, "topLevel(FqNames.list)");
        kotlin.reflect.x.internal.l0.f.c cVar9 = k.a.d0;
        kotlin.reflect.x.internal.l0.f.c h8 = m6.h();
        kotlin.reflect.x.internal.l0.f.c h9 = m6.h();
        l.e(h9, "kotlinReadOnly.packageFqName");
        b bVar4 = new b(h8, e.g(cVar9, h9), false);
        b m7 = b.m(k.a.X);
        l.e(m7, "topLevel(FqNames.set)");
        kotlin.reflect.x.internal.l0.f.c cVar10 = k.a.f0;
        kotlin.reflect.x.internal.l0.f.c h10 = m7.h();
        kotlin.reflect.x.internal.l0.f.c h11 = m7.h();
        l.e(h11, "kotlinReadOnly.packageFqName");
        b bVar5 = new b(h10, e.g(cVar10, h11), false);
        b m8 = b.m(k.a.W);
        l.e(m8, "topLevel(FqNames.listIterator)");
        kotlin.reflect.x.internal.l0.f.c cVar11 = k.a.e0;
        kotlin.reflect.x.internal.l0.f.c h12 = m8.h();
        kotlin.reflect.x.internal.l0.f.c h13 = m8.h();
        l.e(h13, "kotlinReadOnly.packageFqName");
        b bVar6 = new b(h12, e.g(cVar11, h13), false);
        kotlin.reflect.x.internal.l0.f.c cVar12 = k.a.Y;
        b m9 = b.m(cVar12);
        l.e(m9, "topLevel(FqNames.map)");
        kotlin.reflect.x.internal.l0.f.c cVar13 = k.a.g0;
        kotlin.reflect.x.internal.l0.f.c h14 = m9.h();
        kotlin.reflect.x.internal.l0.f.c h15 = m9.h();
        l.e(h15, "kotlinReadOnly.packageFqName");
        b bVar7 = new b(h14, e.g(cVar13, h15), false);
        b d2 = b.m(cVar12).d(k.a.Z.g());
        l.e(d2, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        kotlin.reflect.x.internal.l0.f.c cVar14 = k.a.h0;
        kotlin.reflect.x.internal.l0.f.c h16 = d2.h();
        kotlin.reflect.x.internal.l0.f.c h17 = d2.h();
        l.e(h17, "kotlinReadOnly.packageFqName");
        l2 = t.l(new a(cVar.g(Iterable.class), m3, bVar), new a(cVar.g(Iterator.class), m4, bVar2), new a(cVar.g(Collection.class), m5, bVar3), new a(cVar.g(List.class), m6, bVar4), new a(cVar.g(Set.class), m7, bVar5), new a(cVar.g(ListIterator.class), m8, bVar6), new a(cVar.g(Map.class), m9, bVar7), new a(cVar.g(Map.Entry.class), d2, new b(h16, e.g(cVar14, h17), false)));
        q = l2;
        cVar.f(Object.class, k.a.f19710b);
        cVar.f(String.class, k.a.f19716h);
        cVar.f(CharSequence.class, k.a.f19715g);
        cVar.e(Throwable.class, k.a.u);
        cVar.f(Cloneable.class, k.a.f19712d);
        cVar.f(Number.class, k.a.r);
        cVar.e(Comparable.class, k.a.v);
        cVar.f(Enum.class, k.a.s);
        cVar.e(Annotation.class, k.a.G);
        Iterator<a> it = l2.iterator();
        while (it.hasNext()) {
            a.d(it.next());
        }
        for (kotlin.reflect.x.internal.l0.i.u.e eVar : kotlin.reflect.x.internal.l0.i.u.e.values()) {
            c cVar15 = a;
            b m10 = b.m(eVar.B());
            l.e(m10, "topLevel(jvmType.wrapperFqName)");
            kotlin.reflect.x.internal.l0.b.i r = eVar.r();
            l.e(r, "jvmType.primitiveType");
            b m11 = b.m(k.c(r));
            l.e(m11, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.a(m10, m11);
        }
        for (b bVar8 : kotlin.reflect.x.internal.l0.b.c.a.a()) {
            c cVar16 = a;
            b m12 = b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal." + bVar8.j().f() + "CompanionObject"));
            l.e(m12, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            b d3 = bVar8.d(h.f20727d);
            l.e(d3, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.a(m12, d3);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            c cVar17 = a;
            b m13 = b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.functions.Function" + i2));
            l.e(m13, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.a(m13, k.a(i2));
            cVar17.c(new kotlin.reflect.x.internal.l0.f.c(f19753c + i2), f19758h);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            kotlin.reflect.x.internal.l0.b.p.c cVar18 = kotlin.reflect.x.internal.l0.b.p.c.f19745j;
            a.c(new kotlin.reflect.x.internal.l0.f.c((cVar18.i().toString() + '.' + cVar18.f()) + i3), f19758h);
        }
        c cVar19 = a;
        kotlin.reflect.x.internal.l0.f.c l3 = k.a.f19711c.l();
        l.e(l3, "nothing.toSafe()");
        cVar19.c(l3, cVar19.g(Void.class));
    }

    private c() {
    }

    private final void a(b bVar, b bVar2) {
        b(bVar, bVar2);
        kotlin.reflect.x.internal.l0.f.c b2 = bVar2.b();
        l.e(b2, "kotlinClassId.asSingleFqName()");
        c(b2, bVar);
    }

    private final void b(b bVar, b bVar2) {
        HashMap<d, b> hashMap = f19761k;
        d j2 = bVar.b().j();
        l.e(j2, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j2, bVar2);
    }

    private final void c(kotlin.reflect.x.internal.l0.f.c cVar, b bVar) {
        HashMap<d, b> hashMap = l;
        d j2 = cVar.j();
        l.e(j2, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j2, bVar);
    }

    private final void d(a aVar) {
        b a2 = aVar.a();
        b b2 = aVar.b();
        b c2 = aVar.c();
        a(a2, b2);
        kotlin.reflect.x.internal.l0.f.c b3 = c2.b();
        l.e(b3, "mutableClassId.asSingleFqName()");
        c(b3, a2);
        o.put(c2, b2);
        p.put(b2, c2);
        kotlin.reflect.x.internal.l0.f.c b4 = b2.b();
        l.e(b4, "readOnlyClassId.asSingleFqName()");
        kotlin.reflect.x.internal.l0.f.c b5 = c2.b();
        l.e(b5, "mutableClassId.asSingleFqName()");
        HashMap<d, kotlin.reflect.x.internal.l0.f.c> hashMap = m;
        d j2 = c2.b().j();
        l.e(j2, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j2, b4);
        HashMap<d, kotlin.reflect.x.internal.l0.f.c> hashMap2 = n;
        d j3 = b4.j();
        l.e(j3, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j3, b5);
    }

    private final void e(Class<?> cls, kotlin.reflect.x.internal.l0.f.c cVar) {
        b g2 = g(cls);
        b m2 = b.m(cVar);
        l.e(m2, "topLevel(kotlinFqName)");
        a(g2, m2);
    }

    private final void f(Class<?> cls, d dVar) {
        kotlin.reflect.x.internal.l0.f.c l2 = dVar.l();
        l.e(l2, "kotlinFqName.toSafe()");
        e(cls, l2);
    }

    private final b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            b m2 = b.m(new kotlin.reflect.x.internal.l0.f.c(cls.getCanonicalName()));
            l.e(m2, "topLevel(FqName(clazz.canonicalName))");
            return m2;
        }
        b d2 = g(declaringClass).d(f.r(cls.getSimpleName()));
        l.e(d2, "classId(outer).createNes…tifier(clazz.simpleName))");
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r5 = kotlin.text.t.g(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean j(kotlin.reflect.x.internal.l0.f.d r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.b()
            java.lang.String r0 = "kotlinFqName.asString()"
            kotlin.jvm.internal.l.e(r5, r0)
            java.lang.String r0 = ""
            java.lang.String r5 = kotlin.text.l.y0(r5, r6, r0)
            int r6 = r5.length()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 == 0) goto L37
            r6 = 48
            r2 = 2
            r3 = 0
            boolean r6 = kotlin.text.l.u0(r5, r6, r1, r2, r3)
            if (r6 != 0) goto L37
            java.lang.Integer r5 = kotlin.text.l.g(r5)
            if (r5 == 0) goto L35
            int r5 = r5.intValue()
            r6 = 23
            if (r5 < r6) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.b.q.c.j(kotlin.f0.x.e.l0.f.d, java.lang.String):boolean");
    }

    public final kotlin.reflect.x.internal.l0.f.c h() {
        return f19757g;
    }

    public final List<a> i() {
        return q;
    }

    public final boolean k(d dVar) {
        return m.containsKey(dVar);
    }

    public final boolean l(d dVar) {
        return n.containsKey(dVar);
    }

    public final b m(kotlin.reflect.x.internal.l0.f.c cVar) {
        l.f(cVar, "fqName");
        return f19761k.get(cVar.j());
    }

    public final b n(d dVar) {
        l.f(dVar, "kotlinFqName");
        if (!j(dVar, f19752b) && !j(dVar, f19754d)) {
            if (!j(dVar, f19753c) && !j(dVar, f19755e)) {
                return l.get(dVar);
            }
            return f19758h;
        }
        return f19756f;
    }

    public final kotlin.reflect.x.internal.l0.f.c o(d dVar) {
        return m.get(dVar);
    }

    public final kotlin.reflect.x.internal.l0.f.c p(d dVar) {
        return n.get(dVar);
    }
}
