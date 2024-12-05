package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.l.z0;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes2.dex */
public final class b1 {
    public static final a1 a(a1 a1Var, g gVar) {
        a1 K;
        l.f(a1Var, "<this>");
        l.f(gVar, "newAnnotations");
        if (k.a(a1Var) == gVar) {
            return a1Var;
        }
        j b2 = k.b(a1Var);
        if (b2 != null && (K = a1Var.K(b2)) != null) {
            a1Var = K;
        }
        return (gVar.iterator().hasNext() || !gVar.isEmpty()) ? a1Var.J(new j(gVar)) : a1Var;
    }

    public static final a1 b(g gVar) {
        l.f(gVar, "<this>");
        return z0.a.a(o.a, gVar, null, null, 6, null);
    }
}
