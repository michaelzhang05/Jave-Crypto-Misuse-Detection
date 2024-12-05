package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes2.dex */
public abstract class z extends k implements kotlin.reflect.jvm.internal.impl.descriptors.k0 {

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f21801j;

    /* renamed from: k, reason: collision with root package name */
    private final String f21802k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, kotlin.reflect.x.internal.l0.f.c cVar) {
        super(g0Var, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), cVar.h(), z0.a);
        kotlin.jvm.internal.l.f(g0Var, "module");
        kotlin.jvm.internal.l.f(cVar, "fqName");
        this.f21801j = cVar;
        this.f21802k = "package " + cVar + " of " + g0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        kotlin.jvm.internal.l.f(oVar, "visitor");
        return oVar.f(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public final kotlin.reflect.x.internal.l0.f.c d() {
        return this.f21801j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.p
    public z0 t() {
        z0 z0Var = z0.a;
        kotlin.jvm.internal.l.e(z0Var, "NO_SOURCE");
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.j
    public String toString() {
        return this.f21802k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.g0 b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m b2 = super.b();
        kotlin.jvm.internal.l.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (kotlin.reflect.jvm.internal.impl.descriptors.g0) b2;
    }
}
