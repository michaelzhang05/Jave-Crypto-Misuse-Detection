package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.l0.m.f;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.j.b.s;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.reflect.x.internal.l0.l.u1.k;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes2.dex */
public final class i implements s {
    public static final i a = new i();

    private i() {
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.s
    public e0 a(q qVar, String str, m0 m0Var, m0 m0Var2) {
        l.f(qVar, "proto");
        l.f(str, "flexibleId");
        l.f(m0Var, "lowerBound");
        l.f(m0Var2, "upperBound");
        if (!l.a(str, "kotlin.jvm.PlatformType")) {
            return k.d(j.M, str, m0Var.toString(), m0Var2.toString());
        }
        if (qVar.z(a.f20335g)) {
            return new f(m0Var, m0Var2);
        }
        return f0.d(m0Var, m0Var2);
    }
}
