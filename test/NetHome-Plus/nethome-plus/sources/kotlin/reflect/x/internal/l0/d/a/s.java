package kotlin.reflect.x.internal.l0.d.a;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.d.a.h0;
import kotlin.reflect.x.internal.l0.d.a.k0.c;
import kotlin.reflect.x.internal.l0.d.b.l;
import kotlin.reflect.x.internal.l0.d.b.v;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.e;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class s implements e {
    public static final a a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final boolean b(y yVar) {
            if (yVar.h().size() != 1) {
                return false;
            }
            m b2 = yVar.b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b2 : null;
            if (eVar == null) {
                return false;
            }
            List<i1> h2 = yVar.h();
            l.e(h2, "f.valueParameters");
            h w = ((i1) r.n0(h2)).getType().O0().w();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) w : null;
            return eVar2 != null && kotlin.reflect.x.internal.l0.b.h.q0(eVar) && l.a(kotlin.reflect.x.internal.l0.i.t.a.h(eVar), kotlin.reflect.x.internal.l0.i.t.a.h(eVar2));
        }

        private final kotlin.reflect.x.internal.l0.d.b.l c(y yVar, i1 i1Var) {
            if (!v.e(yVar) && !b(yVar)) {
                e0 type = i1Var.getType();
                l.e(type, "valueParameterDescriptor.type");
                return v.g(type);
            }
            e0 type2 = i1Var.getType();
            l.e(type2, "valueParameterDescriptor.type");
            return v.g(kotlin.reflect.x.internal.l0.l.x1.a.t(type2));
        }

        public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            List<Pair> F0;
            l.f(aVar, "superDescriptor");
            l.f(aVar2, "subDescriptor");
            if ((aVar2 instanceof kotlin.reflect.x.internal.l0.d.a.k0.e) && (aVar instanceof y)) {
                kotlin.reflect.x.internal.l0.d.a.k0.e eVar = (kotlin.reflect.x.internal.l0.d.a.k0.e) aVar2;
                eVar.h().size();
                y yVar = (y) aVar;
                yVar.h().size();
                List<i1> h2 = eVar.a().h();
                l.e(h2, "subDescriptor.original.valueParameters");
                List<i1> h3 = yVar.L0().h();
                l.e(h3, "superDescriptor.original.valueParameters");
                F0 = b0.F0(h2, h3);
                for (Pair pair : F0) {
                    i1 i1Var = (i1) pair.a();
                    i1 i1Var2 = (i1) pair.b();
                    l.e(i1Var, "subParameter");
                    boolean z = c((y) aVar2, i1Var) instanceof l.d;
                    kotlin.jvm.internal.l.e(i1Var2, "superParameter");
                    if (z != (c(yVar, i1Var2) instanceof l.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if ((aVar instanceof b) && (aVar2 instanceof y) && !kotlin.reflect.x.internal.l0.b.h.f0(aVar2)) {
            f fVar = f.n;
            y yVar = (y) aVar2;
            f name = yVar.getName();
            kotlin.jvm.internal.l.e(name, "subDescriptor.name");
            if (!fVar.l(name)) {
                h0.a aVar3 = h0.a;
                f name2 = yVar.getName();
                kotlin.jvm.internal.l.e(name2, "subDescriptor.name");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            b e2 = g0.e((b) aVar);
            boolean z = aVar instanceof y;
            y yVar2 = z ? (y) aVar : null;
            if ((!(yVar2 != null && yVar.w0() == yVar2.w0())) && (e2 == null || !yVar.w0())) {
                return true;
            }
            if ((eVar instanceof c) && yVar.d0() == null && e2 != null && !g0.f(eVar, e2)) {
                if ((e2 instanceof y) && z && f.k((y) e2) != null) {
                    String c2 = v.c(yVar, false, false, 2, null);
                    y L0 = ((y) aVar).L0();
                    kotlin.jvm.internal.l.e(L0, "superDescriptor.original");
                    if (kotlin.jvm.internal.l.a(c2, v.c(L0, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.a a() {
        return e.a.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.b b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.jvm.internal.l.f(aVar, "superDescriptor");
        kotlin.jvm.internal.l.f(aVar2, "subDescriptor");
        if (c(aVar, aVar2, eVar)) {
            return e.b.INCOMPATIBLE;
        }
        if (a.a(aVar, aVar2)) {
            return e.b.INCOMPATIBLE;
        }
        return e.b.UNKNOWN;
    }
}
