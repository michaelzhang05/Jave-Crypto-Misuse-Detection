package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.m1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.a.i0;
import kotlin.reflect.x.internal.l0.d.a.j0.k;
import kotlin.reflect.x.internal.l0.d.a.n0.j;
import kotlin.reflect.x.internal.l0.d.a.n0.x;
import kotlin.reflect.x.internal.l0.d.a.n0.y;
import kotlin.reflect.x.internal.l0.i.r.v;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: LazyJavaClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class f extends g implements kotlin.reflect.x.internal.l0.d.a.k0.c {
    public static final a n = new a(null);
    private static final Set<String> o;
    private final x0<g> A;
    private final kotlin.reflect.x.internal.l0.i.w.f B;
    private final k C;
    private final kotlin.reflect.jvm.internal.impl.descriptors.n1.g D;
    private final i<List<e1>> E;
    private final kotlin.reflect.x.internal.l0.d.a.l0.g p;
    private final kotlin.reflect.x.internal.l0.d.a.n0.g q;
    private final kotlin.reflect.jvm.internal.impl.descriptors.e r;
    private final kotlin.reflect.x.internal.l0.d.a.l0.g s;
    private final Lazy t;
    private final kotlin.reflect.jvm.internal.impl.descriptors.f u;
    private final d0 v;
    private final m1 w;
    private final boolean x;
    private final b y;
    private final g z;

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public final class b extends kotlin.reflect.x.internal.l0.l.b {

        /* renamed from: d, reason: collision with root package name */
        private final i<List<e1>> f20008d;

        /* compiled from: LazyJavaClassDescriptor.kt */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function0<List<? extends e1>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f20010f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f20010f = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends e1> invoke() {
                return f1.d(this.f20010f);
            }
        }

        public b() {
            super(f.this.s.e());
            this.f20008d = f.this.s.e().d(new a(f.this));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if ((!r0.d() && r0.i(kotlin.reflect.x.internal.l0.b.k.q)) != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final kotlin.reflect.x.internal.l0.l.e0 x() {
            /*
                r8 = this;
                kotlin.f0.x.e.l0.f.c r0 = r8.y()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.d()
                if (r3 != 0) goto L18
                kotlin.f0.x.e.l0.f.f r3 = kotlin.reflect.x.internal.l0.b.k.q
                boolean r3 = r0.i(r3)
                if (r3 == 0) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                kotlin.f0.x.e.l0.d.a.m r3 = kotlin.reflect.x.internal.l0.d.a.m.a
                kotlin.f0.x.e.l0.d.a.l0.l.f r4 = kotlin.reflect.x.internal.l0.d.a.l0.l.f.this
                kotlin.f0.x.e.l0.f.c r4 = kotlin.reflect.x.internal.l0.i.t.a.h(r4)
                kotlin.f0.x.e.l0.f.c r3 = r3.b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                kotlin.f0.x.e.l0.d.a.l0.l.f r4 = kotlin.reflect.x.internal.l0.d.a.l0.l.f.this
                kotlin.f0.x.e.l0.d.a.l0.g r4 = kotlin.reflect.x.internal.l0.d.a.l0.l.f.M0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.g0 r4 = r4.d()
                kotlin.f0.x.e.l0.c.b.d r5 = kotlin.reflect.x.internal.l0.c.b.d.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.descriptors.e r3 = kotlin.reflect.x.internal.l0.i.t.a.r(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                kotlin.f0.x.e.l0.l.e1 r4 = r3.g()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.f0.x.e.l0.d.a.l0.l.f r5 = kotlin.reflect.x.internal.l0.d.a.l0.l.f.this
                kotlin.f0.x.e.l0.l.e1 r5 = r5.g()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.l.e(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L8d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.r.t(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r2
                kotlin.f0.x.e.l0.l.i1 r4 = new kotlin.f0.x.e.l0.l.i1
                kotlin.f0.x.e.l0.l.r1 r5 = kotlin.reflect.x.internal.l0.l.r1.INVARIANT
                kotlin.f0.x.e.l0.l.m0 r2 = r2.s()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                kotlin.f0.x.e.l0.l.i1 r0 = new kotlin.f0.x.e.l0.l.i1
                kotlin.f0.x.e.l0.l.r1 r2 = kotlin.reflect.x.internal.l0.l.r1.INVARIANT
                java.lang.Object r5 = kotlin.collections.r.n0(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r5
                kotlin.f0.x.e.l0.l.m0 r5 = r5.s()
                r0.<init>(r2, r5)
                kotlin.e0.c r2 = new kotlin.e0.c
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.r.t(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                kotlin.w.j0 r4 = (kotlin.collections.IntIterator) r4
                r4.a()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                kotlin.f0.x.e.l0.l.a1$a r1 = kotlin.reflect.x.internal.l0.l.a1.f21185g
                kotlin.f0.x.e.l0.l.a1 r1 = r1.h()
                kotlin.f0.x.e.l0.l.m0 r0 = kotlin.reflect.x.internal.l0.l.f0.g(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.d.a.l0.l.f.b.x():kotlin.f0.x.e.l0.l.e0");
        }

        private final kotlin.reflect.x.internal.l0.f.c y() {
            String b2;
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations = f.this.getAnnotations();
            kotlin.reflect.x.internal.l0.f.c cVar = a0.q;
            l.e(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.n1.c e2 = annotations.e(cVar);
            if (e2 == null) {
                return null;
            }
            Object o0 = r.o0(e2.a().values());
            v vVar = o0 instanceof v ? (v) o0 : null;
            if (vVar == null || (b2 = vVar.b()) == null || !kotlin.reflect.x.internal.l0.f.e.e(b2)) {
                return null;
            }
            return new kotlin.reflect.x.internal.l0.f.c(b2);
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public List<e1> getParameters() {
            return this.f20008d.invoke();
        }

        @Override // kotlin.reflect.x.internal.l0.l.g
        protected Collection<e0> l() {
            List e2;
            List y0;
            int t;
            Collection<j> a2 = f.this.Q0().a();
            ArrayList arrayList = new ArrayList(a2.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            e0 x = x();
            Iterator<j> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j next = it.next();
                e0 h2 = f.this.s.a().r().h(f.this.s.g().o(next, kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(k.SUPERTYPE, false, null, 3, null)), f.this.s);
                if (h2.O0().w() instanceof j0.b) {
                    arrayList2.add(next);
                }
                if (!l.a(h2.O0(), x != null ? x.O0() : null) && !h.b0(h2)) {
                    arrayList.add(h2);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = f.this.r;
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, eVar != null ? kotlin.reflect.x.internal.l0.b.q.j.a(eVar, f.this).c().p(eVar.s(), r1.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, x);
            if (!arrayList2.isEmpty()) {
                kotlin.reflect.x.internal.l0.j.b.r c2 = f.this.s.a().c();
                kotlin.reflect.jvm.internal.impl.descriptors.e w = w();
                t = u.t(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(t);
                for (x xVar : arrayList2) {
                    l.d(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((j) xVar).n());
                }
                c2.b(w, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                y0 = b0.y0(arrayList);
                return y0;
            }
            e2 = s.e(f.this.s.d().o().i());
            return e2;
        }

        @Override // kotlin.reflect.x.internal.l0.l.g
        protected c1 q() {
            return f.this.s.a().v();
        }

        public String toString() {
            String f2 = f.this.getName().f();
            l.e(f2, "name.asString()");
            return f2;
        }

        @Override // kotlin.reflect.x.internal.l0.l.m, kotlin.reflect.x.internal.l0.l.e1
        public kotlin.reflect.jvm.internal.impl.descriptors.e w() {
            return f.this;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<List<? extends e1>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends e1> invoke() {
            int t;
            List<y> typeParameters = f.this.Q0().getTypeParameters();
            f fVar = f.this;
            t = u.t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(t);
            for (y yVar : typeParameters) {
                e1 a = fVar.s.f().a(yVar);
                if (a == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.Q0() + ", so it must be resolved");
                }
                arrayList.add(a);
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int a;
            a = kotlin.comparisons.b.a(kotlin.reflect.x.internal.l0.i.t.a.h((kotlin.reflect.jvm.internal.impl.descriptors.e) t).b(), kotlin.reflect.x.internal.l0.i.t.a.h((kotlin.reflect.jvm.internal.impl.descriptors.e) t2).b());
            return a;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function0<List<? extends kotlin.reflect.x.internal.l0.d.a.n0.a>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.x.internal.l0.d.a.n0.a> invoke() {
            kotlin.reflect.x.internal.l0.f.b g2 = kotlin.reflect.x.internal.l0.i.t.a.g(f.this);
            if (g2 != null) {
                return f.this.S0().a().f().a(g2);
            }
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.l0.l.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0291f extends Lambda implements Function1<kotlin.reflect.x.internal.l0.l.t1.g, g> {
        C0291f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            l.f(gVar, "it");
            kotlin.reflect.x.internal.l0.d.a.l0.g gVar2 = f.this.s;
            f fVar = f.this;
            return new g(gVar2, fVar, fVar.Q0(), f.this.r != null, f.this.z);
        }
    }

    static {
        Set<String> g2;
        g2 = u0.g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
        o = g2;
    }

    public /* synthetic */ f(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, m mVar, kotlin.reflect.x.internal.l0.d.a.n0.g gVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, int i2, kotlin.jvm.internal.g gVar3) {
        this(gVar, mVar, gVar2, (i2 & 8) != 0 ? null : eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> J() {
        List i2;
        List r0;
        if (this.v == d0.SEALED) {
            kotlin.reflect.x.internal.l0.d.a.l0.m.a d2 = kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(k.COMMON, false, null, 3, null);
            Collection<j> N = this.q.N();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = N.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h w = this.s.g().o((j) it.next(), d2).O0().w();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) w : null;
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
            r0 = b0.r0(arrayList, new d());
            return r0;
        }
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean M() {
        return false;
    }

    public final f O0(kotlin.reflect.x.internal.l0.d.a.j0.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l.f(gVar, "javaResolverCache");
        kotlin.reflect.x.internal.l0.d.a.l0.g gVar2 = this.s;
        kotlin.reflect.x.internal.l0.d.a.l0.g i2 = kotlin.reflect.x.internal.l0.d.a.l0.a.i(gVar2, gVar2.a().x(gVar));
        m b2 = b();
        l.e(b2, "containingDeclaration");
        return new f(i2, b2, this.q, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> k() {
        return this.z.w0().invoke();
    }

    public final kotlin.reflect.x.internal.l0.d.a.n0.g Q0() {
        return this.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d R() {
        return null;
    }

    public final List<kotlin.reflect.x.internal.l0.d.a.n0.a> R0() {
        return (List) this.t.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h S() {
        return this.C;
    }

    public final kotlin.reflect.x.internal.l0.d.a.l0.g S0() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public g D0() {
        kotlin.reflect.x.internal.l0.i.w.h D0 = super.D0();
        l.d(D0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (g) D0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e U() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.t
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public g H(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this.A.c(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.e1 g() {
        return this.y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g getAnnotations() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        if (l.a(this.w, kotlin.reflect.jvm.internal.impl.descriptors.t.a) && this.q.i() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.x.internal.l0.d.a.r.a;
            l.e(uVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return uVar;
        }
        return i0.c(this.w);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f i() {
        return this.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public d0 j() {
        return this.v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean m() {
        return this.x;
    }

    public String toString() {
        return "Lazy Java class " + kotlin.reflect.x.internal.l0.i.t.a.i(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    public List<e1> w() {
        return this.E.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h y0() {
        return this.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public g1<m0> z0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, m mVar, kotlin.reflect.x.internal.l0.d.a.n0.g gVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(gVar.e(), mVar, gVar2.getName(), gVar.a().t().a(gVar2), false);
        Lazy b2;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar;
        d0 d0Var;
        l.f(gVar, "outerContext");
        l.f(mVar, "containingDeclaration");
        l.f(gVar2, "jClass");
        this.p = gVar;
        this.q = gVar2;
        this.r = eVar;
        kotlin.reflect.x.internal.l0.d.a.l0.g d2 = kotlin.reflect.x.internal.l0.d.a.l0.a.d(gVar, this, gVar2, 0, 4, null);
        this.s = d2;
        d2.a().h().c(gVar2, this);
        gVar2.I();
        b2 = kotlin.i.b(new e());
        this.t = b2;
        if (gVar2.q()) {
            fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS;
        } else if (gVar2.H()) {
            fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
        } else {
            fVar = gVar2.B() ? kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS;
        }
        this.u = fVar;
        if (!gVar2.q() && !gVar2.B()) {
            d0Var = d0.f21624f.a(gVar2.o(), gVar2.o() || gVar2.isAbstract() || gVar2.H(), !gVar2.isFinal());
        } else {
            d0Var = d0.FINAL;
        }
        this.v = d0Var;
        this.w = gVar2.getVisibility();
        this.x = (gVar2.i() == null || gVar2.Q()) ? false : true;
        this.y = new b();
        g gVar3 = new g(d2, this, gVar2, eVar != null, null, 16, null);
        this.z = gVar3;
        this.A = x0.a.a(this, d2.e(), d2.a().k().c(), new C0291f());
        this.B = new kotlin.reflect.x.internal.l0.i.w.f(gVar3);
        this.C = new k(d2, gVar2, this);
        this.D = kotlin.reflect.x.internal.l0.d.a.l0.e.a(d2, gVar2);
        this.E = d2.e().d(new c());
    }
}
