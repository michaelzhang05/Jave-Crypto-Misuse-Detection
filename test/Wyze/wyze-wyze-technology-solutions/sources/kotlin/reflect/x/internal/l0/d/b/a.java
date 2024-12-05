package kotlin.reflect.x.internal.l0.d.b;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.b.o;
import kotlin.reflect.x.internal.l0.d.b.b;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.d.b.t;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.q;
import kotlin.reflect.x.internal.l0.j.b.z;
import kotlin.reflect.x.internal.l0.k.g;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes2.dex */
public abstract class a<A, C> extends kotlin.reflect.x.internal.l0.d.b.b<A, C0299a<? extends A, ? extends C>> implements kotlin.reflect.x.internal.l0.j.b.c<A, C> {

    /* renamed from: b, reason: collision with root package name */
    private final g<q, C0299a<A, C>> f20218b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0299a<A, C> extends b.a<A> {
        private final Map<t, List<A>> a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<t, C> f20219b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<t, C> f20220c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0299a(Map<t, ? extends List<? extends A>> map, Map<t, ? extends C> map2, Map<t, ? extends C> map3) {
            l.f(map, "memberAnnotations");
            l.f(map2, "propertyConstants");
            l.f(map3, "annotationParametersDefaultValues");
            this.a = map;
            this.f20219b = map2;
            this.f20220c = map3;
        }

        @Override // kotlin.f0.x.e.l0.d.b.b.a
        public Map<t, List<A>> a() {
            return this.a;
        }

        public final Map<t, C> b() {
            return this.f20220c;
        }

        public final Map<t, C> c() {
            return this.f20219b;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function2<C0299a<? extends A, ? extends C>, t, C> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f20221f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(C0299a<? extends A, ? extends C> c0299a, t tVar) {
            l.f(c0299a, "$this$loadConstantFromProperty");
            l.f(tVar, "it");
            return c0299a.b().get(tVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    public static final class c implements q.d {
        final /* synthetic */ a<A, C> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<t, List<A>> f20222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f20223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<t, C> f20224d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<t, C> f20225e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.b.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0300a extends b implements q.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f20226d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0300a(c cVar, t tVar) {
                super(cVar, tVar);
                l.f(tVar, RoomInstalled.SIGNATURE);
                this.f20226d = cVar;
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.e
            public q.a c(int i2, kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var) {
                l.f(bVar, "classId");
                l.f(z0Var, "source");
                t e2 = t.a.e(d(), i2);
                List<A> list = this.f20226d.f20222b.get(e2);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f20226d.f20222b.put(e2, list);
                }
                return this.f20226d.a.y(bVar, z0Var, list);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* loaded from: classes2.dex */
        public class b implements q.c {
            private final t a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList<A> f20227b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f20228c;

            public b(c cVar, t tVar) {
                l.f(tVar, RoomInstalled.SIGNATURE);
                this.f20228c = cVar;
                this.a = tVar;
                this.f20227b = new ArrayList<>();
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.c
            public void a() {
                if (!this.f20227b.isEmpty()) {
                    this.f20228c.f20222b.put(this.a, this.f20227b);
                }
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.c
            public q.a b(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var) {
                l.f(bVar, "classId");
                l.f(z0Var, "source");
                return this.f20228c.a.y(bVar, z0Var, this.f20227b);
            }

            protected final t d() {
                return this.a;
            }
        }

        c(a<A, C> aVar, HashMap<t, List<A>> hashMap, q qVar, HashMap<t, C> hashMap2, HashMap<t, C> hashMap3) {
            this.a = aVar;
            this.f20222b = hashMap;
            this.f20223c = qVar;
            this.f20224d = hashMap2;
            this.f20225e = hashMap3;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.d
        public q.c a(f fVar, String str, Object obj) {
            C G;
            l.f(fVar, "name");
            l.f(str, "desc");
            t.a aVar = t.a;
            String f2 = fVar.f();
            l.e(f2, "name.asString()");
            t a = aVar.a(f2, str);
            if (obj != null && (G = this.a.G(str, obj)) != null) {
                this.f20225e.put(a, G);
            }
            return new b(this, a);
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.d
        public q.e b(f fVar, String str) {
            l.f(fVar, "name");
            l.f(str, "desc");
            t.a aVar = t.a;
            String f2 = fVar.f();
            l.e(f2, "name.asString()");
            return new C0300a(this, aVar.d(f2, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function2<C0299a<? extends A, ? extends C>, t, C> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f20229f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(C0299a<? extends A, ? extends C> c0299a, t tVar) {
            l.f(c0299a, "$this$loadConstantFromProperty");
            l.f(tVar, "it");
            return c0299a.c().get(tVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<q, C0299a<? extends A, ? extends C>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<A, C> f20230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<A, C> aVar) {
            super(1);
            this.f20230f = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0299a<A, C> invoke(q qVar) {
            l.f(qVar, "kotlinClass");
            return this.f20230f.F(qVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, o oVar) {
        super(oVar);
        l.f(nVar, "storageManager");
        l.f(oVar, "kotlinClassFinder");
        this.f20218b = nVar.h(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0299a<A, C> F(q qVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        qVar.d(new c(this, hashMap, qVar, hashMap3, hashMap2), q(qVar));
        return new C0299a<>(hashMap, hashMap2, hashMap3);
    }

    private final C H(z zVar, kotlin.reflect.x.internal.l0.e.n nVar, kotlin.reflect.x.internal.l0.j.b.b bVar, e0 e0Var, Function2<? super C0299a<? extends A, ? extends C>, ? super t, ? extends C> function2) {
        C invoke;
        q o = o(zVar, v(zVar, true, true, kotlin.reflect.x.internal.l0.e.z.b.A.d(nVar.c0()), i.f(nVar)));
        if (o == null) {
            return null;
        }
        t r = r(nVar, zVar.b(), zVar.d(), bVar, o.a().d().d(g.a.a()));
        if (r == null || (invoke = function2.invoke(this.f20218b.invoke(o), r)) == null) {
            return null;
        }
        return o.d(e0Var) ? I(invoke) : invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.b.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0299a<A, C> p(q qVar) {
        l.f(qVar, "binaryClass");
        return this.f20218b.invoke(qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean E(kotlin.reflect.x.internal.l0.f.b bVar, Map<f, ? extends kotlin.reflect.x.internal.l0.i.r.g<?>> map) {
        l.f(bVar, "annotationClassId");
        l.f(map, "arguments");
        if (!l.a(bVar, kotlin.reflect.x.internal.l0.a.a.a())) {
            return false;
        }
        kotlin.reflect.x.internal.l0.i.r.g<?> gVar = map.get(f.r("value"));
        kotlin.reflect.x.internal.l0.i.r.q qVar = gVar instanceof kotlin.reflect.x.internal.l0.i.r.q ? (kotlin.reflect.x.internal.l0.i.r.q) gVar : null;
        if (qVar == null) {
            return false;
        }
        q.b b2 = qVar.b();
        q.b.C0338b c0338b = b2 instanceof q.b.C0338b ? (q.b.C0338b) b2 : null;
        if (c0338b == null) {
            return false;
        }
        return w(c0338b.b());
    }

    protected abstract C G(String str, Object obj);

    protected abstract C I(C c2);

    @Override // kotlin.reflect.x.internal.l0.j.b.c
    public C e(z zVar, kotlin.reflect.x.internal.l0.e.n nVar, e0 e0Var) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        l.f(e0Var, "expectedType");
        return H(zVar, nVar, kotlin.reflect.x.internal.l0.j.b.b.PROPERTY, e0Var, d.f20229f);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.c
    public C k(z zVar, kotlin.reflect.x.internal.l0.e.n nVar, e0 e0Var) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        l.f(e0Var, "expectedType");
        return H(zVar, nVar, kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_GETTER, e0Var, b.f20221f);
    }
}
