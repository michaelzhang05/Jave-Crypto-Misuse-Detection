package kotlin.reflect.x.internal.l0.m;

import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.m.g;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class b {
    public final g a(y yVar) {
        l.f(yVar, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(yVar)) {
                return hVar.a(yVar);
            }
        }
        return g.a.f21403b;
    }

    public abstract List<h> b();
}
