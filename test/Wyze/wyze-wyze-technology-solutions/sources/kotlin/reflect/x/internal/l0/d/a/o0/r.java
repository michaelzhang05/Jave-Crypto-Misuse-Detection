package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.k;
import kotlin.reflect.x.internal.l0.b.q.d;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.t1.q;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class r {
    private static final c a;

    /* renamed from: b, reason: collision with root package name */
    private static final c f20191b;

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.NULLABLE.ordinal()] = 1;
            iArr[h.NOT_NULL.ordinal()] = 2;
            a = iArr;
        }
    }

    static {
        c cVar = a0.u;
        l.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new c(cVar);
        c cVar2 = a0.v;
        l.e(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f20191b = new c(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g f(List<? extends g> list) {
        List y0;
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        }
        if (size != 1) {
            y0 = b0.y0(list);
            return new k((List<? extends g>) y0);
        }
        return (g) kotlin.collections.r.n0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h g(h hVar, e eVar, o oVar) {
        d dVar = d.a;
        if (!p.a(oVar) || !(hVar instanceof e)) {
            return null;
        }
        if (eVar.c() == f.READ_ONLY && oVar == o.FLEXIBLE_LOWER) {
            e eVar2 = (e) hVar;
            if (dVar.c(eVar2)) {
                return dVar.a(eVar2);
            }
        }
        if (eVar.c() != f.MUTABLE || oVar != o.FLEXIBLE_UPPER) {
            return null;
        }
        e eVar3 = (e) hVar;
        if (dVar.d(eVar3)) {
            return dVar.b(eVar3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(e eVar, o oVar) {
        if (!p.a(oVar)) {
            return null;
        }
        h d2 = eVar.d();
        int i2 = d2 == null ? -1 : a.a[d2.ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(e0 e0Var) {
        l.f(e0Var, "<this>");
        return s.c(q.a, e0Var);
    }
}
