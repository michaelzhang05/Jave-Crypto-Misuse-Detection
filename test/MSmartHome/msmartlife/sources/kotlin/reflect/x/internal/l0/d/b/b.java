package kotlin.reflect.x.internal.l0.d.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.f0.x.e.l0.d.b.b.a;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.d.b.t;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.z.e;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.j.b.f;
import kotlin.reflect.x.internal.l0.j.b.z;
import kotlin.text.v;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes2.dex */
public abstract class b<A, S extends a<? extends A>> implements f<A> {
    private final o a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes2.dex */
    public static abstract class a<A> {
        public abstract Map<t, List<A>> a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0301b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kotlin.reflect.x.internal.l0.j.b.b.values().length];
            iArr[kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[kotlin.reflect.x.internal.l0.j.b.b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[kotlin.reflect.x.internal.l0.j.b.b.PROPERTY.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* loaded from: classes2.dex */
    public static final class d implements q.c {
        final /* synthetic */ b<A, S> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f20245b;

        d(b<A, S> bVar, ArrayList<A> arrayList) {
            this.a = bVar;
            this.f20245b = arrayList;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.c
        public void a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.c
        public q.a b(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var) {
            l.f(bVar, "classId");
            l.f(z0Var, "source");
            return this.a.y(bVar, z0Var, this.f20245b);
        }
    }

    public b(o oVar) {
        l.f(oVar, "kotlinClassFinder");
        this.a = oVar;
    }

    private final q B(z.a aVar) {
        z0 c2 = aVar.c();
        s sVar = c2 instanceof s ? (s) c2 : null;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    private final int l(z zVar, o oVar) {
        if (oVar instanceof i) {
            if (kotlin.reflect.x.internal.l0.e.z.f.d((i) oVar)) {
                return 1;
            }
        } else if (oVar instanceof n) {
            if (kotlin.reflect.x.internal.l0.e.z.f.e((n) oVar)) {
                return 1;
            }
        } else if (oVar instanceof kotlin.reflect.x.internal.l0.e.d) {
            l.d(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            z.a aVar = (z.a) zVar;
            if (aVar.g() == c.EnumC0324c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + oVar.getClass());
        }
        return 0;
    }

    private final List<A> m(z zVar, t tVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> i2;
        List<A> i3;
        q o = o(zVar, v(zVar, z, z2, bool, z3));
        if (o == null) {
            i3 = t.i();
            return i3;
        }
        List<A> list = p(o).a().get(tVar);
        if (list != null) {
            return list;
        }
        i2 = t.i();
        return i2;
    }

    static /* synthetic */ List n(b bVar, z zVar, t tVar, boolean z, boolean z2, Boolean bool, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return bVar.m(zVar, tVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ t s(b bVar, o oVar, kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, kotlin.reflect.x.internal.l0.j.b.b bVar2, boolean z, int i2, Object obj) {
        if (obj == null) {
            return bVar.r(oVar, cVar, gVar, bVar2, (i2 & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    public static /* synthetic */ t u(b bVar, n nVar, kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return bVar.t(nVar, cVar, gVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final List<A> z(z zVar, n nVar, EnumC0301b enumC0301b) {
        boolean F;
        List<A> i2;
        List<A> i3;
        List<A> i4;
        Boolean d2 = kotlin.reflect.x.internal.l0.e.z.b.A.d(nVar.c0());
        l.e(d2, "IS_CONST.get(proto.flags)");
        boolean booleanValue = d2.booleanValue();
        boolean f2 = kotlin.reflect.x.internal.l0.e.a0.b.i.f(nVar);
        if (enumC0301b == EnumC0301b.PROPERTY) {
            t u = u(this, nVar, zVar.b(), zVar.d(), false, true, false, 40, null);
            if (u != null) {
                return n(this, zVar, u, true, false, Boolean.valueOf(booleanValue), f2, 8, null);
            }
            i4 = t.i();
            return i4;
        }
        t u2 = u(this, nVar, zVar.b(), zVar.d(), true, false, false, 48, null);
        if (u2 == null) {
            i3 = t.i();
            return i3;
        }
        F = v.F(u2.a(), "$delegate", false, 2, null);
        if (F == (enumC0301b == EnumC0301b.DELEGATE_FIELD)) {
            return m(zVar, u2, true, true, Boolean.valueOf(booleanValue), f2);
        }
        i2 = t.i();
        return i2;
    }

    protected abstract A A(kotlin.reflect.x.internal.l0.e.b bVar, kotlin.reflect.x.internal.l0.e.z.c cVar);

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> a(s sVar, kotlin.reflect.x.internal.l0.e.z.c cVar) {
        int t;
        l.f(sVar, "proto");
        l.f(cVar, "nameResolver");
        Object u = sVar.u(kotlin.reflect.x.internal.l0.e.a0.a.f20336h);
        l.e(u, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<kotlin.reflect.x.internal.l0.e.b> iterable = (Iterable) u;
        t = u.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        for (kotlin.reflect.x.internal.l0.e.b bVar : iterable) {
            l.e(bVar, "it");
            arrayList.add(A(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> b(z zVar, o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar, int i2, kotlin.reflect.x.internal.l0.e.u uVar) {
        List<A> i3;
        l.f(zVar, "container");
        l.f(oVar, "callableProto");
        l.f(bVar, "kind");
        l.f(uVar, "proto");
        t s = s(this, oVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s != null) {
            return n(this, zVar, t.a.e(s, i2 + l(zVar, oVar)), false, false, null, false, 60, null);
        }
        i3 = t.i();
        return i3;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> c(z.a aVar) {
        l.f(aVar, "container");
        q B = B(aVar);
        if (B != null) {
            ArrayList arrayList = new ArrayList(1);
            B.b(new d(this, arrayList), q(B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> d(kotlin.reflect.x.internal.l0.e.q qVar, kotlin.reflect.x.internal.l0.e.z.c cVar) {
        int t;
        l.f(qVar, "proto");
        l.f(cVar, "nameResolver");
        Object u = qVar.u(kotlin.reflect.x.internal.l0.e.a0.a.f20334f);
        l.e(u, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<kotlin.reflect.x.internal.l0.e.b> iterable = (Iterable) u;
        t = u.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        for (kotlin.reflect.x.internal.l0.e.b bVar : iterable) {
            l.e(bVar, "it");
            arrayList.add(A(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> f(z zVar, kotlin.reflect.x.internal.l0.e.g gVar) {
        l.f(zVar, "container");
        l.f(gVar, "proto");
        t.a aVar = t.a;
        String string = zVar.b().getString(gVar.H());
        String c2 = ((z.a) zVar).e().c();
        l.e(c2, "container as ProtoContai…Class).classId.asString()");
        return n(this, zVar, aVar.a(string, kotlin.reflect.x.internal.l0.e.a0.b.b.b(c2)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> g(z zVar, n nVar) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        return z(zVar, nVar, EnumC0301b.BACKING_FIELD);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> h(z zVar, o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar) {
        List<A> i2;
        l.f(zVar, "container");
        l.f(oVar, "proto");
        l.f(bVar, "kind");
        t s = s(this, oVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s != null) {
            return n(this, zVar, t.a.e(s, 0), false, false, null, false, 60, null);
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> i(z zVar, n nVar) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        return z(zVar, nVar, EnumC0301b.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<A> j(z zVar, o oVar, kotlin.reflect.x.internal.l0.j.b.b bVar) {
        List<A> i2;
        l.f(zVar, "container");
        l.f(oVar, "proto");
        l.f(bVar, "kind");
        if (bVar == kotlin.reflect.x.internal.l0.j.b.b.PROPERTY) {
            return z(zVar, (n) oVar, EnumC0301b.PROPERTY);
        }
        t s = s(this, oVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s != null) {
            return n(this, zVar, s, false, false, null, false, 60, null);
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q o(z zVar, q qVar) {
        l.f(zVar, "container");
        if (qVar != null) {
            return qVar;
        }
        if (zVar instanceof z.a) {
            return B((z.a) zVar);
        }
        return null;
    }

    protected abstract S p(q qVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] q(q qVar) {
        l.f(qVar, "kotlinClass");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t r(o oVar, kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, kotlin.reflect.x.internal.l0.j.b.b bVar, boolean z) {
        l.f(oVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        l.f(bVar, "kind");
        if (oVar instanceof kotlin.reflect.x.internal.l0.e.d) {
            t.a aVar = t.a;
            d.b b2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.b((kotlin.reflect.x.internal.l0.e.d) oVar, cVar, gVar);
            if (b2 == null) {
                return null;
            }
            return aVar.b(b2);
        }
        if (oVar instanceof i) {
            t.a aVar2 = t.a;
            d.b e2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.e((i) oVar, cVar, gVar);
            if (e2 == null) {
                return null;
            }
            return aVar2.b(e2);
        }
        if (!(oVar instanceof n)) {
            return null;
        }
        h.f<n, a.d> fVar = kotlin.reflect.x.internal.l0.e.a0.a.f20332d;
        l.e(fVar, "propertySignature");
        a.d dVar = (a.d) e.a((h.d) oVar, fVar);
        if (dVar == null) {
            return null;
        }
        int i2 = c.a[bVar.ordinal()];
        if (i2 == 1) {
            if (!dVar.I()) {
                return null;
            }
            t.a aVar3 = t.a;
            a.c D = dVar.D();
            l.e(D, "signature.getter");
            return aVar3.c(cVar, D);
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return t((n) oVar, cVar, gVar, true, true, z);
        }
        if (!dVar.J()) {
            return null;
        }
        t.a aVar4 = t.a;
        a.c E = dVar.E();
        l.e(E, "signature.setter");
        return aVar4.c(cVar, E);
    }

    protected final t t(n nVar, kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, boolean z, boolean z2, boolean z3) {
        l.f(nVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        h.f<n, a.d> fVar = kotlin.reflect.x.internal.l0.e.a0.a.f20332d;
        l.e(fVar, "propertySignature");
        a.d dVar = (a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            d.a c2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.c(nVar, cVar, gVar, z3);
            if (c2 == null) {
                return null;
            }
            return t.a.b(c2);
        }
        if (!z2 || !dVar.K()) {
            return null;
        }
        t.a aVar = t.a;
        a.c F = dVar.F();
        l.e(F, "signature.syntheticMethod");
        return aVar.c(cVar, F);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q v(z zVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        z.a h2;
        String v;
        l.f(zVar, "container");
        if (z) {
            if (bool != null) {
                if (zVar instanceof z.a) {
                    z.a aVar = (z.a) zVar;
                    if (aVar.g() == c.EnumC0324c.INTERFACE) {
                        o oVar = this.a;
                        kotlin.reflect.x.internal.l0.f.b d2 = aVar.e().d(kotlin.reflect.x.internal.l0.f.f.r("DefaultImpls"));
                        l.e(d2, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return p.b(oVar, d2);
                    }
                }
                if (bool.booleanValue() && (zVar instanceof z.b)) {
                    z0 c2 = zVar.c();
                    k kVar = c2 instanceof k ? (k) c2 : null;
                    kotlin.reflect.x.internal.l0.i.u.d f2 = kVar != null ? kVar.f() : null;
                    if (f2 != null) {
                        o oVar2 = this.a;
                        String f3 = f2.f();
                        l.e(f3, "facadeClassName.internalName");
                        v = kotlin.text.u.v(f3, '/', '.', false, 4, null);
                        kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c(v));
                        l.e(m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return p.b(oVar2, m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + zVar + ')').toString());
            }
        }
        if (z2 && (zVar instanceof z.a)) {
            z.a aVar2 = (z.a) zVar;
            if (aVar2.g() == c.EnumC0324c.COMPANION_OBJECT && (h2 = aVar2.h()) != null && (h2.g() == c.EnumC0324c.CLASS || h2.g() == c.EnumC0324c.ENUM_CLASS || (z3 && (h2.g() == c.EnumC0324c.INTERFACE || h2.g() == c.EnumC0324c.ANNOTATION_CLASS)))) {
                return B(h2);
            }
        }
        if (!(zVar instanceof z.b) || !(zVar.c() instanceof k)) {
            return null;
        }
        z0 c3 = zVar.c();
        l.d(c3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        k kVar2 = (k) c3;
        q g2 = kVar2.g();
        return g2 == null ? p.b(this.a, kVar2.d()) : g2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean w(kotlin.reflect.x.internal.l0.f.b bVar) {
        q b2;
        l.f(bVar, "classId");
        return bVar.g() != null && l.a(bVar.j().f(), "Container") && (b2 = p.b(this.a, bVar)) != null && kotlin.reflect.x.internal.l0.a.a.c(b2);
    }

    protected abstract q.a x(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var, List<A> list);

    /* JADX INFO: Access modifiers changed from: protected */
    public final q.a y(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var, List<A> list) {
        l.f(bVar, "annotationClassId");
        l.f(z0Var, "source");
        l.f(list, "result");
        if (kotlin.reflect.x.internal.l0.a.a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, z0Var, list);
    }
}
