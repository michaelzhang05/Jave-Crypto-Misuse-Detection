package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.z;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: DeserializedPackageFragment.kt */
/* loaded from: classes2.dex */
public abstract class p extends z {
    private final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar, n nVar, g0 g0Var) {
        super(g0Var, cVar);
        l.f(cVar, "fqName");
        l.f(nVar, "storageManager");
        l.f(g0Var, "module");
        this.l = nVar;
    }

    public abstract h A0();

    public boolean L0(f fVar) {
        l.f(fVar, "name");
        h q = q();
        return (q instanceof kotlin.reflect.x.internal.l0.j.b.g0.h) && ((kotlin.reflect.x.internal.l0.j.b.g0.h) q).q().contains(fVar);
    }

    public abstract void M0(k kVar);
}
