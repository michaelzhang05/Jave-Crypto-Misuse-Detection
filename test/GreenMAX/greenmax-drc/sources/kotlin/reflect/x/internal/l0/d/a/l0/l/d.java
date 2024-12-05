package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.n;
import kotlin.collections.u0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.u;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.i.w.j;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;

/* compiled from: JvmPackageScope.kt */
/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19991b = {b0.g(new v(b0.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: c, reason: collision with root package name */
    private final g f19992c;

    /* renamed from: d, reason: collision with root package name */
    private final h f19993d;

    /* renamed from: e, reason: collision with root package name */
    private final i f19994e;

    /* renamed from: f, reason: collision with root package name */
    private final i f19995f;

    /* compiled from: JvmPackageScope.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<h[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h[] invoke() {
            Collection<q> values = d.this.f19993d.N0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                h b2 = dVar.f19992c.a().b().b(dVar.f19993d, (q) it.next());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            Object[] array = kotlin.reflect.x.internal.l0.m.v.a.b(arrayList).toArray(new h[0]);
            l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (h[]) array;
        }
    }

    public d(g gVar, u uVar, h hVar) {
        l.f(gVar, "c");
        l.f(uVar, "jPackage");
        l.f(hVar, "packageFragment");
        this.f19992c = gVar;
        this.f19993d = hVar;
        this.f19994e = new i(gVar, uVar, hVar);
        this.f19995f = gVar.e().d(new a());
    }

    private final h[] k() {
        return (h[]) m.a(this.f19995f, this, f19991b[0]);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, b bVar) {
        Set d2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        l(fVar, bVar);
        i iVar = this.f19994e;
        h[] k2 = k();
        Collection<? extends y0> a2 = iVar.a(fVar, bVar);
        int length = k2.length;
        int i2 = 0;
        Collection collection = a2;
        while (i2 < length) {
            Collection a3 = kotlin.reflect.x.internal.l0.m.v.a.a(collection, k2[i2].a(fVar, bVar));
            i2++;
            collection = a3;
        }
        if (collection != null) {
            return collection;
        }
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        h[] k2 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : k2) {
            y.y(linkedHashSet, hVar.b());
        }
        linkedHashSet.addAll(this.f19994e.b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, b bVar) {
        Set d2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        l(fVar, bVar);
        i iVar = this.f19994e;
        h[] k2 = k();
        Collection<? extends t0> c2 = iVar.c(fVar, bVar);
        int length = k2.length;
        int i2 = 0;
        Collection collection = c2;
        while (i2 < length) {
            Collection a2 = kotlin.reflect.x.internal.l0.m.v.a.a(collection, k2[i2].c(fVar, bVar));
            i2++;
            collection = a2;
        }
        if (collection != null) {
            return collection;
        }
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        h[] k2 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : k2) {
            y.y(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(this.f19994e.d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        Iterable p;
        p = n.p(k());
        Set<f> a2 = j.a(p);
        if (a2 == null) {
            return null;
        }
        a2.addAll(this.f19994e.e());
        return a2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        l(fVar, bVar);
        e f2 = this.f19994e.f(fVar, bVar);
        if (f2 != null) {
            return f2;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (h hVar2 : k()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f3 = hVar2.f(fVar, bVar);
            if (f3 != null) {
                if (!(f3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((kotlin.reflect.jvm.internal.impl.descriptors.i) f3).M()) {
                    return f3;
                }
                if (hVar == null) {
                    hVar = f3;
                }
            }
        }
        return hVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set d2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        i iVar = this.f19994e;
        h[] k2 = k();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g2 = iVar.g(dVar, function1);
        for (h hVar : k2) {
            g2 = kotlin.reflect.x.internal.l0.m.v.a.a(g2, hVar.g(dVar, function1));
        }
        if (g2 != null) {
            return g2;
        }
        d2 = u0.d();
        return d2;
    }

    public final i j() {
        return this.f19994e;
    }

    public void l(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        kotlin.reflect.x.internal.l0.c.a.b(this.f19992c.a().l(), bVar, this.f19993d, fVar);
    }

    public String toString() {
        return "scope for " + this.f19993d;
    }
}
