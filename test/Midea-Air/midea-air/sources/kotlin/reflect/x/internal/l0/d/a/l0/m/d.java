package kotlin.reflect.x.internal.l0.d.a.l0.m;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.d.a.j0.k;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.s0;
import kotlin.reflect.x.internal.l0.l.t0;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes2.dex */
public final class d {
    private static final c a = new c("java.lang.Class");

    public static final /* synthetic */ c a() {
        return a;
    }

    public static final g1 b(e1 e1Var, a aVar) {
        l.f(e1Var, "typeParameter");
        l.f(aVar, "attr");
        if (aVar.e() == k.SUPERTYPE) {
            return new i1(t0.b(e1Var));
        }
        return new s0(e1Var);
    }

    public static final a c(k kVar, boolean z, e1 e1Var) {
        l.f(kVar, "<this>");
        return new a(kVar, null, z, e1Var != null ? kotlin.collections.t0.c(e1Var) : null, null, 18, null);
    }

    public static /* synthetic */ a d(k kVar, boolean z, e1 e1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            e1Var = null;
        }
        return c(kVar, z, e1Var);
    }
}
