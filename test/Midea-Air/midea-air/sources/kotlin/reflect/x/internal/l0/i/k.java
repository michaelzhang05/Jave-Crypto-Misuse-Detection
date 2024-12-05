package kotlin.reflect.x.internal.l0.i;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.l.d1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.t1.b;
import kotlin.reflect.x.internal.l0.l.t1.e;
import kotlin.reflect.x.internal.l0.l.t1.f;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.w1.c;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.j;
import kotlin.reflect.x.internal.l0.l.w1.m;
import kotlin.reflect.x.internal.l0.l.w1.n;
import kotlin.reflect.x.internal.l0.l.w1.o;
import kotlin.reflect.x.internal.l0.l.w1.t;
import kotlin.reflect.x.internal.l0.l.w1.u;

/* compiled from: OverridingUtilTypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class k implements b {
    private final Map<e1, e1> a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f20854b;

    /* renamed from: c, reason: collision with root package name */
    private final g f20855c;

    /* renamed from: d, reason: collision with root package name */
    private final f f20856d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2<e0, e0, Boolean> f20857e;

    /* compiled from: OverridingUtilTypeSystemContext.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d1 {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ k f20858k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, boolean z2, k kVar, f fVar, g gVar) {
            super(z, z2, true, kVar, fVar, gVar);
            this.f20858k = kVar;
        }

        @Override // kotlin.reflect.x.internal.l0.l.d1
        public boolean f(i iVar, i iVar2) {
            l.f(iVar, "subType");
            l.f(iVar2, "superType");
            if (iVar instanceof e0) {
                if (iVar2 instanceof e0) {
                    return ((Boolean) this.f20858k.f20857e.invoke(iVar, iVar2)).booleanValue();
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Map<e1, ? extends e1> map, e.a aVar, g gVar, f fVar, Function2<? super e0, ? super e0, Boolean> function2) {
        l.f(aVar, "equalityAxioms");
        l.f(gVar, "kotlinTypeRefiner");
        l.f(fVar, "kotlinTypePreparator");
        this.a = map;
        this.f20854b = aVar;
        this.f20855c = gVar;
        this.f20856d = fVar;
        this.f20857e = function2;
    }

    private final boolean G0(e1 e1Var, e1 e1Var2) {
        if (this.f20854b.a(e1Var, e1Var2)) {
            return true;
        }
        Map<e1, e1> map = this.a;
        if (map == null) {
            return false;
        }
        e1 e1Var3 = map.get(e1Var);
        e1 e1Var4 = this.a.get(e1Var2);
        if (e1Var3 == null || !l.a(e1Var3, e1Var2)) {
            return e1Var4 != null && l.a(e1Var4, e1Var);
        }
        return true;
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public d1.c A(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.y0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean A0(n nVar, n nVar2) {
        l.f(nVar, "c1");
        l.f(nVar2, "c2");
        if (nVar instanceof e1) {
            if (nVar2 instanceof e1) {
                return b.a.a(this, nVar, nVar2) || G0((e1) nVar, (e1) nVar2);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean B(i iVar) {
        return b.a.L(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public List<i> B0(o oVar) {
        return b.a.C(this, oVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean C(i iVar) {
        return b.a.P(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public i C0(i iVar) {
        return b.a.r0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public o D(n nVar, int i2) {
        return b.a.t(this, nVar, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public m D0(kotlin.reflect.x.internal.l0.l.w1.k kVar, int i2) {
        return b.a.q(this, kVar, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b
    public i E(kotlin.reflect.x.internal.l0.l.w1.k kVar, kotlin.reflect.x.internal.l0.l.w1.k kVar2) {
        return b.a.m(this, kVar, kVar2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean E0(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.e0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public o F(n nVar) {
        return b.a.A(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public i G(i iVar, boolean z) {
        return b.a.F0(this, iVar, z);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k H(kotlin.reflect.x.internal.l0.l.w1.e eVar) {
        return b.a.t0(this, eVar);
    }

    public d1 H0(boolean z, boolean z2) {
        if (this.f20857e == null) {
            return kotlin.reflect.x.internal.l0.l.t1.a.a(z, z2, this, this.f20856d, this.f20855c);
        }
        return new a(z, z2, this, this.f20856d, this.f20855c);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean I(i iVar) {
        return b.a.Z(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean J(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.U(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public d K(n nVar) {
        return b.a.s(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean L(m mVar) {
        return b.a.i0(this, mVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.g M(i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public u N(o oVar) {
        return b.a.E(this, oVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public i O(List<? extends i> list) {
        return b.a.J(this, list);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.b P(kotlin.reflect.x.internal.l0.l.w1.d dVar) {
        return b.a.l(this, dVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public i Q(i iVar) {
        return b.a.q0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public int R(kotlin.reflect.x.internal.l0.l.w1.l lVar) {
        return b.a.x0(this, lVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public m S(c cVar) {
        return b.a.w0(this, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k T(i iVar) {
        return b.a.E0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public i U(kotlin.reflect.x.internal.l0.l.w1.d dVar) {
        return b.a.p0(this, dVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean V(n nVar) {
        return b.a.N(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean W(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.Y(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public List<m> X(i iVar) {
        return b.a.r(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean Y(i iVar) {
        return b.a.S(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean Z(n nVar) {
        return b.a.W(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k a(i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public boolean a0(n nVar) {
        return b.a.T(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public boolean b(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.g0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public i b0(i iVar) {
        return b.a.B(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public n c(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.C0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public m c0(i iVar) {
        return b.a.j(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k d(kotlin.reflect.x.internal.l0.l.w1.k kVar, boolean z) {
        return b.a.G0(this, kVar, z);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public c d0(kotlin.reflect.x.internal.l0.l.w1.d dVar) {
        return b.a.A0(this, dVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k e(kotlin.reflect.x.internal.l0.l.w1.g gVar) {
        return b.a.D0(this, gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public List<o> e0(n nVar) {
        return b.a.u(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.d f(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean f0(i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.b, kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k g(kotlin.reflect.x.internal.l0.l.w1.g gVar) {
        return b.a.n0(this, gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public m g0(i iVar, int i2) {
        return b.a.p(this, iVar, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public int h(n nVar) {
        return b.a.u0(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k h0(i iVar) {
        return b.a.o0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public boolean i(n nVar) {
        return b.a.m0(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public kotlin.reflect.x.internal.l0.b.i i0(n nVar) {
        return b.a.w(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public int j(i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public u j0(m mVar) {
        return b.a.D(this, mVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean k(kotlin.reflect.x.internal.l0.l.w1.d dVar) {
        return b.a.f0(this, dVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean k0(n nVar) {
        return b.a.K(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public kotlin.reflect.x.internal.l0.b.i l(n nVar) {
        return b.a.v(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public boolean l0(i iVar, kotlin.reflect.x.internal.l0.f.c cVar) {
        return b.a.F(this, iVar, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m1
    public i m(o oVar) {
        return b.a.x(this, oVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public o m0(t tVar) {
        return b.a.z(this, tVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public List<kotlin.reflect.x.internal.l0.l.w1.k> n(kotlin.reflect.x.internal.l0.l.w1.k kVar, n nVar) {
        return b.a.n(this, kVar, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean n0(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.j0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean o(o oVar, n nVar) {
        return b.a.H(this, oVar, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean o0(i iVar) {
        return b.a.X(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean p(n nVar) {
        return b.a.b0(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean p0(i iVar) {
        return b.a.c0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean q(kotlin.reflect.x.internal.l0.l.w1.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean q0(n nVar) {
        return b.a.V(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.l r(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.c(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.k r0(kotlin.reflect.x.internal.l0.l.w1.k kVar, kotlin.reflect.x.internal.l0.l.w1.b bVar) {
        return b.a.k(this, kVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean s(i iVar) {
        return b.a.R(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.e s0(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.e(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public Collection<i> t(n nVar) {
        return b.a.z0(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.s
    public boolean t0(kotlin.reflect.x.internal.l0.l.w1.k kVar, kotlin.reflect.x.internal.l0.l.w1.k kVar2) {
        return b.a.I(this, kVar, kVar2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public m u(kotlin.reflect.x.internal.l0.l.w1.l lVar, int i2) {
        return b.a.o(this, lVar, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean u0(n nVar) {
        return b.a.O(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public Collection<i> v(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.v0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean v0(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.M(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public n w(i iVar) {
        return b.a.B0(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean w0(kotlin.reflect.x.internal.l0.l.w1.k kVar) {
        return b.a.k0(this, kVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean x(n nVar) {
        return b.a.Q(this, nVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public i x0(m mVar) {
        return b.a.y(this, mVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public j y(kotlin.reflect.x.internal.l0.l.w1.g gVar) {
        return b.a.h(this, gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public kotlin.reflect.x.internal.l0.l.w1.f y0(kotlin.reflect.x.internal.l0.l.w1.g gVar) {
        return b.a.f(this, gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean z(i iVar) {
        return b.a.G(this, iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.w1.p
    public boolean z0(i iVar) {
        return b.a.l0(this, iVar);
    }
}
