package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.q1;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes2.dex */
public abstract class d extends k implements d1 {

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.u f21719j;

    /* renamed from: k, reason: collision with root package name */
    private List<? extends e1> f21720k;
    private final c l;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<kotlin.reflect.x.internal.l0.l.t1.g, kotlin.reflect.x.internal.l0.l.m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.l.m0 invoke(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f2 = gVar.f(d.this);
            if (f2 != null) {
                return f2.s();
            }
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<q1, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            if (((r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1) && !kotlin.jvm.internal.l.a(((kotlin.reflect.jvm.internal.impl.descriptors.e1) r5).b(), r0)) != false) goto L13;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.reflect.x.internal.l0.l.q1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.l.e(r5, r0)
                boolean r0 = kotlin.reflect.x.internal.l0.l.g0.a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                kotlin.reflect.jvm.internal.impl.descriptors.p1.d r0 = kotlin.reflect.jvm.internal.impl.descriptors.p1.d.this
                kotlin.f0.x.e.l0.l.e1 r5 = r5.O0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.w()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1
                if (r3 == 0) goto L29
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r5
                kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.b()
                boolean r5 = kotlin.jvm.internal.l.a(r5, r0)
                if (r5 != 0) goto L29
                r5 = 1
                goto L2a
            L29:
                r5 = 0
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = 0
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p1.d.b.invoke(kotlin.f0.x.e.l0.l.q1):java.lang.Boolean");
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class c implements kotlin.reflect.x.internal.l0.l.e1 {
        c() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public Collection<kotlin.reflect.x.internal.l0.l.e0> a() {
            Collection<kotlin.reflect.x.internal.l0.l.e0> a = w().g0().O0().a();
            kotlin.jvm.internal.l.e(a, "declarationDescriptor.un…pe.constructor.supertypes");
            return a;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public kotlin.reflect.x.internal.l0.l.e1 b(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefiner");
            return this;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d1 w() {
            return d.this;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public List<e1> getParameters() {
            return d.this.N0();
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public kotlin.reflect.x.internal.l0.b.h o() {
            return kotlin.reflect.x.internal.l0.i.t.a.f(w());
        }

        public String toString() {
            return "[typealias " + w().getName().f() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, kotlin.reflect.x.internal.l0.f.f fVar, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        super(mVar, gVar, fVar, z0Var);
        kotlin.jvm.internal.l.f(mVar, "containingDeclaration");
        kotlin.jvm.internal.l.f(gVar, "annotations");
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(z0Var, "sourceElement");
        kotlin.jvm.internal.l.f(uVar, "visibilityImpl");
        this.f21719j = uVar;
        this.l = new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.l.m0 A0() {
        kotlin.reflect.x.internal.l0.i.w.h hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.e r = r();
        if (r == null || (hVar = r.D0()) == null) {
            hVar = h.b.f20931b;
        }
        kotlin.reflect.x.internal.l0.l.m0 t = n1.t(this, hVar, new a());
        kotlin.jvm.internal.l.e(t, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        kotlin.jvm.internal.l.f(oVar, "visitor");
        return oVar.e(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.p1.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    public d1 L0() {
        kotlin.reflect.jvm.internal.impl.descriptors.p L0 = super.L0();
        kotlin.jvm.internal.l.d(L0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (d1) L0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean M() {
        return false;
    }

    public final Collection<i0> M0() {
        List i2;
        kotlin.reflect.jvm.internal.impl.descriptors.e r = r();
        if (r == null) {
            i2 = kotlin.collections.t.i();
            return i2;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k2 = r.k();
        kotlin.jvm.internal.l.e(k2, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : k2) {
            j0.a aVar = j0.J;
            kotlin.reflect.x.internal.l0.k.n h0 = h0();
            kotlin.jvm.internal.l.e(dVar, "it");
            i0 b2 = aVar.b(h0, this, dVar);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    protected abstract List<e1> N0();

    public final void O0(List<? extends e1> list) {
        kotlin.jvm.internal.l.f(list, "declaredTypeParameters");
        this.f21720k = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.e1 g() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        return this.f21719j;
    }

    protected abstract kotlin.reflect.x.internal.l0.k.n h0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean m() {
        return n1.c(g0(), new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.j
    public String toString() {
        return "typealias " + getName().f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public List<e1> w() {
        List list = this.f21720k;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l.v("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean z() {
        return false;
    }
}
