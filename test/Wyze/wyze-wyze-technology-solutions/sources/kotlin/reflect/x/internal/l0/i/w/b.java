package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.n;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.utils.e;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;

/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20906b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final String f20907c;

    /* renamed from: d, reason: collision with root package name */
    private final h[] f20908d;

    /* compiled from: ChainedMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h a(String str, Iterable<? extends h> iterable) {
            l.f(str, "debugName");
            l.f(iterable, "scopes");
            e eVar = new e();
            for (h hVar : iterable) {
                if (hVar != h.b.f20931b) {
                    if (hVar instanceof b) {
                        y.z(eVar, ((b) hVar).f20908d);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return b(str, eVar);
        }

        public final h b(String str, List<? extends h> list) {
            l.f(str, "debugName");
            l.f(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return h.b.f20931b;
            }
            if (size != 1) {
                Object[] array = list.toArray(new h[0]);
                l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new b(str, (h[]) array, null);
            }
            return list.get(0);
        }
    }

    private b(String str, h[] hVarArr) {
        this.f20907c = str;
        this.f20908d = hVarArr;
    }

    public /* synthetic */ b(String str, h[] hVarArr, g gVar) {
        this(str, hVarArr);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        List i2;
        Set d2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        h[] hVarArr = this.f20908d;
        int length = hVarArr.length;
        if (length == 0) {
            i2 = t.i();
            return i2;
        }
        if (length != 1) {
            Collection<y0> collection = null;
            for (h hVar : hVarArr) {
                collection = kotlin.reflect.x.internal.l0.m.v.a.a(collection, hVar.a(fVar, bVar));
            }
            if (collection != null) {
                return collection;
            }
            d2 = u0.d();
            return d2;
        }
        return hVarArr[0].a(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        h[] hVarArr = this.f20908d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            y.y(linkedHashSet, hVar.b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        List i2;
        Set d2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        h[] hVarArr = this.f20908d;
        int length = hVarArr.length;
        if (length == 0) {
            i2 = t.i();
            return i2;
        }
        if (length != 1) {
            Collection<t0> collection = null;
            for (h hVar : hVarArr) {
                collection = kotlin.reflect.x.internal.l0.m.v.a.a(collection, hVar.c(fVar, bVar));
            }
            if (collection != null) {
                return collection;
            }
            d2 = u0.d();
            return d2;
        }
        return hVarArr[0].c(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        h[] hVarArr = this.f20908d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            y.y(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        Iterable p;
        p = n.p(this.f20908d);
        return j.a(p);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (h hVar2 : this.f20908d) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f2 = hVar2.f(fVar, bVar);
            if (f2 != null) {
                if (!(f2 instanceof i) || !((i) f2).M()) {
                    return f2;
                }
                if (hVar == null) {
                    hVar = f2;
                }
            }
        }
        return hVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super f, Boolean> function1) {
        List i2;
        Set d2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        h[] hVarArr = this.f20908d;
        int length = hVarArr.length;
        if (length == 0) {
            i2 = t.i();
            return i2;
        }
        if (length != 1) {
            Collection<m> collection = null;
            for (h hVar : hVarArr) {
                collection = kotlin.reflect.x.internal.l0.m.v.a.a(collection, hVar.g(dVar, function1));
            }
            if (collection != null) {
                return collection;
            }
            d2 = u0.d();
            return d2;
        }
        return hVarArr[0].g(dVar, function1);
    }

    public String toString() {
        return this.f20907c;
    }
}
