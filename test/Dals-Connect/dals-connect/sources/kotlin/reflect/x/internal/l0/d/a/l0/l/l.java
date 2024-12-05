package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.l0.l.j;
import kotlin.reflect.x.internal.l0.d.a.n0.r;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes2.dex */
public abstract class l extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(gVar, null, 2, null);
        kotlin.jvm.internal.l.f(gVar, "c");
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected j.a H(r rVar, List<? extends e1> list, e0 e0Var, List<? extends i1> list2) {
        List i2;
        kotlin.jvm.internal.l.f(rVar, "method");
        kotlin.jvm.internal.l.f(list, "methodTypeParameters");
        kotlin.jvm.internal.l.f(e0Var, "returnType");
        kotlin.jvm.internal.l.f(list2, "valueParameters");
        i2 = t.i();
        return new j.a(e0Var, null, list2, list, false, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void s(f fVar, Collection<t0> collection) {
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(collection, "result");
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected w0 z() {
        return null;
    }
}
