package kotlin.reflect.x.internal.l0.d.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.n;
import kotlin.collections.r;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.a.o0.f;
import kotlin.reflect.x.internal.l0.d.a.o0.i;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* loaded from: classes2.dex */
public abstract class a<TAnnotation> {
    private static final C0285a a = new C0285a(null);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final Map<String, kotlin.reflect.x.internal.l0.d.a.b> f19829b;

    /* renamed from: c, reason: collision with root package name */
    private final w f19830c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<Object, TAnnotation> f19831d;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0285a {
        private C0285a() {
        }

        public /* synthetic */ C0285a(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19832f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            l.f(tannotation, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.reflect.x.internal.l0.d.a.b bVar : kotlin.reflect.x.internal.l0.d.a.b.values()) {
            String f2 = bVar.f();
            if (linkedHashMap.get(f2) == null) {
                linkedHashMap.put(f2, bVar);
            }
        }
        f19829b = linkedHashMap;
    }

    public a(w wVar) {
        l.f(wVar, "javaTypeEnhancementState");
        this.f19830c = wVar;
        this.f19831d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<kotlin.reflect.x.internal.l0.d.a.b> a(Set<? extends kotlin.reflect.x.internal.l0.d.a.b> set) {
        Set j0;
        Set i2;
        Set<kotlin.reflect.x.internal.l0.d.a.b> j2;
        if (!set.contains(kotlin.reflect.x.internal.l0.d.a.b.TYPE_USE)) {
            return set;
        }
        j0 = n.j0(kotlin.reflect.x.internal.l0.d.a.b.values());
        i2 = v0.i(j0, kotlin.reflect.x.internal.l0.d.a.b.TYPE_PARAMETER_BOUNDS);
        j2 = v0.j(i2, set);
        return j2;
    }

    private final q d(TAnnotation tannotation) {
        i g2;
        q r = r(tannotation);
        if (r != null) {
            return r;
        }
        Pair<TAnnotation, Set<kotlin.reflect.x.internal.l0.d.a.b>> t = t(tannotation);
        if (t == null) {
            return null;
        }
        TAnnotation a2 = t.a();
        Set<kotlin.reflect.x.internal.l0.d.a.b> b2 = t.b();
        f0 q = q(tannotation);
        if (q == null) {
            q = p(a2);
        }
        if (q.i() || (g2 = g(a2, b.f19832f)) == null) {
            return null;
        }
        return new q(i.b(g2, null, q.n(), 1, null), b2, false, 4, null);
    }

    private final i g(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        i n;
        i n2 = n(tannotation, function1.invoke(tannotation).booleanValue());
        if (n2 != null) {
            return n2;
        }
        TAnnotation s = s(tannotation);
        if (s == null) {
            return null;
        }
        f0 p = p(tannotation);
        if (p.i() || (n = n(s, function1.invoke(s).booleanValue())) == null) {
            return null;
        }
        return i.b(n, null, p.n(), 1, null);
    }

    private final TAnnotation h(TAnnotation tannotation, c cVar) {
        for (TAnnotation tannotation2 : k(tannotation)) {
            if (l.a(i(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean l(TAnnotation tannotation, c cVar) {
        Iterable<TAnnotation> k2 = k(tannotation);
        if ((k2 instanceof Collection) && ((Collection) k2).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = k2.iterator();
        while (it.hasNext()) {
            if (l.a(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r6.equals("NEVER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r6.equals("MAYBE") == false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x006e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.x.internal.l0.d.a.o0.i n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.f0.x.e.l0.f.c r0 = r5.i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.f0.x.e.l0.d.a.w r2 = r5.f19830c
            kotlin.a0.c.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.f0.x.e.l0.d.a.f0 r2 = (kotlin.reflect.x.internal.l0.d.a.f0) r2
            boolean r3 = r2.i()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = kotlin.reflect.x.internal.l0.d.a.b0.l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
            goto Ld3
        L2a:
            java.util.List r3 = kotlin.reflect.x.internal.l0.d.a.b0.k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NOT_NULL
            goto Ld3
        L38:
            kotlin.f0.x.e.l0.f.c r3 = kotlin.reflect.x.internal.l0.d.a.b0.g()
            boolean r3 = kotlin.jvm.internal.l.a(r0, r3)
            if (r3 == 0) goto L46
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
            goto Ld3
        L46:
            kotlin.f0.x.e.l0.f.c r3 = kotlin.reflect.x.internal.l0.d.a.b0.h()
            boolean r3 = kotlin.jvm.internal.l.a(r0, r3)
            if (r3 == 0) goto L54
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.FORCE_FLEXIBILITY
            goto Ld3
        L54:
            kotlin.f0.x.e.l0.f.c r3 = kotlin.reflect.x.internal.l0.d.a.b0.f()
            boolean r3 = kotlin.jvm.internal.l.a(r0, r3)
            if (r3 == 0) goto La0
            java.lang.Iterable r6 = r5.b(r6, r4)
            java.lang.Object r6 = kotlin.collections.r.S(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L90;
                case 74175084: goto L87;
                case 433141802: goto L7b;
                case 1933739535: goto L72;
                default: goto L71;
            }
        L71:
            goto L9c
        L72:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9c
            goto L9d
        L7b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L84
            goto L9c
        L84:
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.FORCE_FLEXIBILITY
            goto Ld3
        L87:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L90:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L99:
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
            goto Ld3
        L9c:
            return r1
        L9d:
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NOT_NULL
            goto Ld3
        La0:
            kotlin.f0.x.e.l0.f.c r6 = kotlin.reflect.x.internal.l0.d.a.b0.d()
            boolean r6 = kotlin.jvm.internal.l.a(r0, r6)
            if (r6 == 0) goto Lad
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
            goto Ld3
        Lad:
            kotlin.f0.x.e.l0.f.c r6 = kotlin.reflect.x.internal.l0.d.a.b0.c()
            boolean r6 = kotlin.jvm.internal.l.a(r0, r6)
            if (r6 == 0) goto Lba
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NOT_NULL
            goto Ld3
        Lba:
            kotlin.f0.x.e.l0.f.c r6 = kotlin.reflect.x.internal.l0.d.a.b0.a()
            boolean r6 = kotlin.jvm.internal.l.a(r0, r6)
            if (r6 == 0) goto Lc7
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NOT_NULL
            goto Ld3
        Lc7:
            kotlin.f0.x.e.l0.f.c r6 = kotlin.reflect.x.internal.l0.d.a.b0.b()
            boolean r6 = kotlin.jvm.internal.l.a(r0, r6)
            if (r6 == 0) goto Le2
            kotlin.f0.x.e.l0.d.a.o0.h r6 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
        Ld3:
            kotlin.f0.x.e.l0.d.a.o0.i r0 = new kotlin.f0.x.e.l0.d.a.o0.i
            boolean r1 = r2.n()
            if (r1 != 0) goto Ldd
            if (r7 == 0) goto Lde
        Ldd:
            r4 = 1
        Lde:
            r0.<init>(r6, r4)
            return r0
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.a.n(java.lang.Object, boolean):kotlin.f0.x.e.l0.d.a.o0.i");
    }

    private final f0 o(TAnnotation tannotation) {
        c i2 = i(tannotation);
        if (i2 != null && c.c().containsKey(i2)) {
            return this.f19830c.c().invoke(i2);
        }
        return p(tannotation);
    }

    private final f0 p(TAnnotation tannotation) {
        f0 q = q(tannotation);
        return q != null ? q : this.f19830c.d().a();
    }

    private final f0 q(TAnnotation tannotation) {
        Iterable<String> b2;
        String str;
        f0 f0Var = this.f19830c.d().c().get(i(tannotation));
        if (f0Var != null) {
            return f0Var;
        }
        TAnnotation h2 = h(tannotation, c.d());
        if (h2 == null || (b2 = b(h2, false)) == null || (str = (String) r.S(b2)) == null) {
            return null;
        }
        f0 b3 = this.f19830c.d().b();
        if (b3 != null) {
            return b3;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return f0.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return f0.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return f0.WARN;
        }
        return null;
    }

    private final q r(TAnnotation tannotation) {
        q qVar;
        if (this.f19830c.b() || (qVar = c.a().get(i(tannotation))) == null) {
            return null;
        }
        f0 o = o(tannotation);
        if (!(o != f0.IGNORE)) {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return q.b(qVar, i.b(qVar.d(), null, o.n(), 1, null), null, false, 6, null);
    }

    private final Pair<TAnnotation, Set<kotlin.reflect.x.internal.l0.d.a.b>> t(TAnnotation tannotation) {
        TAnnotation h2;
        TAnnotation tannotation2;
        if (this.f19830c.d().d() || (h2 = h(tannotation, c.e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = it.next();
            if (s(tannotation2) != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> b2 = b(h2, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = b2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.x.internal.l0.d.a.b bVar = f19829b.get(it2.next());
            if (bVar != null) {
                linkedHashSet.add(bVar);
            }
        }
        return new Pair<>(tannotation2, a(linkedHashSet));
    }

    protected abstract Iterable<String> b(TAnnotation tannotation, boolean z);

    public final x c(x xVar, Iterable<? extends TAnnotation> iterable) {
        EnumMap<kotlin.reflect.x.internal.l0.d.a.b, q> b2;
        l.f(iterable, "annotations");
        if (this.f19830c.b()) {
            return xVar;
        }
        ArrayList<q> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            q d2 = d(it.next());
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        if (arrayList.isEmpty()) {
            return xVar;
        }
        EnumMap enumMap = (xVar == null || (b2 = xVar.b()) == null) ? new EnumMap(kotlin.reflect.x.internal.l0.d.a.b.class) : new EnumMap((EnumMap) b2);
        boolean z = false;
        for (q qVar : arrayList) {
            Iterator<kotlin.reflect.x.internal.l0.d.a.b> it2 = qVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (kotlin.reflect.x.internal.l0.d.a.b) qVar);
                z = true;
            }
        }
        return !z ? xVar : new x(enumMap);
    }

    public final f e(Iterable<? extends TAnnotation> iterable) {
        f fVar;
        l.f(iterable, "annotations");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        f fVar2 = null;
        while (it.hasNext()) {
            c i2 = i(it.next());
            if (b0.m().contains(i2)) {
                fVar = f.READ_ONLY;
            } else if (b0.j().contains(i2)) {
                fVar = f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    public final i f(Iterable<? extends TAnnotation> iterable, Function1<? super TAnnotation, Boolean> function1) {
        l.f(iterable, "annotations");
        l.f(function1, "forceWarning");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        i iVar = null;
        while (it.hasNext()) {
            i g2 = g(it.next(), function1);
            if (iVar != null) {
                if (g2 != null && !l.a(g2, iVar) && (!g2.d() || iVar.d())) {
                    if (g2.d() || !iVar.d()) {
                        return null;
                    }
                }
            }
            iVar = g2;
        }
        return iVar;
    }

    protected abstract c i(TAnnotation tannotation);

    protected abstract Object j(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> k(TAnnotation tannotation);

    public final boolean m(TAnnotation tannotation) {
        l.f(tannotation, "annotation");
        TAnnotation h2 = h(tannotation, k.a.H);
        if (h2 == null) {
            return false;
        }
        Iterable<String> b2 = b(h2, false);
        if ((b2 instanceof Collection) && ((Collection) b2).isEmpty()) {
            return false;
        }
        Iterator<String> it = b2.iterator();
        while (it.hasNext()) {
            if (l.a(it.next(), kotlin.reflect.jvm.internal.impl.descriptors.n1.n.H.name())) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation s(TAnnotation tannotation) {
        boolean J;
        TAnnotation tannotation2;
        l.f(tannotation, "annotation");
        if (this.f19830c.d().d()) {
            return null;
        }
        J = b0.J(c.b(), i(tannotation));
        if (J || l(tannotation, c.f())) {
            return tannotation;
        }
        if (!l(tannotation, c.g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f19831d;
        Object j2 = j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j2);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j2, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
