package kotlin.reflect.x.internal.l0.d.a.l0;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.d.a.n0.g;
import kotlin.reflect.x.internal.l0.i.u.c;

/* compiled from: ModuleClassResolver.kt */
/* loaded from: classes2.dex */
public final class j implements i {
    public c a;

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.i
    public e a(g gVar) {
        l.f(gVar, "javaClass");
        return b().b(gVar);
    }

    public final c b() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        l.v("resolver");
        return null;
    }

    public final void c(c cVar) {
        l.f(cVar, "<set-?>");
        this.a = cVar;
    }
}
