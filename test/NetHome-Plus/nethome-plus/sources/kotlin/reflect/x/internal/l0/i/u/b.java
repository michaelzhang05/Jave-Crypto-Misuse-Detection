package kotlin.reflect.x.internal.l0.i.u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.i.f;
import kotlin.reflect.x.internal.l0.i.t.a;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: inlineClassManglingRules.kt */
/* loaded from: classes2.dex */
public final class b {
    private static final boolean a(e eVar) {
        return l.a(a.h(eVar), k.n);
    }

    public static final boolean b(m mVar) {
        l.f(mVar, "<this>");
        return f.b(mVar) && !a((e) mVar);
    }

    public static final boolean c(e0 e0Var) {
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        return w != null && b(w);
    }

    private static final boolean d(e0 e0Var) {
        h w = e0Var.O0().w();
        e1 e1Var = w instanceof e1 ? (e1) w : null;
        if (e1Var == null) {
            return false;
        }
        return e(kotlin.reflect.x.internal.l0.l.x1.a.i(e1Var));
    }

    private static final boolean e(e0 e0Var) {
        return c(e0Var) || d(e0Var);
    }

    public static final boolean f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l.f(bVar, "descriptor");
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar == null || t.g(dVar.getVisibility())) {
            return false;
        }
        e C = dVar.C();
        l.e(C, "constructorDescriptor.constructedClass");
        if (f.b(C) || kotlin.reflect.x.internal.l0.i.d.G(dVar.C())) {
            return false;
        }
        List<i1> h2 = dVar.h();
        l.e(h2, "constructorDescriptor.valueParameters");
        if ((h2 instanceof Collection) && h2.isEmpty()) {
            return false;
        }
        Iterator<T> it = h2.iterator();
        while (it.hasNext()) {
            e0 type = ((i1) it.next()).getType();
            l.e(type, "it.type");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
