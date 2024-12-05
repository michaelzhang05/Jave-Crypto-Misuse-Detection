package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class c extends g<Boolean> {
    public c(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m0 a(g0 g0Var) {
        l.f(g0Var, "module");
        m0 n = g0Var.o().n();
        l.e(n, "module.builtIns.booleanType");
        return n;
    }
}
