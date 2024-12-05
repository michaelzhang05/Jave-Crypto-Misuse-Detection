package kotlin.reflect.x.internal.l0.i.r;

import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class l extends g<Float> {
    public l(float f2) {
        super(Float.valueOf(f2));
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m0 a(g0 g0Var) {
        kotlin.jvm.internal.l.f(g0Var, "module");
        m0 B = g0Var.o().B();
        kotlin.jvm.internal.l.e(B, "module.builtIns.floatType");
        return B;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        return b().floatValue() + ".toFloat()";
    }
}
