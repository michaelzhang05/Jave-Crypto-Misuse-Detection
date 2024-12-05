package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.b.q.d;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.a.k0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.m;
import kotlin.reflect.x.internal.l0.d.a.n0.o;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.h;
import kotlin.reflect.x.internal.l0.i.r.q;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.j;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.s;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* loaded from: classes2.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.n1.c, g {
    static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), b0.g(new v(b0.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), b0.g(new v(b0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.l0.g f19997b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.n0.a f19998c;

    /* renamed from: d, reason: collision with root package name */
    private final j f19999d;

    /* renamed from: e, reason: collision with root package name */
    private final i f20000e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.m0.a f20001f;

    /* renamed from: g, reason: collision with root package name */
    private final i f20002g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f20003h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20004i;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Map<f, ? extends kotlin.reflect.x.internal.l0.i.r.g<?>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> invoke() {
            Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> q;
            Collection<kotlin.reflect.x.internal.l0.d.a.n0.b> w = e.this.f19998c.w();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (kotlin.reflect.x.internal.l0.d.a.n0.b bVar : w) {
                f name = bVar.getName();
                if (name == null) {
                    name = a0.f19834c;
                }
                kotlin.reflect.x.internal.l0.i.r.g l = eVar.l(bVar);
                Pair a = l != null ? s.a(name, l) : null;
                if (a != null) {
                    arrayList.add(a);
                }
            }
            q = o0.q(arrayList);
            return q;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<kotlin.reflect.x.internal.l0.f.c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.f.c invoke() {
            kotlin.reflect.x.internal.l0.f.b c2 = e.this.f19998c.c();
            if (c2 != null) {
                return c2.b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<m0> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            kotlin.reflect.x.internal.l0.f.c d2 = e.this.d();
            if (d2 == null) {
                return k.d(kotlin.reflect.x.internal.l0.l.u1.j.I0, e.this.f19998c.toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e f2 = d.f(d.a, d2, e.this.f19997b.d().o(), null, 4, null);
            if (f2 == null) {
                kotlin.reflect.x.internal.l0.d.a.n0.g z = e.this.f19998c.z();
                f2 = z != null ? e.this.f19997b.a().n().a(z) : null;
                if (f2 == null) {
                    f2 = e.this.h(d2);
                }
            }
            return f2.s();
        }
    }

    public e(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.x.internal.l0.d.a.n0.a aVar, boolean z) {
        l.f(gVar, "c");
        l.f(aVar, "javaAnnotation");
        this.f19997b = gVar;
        this.f19998c = aVar;
        this.f19999d = gVar.e().f(new b());
        this.f20000e = gVar.e().d(new c());
        this.f20001f = gVar.a().t().a(aVar);
        this.f20002g = gVar.e().d(new a());
        this.f20003h = aVar.f();
        this.f20004i = aVar.u() || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e h(kotlin.reflect.x.internal.l0.f.c cVar) {
        g0 d2 = this.f19997b.d();
        kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(cVar);
        l.e(m, "topLevel(fqName)");
        return x.c(d2, m, this.f19997b.a().b().d().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.x.internal.l0.i.r.g<?> l(kotlin.reflect.x.internal.l0.d.a.n0.b bVar) {
        if (bVar instanceof o) {
            return h.a.c(((o) bVar).getValue());
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            return o(mVar.b(), mVar.d());
        }
        if (!(bVar instanceof kotlin.reflect.x.internal.l0.d.a.n0.e)) {
            if (bVar instanceof kotlin.reflect.x.internal.l0.d.a.n0.c) {
                return m(((kotlin.reflect.x.internal.l0.d.a.n0.c) bVar).a());
            }
            if (bVar instanceof kotlin.reflect.x.internal.l0.d.a.n0.h) {
                return p(((kotlin.reflect.x.internal.l0.d.a.n0.h) bVar).c());
            }
            return null;
        }
        kotlin.reflect.x.internal.l0.d.a.n0.e eVar = (kotlin.reflect.x.internal.l0.d.a.n0.e) bVar;
        f name = eVar.getName();
        if (name == null) {
            name = a0.f19834c;
        }
        l.e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
        return n(name, eVar.e());
    }

    private final kotlin.reflect.x.internal.l0.i.r.g<?> m(kotlin.reflect.x.internal.l0.d.a.n0.a aVar) {
        return new kotlin.reflect.x.internal.l0.i.r.a(new e(this.f19997b, aVar, false, 4, null));
    }

    private final kotlin.reflect.x.internal.l0.i.r.g<?> n(f fVar, List<? extends kotlin.reflect.x.internal.l0.d.a.n0.b> list) {
        e0 l;
        int t;
        m0 type = getType();
        l.e(type, "type");
        if (kotlin.reflect.x.internal.l0.l.g0.a(type)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e e2 = kotlin.reflect.x.internal.l0.i.t.a.e(this);
        l.c(e2);
        i1 b2 = kotlin.reflect.x.internal.l0.d.a.j0.a.b(fVar, e2);
        if (b2 == null || (l = b2.getType()) == null) {
            l = this.f19997b.a().m().o().l(r1.INVARIANT, k.d(kotlin.reflect.x.internal.l0.l.u1.j.H0, new String[0]));
        }
        l.e(l, "DescriptorResolverUtils.…GUMENT)\n                )");
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.x.internal.l0.i.r.g<?> l2 = l((kotlin.reflect.x.internal.l0.d.a.n0.b) it.next());
            if (l2 == null) {
                l2 = new kotlin.reflect.x.internal.l0.i.r.s();
            }
            arrayList.add(l2);
        }
        return h.a.b(arrayList, l);
    }

    private final kotlin.reflect.x.internal.l0.i.r.g<?> o(kotlin.reflect.x.internal.l0.f.b bVar, f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new kotlin.reflect.x.internal.l0.i.r.j(bVar, fVar);
    }

    private final kotlin.reflect.x.internal.l0.i.r.g<?> p(kotlin.reflect.x.internal.l0.d.a.n0.x xVar) {
        return q.f20887b.a(this.f19997b.g().o(xVar, kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, false, null, 3, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> a() {
        return (Map) kotlin.reflect.x.internal.l0.k.m.a(this.f20002g, this, a[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public kotlin.reflect.x.internal.l0.f.c d() {
        return (kotlin.reflect.x.internal.l0.f.c) kotlin.reflect.x.internal.l0.k.m.b(this.f19999d, this, a[0]);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.k0.g
    public boolean f() {
        return this.f20003h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.x.internal.l0.d.a.m0.a t() {
        return this.f20001f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m0 getType() {
        return (m0) kotlin.reflect.x.internal.l0.k.m.a(this.f20000e, this, a[1]);
    }

    public final boolean k() {
        return this.f20004i;
    }

    public String toString() {
        return kotlin.reflect.x.internal.l0.h.c.s(kotlin.reflect.x.internal.l0.h.c.f20761g, this, null, 2, null);
    }

    public /* synthetic */ e(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.x.internal.l0.d.a.n0.a aVar, boolean z, int i2, kotlin.jvm.internal.g gVar2) {
        this(gVar, aVar, (i2 & 4) != 0 ? false : z);
    }
}
