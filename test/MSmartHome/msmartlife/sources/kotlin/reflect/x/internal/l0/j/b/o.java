package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: DeserializedClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class o implements h {
    private final l0 a;

    public o(l0 l0Var) {
        l.f(l0Var, "packageFragmentProvider");
        this.a = l0Var;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.h
    public g a(b bVar) {
        g a;
        l.f(bVar, "classId");
        l0 l0Var = this.a;
        c h2 = bVar.h();
        l.e(h2, "classId.packageFqName");
        for (k0 k0Var : n0.c(l0Var, h2)) {
            if ((k0Var instanceof p) && (a = ((p) k0Var).A0().a(bVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
