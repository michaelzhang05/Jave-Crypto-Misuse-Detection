package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.b;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.j0.k;
import kotlin.reflect.x.internal.l0.d.a.l0.d;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.j;
import kotlin.reflect.x.internal.l0.d.a.n0.y;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes2.dex */
public final class m extends b {
    private final g p;
    private final y q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, y yVar, int i2, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        super(gVar.e(), mVar, new d(gVar, yVar, false, 4, null), yVar.getName(), r1.INVARIANT, false, i2, z0.a, gVar.a().v());
        l.f(gVar, "c");
        l.f(yVar, "javaTypeParameter");
        l.f(mVar, "containingDeclaration");
        this.p = gVar;
        this.q = yVar;
    }

    private final List<e0> N0() {
        int t;
        List<e0> e2;
        Collection<j> upperBounds = this.q.getUpperBounds();
        if (upperBounds.isEmpty()) {
            m0 i2 = this.p.d().o().i();
            l.e(i2, "c.module.builtIns.anyType");
            m0 I = this.p.d().o().I();
            l.e(I, "c.module.builtIns.nullableAnyType");
            e2 = s.e(f0.d(i2, I));
            return e2;
        }
        t = u.t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.p.g().o((j) it.next(), kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.e
    protected List<e0> A0(List<? extends e0> list) {
        l.f(list, "bounds");
        return this.p.a().r().i(this, list, this.p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.e
    protected void L0(e0 e0Var) {
        l.f(e0Var, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.e
    protected List<e0> M0() {
        return N0();
    }
}
