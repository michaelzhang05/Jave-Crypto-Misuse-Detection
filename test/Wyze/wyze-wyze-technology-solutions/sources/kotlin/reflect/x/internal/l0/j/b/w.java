package kotlin.reflect.x.internal.l0.j.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.u;
import kotlin.reflect.x.internal.l0.e.x;
import kotlin.reflect.x.internal.l0.e.z.b;
import kotlin.reflect.x.internal.l0.e.z.h;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.j.b.g0.k;
import kotlin.reflect.x.internal.l0.j.b.z;
import kotlin.reflect.x.internal.l0.k.j;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes2.dex */
public final class w {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.j.b.e f21116b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f21118g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.b f21119h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar) {
            super(0);
            this.f21118g = oVar;
            this.f21119h = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i2;
            w wVar = w.this;
            z c2 = wVar.c(wVar.a.e());
            if (c2 != null) {
                w wVar2 = w.this;
                list = b0.y0(wVar2.a.c().d().j(c2, this.f21118g, this.f21119h));
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            i2 = t.i();
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f21121g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f21122h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, n nVar) {
            super(0);
            this.f21121g = z;
            this.f21122h = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i2;
            w wVar = w.this;
            z c2 = wVar.c(wVar.a.e());
            if (c2 != null) {
                boolean z = this.f21121g;
                w wVar2 = w.this;
                n nVar = this.f21122h;
                list = z ? b0.y0(wVar2.a.c().d().i(c2, nVar)) : b0.y0(wVar2.a.c().d().g(c2, nVar));
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            i2 = t.i();
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f21124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.b f21125h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar) {
            super(0);
            this.f21124g = oVar;
            this.f21125h = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> invoke() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.n1.c> list;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i2;
            w wVar = w.this;
            z c2 = wVar.c(wVar.a.e());
            if (c2 != null) {
                w wVar2 = w.this;
                list = wVar2.a.c().d().h(c2, this.f21124g, this.f21125h);
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            i2 = t.i();
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function0<j<? extends g<?>>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f21127g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.g0.j f21128h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MemberDeserializer.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<g<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f21129f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f21130g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.g0.j f21131h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, n nVar, kotlin.reflect.x.internal.l0.j.b.g0.j jVar) {
                super(0);
                this.f21129f = wVar;
                this.f21130g = nVar;
                this.f21131h = jVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g<?> invoke() {
                w wVar = this.f21129f;
                z c2 = wVar.c(wVar.a.e());
                l.c(c2);
                kotlin.reflect.x.internal.l0.j.b.c<kotlin.reflect.jvm.internal.impl.descriptors.n1.c, g<?>> d2 = this.f21129f.a.c().d();
                n nVar = this.f21130g;
                e0 returnType = this.f21131h.getReturnType();
                l.e(returnType, "property.returnType");
                return d2.e(c2, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, kotlin.reflect.x.internal.l0.j.b.g0.j jVar) {
            super(0);
            this.f21127g = nVar;
            this.f21128h = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j<g<?>> invoke() {
            return w.this.a.h().f(new a(w.this, this.f21127g, this.f21128h));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function0<j<? extends g<?>>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f21133g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.g0.j f21134h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MemberDeserializer.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<g<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f21135f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f21136g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.g0.j f21137h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, n nVar, kotlin.reflect.x.internal.l0.j.b.g0.j jVar) {
                super(0);
                this.f21135f = wVar;
                this.f21136g = nVar;
                this.f21137h = jVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g<?> invoke() {
                w wVar = this.f21135f;
                z c2 = wVar.c(wVar.a.e());
                l.c(c2);
                kotlin.reflect.x.internal.l0.j.b.c<kotlin.reflect.jvm.internal.impl.descriptors.n1.c, g<?>> d2 = this.f21135f.a.c().d();
                n nVar = this.f21136g;
                e0 returnType = this.f21137h.getReturnType();
                l.e(returnType, "property.returnType");
                return d2.k(c2, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar, kotlin.reflect.x.internal.l0.j.b.g0.j jVar) {
            super(0);
            this.f21133g = nVar;
            this.f21134h = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j<g<?>> invoke() {
            return w.this.a.h().f(new a(w.this, this.f21133g, this.f21134h));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f21139g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f21140h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.j.b.b f21141i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f21142j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u f21143k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z zVar, o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar, int i2, u uVar) {
            super(0);
            this.f21139g = zVar;
            this.f21140h = oVar;
            this.f21141i = bVar;
            this.f21142j = i2;
            this.f21143k = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> y0;
            y0 = b0.y0(w.this.a.c().d().b(this.f21139g, this.f21140h, this.f21141i, this.f21142j, this.f21143k));
            return y0;
        }
    }

    public w(m mVar) {
        l.f(mVar, "c");
        this.a = mVar;
        this.f21116b = new kotlin.reflect.x.internal.l0.j.b.e(mVar.c().p(), mVar.c().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z c(m mVar) {
        if (mVar instanceof k0) {
            return new z.b(((k0) mVar).d(), this.a.g(), this.a.j(), this.a.d());
        }
        if (mVar instanceof kotlin.reflect.x.internal.l0.j.b.g0.d) {
            return ((kotlin.reflect.x.internal.l0.j.b.g0.d) mVar).g1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.n1.g d(o oVar, int i2, kotlin.reflect.x.internal.l0.j.b.b bVar) {
        if (!kotlin.reflect.x.internal.l0.e.z.b.f20692c.d(i2).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        }
        return new kotlin.reflect.x.internal.l0.j.b.g0.n(this.a.h(), new a(oVar, bVar));
    }

    private final w0 e() {
        m e2 = this.a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e2 : null;
        if (eVar != null) {
            return eVar.K0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.n1.g f(n nVar, boolean z) {
        if (!kotlin.reflect.x.internal.l0.e.z.b.f20692c.d(nVar.c0()).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        }
        return new kotlin.reflect.x.internal.l0.j.b.g0.n(this.a.h(), new b(z, nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.n1.g g(o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar) {
        return new kotlin.reflect.x.internal.l0.j.b.g0.a(this.a.h(), new c(oVar, bVar));
    }

    private final void h(k kVar, w0 w0Var, w0 w0Var2, List<? extends w0> list, List<? extends e1> list2, List<? extends i1> list3, e0 e0Var, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, Map<? extends a.InterfaceC0365a<?>, ?> map) {
        kVar.p1(w0Var, w0Var2, list, list2, list3, e0Var, d0Var, uVar, map);
    }

    private final int k(int i2) {
        return (i2 & 63) + ((i2 >> 8) << 6);
    }

    private final w0 n(q qVar, m mVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        return kotlin.reflect.x.internal.l0.i.c.b(aVar, mVar.i().q(qVar), kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.i1> o(java.util.List<kotlin.reflect.x.internal.l0.e.u> r26, kotlin.reflect.jvm.internal.impl.protobuf.o r27, kotlin.reflect.x.internal.l0.j.b.b r28) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.w.o(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.f0.x.e.l0.j.b.b):java.util.List");
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d i(kotlin.reflect.x.internal.l0.e.d dVar, boolean z) {
        List i2;
        l.f(dVar, "proto");
        m e2 = this.a.e();
        l.d(e2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) e2;
        int L = dVar.L();
        kotlin.reflect.x.internal.l0.j.b.b bVar = kotlin.reflect.x.internal.l0.j.b.b.FUNCTION;
        kotlin.reflect.x.internal.l0.j.b.g0.c cVar = new kotlin.reflect.x.internal.l0.j.b.g0.c(eVar, null, d(dVar, L, bVar), z, b.a.DECLARATION, dVar, this.a.g(), this.a.j(), this.a.k(), this.a.d(), null, 1024, null);
        m mVar = this.a;
        i2 = t.i();
        w f2 = m.b(mVar, cVar, i2, null, null, null, null, 60, null).f();
        List<u> O = dVar.O();
        l.e(O, "proto.valueParameterList");
        cVar.r1(f2.o(O, dVar, bVar), b0.a(a0.a, kotlin.reflect.x.internal.l0.e.z.b.f20693d.d(dVar.L())));
        cVar.h1(eVar.s());
        cVar.X0(eVar.M());
        cVar.Z0(!kotlin.reflect.x.internal.l0.e.z.b.n.d(dVar.L()).booleanValue());
        return cVar;
    }

    public final y0 j(i iVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g b2;
        h k2;
        Map<? extends a.InterfaceC0365a<?>, ?> i2;
        e0 q;
        l.f(iVar, "proto");
        int e0 = iVar.u0() ? iVar.e0() : k(iVar.g0());
        kotlin.reflect.x.internal.l0.j.b.b bVar = kotlin.reflect.x.internal.l0.j.b.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g d2 = d(iVar, e0, bVar);
        if (kotlin.reflect.x.internal.l0.e.z.f.d(iVar)) {
            b2 = g(iVar, bVar);
        } else {
            b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        }
        if (l.a(kotlin.reflect.x.internal.l0.i.t.a.h(this.a.e()).c(x.b(this.a.g(), iVar.f0())), c0.a)) {
            k2 = h.a.b();
        } else {
            k2 = this.a.k();
        }
        k kVar = new k(this.a.e(), null, d2, x.b(this.a.g(), iVar.f0()), b0.b(a0.a, kotlin.reflect.x.internal.l0.e.z.b.o.d(e0)), iVar, this.a.g(), this.a.j(), k2, this.a.d(), null, 1024, null);
        m mVar = this.a;
        List<s> n0 = iVar.n0();
        l.e(n0, "proto.typeParameterList");
        m b3 = m.b(mVar, kVar, n0, null, null, null, null, 60, null);
        q h2 = kotlin.reflect.x.internal.l0.e.z.f.h(iVar, this.a.j());
        w0 h3 = (h2 == null || (q = b3.i().q(h2)) == null) ? null : kotlin.reflect.x.internal.l0.i.c.h(kVar, q, b2);
        w0 e2 = e();
        List<q> a0 = iVar.a0();
        l.e(a0, "proto.contextReceiverTypeList");
        List<? extends w0> arrayList = new ArrayList<>();
        for (q qVar : a0) {
            l.e(qVar, "it");
            w0 n = n(qVar, b3, kVar);
            if (n != null) {
                arrayList.add(n);
            }
        }
        List<e1> j2 = b3.i().j();
        w f2 = b3.f();
        List<u> r0 = iVar.r0();
        l.e(r0, "proto.valueParameterList");
        List<i1> o = f2.o(r0, iVar, kotlin.reflect.x.internal.l0.j.b.b.FUNCTION);
        e0 q2 = b3.i().q(kotlin.reflect.x.internal.l0.e.z.f.j(iVar, this.a.j()));
        a0 a0Var = a0.a;
        d0 b4 = a0Var.b(kotlin.reflect.x.internal.l0.e.z.b.f20694e.d(e0));
        kotlin.reflect.jvm.internal.impl.descriptors.u a2 = b0.a(a0Var, kotlin.reflect.x.internal.l0.e.z.b.f20693d.d(e0));
        i2 = o0.i();
        h(kVar, h3, e2, arrayList, j2, o, q2, b4, a2, i2);
        Boolean d3 = kotlin.reflect.x.internal.l0.e.z.b.p.d(e0);
        l.e(d3, "IS_OPERATOR.get(flags)");
        kVar.g1(d3.booleanValue());
        Boolean d4 = kotlin.reflect.x.internal.l0.e.z.b.q.d(e0);
        l.e(d4, "IS_INFIX.get(flags)");
        kVar.d1(d4.booleanValue());
        Boolean d5 = kotlin.reflect.x.internal.l0.e.z.b.t.d(e0);
        l.e(d5, "IS_EXTERNAL_FUNCTION.get(flags)");
        kVar.Y0(d5.booleanValue());
        Boolean d6 = kotlin.reflect.x.internal.l0.e.z.b.r.d(e0);
        l.e(d6, "IS_INLINE.get(flags)");
        kVar.f1(d6.booleanValue());
        Boolean d7 = kotlin.reflect.x.internal.l0.e.z.b.s.d(e0);
        l.e(d7, "IS_TAILREC.get(flags)");
        kVar.j1(d7.booleanValue());
        Boolean d8 = kotlin.reflect.x.internal.l0.e.z.b.u.d(e0);
        l.e(d8, "IS_SUSPEND.get(flags)");
        kVar.i1(d8.booleanValue());
        Boolean d9 = kotlin.reflect.x.internal.l0.e.z.b.v.d(e0);
        l.e(d9, "IS_EXPECT_FUNCTION.get(flags)");
        kVar.X0(d9.booleanValue());
        kVar.Z0(!kotlin.reflect.x.internal.l0.e.z.b.w.d(e0).booleanValue());
        Pair<a.InterfaceC0365a<?>, Object> a3 = this.a.c().h().a(iVar, kVar, this.a.j(), b3.i());
        if (a3 != null) {
            kVar.V0(a3.c(), a3.d());
        }
        return kVar;
    }

    public final t0 l(n nVar) {
        n nVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g b2;
        kotlin.reflect.x.internal.l0.j.b.g0.j jVar;
        w0 w0Var;
        int t;
        b.d<x> dVar;
        m mVar;
        b.d<kotlin.reflect.x.internal.l0.e.k> dVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d0Var2;
        kotlin.reflect.x.internal.l0.j.b.g0.j jVar2;
        n nVar3;
        int i2;
        boolean z;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 e0Var;
        List i3;
        List<u> e2;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d2;
        e0 q;
        l.f(nVar, "proto");
        int c0 = nVar.q0() ? nVar.c0() : k(nVar.f0());
        m e3 = this.a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g d3 = d(nVar, c0, kotlin.reflect.x.internal.l0.j.b.b.PROPERTY);
        a0 a0Var = a0.a;
        d0 b3 = a0Var.b(kotlin.reflect.x.internal.l0.e.z.b.f20694e.d(c0));
        kotlin.reflect.jvm.internal.impl.descriptors.u a2 = b0.a(a0Var, kotlin.reflect.x.internal.l0.e.z.b.f20693d.d(c0));
        Boolean d4 = kotlin.reflect.x.internal.l0.e.z.b.x.d(c0);
        l.e(d4, "IS_VAR.get(flags)");
        boolean booleanValue = d4.booleanValue();
        kotlin.reflect.x.internal.l0.f.f b4 = x.b(this.a.g(), nVar.e0());
        b.a b5 = b0.b(a0Var, kotlin.reflect.x.internal.l0.e.z.b.o.d(c0));
        Boolean d5 = kotlin.reflect.x.internal.l0.e.z.b.B.d(c0);
        l.e(d5, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = d5.booleanValue();
        Boolean d6 = kotlin.reflect.x.internal.l0.e.z.b.A.d(c0);
        l.e(d6, "IS_CONST.get(flags)");
        boolean booleanValue3 = d6.booleanValue();
        Boolean d7 = kotlin.reflect.x.internal.l0.e.z.b.D.d(c0);
        l.e(d7, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = d7.booleanValue();
        Boolean d8 = kotlin.reflect.x.internal.l0.e.z.b.E.d(c0);
        l.e(d8, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = d8.booleanValue();
        Boolean d9 = kotlin.reflect.x.internal.l0.e.z.b.F.d(c0);
        l.e(d9, "IS_EXPECT_PROPERTY.get(flags)");
        kotlin.reflect.x.internal.l0.j.b.g0.j jVar3 = new kotlin.reflect.x.internal.l0.j.b.g0.j(e3, null, d3, b3, a2, booleanValue, b4, b5, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d9.booleanValue(), nVar, this.a.g(), this.a.j(), this.a.k(), this.a.d());
        m mVar2 = this.a;
        List<s> o0 = nVar.o0();
        l.e(o0, "proto.typeParameterList");
        m b6 = m.b(mVar2, jVar3, o0, null, null, null, null, 60, null);
        Boolean d10 = kotlin.reflect.x.internal.l0.e.z.b.y.d(c0);
        l.e(d10, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = d10.booleanValue();
        if (booleanValue6 && kotlin.reflect.x.internal.l0.e.z.f.e(nVar)) {
            nVar2 = nVar;
            b2 = g(nVar2, kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_GETTER);
        } else {
            nVar2 = nVar;
            b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        }
        e0 q2 = b6.i().q(kotlin.reflect.x.internal.l0.e.z.f.k(nVar2, this.a.j()));
        List<e1> j2 = b6.i().j();
        w0 e4 = e();
        q i4 = kotlin.reflect.x.internal.l0.e.z.f.i(nVar2, this.a.j());
        if (i4 == null || (q = b6.i().q(i4)) == null) {
            jVar = jVar3;
            w0Var = null;
        } else {
            jVar = jVar3;
            w0Var = kotlin.reflect.x.internal.l0.i.c.h(jVar, q, b2);
        }
        List<q> Z = nVar.Z();
        l.e(Z, "proto.contextReceiverTypeList");
        t = kotlin.collections.u.t(Z, 10);
        ArrayList arrayList = new ArrayList(t);
        for (q qVar : Z) {
            l.e(qVar, "it");
            arrayList.add(n(qVar, b6, jVar));
        }
        jVar.c1(q2, j2, e4, w0Var, arrayList);
        Boolean d11 = kotlin.reflect.x.internal.l0.e.z.b.f20692c.d(c0);
        l.e(d11, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = d11.booleanValue();
        b.d<x> dVar3 = kotlin.reflect.x.internal.l0.e.z.b.f20693d;
        x d12 = dVar3.d(c0);
        b.d<kotlin.reflect.x.internal.l0.e.k> dVar4 = kotlin.reflect.x.internal.l0.e.z.b.f20694e;
        int b7 = kotlin.reflect.x.internal.l0.e.z.b.b(booleanValue7, d12, dVar4.d(c0), false, false, false);
        if (booleanValue6) {
            int d0 = nVar.r0() ? nVar.d0() : b7;
            Boolean d13 = kotlin.reflect.x.internal.l0.e.z.b.J.d(d0);
            l.e(d13, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = d13.booleanValue();
            Boolean d14 = kotlin.reflect.x.internal.l0.e.z.b.K.d(d0);
            l.e(d14, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = d14.booleanValue();
            Boolean d15 = kotlin.reflect.x.internal.l0.e.z.b.L.d(d0);
            l.e(d15, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = d15.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g d16 = d(nVar2, d0, kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_GETTER);
            if (booleanValue8) {
                a0 a0Var2 = a0.a;
                mVar = b6;
                dVar2 = dVar4;
                dVar = dVar3;
                d2 = new kotlin.reflect.jvm.internal.impl.descriptors.p1.d0(jVar, d16, a0Var2.b(dVar4.d(d0)), b0.a(a0Var2, dVar3.d(d0)), !booleanValue8, booleanValue9, booleanValue10, jVar.i(), null, z0.a);
            } else {
                dVar = dVar3;
                mVar = b6;
                dVar2 = dVar4;
                d2 = kotlin.reflect.x.internal.l0.i.c.d(jVar, d16);
                l.e(d2, "{\n                Descri…nnotations)\n            }");
            }
            d2.R0(jVar.getReturnType());
            d0Var = d2;
        } else {
            dVar = dVar3;
            mVar = b6;
            dVar2 = dVar4;
            d0Var = null;
        }
        Boolean d17 = kotlin.reflect.x.internal.l0.e.z.b.z.d(c0);
        l.e(d17, "HAS_SETTER.get(flags)");
        if (d17.booleanValue()) {
            if (nVar.y0()) {
                b7 = nVar.k0();
            }
            int i5 = b7;
            Boolean d18 = kotlin.reflect.x.internal.l0.e.z.b.J.d(i5);
            l.e(d18, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = d18.booleanValue();
            Boolean d19 = kotlin.reflect.x.internal.l0.e.z.b.K.d(i5);
            l.e(d19, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = d19.booleanValue();
            Boolean d20 = kotlin.reflect.x.internal.l0.e.z.b.L.d(i5);
            l.e(d20, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = d20.booleanValue();
            kotlin.reflect.x.internal.l0.j.b.b bVar = kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g d21 = d(nVar2, i5, bVar);
            if (booleanValue11) {
                a0 a0Var3 = a0.a;
                d0Var2 = d0Var;
                kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 e0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.p1.e0(jVar, d21, a0Var3.b(dVar2.d(i5)), b0.a(a0Var3, dVar.d(i5)), !booleanValue11, booleanValue12, booleanValue13, jVar.i(), null, z0.a);
                i3 = t.i();
                z = true;
                jVar2 = jVar;
                nVar3 = nVar2;
                i2 = c0;
                w f2 = m.b(mVar, e0Var2, i3, null, null, null, null, 60, null).f();
                e2 = kotlin.collections.s.e(nVar.l0());
                e0Var2.S0((i1) r.n0(f2.o(e2, nVar3, bVar)));
                e0Var = e0Var2;
            } else {
                d0Var2 = d0Var;
                jVar2 = jVar;
                nVar3 = nVar2;
                i2 = c0;
                z = true;
                e0Var = kotlin.reflect.x.internal.l0.i.c.e(jVar2, d21, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b());
                l.e(e0Var, "{\n                Descri…          )\n            }");
            }
        } else {
            d0Var2 = d0Var;
            jVar2 = jVar;
            nVar3 = nVar2;
            i2 = c0;
            z = true;
            e0Var = null;
        }
        Boolean d22 = kotlin.reflect.x.internal.l0.e.z.b.C.d(i2);
        l.e(d22, "HAS_CONSTANT.get(flags)");
        if (d22.booleanValue()) {
            jVar2.M0(new d(nVar3, jVar2));
        }
        m e5 = this.a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e5 : null;
        if ((eVar != null ? eVar.i() : null) == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) {
            jVar2.M0(new e(nVar3, jVar2));
        }
        jVar2.W0(d0Var2, e0Var, new kotlin.reflect.jvm.internal.impl.descriptors.p1.o(f(nVar3, false), jVar2), new kotlin.reflect.jvm.internal.impl.descriptors.p1.o(f(nVar3, z), jVar2));
        return jVar2;
    }

    public final d1 m(kotlin.reflect.x.internal.l0.e.r rVar) {
        int t;
        l.f(rVar, "proto");
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
        List<kotlin.reflect.x.internal.l0.e.b> S = rVar.S();
        l.e(S, "proto.annotationList");
        t = kotlin.collections.u.t(S, 10);
        ArrayList arrayList = new ArrayList(t);
        for (kotlin.reflect.x.internal.l0.e.b bVar : S) {
            kotlin.reflect.x.internal.l0.j.b.e eVar = this.f21116b;
            l.e(bVar, "it");
            arrayList.add(eVar.a(bVar, this.a.g()));
        }
        kotlin.reflect.x.internal.l0.j.b.g0.l lVar = new kotlin.reflect.x.internal.l0.j.b.g0.l(this.a.h(), this.a.e(), aVar.a(arrayList), x.b(this.a.g(), rVar.Y()), b0.a(a0.a, kotlin.reflect.x.internal.l0.e.z.b.f20693d.d(rVar.X())), rVar, this.a.g(), this.a.j(), this.a.k(), this.a.d());
        m mVar = this.a;
        List<s> b0 = rVar.b0();
        l.e(b0, "proto.typeParameterList");
        m b2 = m.b(mVar, lVar, b0, null, null, null, null, 60, null);
        lVar.R0(b2.i().j(), b2.i().l(kotlin.reflect.x.internal.l0.e.z.f.o(rVar, this.a.j()), false), b2.i().l(kotlin.reflect.x.internal.l0.e.z.f.b(rVar, this.a.j()), false));
        return lVar;
    }
}
