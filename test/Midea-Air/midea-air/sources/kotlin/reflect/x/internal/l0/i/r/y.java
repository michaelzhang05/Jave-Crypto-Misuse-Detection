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
public final class y extends a0<Long> {
    public y(long j2) {
        super(Long.valueOf(j2));
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public e0 a(g0 g0Var) {
        l.f(g0Var, "module");
        e a = x.a(g0Var, k.a.B0);
        m0 s = a != null ? a.s() : null;
        return s == null ? kotlin.reflect.x.internal.l0.l.u1.k.d(j.A0, "ULong") : s;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        return b().longValue() + ".toULong()";
    }
}
