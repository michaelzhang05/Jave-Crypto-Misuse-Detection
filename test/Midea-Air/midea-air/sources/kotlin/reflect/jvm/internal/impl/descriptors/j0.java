package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.aptoide.pt.dataprovider.model.v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes2.dex */
public final class j0 {
    private final kotlin.reflect.x.internal.l0.k.n a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f21640b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.g<kotlin.reflect.x.internal.l0.f.c, k0> f21641c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.g<a, e> f21642d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final kotlin.reflect.x.internal.l0.f.b a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Integer> f21643b;

        public a(kotlin.reflect.x.internal.l0.f.b bVar, List<Integer> list) {
            kotlin.jvm.internal.l.f(bVar, "classId");
            kotlin.jvm.internal.l.f(list, "typeParametersCount");
            this.a = bVar;
            this.f21643b = list;
        }

        public final kotlin.reflect.x.internal.l0.f.b a() {
            return this.a;
        }

        public final List<Integer> b() {
            return this.f21643b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.a(this.a, aVar.a) && kotlin.jvm.internal.l.a(this.f21643b, aVar.f21643b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.f21643b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.f21643b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.p1.g {
        private final boolean n;
        private final List<e1> o;
        private final kotlin.reflect.x.internal.l0.l.l p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.reflect.x.internal.l0.k.n nVar, m mVar, kotlin.reflect.x.internal.l0.f.f fVar, boolean z, int i2) {
            super(nVar, mVar, fVar, z0.a, false);
            IntRange i3;
            int t;
            Set c2;
            kotlin.jvm.internal.l.f(nVar, "storageManager");
            kotlin.jvm.internal.l.f(mVar, "container");
            kotlin.jvm.internal.l.f(fVar, "name");
            this.n = z;
            i3 = kotlin.ranges.f.i(0, i2);
            t = kotlin.collections.u.t(i3, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<Integer> it = i3.iterator();
            while (it.hasNext()) {
                int a = ((IntIterator) it).a();
                kotlin.reflect.jvm.internal.impl.descriptors.n1.g b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
                r1 r1Var = r1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(a);
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.p1.k0.S0(this, b2, false, r1Var, kotlin.reflect.x.internal.l0.f.f.r(sb.toString()), a, nVar));
            }
            this.o = arrayList;
            List<e1> d2 = f1.d(this);
            c2 = kotlin.collections.t0.c(kotlin.reflect.x.internal.l0.i.t.a.l(this).o().i());
            this.p = new kotlin.reflect.x.internal.l0.l.l(this, d2, c2, nVar);
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
        public Collection<e> J() {
            List i2;
            i2 = kotlin.collections.t.i();
            return i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean J0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public h.b S() {
            return h.b.f20931b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
        public boolean M() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.x.internal.l0.l.l g() {
            return this.p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.t
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public h.b H(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefiner");
            return h.b.f20931b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public kotlin.reflect.jvm.internal.impl.descriptors.d R() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public e U() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
        public kotlin.reflect.jvm.internal.impl.descriptors.n1.g getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
        public u getVisibility() {
            u uVar = t.f21863e;
            kotlin.jvm.internal.l.e(uVar, Store.PUBLIC_ACCESS);
            return uVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public f i() {
            return f.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.c0
        public d0 j() {
            return d0.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k() {
            Set d2;
            d2 = kotlin.collections.u0.d();
            return d2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean l() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
        public boolean m() {
            return this.n;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
        public List<e1> w() {
            return this.o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g, kotlin.reflect.jvm.internal.impl.descriptors.c0
        public boolean z() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public g1<kotlin.reflect.x.internal.l0.l.m0> z0() {
            return null;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<a, e> {
        c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r1 != null) goto L10;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(kotlin.reflect.jvm.internal.impl.descriptors.j0.a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.l.f(r9, r0)
                kotlin.f0.x.e.l0.f.b r0 = r9.a()
                java.util.List r9 = r9.b()
                boolean r1 = r0.k()
                if (r1 != 0) goto L67
                kotlin.f0.x.e.l0.f.b r1 = r0.g()
                if (r1 == 0) goto L27
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.j0.this
                r3 = 1
                java.util.List r3 = kotlin.collections.r.L(r9, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r2.d(r1, r3)
                if (r1 == 0) goto L27
                goto L3c
            L27:
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.j0.this
                kotlin.f0.x.e.l0.k.g r1 = kotlin.reflect.jvm.internal.impl.descriptors.j0.b(r1)
                kotlin.f0.x.e.l0.f.c r2 = r0.h()
                java.lang.String r3 = "classId.packageFqName"
                kotlin.jvm.internal.l.e(r2, r3)
                java.lang.Object r1 = r1.invoke(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r1
            L3c:
                r4 = r1
                boolean r6 = r0.l()
                kotlin.reflect.jvm.internal.impl.descriptors.j0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.j0$b
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.j0.this
                kotlin.f0.x.e.l0.k.n r3 = kotlin.reflect.jvm.internal.impl.descriptors.j0.c(r2)
                kotlin.f0.x.e.l0.f.f r5 = r0.j()
                java.lang.String r0 = "classId.shortClassName"
                kotlin.jvm.internal.l.e(r5, r0)
                java.lang.Object r9 = kotlin.collections.r.T(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L60
                int r9 = r9.intValue()
                r7 = r9
                goto L62
            L60:
                r9 = 0
                r7 = 0
            L62:
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L67:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.j0.c.invoke(kotlin.reflect.jvm.internal.impl.descriptors.j0$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.c, k0> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(kotlin.reflect.x.internal.l0.f.c cVar) {
            kotlin.jvm.internal.l.f(cVar, "fqName");
            return new kotlin.reflect.jvm.internal.impl.descriptors.p1.m(j0.this.f21640b, cVar);
        }
    }

    public j0(kotlin.reflect.x.internal.l0.k.n nVar, g0 g0Var) {
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(g0Var, "module");
        this.a = nVar;
        this.f21640b = g0Var;
        this.f21641c = nVar.h(new d());
        this.f21642d = nVar.h(new c());
    }

    public final e d(kotlin.reflect.x.internal.l0.f.b bVar, List<Integer> list) {
        kotlin.jvm.internal.l.f(bVar, "classId");
        kotlin.jvm.internal.l.f(list, "typeParametersCount");
        return this.f21642d.invoke(new a(bVar, list));
    }
}
