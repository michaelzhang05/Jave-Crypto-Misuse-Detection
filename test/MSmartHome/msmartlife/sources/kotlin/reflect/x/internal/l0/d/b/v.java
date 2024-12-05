package kotlin.reflect.x.internal.l0.d.b;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.b.q.c;
import kotlin.reflect.x.internal.l0.d.a.f;
import kotlin.reflect.x.internal.l0.d.a.g0;
import kotlin.reflect.x.internal.l0.d.b.l;
import kotlin.reflect.x.internal.l0.i.d;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes2.dex */
public final class v {
    private static final void a(StringBuilder sb, e0 e0Var) {
        sb.append(g(e0Var));
    }

    public static final String b(y yVar, boolean z, boolean z2) {
        String f2;
        l.f(yVar, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (yVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                f2 = "<init>";
            } else {
                f2 = yVar.getName().f();
                l.e(f2, "name.asString()");
            }
            sb.append(f2);
        }
        sb.append("(");
        w0 m0 = yVar.m0();
        if (m0 != null) {
            e0 type = m0.getType();
            l.e(type, "it.type");
            a(sb, type);
        }
        Iterator<i1> it = yVar.h().iterator();
        while (it.hasNext()) {
            e0 type2 = it.next().getType();
            l.e(type2, "parameter.type");
            a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (d.c(yVar)) {
                sb.append("V");
            } else {
                e0 returnType = yVar.getReturnType();
                l.c(returnType);
                a(sb, returnType);
            }
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String c(y yVar, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return b(yVar, z, z2);
    }

    public static final String d(a aVar) {
        l.f(aVar, "<this>");
        x xVar = x.a;
        if (d.E(aVar)) {
            return null;
        }
        m b2 = aVar.b();
        e eVar = b2 instanceof e ? (e) b2 : null;
        if (eVar == null || eVar.getName().x()) {
            return null;
        }
        a a = aVar.a();
        y0 y0Var = a instanceof y0 ? (y0) a : null;
        if (y0Var == null) {
            return null;
        }
        return u.a(xVar, eVar, c(y0Var, false, false, 3, null));
    }

    public static final boolean e(a aVar) {
        y k2;
        l.f(aVar, "f");
        if (!(aVar instanceof y)) {
            return false;
        }
        y yVar = (y) aVar;
        if (!l.a(yVar.getName().f(), "remove") || yVar.h().size() != 1 || g0.h((b) aVar)) {
            return false;
        }
        List<i1> h2 = yVar.a().h();
        l.e(h2, "f.original.valueParameters");
        e0 type = ((i1) r.n0(h2)).getType();
        l.e(type, "f.original.valueParameters.single().type");
        l g2 = g(type);
        l.d dVar = g2 instanceof l.d ? (l.d) g2 : null;
        if ((dVar != null ? dVar.i() : null) != kotlin.reflect.x.internal.l0.i.u.e.INT || (k2 = f.k(yVar)) == null) {
            return false;
        }
        List<i1> h3 = k2.a().h();
        kotlin.jvm.internal.l.e(h3, "overridden.original.valueParameters");
        e0 type2 = ((i1) r.n0(h3)).getType();
        kotlin.jvm.internal.l.e(type2, "overridden.original.valueParameters.single().type");
        l g3 = g(type2);
        m b2 = k2.b();
        kotlin.jvm.internal.l.e(b2, "overridden.containingDeclaration");
        return kotlin.jvm.internal.l.a(kotlin.reflect.x.internal.l0.i.t.a.i(b2), k.a.c0.j()) && (g3 instanceof l.c) && kotlin.jvm.internal.l.a(((l.c) g3).i(), "java/lang/Object");
    }

    public static final String f(e eVar) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        c cVar = c.a;
        kotlin.reflect.x.internal.l0.f.d j2 = kotlin.reflect.x.internal.l0.i.t.a.h(eVar).j();
        kotlin.jvm.internal.l.e(j2, "fqNameSafe.toUnsafe()");
        kotlin.reflect.x.internal.l0.f.b n = cVar.n(j2);
        if (n != null) {
            String f2 = kotlin.reflect.x.internal.l0.i.u.d.b(n).f();
            kotlin.jvm.internal.l.e(f2, "byClassId(it).internalName");
            return f2;
        }
        return d.b(eVar, null, 2, null);
    }

    public static final l g(e0 e0Var) {
        kotlin.jvm.internal.l.f(e0Var, "<this>");
        return (l) d.e(e0Var, n.a, a0.f20234e, z.a, null, null, 32, null);
    }
}
