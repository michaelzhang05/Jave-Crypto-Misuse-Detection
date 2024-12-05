package kotlin.reflect.x.internal.l0.d.a;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.x.internal.l0.d.a.l0.l.c;
import kotlin.reflect.x.internal.l0.i.e;

/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class n implements e {
    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.a a() {
        return e.a.BOTH;
    }

    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.b b(a aVar, a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l.f(aVar, "superDescriptor");
        l.f(aVar2, "subDescriptor");
        if ((aVar2 instanceof t0) && (aVar instanceof t0)) {
            t0 t0Var = (t0) aVar2;
            t0 t0Var2 = (t0) aVar;
            if (!l.a(t0Var.getName(), t0Var2.getName())) {
                return e.b.UNKNOWN;
            }
            if (c.a(t0Var) && c.a(t0Var2)) {
                return e.b.OVERRIDABLE;
            }
            if (!c.a(t0Var) && !c.a(t0Var2)) {
                return e.b.UNKNOWN;
            }
            return e.b.INCOMPATIBLE;
        }
        return e.b.UNKNOWN;
    }
}
