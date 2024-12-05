package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.x.internal.l0.b.e;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes2.dex */
public final class d implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d f21334f = new d();

    /* renamed from: g, reason: collision with root package name */
    private static final f f21335g;

    /* renamed from: h, reason: collision with root package name */
    private static final List<g0> f21336h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<g0> f21337i;

    /* renamed from: j, reason: collision with root package name */
    private static final Set<g0> f21338j;

    /* renamed from: k, reason: collision with root package name */
    private static final h f21339k;

    static {
        List<g0> i2;
        List<g0> i3;
        Set<g0> d2;
        f C = f.C(b.ERROR_MODULE.f());
        l.e(C, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f21335g = C;
        i2 = t.i();
        f21336h = i2;
        i3 = t.i();
        f21337i = i3;
        d2 = u0.d();
        f21338j = d2;
        f21339k = e.f19666h.a();
    }

    private d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public <T> T I0(f0<T> f0Var) {
        l.f(f0Var, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(o<R, D> oVar, D d2) {
        l.f(oVar, "visitor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public p0 N(c cVar) {
        l.f(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public m b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public boolean e0(g0 g0Var) {
        l.f(g0Var, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public g getAnnotations() {
        return g.f21674c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public f getName() {
        return v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public h o() {
        return f21339k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public Collection<c> p(c cVar, Function1<? super f, Boolean> function1) {
        List i2;
        l.f(cVar, "fqName");
        l.f(function1, "nameFilter");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public List<g0> t0() {
        return f21337i;
    }

    public f v() {
        return f21335g;
    }
}
