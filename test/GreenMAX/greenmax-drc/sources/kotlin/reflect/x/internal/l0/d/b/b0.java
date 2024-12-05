package kotlin.reflect.x.internal.l0.d.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.q.c;
import kotlin.reflect.x.internal.l0.d.a.o0.s;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.i.u.e;
import kotlin.reflect.x.internal.l0.l.m1;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.n;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes2.dex */
public final class b0 {
    public static final <T> T a(m<T> mVar, T t, boolean z) {
        l.f(mVar, "<this>");
        l.f(t, "possiblyPrimitiveType");
        return z ? mVar.d(t) : t;
    }

    public static final <T> T b(m1 m1Var, i iVar, m<T> mVar, a0 a0Var) {
        l.f(m1Var, "<this>");
        l.f(iVar, "type");
        l.f(mVar, "typeFactory");
        l.f(a0Var, "mode");
        n w = m1Var.w(iVar);
        if (!m1Var.V(w)) {
            return null;
        }
        kotlin.reflect.x.internal.l0.b.i i0 = m1Var.i0(w);
        boolean z = true;
        if (i0 != null) {
            T f2 = mVar.f(i0);
            if (!m1Var.p0(iVar) && !s.c(m1Var, iVar)) {
                z = false;
            }
            return (T) a(mVar, f2, z);
        }
        kotlin.reflect.x.internal.l0.b.i l = m1Var.l(w);
        if (l != null) {
            return mVar.b('[' + e.i(l).n());
        }
        if (m1Var.i(w)) {
            d K = m1Var.K(w);
            b n = K != null ? c.a.n(K) : null;
            if (n != null) {
                if (!a0Var.a()) {
                    List<c.a> i2 = c.a.i();
                    if (!(i2 instanceof Collection) || !i2.isEmpty()) {
                        Iterator<T> it = i2.iterator();
                        while (it.hasNext()) {
                            if (l.a(((c.a) it.next()).d(), n)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String f3 = kotlin.reflect.x.internal.l0.i.u.d.b(n).f();
                l.e(f3, "byClassId(classId).internalName");
                return mVar.c(f3);
            }
        }
        return null;
    }
}
