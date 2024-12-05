package kotlin.reflect.x.internal.l0.d.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.d;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.i.r.h;
import kotlin.reflect.x.internal.l0.i.r.j;
import kotlin.reflect.x.internal.l0.i.r.k;
import kotlin.reflect.x.internal.l0.i.r.m;
import kotlin.reflect.x.internal.l0.i.r.u;
import kotlin.reflect.x.internal.l0.i.r.w;
import kotlin.reflect.x.internal.l0.i.r.y;
import kotlin.reflect.x.internal.l0.i.r.z;
import kotlin.reflect.x.internal.l0.j.b.e;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.text.v;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.reflect.x.internal.l0.d.b.a<kotlin.reflect.jvm.internal.impl.descriptors.n1.c, g<?>> {

    /* renamed from: c, reason: collision with root package name */
    private final g0 f20246c;

    /* renamed from: d, reason: collision with root package name */
    private final j0 f20247d;

    /* renamed from: e, reason: collision with root package name */
    private final e f20248e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes2.dex */
    private abstract class a implements q.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.b.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0302a implements q.a {
            private final /* synthetic */ q.a a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q.a f20249b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f20250c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f20251d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> f20252e;

            C0302a(q.a aVar, a aVar2, f fVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> arrayList) {
                this.f20249b = aVar;
                this.f20250c = aVar2;
                this.f20251d = fVar;
                this.f20252e = arrayList;
                this.a = aVar;
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public void a() {
                this.f20249b.a();
                this.f20250c.h(this.f20251d, new kotlin.reflect.x.internal.l0.i.r.a((kotlin.reflect.jvm.internal.impl.descriptors.n1.c) r.n0(this.f20252e)));
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
                l.f(fVar2, "value");
                this.a.b(fVar, fVar2);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public void c(f fVar, Object obj) {
                this.a.c(fVar, obj);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
                l.f(bVar, "enumClassId");
                l.f(fVar2, "enumEntryName");
                this.a.d(fVar, bVar, fVar2);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
                l.f(bVar, "classId");
                return this.a.e(fVar, bVar);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.a
            public q.b f(f fVar) {
                return this.a.f(fVar);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b implements q.b {
            private final ArrayList<g<?>> a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f20253b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f20254c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f20255d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.f0.x.e.l0.d.b.c$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0303a implements q.a {
                private final /* synthetic */ q.a a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q.a f20256b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f20257c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> f20258d;

                C0303a(q.a aVar, b bVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> arrayList) {
                    this.f20256b = aVar;
                    this.f20257c = bVar;
                    this.f20258d = arrayList;
                    this.a = aVar;
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public void a() {
                    this.f20256b.a();
                    this.f20257c.a.add(new kotlin.reflect.x.internal.l0.i.r.a((kotlin.reflect.jvm.internal.impl.descriptors.n1.c) r.n0(this.f20258d)));
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
                    l.f(fVar2, "value");
                    this.a.b(fVar, fVar2);
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public void c(f fVar, Object obj) {
                    this.a.c(fVar, obj);
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
                    l.f(bVar, "enumClassId");
                    l.f(fVar2, "enumEntryName");
                    this.a.d(fVar, bVar, fVar2);
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
                    l.f(bVar, "classId");
                    return this.a.e(fVar, bVar);
                }

                @Override // kotlin.f0.x.e.l0.d.b.q.a
                public q.b f(f fVar) {
                    return this.a.f(fVar);
                }
            }

            b(c cVar, f fVar, a aVar) {
                this.f20253b = cVar;
                this.f20254c = fVar;
                this.f20255d = aVar;
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.b
            public void a() {
                this.f20255d.g(this.f20254c, this.a);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.b
            public void b(Object obj) {
                this.a.add(this.f20253b.K(this.f20254c, obj));
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.b
            public void c(kotlin.reflect.x.internal.l0.f.b bVar, f fVar) {
                l.f(bVar, "enumClassId");
                l.f(fVar, "enumEntryName");
                this.a.add(new j(bVar, fVar));
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.b
            public q.a d(kotlin.reflect.x.internal.l0.f.b bVar) {
                l.f(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                c cVar = this.f20253b;
                z0 z0Var = z0.a;
                l.e(z0Var, "NO_SOURCE");
                q.a x = cVar.x(bVar, z0Var, arrayList);
                l.c(x);
                return new C0303a(x, this, arrayList);
            }

            @Override // kotlin.f0.x.e.l0.d.b.q.b
            public void e(kotlin.reflect.x.internal.l0.i.r.f fVar) {
                l.f(fVar, "value");
                this.a.add(new kotlin.reflect.x.internal.l0.i.r.q(fVar));
            }
        }

        public a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
            l.f(fVar2, "value");
            h(fVar, new kotlin.reflect.x.internal.l0.i.r.q(fVar2));
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void c(f fVar, Object obj) {
            h(fVar, c.this.K(fVar, obj));
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
            l.f(bVar, "enumClassId");
            l.f(fVar2, "enumEntryName");
            h(fVar, new j(bVar, fVar2));
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
            l.f(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            c cVar = c.this;
            z0 z0Var = z0.a;
            l.e(z0Var, "NO_SOURCE");
            q.a x = cVar.x(bVar, z0Var, arrayList);
            l.c(x);
            return new C0302a(x, this, fVar, arrayList);
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.b f(f fVar) {
            return new b(c.this, fVar, this);
        }

        public abstract void g(f fVar, ArrayList<g<?>> arrayList);

        public abstract void h(f fVar, g<?> gVar);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<f, g<?>> f20259b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f20261d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.f.b f20262e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> f20263f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z0 f20264g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.f.b bVar, List<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list, z0 z0Var) {
            super();
            this.f20261d = eVar;
            this.f20262e = bVar;
            this.f20263f = list;
            this.f20264g = z0Var;
            this.f20259b = new HashMap<>();
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void a() {
            if (c.this.E(this.f20262e, this.f20259b) || c.this.w(this.f20262e)) {
                return;
            }
            this.f20263f.add(new d(this.f20261d.s(), this.f20259b, this.f20264g));
        }

        @Override // kotlin.f0.x.e.l0.d.b.c.a
        public void g(f fVar, ArrayList<g<?>> arrayList) {
            l.f(arrayList, "elements");
            if (fVar == null) {
                return;
            }
            i1 b2 = kotlin.reflect.x.internal.l0.d.a.j0.a.b(fVar, this.f20261d);
            if (b2 != null) {
                HashMap<f, g<?>> hashMap = this.f20259b;
                h hVar = h.a;
                List<? extends g<?>> c2 = kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
                e0 type = b2.getType();
                l.e(type, "parameter.type");
                hashMap.put(fVar, hVar.b(c2, type));
                return;
            }
            if (c.this.w(this.f20262e) && l.a(fVar.f(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof kotlin.reflect.x.internal.l0.i.r.a) {
                        arrayList2.add(obj);
                    }
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list = this.f20263f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((kotlin.reflect.x.internal.l0.i.r.a) it.next()).b());
                }
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.c.a
        public void h(f fVar, g<?> gVar) {
            l.f(gVar, "value");
            if (fVar != null) {
                this.f20259b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g0 g0Var, j0 j0Var, n nVar, o oVar) {
        super(nVar, oVar);
        l.f(g0Var, "module");
        l.f(j0Var, "notFoundClasses");
        l.f(nVar, "storageManager");
        l.f(oVar, "kotlinClassFinder");
        this.f20246c = g0Var;
        this.f20247d = j0Var;
        this.f20248e = new e(g0Var, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g<?> K(f fVar, Object obj) {
        g<?> c2 = h.a.c(obj);
        if (c2 != null) {
            return c2;
        }
        return k.f20873b.a("Unsupported annotation argument: " + fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e N(kotlin.reflect.x.internal.l0.f.b bVar) {
        return x.c(this.f20246c, bVar, this.f20247d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.b.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public g<?> G(String str, Object obj) {
        boolean F;
        l.f(str, "desc");
        l.f(obj, "initializer");
        F = v.F("ZBCS", str, false, 2, null);
        if (F) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(str);
        }
        return h.a.c(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.b.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.c A(kotlin.reflect.x.internal.l0.e.b bVar, kotlin.reflect.x.internal.l0.e.z.c cVar) {
        l.f(bVar, "proto");
        l.f(cVar, "nameResolver");
        return this.f20248e.a(bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.b.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public g<?> I(g<?> gVar) {
        g<?> yVar;
        l.f(gVar, "constant");
        if (gVar instanceof kotlin.reflect.x.internal.l0.i.r.d) {
            yVar = new w(((kotlin.reflect.x.internal.l0.i.r.d) gVar).b().byteValue());
        } else if (gVar instanceof u) {
            yVar = new z(((u) gVar).b().shortValue());
        } else if (gVar instanceof m) {
            yVar = new kotlin.reflect.x.internal.l0.i.r.x(((m) gVar).b().intValue());
        } else {
            if (!(gVar instanceof kotlin.reflect.x.internal.l0.i.r.r)) {
                return gVar;
            }
            yVar = new y(((kotlin.reflect.x.internal.l0.i.r.r) gVar).b().longValue());
        }
        return yVar;
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.b
    protected q.a x(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var, List<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list) {
        l.f(bVar, "annotationClassId");
        l.f(z0Var, "source");
        l.f(list, "result");
        return new b(N(bVar), bVar, list, z0Var);
    }
}
