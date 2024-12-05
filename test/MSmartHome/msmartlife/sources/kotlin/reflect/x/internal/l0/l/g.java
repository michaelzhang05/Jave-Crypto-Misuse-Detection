package kotlin.reflect.x.internal.l0.l;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.t1.h;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.u;

/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes2.dex */
public abstract class g extends m {

    /* renamed from: b, reason: collision with root package name */
    private final i<b> f21239b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21240c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public final class a implements e1 {
        private final kotlin.reflect.x.internal.l0.l.t1.g a;

        /* renamed from: b, reason: collision with root package name */
        private final Lazy f21241b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f21242c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.x.e.l0.l.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0355a extends Lambda implements Function0<List<? extends e0>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ g f21244g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0355a(g gVar) {
                super(0);
                this.f21244g = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends e0> invoke() {
                return h.b(a.this.a, this.f21244g.a());
            }
        }

        public a(g gVar, kotlin.reflect.x.internal.l0.l.t1.g gVar2) {
            Lazy a;
            l.f(gVar2, "kotlinTypeRefiner");
            this.f21242c = gVar;
            this.a = gVar2;
            a = kotlin.i.a(LazyThreadSafetyMode.PUBLICATION, new C0355a(gVar));
            this.f21241b = a;
        }

        private final List<e0> h() {
            return (List) this.f21241b.getValue();
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public e1 b(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            l.f(gVar, "kotlinTypeRefiner");
            return this.f21242c.b(gVar);
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        /* renamed from: c */
        public kotlin.reflect.jvm.internal.impl.descriptors.h w() {
            return this.f21242c.w();
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public boolean e() {
            return this.f21242c.e();
        }

        public boolean equals(Object obj) {
            return this.f21242c.equals(obj);
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public List<e1> getParameters() {
            List<e1> parameters = this.f21242c.getParameters();
            l.e(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f21242c.hashCode();
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<e0> a() {
            return h();
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public kotlin.reflect.x.internal.l0.b.h o() {
            kotlin.reflect.x.internal.l0.b.h o = this.f21242c.o();
            l.e(o, "this@AbstractTypeConstructor.builtIns");
            return o;
        }

        public String toString() {
            return this.f21242c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Collection<e0> a;

        /* renamed from: b, reason: collision with root package name */
        private List<? extends e0> f21245b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends e0> collection) {
            List<? extends e0> e2;
            l.f(collection, "allSupertypes");
            this.a = collection;
            e2 = s.e(k.a.l());
            this.f21245b = e2;
        }

        public final Collection<e0> a() {
            return this.a;
        }

        public final List<e0> b() {
            return this.f21245b;
        }

        public final void c(List<? extends e0> list) {
            l.f(list, "<set-?>");
            this.f21245b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<b> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(g.this.l());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function1<Boolean, b> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f21247f = new d();

        d() {
            super(1);
        }

        public final b b(boolean z) {
            List e2;
            e2 = s.e(k.a.l());
            return new b(e2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return b(bool.booleanValue());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<b, u> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function1<e1, Iterable<? extends e0>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f21249f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f21249f = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<e0> invoke(e1 e1Var) {
                l.f(e1Var, "it");
                return this.f21249f.k(e1Var, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* loaded from: classes2.dex */
        public static final class b extends Lambda implements Function1<e0, u> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f21250f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(1);
                this.f21250f = gVar;
            }

            public final void b(e0 e0Var) {
                l.f(e0Var, "it");
                this.f21250f.t(e0Var);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ u invoke(e0 e0Var) {
                b(e0Var);
                return u.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* loaded from: classes2.dex */
        public static final class c extends Lambda implements Function1<e1, Iterable<? extends e0>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f21251f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g gVar) {
                super(1);
                this.f21251f = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<e0> invoke(e1 e1Var) {
                l.f(e1Var, "it");
                return this.f21251f.k(e1Var, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* loaded from: classes2.dex */
        public static final class d extends Lambda implements Function1<e0, u> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f21252f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(g gVar) {
                super(1);
                this.f21252f = gVar;
            }

            public final void b(e0 e0Var) {
                l.f(e0Var, "it");
                this.f21252f.u(e0Var);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ u invoke(e0 e0Var) {
                b(e0Var);
                return u.a;
            }
        }

        e() {
            super(1);
        }

        public final void b(b bVar) {
            l.f(bVar, "supertypes");
            Collection<e0> a2 = g.this.q().a(g.this, bVar.a(), new c(g.this), new d(g.this));
            if (a2.isEmpty()) {
                e0 m = g.this.m();
                a2 = m != null ? s.e(m) : null;
                if (a2 == null) {
                    a2 = t.i();
                }
            }
            if (g.this.p()) {
                c1 q = g.this.q();
                g gVar = g.this;
                q.a(gVar, a2, new a(gVar), new b(g.this));
            }
            g gVar2 = g.this;
            List<e0> list = a2 instanceof List ? (List) a2 : null;
            if (list == null) {
                list = b0.y0(a2);
            }
            bVar.c(gVar2.s(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ u invoke(b bVar) {
            b(bVar);
            return u.a;
        }
    }

    public g(n nVar) {
        l.f(nVar, "storageManager");
        this.f21239b = nVar.g(new c(), d.f21247f, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r4 = kotlin.collections.b0.k0(r0.f21239b.invoke().a(), r0.n(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.x.internal.l0.l.e0> k(kotlin.reflect.x.internal.l0.l.e1 r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.x.internal.l0.l.g
            if (r0 == 0) goto L8
            r0 = r3
            kotlin.f0.x.e.l0.l.g r0 = (kotlin.reflect.x.internal.l0.l.g) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L22
            kotlin.f0.x.e.l0.k.i<kotlin.f0.x.e.l0.l.g$b> r1 = r0.f21239b
            java.lang.Object r1 = r1.invoke()
            kotlin.f0.x.e.l0.l.g$b r1 = (kotlin.f0.x.e.l0.l.g.b) r1
            java.util.Collection r1 = r1.a()
            java.util.Collection r4 = r0.n(r4)
            java.util.List r4 = kotlin.collections.r.k0(r1, r4)
            if (r4 == 0) goto L22
            goto L2b
        L22:
            java.util.Collection r4 = r3.a()
            java.lang.String r3 = "supertypes"
            kotlin.jvm.internal.l.e(r4, r3)
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.g.k(kotlin.f0.x.e.l0.l.e1, boolean):java.util.Collection");
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public e1 b(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return new a(this, gVar);
    }

    protected abstract Collection<e0> l();

    protected e0 m() {
        return null;
    }

    protected Collection<e0> n(boolean z) {
        List i2;
        i2 = t.i();
        return i2;
    }

    protected boolean p() {
        return this.f21240c;
    }

    protected abstract c1 q();

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public List<e0> a() {
        return this.f21239b.invoke().b();
    }

    protected List<e0> s(List<e0> list) {
        l.f(list, "supertypes");
        return list;
    }

    protected void t(e0 e0Var) {
        l.f(e0Var, "type");
    }

    protected void u(e0 e0Var) {
        l.f(e0Var, "type");
    }
}
