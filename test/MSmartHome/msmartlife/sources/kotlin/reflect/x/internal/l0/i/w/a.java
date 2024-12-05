package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes2.dex */
public abstract class a implements h {
    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return i().a(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        return i().b();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return i().c(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        return i().d();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        return i().e();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public h f(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return i().f(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super f, Boolean> function1) {
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        return i().g(dVar, function1);
    }

    public final h h() {
        if (i() instanceof a) {
            h i2 = i();
            l.d(i2, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((a) i2).h();
        }
        return i();
    }

    protected abstract h i();
}
