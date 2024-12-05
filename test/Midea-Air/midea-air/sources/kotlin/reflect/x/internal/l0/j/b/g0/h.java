package kotlin.reflect.x.internal.l0.j.b.g0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.r;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.d;
import kotlin.reflect.x.internal.l0.i.w.i;
import kotlin.reflect.x.internal.l0.j.b.m;
import kotlin.reflect.x.internal.l0.j.b.x;
import kotlin.reflect.x.internal.l0.k.g;
import kotlin.reflect.x.internal.l0.k.j;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes2.dex */
public abstract class h extends i {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21033b = {b0.g(new v(b0.b(h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), b0.g(new v(b0.b(h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c, reason: collision with root package name */
    private final m f21034c;

    /* renamed from: d, reason: collision with root package name */
    private final a f21035d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f21036e;

    /* renamed from: f, reason: collision with root package name */
    private final j f21037f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public interface a {
        Collection<y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar);

        Set<f> b();

        Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar);

        Set<f> d();

        Set<f> e();

        void f(Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1, kotlin.reflect.x.internal.l0.c.b.b bVar);

        d1 g(f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public final class b implements a {
        static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), b0.g(new v(b0.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), b0.g(new v(b0.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), b0.g(new v(b0.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), b0.g(new v(b0.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), b0.g(new v(b0.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), b0.g(new v(b0.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), b0.g(new v(b0.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), b0.g(new v(b0.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), b0.g(new v(b0.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b, reason: collision with root package name */
        private final List<kotlin.reflect.x.internal.l0.e.i> f21038b;

        /* renamed from: c, reason: collision with root package name */
        private final List<n> f21039c;

        /* renamed from: d, reason: collision with root package name */
        private final List<r> f21040d;

        /* renamed from: e, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21041e;

        /* renamed from: f, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21042f;

        /* renamed from: g, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21043g;

        /* renamed from: h, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21044h;

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21045i;

        /* renamed from: j, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21046j;

        /* renamed from: k, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21047k;
        private final kotlin.reflect.x.internal.l0.k.i l;
        private final kotlin.reflect.x.internal.l0.k.i m;
        private final kotlin.reflect.x.internal.l0.k.i n;
        final /* synthetic */ h o;

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function0<List<? extends y0>> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends y0> invoke() {
                List<? extends y0> k0;
                k0 = kotlin.collections.b0.k0(b.this.D(), b.this.t());
                return k0;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.x.e.l0.j.b.g0.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0347b extends Lambda implements Function0<List<? extends t0>> {
            C0347b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends t0> invoke() {
                List<? extends t0> k0;
                k0 = kotlin.collections.b0.k0(b.this.E(), b.this.u());
                return k0;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class c extends Lambda implements Function0<List<? extends d1>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends d1> invoke() {
                return b.this.z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class d extends Lambda implements Function0<List<? extends y0>> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends y0> invoke() {
                return b.this.v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class e extends Lambda implements Function0<List<? extends t0>> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends t0> invoke() {
                return b.this.y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class f extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f21054g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                this.f21054g = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
                Set<kotlin.reflect.x.internal.l0.f.f> j2;
                b bVar = b.this;
                List list = bVar.f21038b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((kotlin.reflect.x.internal.l0.e.i) ((o) it.next())).f0()));
                }
                j2 = v0.j(linkedHashSet, this.f21054g.t());
                return j2;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class g extends Lambda implements Function0<Map<kotlin.reflect.x.internal.l0.f.f, ? extends List<? extends y0>>> {
            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.x.internal.l0.f.f, List<y0>> invoke() {
                List A = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    kotlin.reflect.x.internal.l0.f.f name = ((y0) obj).getName();
                    l.e(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.x.e.l0.j.b.g0.h$b$h, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0348h extends Lambda implements Function0<Map<kotlin.reflect.x.internal.l0.f.f, ? extends List<? extends t0>>> {
            C0348h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.x.internal.l0.f.f, List<t0>> invoke() {
                List B = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    kotlin.reflect.x.internal.l0.f.f name = ((t0) obj).getName();
                    l.e(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class i extends Lambda implements Function0<Map<kotlin.reflect.x.internal.l0.f.f, ? extends d1>> {
            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.x.internal.l0.f.f, d1> invoke() {
                int t;
                int e2;
                int b2;
                List C = b.this.C();
                t = u.t(C, 10);
                e2 = n0.e(t);
                b2 = kotlin.ranges.f.b(e2, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                for (Object obj : C) {
                    kotlin.reflect.x.internal.l0.f.f name = ((d1) obj).getName();
                    l.e(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class j extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f21059g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(h hVar) {
                super(0);
                this.f21059g = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
                Set<kotlin.reflect.x.internal.l0.f.f> j2;
                b bVar = b.this;
                List list = bVar.f21039c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((n) ((o) it.next())).e0()));
                }
                j2 = v0.j(linkedHashSet, this.f21059g.u());
                return j2;
            }
        }

        public b(h hVar, List<kotlin.reflect.x.internal.l0.e.i> list, List<n> list2, List<r> list3) {
            l.f(list, "functionList");
            l.f(list2, "propertyList");
            l.f(list3, "typeAliasList");
            this.o = hVar;
            this.f21038b = list;
            this.f21039c = list2;
            this.f21040d = hVar.p().c().g().f() ? list3 : t.i();
            this.f21041e = hVar.p().h().d(new d());
            this.f21042f = hVar.p().h().d(new e());
            this.f21043g = hVar.p().h().d(new c());
            this.f21044h = hVar.p().h().d(new a());
            this.f21045i = hVar.p().h().d(new C0347b());
            this.f21046j = hVar.p().h().d(new i());
            this.f21047k = hVar.p().h().d(new g());
            this.l = hVar.p().h().d(new C0348h());
            this.m = hVar.p().h().d(new f(hVar));
            this.n = hVar.p().h().d(new j(hVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<y0> A() {
            return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21044h, this, a[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<t0> B() {
            return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21045i, this, a[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<d1> C() {
            return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21043g, this, a[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<y0> D() {
            return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21041e, this, a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<t0> E() {
            return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21042f, this, a[1]);
        }

        private final Map<kotlin.reflect.x.internal.l0.f.f, Collection<y0>> F() {
            return (Map) kotlin.reflect.x.internal.l0.k.m.a(this.f21047k, this, a[6]);
        }

        private final Map<kotlin.reflect.x.internal.l0.f.f, Collection<t0>> G() {
            return (Map) kotlin.reflect.x.internal.l0.k.m.a(this.l, this, a[7]);
        }

        private final Map<kotlin.reflect.x.internal.l0.f.f, d1> H() {
            return (Map) kotlin.reflect.x.internal.l0.k.m.a(this.f21046j, this, a[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<y0> t() {
            Set<kotlin.reflect.x.internal.l0.f.f> t = this.o.t();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = t.iterator();
            while (it.hasNext()) {
                y.y(arrayList, w((kotlin.reflect.x.internal.l0.f.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<t0> u() {
            Set<kotlin.reflect.x.internal.l0.f.f> u = this.o.u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = u.iterator();
            while (it.hasNext()) {
                y.y(arrayList, x((kotlin.reflect.x.internal.l0.f.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<y0> v() {
            List<kotlin.reflect.x.internal.l0.e.i> list = this.f21038b;
            h hVar = this.o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                y0 j2 = hVar.p().f().j((kotlin.reflect.x.internal.l0.e.i) ((o) it.next()));
                if (!hVar.x(j2)) {
                    j2 = null;
                }
                if (j2 != null) {
                    arrayList.add(j2);
                }
            }
            return arrayList;
        }

        private final List<y0> w(kotlin.reflect.x.internal.l0.f.f fVar) {
            List<y0> D = D();
            h hVar = this.o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (l.a(((kotlin.reflect.jvm.internal.impl.descriptors.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<t0> x(kotlin.reflect.x.internal.l0.f.f fVar) {
            List<t0> E = E();
            h hVar = this.o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E) {
                if (l.a(((kotlin.reflect.jvm.internal.impl.descriptors.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<t0> y() {
            List<n> list = this.f21039c;
            h hVar = this.o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                t0 l = hVar.p().f().l((n) ((o) it.next()));
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<d1> z() {
            List<r> list = this.f21040d;
            h hVar = this.o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                d1 m = hVar.p().f().m((r) ((o) it.next()));
                if (m != null) {
                    arrayList.add(m);
                }
            }
            return arrayList;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Collection<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            List i2;
            List i3;
            l.f(fVar, "name");
            l.f(bVar, "location");
            if (!b().contains(fVar)) {
                i3 = t.i();
                return i3;
            }
            Collection<y0> collection = F().get(fVar);
            if (collection != null) {
                return collection;
            }
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> b() {
            return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.m, this, a[8]);
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Collection<t0> c(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            List i2;
            List i3;
            l.f(fVar, "name");
            l.f(bVar, "location");
            if (!d().contains(fVar)) {
                i3 = t.i();
                return i3;
            }
            Collection<t0> collection = G().get(fVar);
            if (collection != null) {
                return collection;
            }
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> d() {
            return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.n, this, a[9]);
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> e() {
            List<r> list = this.f21040d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h hVar = this.o;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(x.b(hVar.p().g(), ((r) ((o) it.next())).Y()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public void f(Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            l.f(collection, "result");
            l.f(dVar, "kindFilter");
            l.f(function1, "nameFilter");
            l.f(bVar, "location");
            if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.i())) {
                for (Object obj : B()) {
                    kotlin.reflect.x.internal.l0.f.f name = ((t0) obj).getName();
                    l.e(name, "it.name");
                    if (function1.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.d())) {
                for (Object obj2 : A()) {
                    kotlin.reflect.x.internal.l0.f.f name2 = ((y0) obj2).getName();
                    l.e(name2, "it.name");
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public d1 g(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "name");
            return H().get(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public final class c implements a {
        static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), b0.g(new v(b0.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b, reason: collision with root package name */
        private final Map<kotlin.reflect.x.internal.l0.f.f, byte[]> f21060b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<kotlin.reflect.x.internal.l0.f.f, byte[]> f21061c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<kotlin.reflect.x.internal.l0.f.f, byte[]> f21062d;

        /* renamed from: e, reason: collision with root package name */
        private final g<kotlin.reflect.x.internal.l0.f.f, Collection<y0>> f21063e;

        /* renamed from: f, reason: collision with root package name */
        private final g<kotlin.reflect.x.internal.l0.f.f, Collection<t0>> f21064f;

        /* renamed from: g, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.h<kotlin.reflect.x.internal.l0.f.f, d1> f21065g;

        /* renamed from: h, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21066h;

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.k.i f21067i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f21068j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [M] */
        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class a<M> extends Lambda implements Function0<M> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ q<M> f21069f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f21070g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ h f21071h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q<M> qVar, ByteArrayInputStream byteArrayInputStream, h hVar) {
                super(0);
                this.f21069f = qVar;
                this.f21070g = byteArrayInputStream;
                this.f21071h = hVar;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o invoke() {
                return (o) this.f21069f.c(this.f21070g, this.f21071h.p().c().j());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f21073g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(0);
                this.f21073g = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
                Set<kotlin.reflect.x.internal.l0.f.f> j2;
                j2 = v0.j(c.this.f21060b.keySet(), this.f21073g.t());
                return j2;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.x.e.l0.j.b.g0.h$c$c, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0349c extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
            C0349c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
                l.f(fVar, "it");
                return c.this.m(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class d extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends t0>> {
            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<t0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
                l.f(fVar, "it");
                return c.this.n(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class e extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, d1> {
            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d1 invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
                l.f(fVar, "it");
                return c.this.o(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        static final class f extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f21078g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                this.f21078g = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
                Set<kotlin.reflect.x.internal.l0.f.f> j2;
                j2 = v0.j(c.this.f21061c.keySet(), this.f21078g.u());
                return j2;
            }
        }

        public c(h hVar, List<kotlin.reflect.x.internal.l0.e.i> list, List<n> list2, List<r> list3) {
            Map<kotlin.reflect.x.internal.l0.f.f, byte[]> i2;
            l.f(list, "functionList");
            l.f(list2, "propertyList");
            l.f(list3, "typeAliasList");
            this.f21068j = hVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                kotlin.reflect.x.internal.l0.f.f b2 = x.b(hVar.p().g(), ((kotlin.reflect.x.internal.l0.e.i) ((o) obj)).f0());
                Object obj2 = linkedHashMap.get(b2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b2, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f21060b = p(linkedHashMap);
            h hVar2 = this.f21068j;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                kotlin.reflect.x.internal.l0.f.f b3 = x.b(hVar2.p().g(), ((n) ((o) obj3)).e0());
                Object obj4 = linkedHashMap2.get(b3);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b3, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f21061c = p(linkedHashMap2);
            if (this.f21068j.p().c().g().f()) {
                h hVar3 = this.f21068j;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    kotlin.reflect.x.internal.l0.f.f b4 = x.b(hVar3.p().g(), ((r) ((o) obj5)).Y());
                    Object obj6 = linkedHashMap3.get(b4);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b4, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                i2 = p(linkedHashMap3);
            } else {
                i2 = o0.i();
            }
            this.f21062d = i2;
            this.f21063e = this.f21068j.p().h().h(new C0349c());
            this.f21064f = this.f21068j.p().h().h(new d());
            this.f21065g = this.f21068j.p().h().i(new e());
            this.f21066h = this.f21068j.p().h().d(new b(this.f21068j));
            this.f21067i = this.f21068j.p().h().d(new f(this.f21068j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
        
            if (r0 != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y0> m(kotlin.reflect.x.internal.l0.f.f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.x.e.l0.f.f, byte[]> r0 = r6.f21060b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.i> r1 = kotlin.reflect.x.internal.l0.e.i.f20513i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.l.e(r1, r2)
                kotlin.f0.x.e.l0.j.b.g0.h r2 = r6.f21068j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.x.e.l0.j.b.g0.h r3 = r6.f21068j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.x.e.l0.j.b.g0.h$c$a r0 = new kotlin.f0.x.e.l0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.i.g(r0)
                java.util.List r0 = kotlin.sequences.i.A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.r.i()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L66
                java.lang.Object r3 = r0.next()
                kotlin.f0.x.e.l0.e.i r3 = (kotlin.reflect.x.internal.l0.e.i) r3
                kotlin.f0.x.e.l0.j.b.m r4 = r2.p()
                kotlin.f0.x.e.l0.j.b.w r4 = r4.f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.l.e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = r4.j(r3)
                boolean r4 = r2.x(r3)
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L66:
                r2.k(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.j.b.g0.h.c.m(kotlin.f0.x.e.l0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
        
            if (r0 != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.t0> n(kotlin.reflect.x.internal.l0.f.f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.x.e.l0.f.f, byte[]> r0 = r6.f21061c
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.n> r1 = kotlin.reflect.x.internal.l0.e.n.f20546i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.l.e(r1, r2)
                kotlin.f0.x.e.l0.j.b.g0.h r2 = r6.f21068j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.x.e.l0.j.b.g0.h r3 = r6.f21068j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.x.e.l0.j.b.g0.h$c$a r0 = new kotlin.f0.x.e.l0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.i.g(r0)
                java.util.List r0 = kotlin.sequences.i.A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.r.i()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                kotlin.f0.x.e.l0.e.n r3 = (kotlin.reflect.x.internal.l0.e.n) r3
                kotlin.f0.x.e.l0.j.b.m r4 = r2.p()
                kotlin.f0.x.e.l0.j.b.w r4 = r4.f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.l.e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r3 = r4.l(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5e:
                r2.l(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.j.b.g0.h.c.n(kotlin.f0.x.e.l0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d1 o(kotlin.reflect.x.internal.l0.f.f fVar) {
            r p0;
            byte[] bArr = this.f21062d.get(fVar);
            if (bArr == null || (p0 = r.p0(new ByteArrayInputStream(bArr), this.f21068j.p().c().j())) == null) {
                return null;
            }
            return this.f21068j.p().f().m(p0);
        }

        private final Map<kotlin.reflect.x.internal.l0.f.f, byte[]> p(Map<kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            int e2;
            int t;
            e2 = n0.e(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                t = u.t(iterable, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).i(byteArrayOutputStream);
                    arrayList.add(kotlin.u.a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Collection<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            List i2;
            l.f(fVar, "name");
            l.f(bVar, "location");
            if (b().contains(fVar)) {
                return this.f21063e.invoke(fVar);
            }
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> b() {
            return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.f21066h, this, a[0]);
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Collection<t0> c(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            List i2;
            l.f(fVar, "name");
            l.f(bVar, "location");
            if (d().contains(fVar)) {
                return this.f21064f.invoke(fVar);
            }
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> d() {
            return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.f21067i, this, a[1]);
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public Set<kotlin.reflect.x.internal.l0.f.f> e() {
            return this.f21062d.keySet();
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public void f(Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1, kotlin.reflect.x.internal.l0.c.b.b bVar) {
            l.f(collection, "result");
            l.f(dVar, "kindFilter");
            l.f(function1, "nameFilter");
            l.f(bVar, "location");
            if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.i())) {
                Set<kotlin.reflect.x.internal.l0.f.f> d2 = d();
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.x.internal.l0.f.f fVar : d2) {
                    if (function1.invoke(fVar).booleanValue()) {
                        arrayList.addAll(c(fVar, bVar));
                    }
                }
                kotlin.reflect.x.internal.l0.i.g gVar = kotlin.reflect.x.internal.l0.i.g.f20835f;
                l.e(gVar, "INSTANCE");
                kotlin.collections.x.x(arrayList, gVar);
                collection.addAll(arrayList);
            }
            if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.d())) {
                Set<kotlin.reflect.x.internal.l0.f.f> b2 = b();
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.x.internal.l0.f.f fVar2 : b2) {
                    if (function1.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, bVar));
                    }
                }
                kotlin.reflect.x.internal.l0.i.g gVar2 = kotlin.reflect.x.internal.l0.i.g.f20835f;
                l.e(gVar2, "INSTANCE");
                kotlin.collections.x.x(arrayList2, gVar2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.f0.x.e.l0.j.b.g0.h.a
        public d1 g(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "name");
            return this.f21065g.invoke(fVar);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function0<Set<? extends f>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Collection<f>> f21079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends Collection<f>> function0) {
            super(0);
            this.f21079f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<f> invoke() {
            Set<f> C0;
            C0 = kotlin.collections.b0.C0(this.f21079f.invoke());
            return C0;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function0<Set<? extends f>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<f> invoke() {
            Set j2;
            Set<f> j3;
            Set<f> s = h.this.s();
            if (s == null) {
                return null;
            }
            j2 = v0.j(h.this.q(), h.this.f21035d.e());
            j3 = v0.j(j2, s);
            return j3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(m mVar, List<kotlin.reflect.x.internal.l0.e.i> list, List<n> list2, List<r> list3, Function0<? extends Collection<f>> function0) {
        l.f(mVar, "c");
        l.f(list, "functionList");
        l.f(list2, "propertyList");
        l.f(list3, "typeAliasList");
        l.f(function0, "classNames");
        this.f21034c = mVar;
        this.f21035d = n(list, list2, list3);
        this.f21036e = mVar.h().d(new d(function0));
        this.f21037f = mVar.h().f(new e());
    }

    private final a n(List<kotlin.reflect.x.internal.l0.e.i> list, List<n> list2, List<r> list3) {
        if (this.f21034c.c().g().a()) {
            return new b(this, list, list2, list3);
        }
        return new c(this, list, list2, list3);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e o(f fVar) {
        return this.f21034c.c().b(m(fVar));
    }

    private final Set<f> r() {
        return (Set) kotlin.reflect.x.internal.l0.k.m.b(this.f21037f, this, f21033b[1]);
    }

    private final d1 v(f fVar) {
        return this.f21035d.g(fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return this.f21035d.a(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        return this.f21035d.b();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return this.f21035d.c(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        return this.f21035d.d();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        return r();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        if (w(fVar)) {
            return o(fVar);
        }
        if (this.f21035d.e().contains(fVar)) {
            return v(fVar);
        }
        return null;
    }

    protected abstract void i(Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, Function1<? super f, Boolean> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> j(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        l.f(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = kotlin.reflect.x.internal.l0.i.w.d.a;
        if (dVar.a(aVar.g())) {
            i(arrayList, function1);
        }
        this.f21035d.f(arrayList, dVar, function1, bVar);
        if (dVar.a(aVar.c())) {
            for (f fVar : q()) {
                if (function1.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, o(fVar));
                }
            }
        }
        if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.h())) {
            for (f fVar2 : this.f21035d.e()) {
                if (function1.invoke(fVar2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f21035d.g(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    protected void k(f fVar, List<y0> list) {
        l.f(fVar, "name");
        l.f(list, "functions");
    }

    protected void l(f fVar, List<t0> list) {
        l.f(fVar, "name");
        l.f(list, "descriptors");
    }

    protected abstract kotlin.reflect.x.internal.l0.f.b m(f fVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final m p() {
        return this.f21034c;
    }

    public final Set<f> q() {
        return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.f21036e, this, f21033b[0]);
    }

    protected abstract Set<f> s();

    protected abstract Set<f> t();

    protected abstract Set<f> u();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w(f fVar) {
        l.f(fVar, "name");
        return q().contains(fVar);
    }

    protected boolean x(y0 y0Var) {
        l.f(y0Var, "function");
        return true;
    }
}
