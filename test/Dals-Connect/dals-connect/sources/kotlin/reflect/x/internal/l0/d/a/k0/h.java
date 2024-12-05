package kotlin.reflect.x.internal.l0.d.a.k0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.l0.l.k;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: util.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final List<i1> a(Collection<? extends e0> collection, Collection<? extends i1> collection2, a aVar) {
        List<Pair> F0;
        int t;
        l.f(collection, "newValueParameterTypes");
        l.f(collection2, "oldValueParameters");
        l.f(aVar, "newOwner");
        collection.size();
        collection2.size();
        F0 = b0.F0(collection, collection2);
        t = u.t(F0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Pair pair : F0) {
            e0 e0Var = (e0) pair.a();
            i1 i1Var = (i1) pair.b();
            int f2 = i1Var.f();
            g annotations = i1Var.getAnnotations();
            f name = i1Var.getName();
            l.e(name, "oldParameter.name");
            boolean u0 = i1Var.u0();
            boolean b0 = i1Var.b0();
            boolean Y = i1Var.Y();
            e0 k2 = i1Var.l0() != null ? kotlin.reflect.x.internal.l0.i.t.a.l(aVar).o().k(e0Var) : null;
            z0 t2 = i1Var.t();
            l.e(t2, "oldParameter.source");
            arrayList.add(new l0(aVar, null, f2, annotations, name, e0Var, u0, b0, Y, k2, t2));
        }
        return arrayList;
    }

    public static final k b(e eVar) {
        l.f(eVar, "<this>");
        e p = kotlin.reflect.x.internal.l0.i.t.a.p(eVar);
        if (p == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.i.w.h S = p.S();
        k kVar = S instanceof k ? (k) S : null;
        return kVar == null ? b(p) : kVar;
    }
}
