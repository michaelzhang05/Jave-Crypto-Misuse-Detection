package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.a;

/* compiled from: TypeCapabilities.kt */
/* loaded from: classes2.dex */
public final class c1 {
    public static final n a(e0 e0Var) {
        l.f(e0Var, "<this>");
        a R0 = e0Var.R0();
        n nVar = R0 instanceof n ? (n) R0 : null;
        if (nVar == null || !nVar.A0()) {
            return null;
        }
        return nVar;
    }

    public static final boolean b(e0 e0Var) {
        l.f(e0Var, "<this>");
        a R0 = e0Var.R0();
        n nVar = R0 instanceof n ? (n) R0 : null;
        if (nVar != null) {
            return nVar.A0();
        }
        return false;
    }
}
