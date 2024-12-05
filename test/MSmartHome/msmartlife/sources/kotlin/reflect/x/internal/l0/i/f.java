package kotlin.reflect.x.internal.l0.i;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: inlineClassesUtils.kt */
/* loaded from: classes2.dex */
public final class f {
    private static final c a;

    /* renamed from: b, reason: collision with root package name */
    private static final b f20834b;

    static {
        c cVar = new c("kotlin.jvm.JvmInline");
        a = cVar;
        b m = b.m(cVar);
        l.e(m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f20834b = m;
    }

    public static final boolean a(a aVar) {
        l.f(aVar, "<this>");
        if (aVar instanceof u0) {
            t0 B0 = ((u0) aVar).B0();
            l.e(B0, "correspondingProperty");
            if (d(B0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(m mVar) {
        l.f(mVar, "<this>");
        return (mVar instanceof e) && (((e) mVar).z0() instanceof z);
    }

    public static final boolean c(e0 e0Var) {
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        if (w != null) {
            return b(w);
        }
        return false;
    }

    public static final boolean d(j1 j1Var) {
        z<m0> j2;
        l.f(j1Var, "<this>");
        if (j1Var.m0() == null) {
            m b2 = j1Var.b();
            kotlin.reflect.x.internal.l0.f.f fVar = null;
            e eVar = b2 instanceof e ? (e) b2 : null;
            if (eVar != null && (j2 = kotlin.reflect.x.internal.l0.i.t.a.j(eVar)) != null) {
                fVar = j2.c();
            }
            if (l.a(fVar, j1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final e0 e(e0 e0Var) {
        z<m0> j2;
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        if (!(w instanceof e)) {
            w = null;
        }
        e eVar = (e) w;
        if (eVar == null || (j2 = kotlin.reflect.x.internal.l0.i.t.a.j(eVar)) == null) {
            return null;
        }
        return j2.d();
    }
}
