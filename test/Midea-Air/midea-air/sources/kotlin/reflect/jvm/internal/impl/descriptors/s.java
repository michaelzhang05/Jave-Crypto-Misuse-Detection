package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: descriptorUtil.kt */
/* loaded from: classes2.dex */
public final class s {
    public static final h a(m mVar) {
        kotlin.jvm.internal.l.f(mVar, "<this>");
        m b2 = mVar.b();
        if (b2 == null || (mVar instanceof k0)) {
            return null;
        }
        if (!b(b2)) {
            return a(b2);
        }
        if (b2 instanceof h) {
            return (h) b2;
        }
        return null;
    }

    public static final boolean b(m mVar) {
        kotlin.jvm.internal.l.f(mVar, "<this>");
        return mVar.b() instanceof k0;
    }

    public static final e c(g0 g0Var, kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        h hVar;
        kotlin.reflect.x.internal.l0.i.w.h y0;
        kotlin.jvm.internal.l.f(g0Var, "<this>");
        kotlin.jvm.internal.l.f(cVar, "fqName");
        kotlin.jvm.internal.l.f(bVar, "lookupLocation");
        if (cVar.d()) {
            return null;
        }
        kotlin.reflect.x.internal.l0.f.c e2 = cVar.e();
        kotlin.jvm.internal.l.e(e2, "fqName.parent()");
        kotlin.reflect.x.internal.l0.i.w.h q = g0Var.N(e2).q();
        kotlin.reflect.x.internal.l0.f.f g2 = cVar.g();
        kotlin.jvm.internal.l.e(g2, "fqName.shortName()");
        h f2 = q.f(g2, bVar);
        e eVar = f2 instanceof e ? (e) f2 : null;
        if (eVar != null) {
            return eVar;
        }
        kotlin.reflect.x.internal.l0.f.c e3 = cVar.e();
        kotlin.jvm.internal.l.e(e3, "fqName.parent()");
        e c2 = c(g0Var, e3, bVar);
        if (c2 == null || (y0 = c2.y0()) == null) {
            hVar = null;
        } else {
            kotlin.reflect.x.internal.l0.f.f g3 = cVar.g();
            kotlin.jvm.internal.l.e(g3, "fqName.shortName()");
            hVar = y0.f(g3, bVar);
        }
        if (hVar instanceof e) {
            return (e) hVar;
        }
        return null;
    }
}
