package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.u1.j;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class z extends a0<Short> {
    public z(short s) {
        super(Short.valueOf(s));
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public e0 a(g0 g0Var) {
        l.f(g0Var, "module");
        e a = x.a(g0Var, k.a.z0);
        m0 s = a != null ? a.s() : null;
        return s == null ? kotlin.reflect.x.internal.l0.l.u1.k.d(j.A0, "UShort") : s;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        return b().intValue() + ".toUShort()";
    }
}
