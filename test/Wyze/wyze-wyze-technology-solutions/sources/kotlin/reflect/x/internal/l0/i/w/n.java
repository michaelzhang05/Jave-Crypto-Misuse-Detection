package kotlin.reflect.x.internal.l0.i.w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.utils.e;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes2.dex */
public final class n extends kotlin.reflect.x.internal.l0.i.w.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20941b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final String f20942c;

    /* renamed from: d, reason: collision with root package name */
    private final h f20943d;

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h a(String str, Collection<? extends e0> collection) {
            int t;
            l.f(str, "message");
            l.f(collection, "types");
            t = u.t(collection, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((e0) it.next()).q());
            }
            e<h> b2 = kotlin.reflect.x.internal.l0.m.v.a.b(arrayList);
            h b3 = kotlin.reflect.x.internal.l0.i.w.b.f20906b.b(str, b2);
            return b2.size() <= 1 ? b3 : new n(str, b3, null);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f20944f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
            l.f(aVar, "$this$selectMostSpecificInEachOverridableGroup");
            return aVar;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<y0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f20945f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(y0 y0Var) {
            l.f(y0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return y0Var;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function1<t0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f20946f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(t0 t0Var) {
            l.f(t0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return t0Var;
        }
    }

    private n(String str, h hVar) {
        this.f20942c = str;
        this.f20943d = hVar;
    }

    public /* synthetic */ n(String str, h hVar, g gVar) {
        this(str, hVar);
    }

    public static final h j(String str, Collection<? extends e0> collection) {
        return f20941b.a(str, collection);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.a, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return kotlin.reflect.x.internal.l0.i.l.a(super.a(fVar, bVar), c.f20945f);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.a, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return kotlin.reflect.x.internal.l0.i.l.a(super.c(fVar, bVar), d.f20946f);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.a, kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        List k0;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        Collection<m> g2 = super.g(dVar, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g2) {
            if (((m) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        l.d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        k0 = b0.k0(kotlin.reflect.x.internal.l0.i.l.a(list, b.f20944f), list2);
        return k0;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.a
    protected h i() {
        return this.f20943d;
    }
}
