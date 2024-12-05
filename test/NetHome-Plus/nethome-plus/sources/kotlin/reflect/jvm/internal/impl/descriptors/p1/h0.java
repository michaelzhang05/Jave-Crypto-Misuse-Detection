package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.x.internal.l0.i.w.c;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes2.dex */
public class h0 extends kotlin.reflect.x.internal.l0.i.w.i {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.g0 f21736b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f21737c;

    public h0(kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(g0Var, "moduleDescriptor");
        kotlin.jvm.internal.l.f(cVar, "fqName");
        this.f21736b = g0Var;
        this.f21737c = cVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> e() {
        Set<kotlin.reflect.x.internal.l0.f.f> d2;
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List i2;
        List i3;
        kotlin.jvm.internal.l.f(dVar, "kindFilter");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        if (!dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.f())) {
            i3 = kotlin.collections.t.i();
            return i3;
        }
        if (this.f21737c.d() && dVar.l().contains(c.b.a)) {
            i2 = kotlin.collections.t.i();
            return i2;
        }
        Collection<kotlin.reflect.x.internal.l0.f.c> p = this.f21736b.p(this.f21737c, function1);
        ArrayList arrayList = new ArrayList(p.size());
        Iterator<kotlin.reflect.x.internal.l0.f.c> it = p.iterator();
        while (it.hasNext()) {
            kotlin.reflect.x.internal.l0.f.f g2 = it.next().g();
            kotlin.jvm.internal.l.e(g2, "subFqName.shortName()");
            if (function1.invoke(g2).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, h(g2));
            }
        }
        return arrayList;
    }

    protected final p0 h(kotlin.reflect.x.internal.l0.f.f fVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        if (fVar.x()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var = this.f21736b;
        kotlin.reflect.x.internal.l0.f.c c2 = this.f21737c.c(fVar);
        kotlin.jvm.internal.l.e(c2, "fqName.child(name)");
        p0 N = g0Var.N(c2);
        if (N.isEmpty()) {
            return null;
        }
        return N;
    }

    public String toString() {
        return "subpackages of " + this.f21737c + " from " + this.f21736b;
    }
}
