package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.q0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes2.dex */
public final class j0 extends p implements i0 {
    private final kotlin.reflect.x.internal.l0.k.n L;
    private final d1 M;
    private final kotlin.reflect.x.internal.l0.k.j N;
    private kotlin.reflect.jvm.internal.impl.descriptors.d O;
    static final /* synthetic */ KProperty<Object>[] K = {kotlin.jvm.internal.b0.g(new kotlin.jvm.internal.v(kotlin.jvm.internal.b0.b(j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a J = new a(null);

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l1 c(d1 d1Var) {
            if (d1Var.r() == null) {
                return null;
            }
            return l1.f(d1Var.W());
        }

        public final i0 b(kotlin.reflect.x.internal.l0.k.n nVar, d1 d1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.d c2;
            List<w0> i2;
            List<w0> list;
            int t;
            kotlin.jvm.internal.l.f(nVar, "storageManager");
            kotlin.jvm.internal.l.f(d1Var, "typeAliasDescriptor");
            kotlin.jvm.internal.l.f(dVar, "constructor");
            l1 c3 = c(d1Var);
            if (c3 == null || (c2 = dVar.c(c3)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations = dVar.getAnnotations();
            b.a i3 = dVar.i();
            kotlin.jvm.internal.l.e(i3, "constructor.kind");
            z0 t2 = d1Var.t();
            kotlin.jvm.internal.l.e(t2, "typeAliasDescriptor.source");
            j0 j0Var = new j0(nVar, d1Var, c2, null, annotations, i3, t2, null);
            List<i1> P0 = p.P0(j0Var, dVar.h(), c3);
            if (P0 == null) {
                return null;
            }
            kotlin.reflect.x.internal.l0.l.m0 c4 = kotlin.reflect.x.internal.l0.l.b0.c(c2.getReturnType().R0());
            kotlin.reflect.x.internal.l0.l.m0 s = d1Var.s();
            kotlin.jvm.internal.l.e(s, "typeAliasDescriptor.defaultType");
            kotlin.reflect.x.internal.l0.l.m0 j2 = q0.j(c4, s);
            w0 f0 = dVar.f0();
            w0 h2 = f0 != null ? kotlin.reflect.x.internal.l0.i.c.h(j0Var, c3.n(f0.getType(), r1.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.e r = d1Var.r();
            if (r != null) {
                List<w0> r0 = dVar.r0();
                kotlin.jvm.internal.l.e(r0, "constructor.contextReceiverParameters");
                t = kotlin.collections.u.t(r0, 10);
                list = new ArrayList<>(t);
                Iterator<T> it = r0.iterator();
                while (it.hasNext()) {
                    list.add(kotlin.reflect.x.internal.l0.i.c.c(r, c3.n(((w0) it.next()).getType(), r1.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b()));
                }
            } else {
                i2 = kotlin.collections.t.i();
                list = i2;
            }
            j0Var.S0(h2, null, list, d1Var.w(), P0, j2, kotlin.reflect.jvm.internal.impl.descriptors.d0.FINAL, d1Var.getVisibility());
            return j0Var;
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<j0> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f21741g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            super(0);
            this.f21741g = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            int t;
            kotlin.reflect.x.internal.l0.k.n h0 = j0.this.h0();
            d1 p1 = j0.this.p1();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f21741g;
            j0 j0Var = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations = dVar.getAnnotations();
            b.a i2 = this.f21741g.i();
            kotlin.jvm.internal.l.e(i2, "underlyingConstructorDescriptor.kind");
            z0 t2 = j0.this.p1().t();
            kotlin.jvm.internal.l.e(t2, "typeAliasDescriptor.source");
            j0 j0Var2 = new j0(h0, p1, dVar, j0Var, annotations, i2, t2, null);
            j0 j0Var3 = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = this.f21741g;
            l1 c2 = j0.J.c(j0Var3.p1());
            if (c2 == null) {
                return null;
            }
            w0 f0 = dVar2.f0();
            w0 c3 = f0 != null ? f0.c(c2) : null;
            List<w0> r0 = dVar2.r0();
            kotlin.jvm.internal.l.e(r0, "underlyingConstructorDes…contextReceiverParameters");
            t = kotlin.collections.u.t(r0, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = r0.iterator();
            while (it.hasNext()) {
                arrayList.add(((w0) it.next()).c(c2));
            }
            j0Var2.S0(null, c3, arrayList, j0Var3.p1().w(), j0Var3.h(), j0Var3.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.d0.FINAL, j0Var3.p1().getVisibility());
            return j0Var2;
        }
    }

    private j0(kotlin.reflect.x.internal.l0.k.n nVar, d1 d1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, b.a aVar, z0 z0Var) {
        super(d1Var, i0Var, gVar, kotlin.reflect.x.internal.l0.f.h.f20732i, aVar, z0Var);
        this.L = nVar;
        this.M = d1Var;
        W0(p1().E0());
        this.N = nVar.f(new b(dVar));
        this.O = dVar;
    }

    public /* synthetic */ j0(kotlin.reflect.x.internal.l0.k.n nVar, d1 d1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, b.a aVar, z0 z0Var, kotlin.jvm.internal.g gVar2) {
        this(nVar, d1Var, dVar, i0Var, gVar, aVar, z0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean B() {
        return p0().B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e C() {
        kotlin.reflect.jvm.internal.impl.descriptors.e C = p0().C();
        kotlin.jvm.internal.l.e(C, "underlyingConstructorDescriptor.constructedClass");
        return C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public kotlin.reflect.x.internal.l0.l.e0 getReturnType() {
        kotlin.reflect.x.internal.l0.l.e0 returnType = super.getReturnType();
        kotlin.jvm.internal.l.c(returnType);
        return returnType;
    }

    public final kotlin.reflect.x.internal.l0.k.n h0() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public i0 k0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z) {
        kotlin.jvm.internal.l.f(mVar, "newOwner");
        kotlin.jvm.internal.l.f(d0Var, "modality");
        kotlin.jvm.internal.l.f(uVar, "visibility");
        kotlin.jvm.internal.l.f(aVar, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.y a2 = u().p(mVar).d(d0Var).o(uVar).r(aVar).j(z).a();
        kotlin.jvm.internal.l.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public j0 M0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.y yVar, b.a aVar, kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, z0 z0Var) {
        kotlin.jvm.internal.l.f(mVar, "newOwner");
        kotlin.jvm.internal.l.f(aVar, "kind");
        kotlin.jvm.internal.l.f(gVar, "annotations");
        kotlin.jvm.internal.l.f(z0Var, "source");
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2) {
            b.a aVar3 = b.a.SYNTHESIZED;
        }
        return new j0(this.L, p1(), p0(), this, gVar, aVar2, z0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public d1 b() {
        return p1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.p1.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public i0 L0() {
        kotlin.reflect.jvm.internal.impl.descriptors.y L0 = super.L0();
        kotlin.jvm.internal.l.d(L0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) L0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.i0
    public kotlin.reflect.jvm.internal.impl.descriptors.d p0() {
        return this.O;
    }

    public d1 p1() {
        return this.M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.b1
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public i0 c(l1 l1Var) {
        kotlin.jvm.internal.l.f(l1Var, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.y c2 = super.c(l1Var);
        kotlin.jvm.internal.l.d(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        j0 j0Var = (j0) c2;
        l1 f2 = l1.f(j0Var.getReturnType());
        kotlin.jvm.internal.l.e(f2, "create(substitutedTypeAliasConstructor.returnType)");
        kotlin.reflect.jvm.internal.impl.descriptors.d c3 = p0().L0().c(f2);
        if (c3 == null) {
            return null;
        }
        j0Var.O = c3;
        return j0Var;
    }
}
