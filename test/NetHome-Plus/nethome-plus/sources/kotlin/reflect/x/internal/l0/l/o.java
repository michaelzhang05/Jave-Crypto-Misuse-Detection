package kotlin.reflect.x.internal.l0.l;

import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.l.a1;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes2.dex */
public final class o implements z0 {
    public static final o a = new o();

    private o() {
    }

    @Override // kotlin.reflect.x.internal.l0.l.z0
    public a1 a(g gVar, e1 e1Var, m mVar) {
        List<? extends y0<?>> e2;
        l.f(gVar, "annotations");
        if (gVar.isEmpty()) {
            return a1.f21185g.h();
        }
        a1.a aVar = a1.f21185g;
        e2 = s.e(new j(gVar));
        return aVar.g(e2);
    }
}
