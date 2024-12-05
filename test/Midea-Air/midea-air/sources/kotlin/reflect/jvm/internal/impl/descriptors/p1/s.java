package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.l.j1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* loaded from: classes2.dex */
public class s extends t {

    /* renamed from: g, reason: collision with root package name */
    private final t f21784g;

    /* renamed from: h, reason: collision with root package name */
    private final l1 f21785h;

    /* renamed from: i, reason: collision with root package name */
    private l1 f21786i;

    /* renamed from: j, reason: collision with root package name */
    private List<e1> f21787j;

    /* renamed from: k, reason: collision with root package name */
    private List<e1> f21788k;
    private kotlin.reflect.x.internal.l0.l.e1 l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* loaded from: classes2.dex */
    public class a implements Function1<e1, Boolean> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(e1 e1Var) {
            return Boolean.valueOf(!e1Var.o0());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* loaded from: classes2.dex */
    class b implements Function1<kotlin.reflect.x.internal.l0.l.m0, kotlin.reflect.x.internal.l0.l.m0> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.x.internal.l0.l.m0 invoke(kotlin.reflect.x.internal.l0.l.m0 m0Var) {
            return s.this.N0(m0Var);
        }
    }

    public s(t tVar, l1 l1Var) {
        this.f21784g = tVar;
        this.f21785h = l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void K(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p1.s.K(int):void");
    }

    private l1 L0() {
        List<e1> N;
        if (this.f21786i == null) {
            if (this.f21785h.k()) {
                this.f21786i = this.f21785h;
            } else {
                List<e1> parameters = this.f21784g.g().getParameters();
                this.f21787j = new ArrayList(parameters.size());
                this.f21786i = kotlin.reflect.x.internal.l0.l.t.b(parameters, this.f21785h.j(), this, this.f21787j);
                N = kotlin.collections.b0.N(this.f21787j, new a());
                this.f21788k = N;
            }
        }
        return this.f21786i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kotlin.reflect.x.internal.l0.l.m0 N0(kotlin.reflect.x.internal.l0.l.m0 m0Var) {
        return (m0Var == null || this.f21785h.k()) ? m0Var : (kotlin.reflect.x.internal.l0.l.m0) L0().p(m0Var, r1.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return this.f21784g.A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean D() {
        return this.f21784g.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h D0() {
        kotlin.reflect.x.internal.l0.i.w.h H = H(kotlin.reflect.x.internal.l0.i.t.a.k(kotlin.reflect.x.internal.l0.i.d.g(this.f21784g)));
        if (H == null) {
            K(12);
        }
        return H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean E0() {
        return this.f21784g.E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public List<w0> F0() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            K(17);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.t
    public kotlin.reflect.x.internal.l0.i.w.h H(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        if (gVar == null) {
            K(13);
        }
        kotlin.reflect.x.internal.l0.i.w.h H = this.f21784g.H(gVar);
        if (!this.f21785h.k()) {
            return new kotlin.reflect.x.internal.l0.i.w.m(H, L0());
        }
        if (H == null) {
            K(14);
        }
        return H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> J() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> J = this.f21784g.J();
        if (J == null) {
            K(31);
        }
        return J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean J0() {
        return this.f21784g.J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public w0 K0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        return oVar.a(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean M() {
        return this.f21784g.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(l1 l1Var) {
        if (l1Var == null) {
            K(23);
        }
        return l1Var.k() ? this : new s(this, l1.h(l1Var.j(), L0().j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d R() {
        return this.f21784g.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h S() {
        kotlin.reflect.x.internal.l0.i.w.h S = this.f21784g.S();
        if (S == null) {
            K(15);
        }
        return S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e U() {
        return this.f21784g.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h a0(j1 j1Var) {
        if (j1Var == null) {
            K(10);
        }
        kotlin.reflect.x.internal.l0.i.w.h v = v(j1Var, kotlin.reflect.x.internal.l0.i.t.a.k(kotlin.reflect.x.internal.l0.i.d.g(this)));
        if (v == null) {
            K(11);
        }
        return v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m b2 = this.f21784g.b();
        if (b2 == null) {
            K(22);
        }
        return b2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.e1 g() {
        kotlin.reflect.x.internal.l0.l.e1 g2 = this.f21784g.g();
        if (this.f21785h.k()) {
            if (g2 == null) {
                K(0);
            }
            return g2;
        }
        if (this.l == null) {
            l1 L0 = L0();
            Collection<kotlin.reflect.x.internal.l0.l.e0> a2 = g2.a();
            ArrayList arrayList = new ArrayList(a2.size());
            Iterator<kotlin.reflect.x.internal.l0.l.e0> it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(L0.p(it.next(), r1.INVARIANT));
            }
            this.l = new kotlin.reflect.x.internal.l0.l.l(this, this.f21787j, arrayList, kotlin.reflect.x.internal.l0.k.f.f21159b);
        }
        kotlin.reflect.x.internal.l0.l.e1 e1Var = this.l;
        if (e1Var == null) {
            K(1);
        }
        return e1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations = this.f21784g.getAnnotations();
        if (annotations == null) {
            K(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public kotlin.reflect.x.internal.l0.f.f getName() {
        kotlin.reflect.x.internal.l0.f.f name = this.f21784g.getName();
        if (name == null) {
            K(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = this.f21784g.getVisibility();
        if (visibility == null) {
            K(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f i() {
        kotlin.reflect.jvm.internal.impl.descriptors.f i2 = this.f21784g.i();
        if (i2 == null) {
            K(25);
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return this.f21784g.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public kotlin.reflect.jvm.internal.impl.descriptors.d0 j() {
        kotlin.reflect.jvm.internal.impl.descriptors.d0 j2 = this.f21784g.j();
        if (j2 == null) {
            K(26);
        }
        return j2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k2 = this.f21784g.k();
        ArrayList arrayList = new ArrayList(k2.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : k2) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.d) dVar.u().h(dVar.L0()).d(dVar.j()).o(dVar.getVisibility()).r(dVar.i()).j(false).a()).c(L0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean l() {
        return this.f21784g.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean m() {
        return this.f21784g.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.m0 s() {
        kotlin.reflect.x.internal.l0.l.m0 j2 = kotlin.reflect.x.internal.l0.l.f0.j(kotlin.reflect.x.internal.l0.l.o.a.a(getAnnotations(), null, null), g(), n1.g(g().getParameters()), false, D0());
        if (j2 == null) {
            K(16);
        }
        return j2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    public z0 t() {
        z0 z0Var = z0.a;
        if (z0Var == null) {
            K(29);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.t
    public kotlin.reflect.x.internal.l0.i.w.h v(j1 j1Var, kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        if (j1Var == null) {
            K(5);
        }
        if (gVar == null) {
            K(6);
        }
        kotlin.reflect.x.internal.l0.i.w.h v = this.f21784g.v(j1Var, gVar);
        if (!this.f21785h.k()) {
            return new kotlin.reflect.x.internal.l0.i.w.m(v, L0());
        }
        if (v == null) {
            K(7);
        }
        return v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    public List<e1> w() {
        L0();
        List<e1> list = this.f21788k;
        if (list == null) {
            K(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.x.internal.l0.i.w.h y0() {
        kotlin.reflect.x.internal.l0.i.w.h y0 = this.f21784g.y0();
        if (y0 == null) {
            K(28);
        }
        return y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean z() {
        return this.f21784g.z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public g1<kotlin.reflect.x.internal.l0.l.m0> z0() {
        g1<kotlin.reflect.x.internal.l0.l.m0> z0 = this.f21784g.z0();
        if (z0 == null) {
            return null;
        }
        return z0.b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: a */
    public kotlin.reflect.jvm.internal.impl.descriptors.e L0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e L0 = this.f21784g.L0();
        if (L0 == null) {
            K(21);
        }
        return L0;
    }
}
