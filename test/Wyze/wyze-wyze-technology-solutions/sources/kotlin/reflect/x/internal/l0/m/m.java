package kotlin.reflect.x.internal.l0.m;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.i.t.a;
import kotlin.reflect.x.internal.l0.m.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
final class m implements f {
    public static final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final String f21417b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String a(y yVar) {
        return f.a.a(this, yVar);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public boolean b(y yVar) {
        l.f(yVar, "functionDescriptor");
        List<i1> h2 = yVar.h();
        l.e(h2, "functionDescriptor.valueParameters");
        if (!(h2 instanceof Collection) || !h2.isEmpty()) {
            for (i1 i1Var : h2) {
                l.e(i1Var, "it");
                if (!(!a.a(i1Var) && i1Var.l0() == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String getDescription() {
        return f21417b;
    }
}
