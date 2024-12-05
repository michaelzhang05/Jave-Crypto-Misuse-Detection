package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.l1;

/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes2.dex */
public final class e implements t0 {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ c0 f21340f;

    public e() {
        List<? extends e1> i2;
        List<w0> i3;
        k kVar = k.a;
        c0 P0 = c0.P0(kVar.h(), g.f21674c.b(), d0.OPEN, t.f21863e, true, f.C(b.ERROR_PROPERTY.f()), b.a.DECLARATION, z0.a, false, false, false, false, false, false);
        e0 k2 = kVar.k();
        i2 = kotlin.collections.t.i();
        i3 = kotlin.collections.t.i();
        P0.c1(k2, i2, null, null, i3);
        this.f21340f = P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean E0() {
        return this.f21340f.E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean G() {
        return this.f21340f.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(o<R, D> oVar, D d2) {
        return (R) this.f21340f.L(oVar, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean M() {
        return this.f21340f.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k1
    public boolean O() {
        return this.f21340f.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public kotlin.reflect.x.internal.l0.i.r.g<?> X() {
        return this.f21340f.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: a */
    public t0 L0() {
        return this.f21340f.L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    public m b() {
        return this.f21340f.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    public t0 c(l1 l1Var) {
        l.f(l1Var, "substitutor");
        return this.f21340f.c(l1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends t0> e() {
        return this.f21340f.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w0 f0() {
        return this.f21340f.f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public g getAnnotations() {
        g annotations = this.f21340f.getAnnotations();
        l.e(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public u0 getGetter() {
        return this.f21340f.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public f getName() {
        return this.f21340f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public e0 getReturnType() {
        return this.f21340f.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public v0 getSetter() {
        return this.f21340f.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    public e0 getType() {
        return this.f21340f.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<e1> getTypeParameters() {
        return this.f21340f.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public u getVisibility() {
        return this.f21340f.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<i1> h() {
        return this.f21340f.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public b.a i() {
        return this.f21340f.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V i0(a.InterfaceC0365a<V> interfaceC0365a) {
        return (V) this.f21340f.i0(interfaceC0365a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean isConst() {
        return this.f21340f.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public d0 j() {
        return this.f21340f.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean j0() {
        return this.f21340f.j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public b k0(m mVar, d0 d0Var, u uVar, b.a aVar, boolean z) {
        return this.f21340f.k0(mVar, d0Var, uVar, aVar, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w0 m0() {
        return this.f21340f.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public w n0() {
        return this.f21340f.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public w q0() {
        return this.f21340f.q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<w0> r0() {
        return this.f21340f.r0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean s0() {
        return this.f21340f.s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    public z0 t() {
        return this.f21340f.t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public List<s0> x() {
        return this.f21340f.x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void x0(Collection<? extends b> collection) {
        l.f(collection, "overriddenDescriptors");
        this.f21340f.x0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean z() {
        return this.f21340f.z();
    }
}
