package kotlin.reflect.x.internal.l0.b;

import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.i.t.a;

/* compiled from: CompanionObjectMappingUtils.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final boolean a(c cVar, e eVar) {
        boolean J;
        l.f(cVar, "<this>");
        l.f(eVar, "classDescriptor");
        if (kotlin.reflect.x.internal.l0.i.d.x(eVar)) {
            Set<b> b2 = cVar.b();
            b g2 = a.g(eVar);
            J = b0.J(b2, g2 != null ? g2.g() : null);
            if (J) {
                return true;
            }
        }
        return false;
    }
}
