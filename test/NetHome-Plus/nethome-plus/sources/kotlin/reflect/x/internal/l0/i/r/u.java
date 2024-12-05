package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class u extends o<Short> {
    public u(short s) {
        super(Short.valueOf(s));
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m0 a(g0 g0Var) {
        l.f(g0Var, "module");
        m0 T = g0Var.o().T();
        l.e(T, "module.builtIns.shortType");
        return T;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}
