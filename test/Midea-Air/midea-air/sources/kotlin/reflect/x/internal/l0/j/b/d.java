package kotlin.reflect.x.internal.l0.j.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.x.internal.l0.e.b;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.z.e;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.j.b.z;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class d implements c<c, g<?>> {
    private final kotlin.reflect.x.internal.l0.j.a a;

    /* renamed from: b, reason: collision with root package name */
    private final e f20983b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.PROPERTY.ordinal()] = 1;
            iArr[b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[b.PROPERTY_SETTER.ordinal()] = 3;
            a = iArr;
        }
    }

    public d(g0 g0Var, j0 j0Var, kotlin.reflect.x.internal.l0.j.a aVar) {
        l.f(g0Var, "module");
        l.f(j0Var, "notFoundClasses");
        l.f(aVar, "protocol");
        this.a = aVar;
        this.f20983b = new e(g0Var, j0Var);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> a(s sVar, kotlin.reflect.x.internal.l0.e.z.c cVar) {
        int t;
        l.f(sVar, "proto");
        l.f(cVar, "nameResolver");
        List list = (List) sVar.u(this.a.l());
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> b(z zVar, o oVar, b bVar, int i2, kotlin.reflect.x.internal.l0.e.u uVar) {
        int t;
        l.f(zVar, "container");
        l.f(oVar, "callableProto");
        l.f(bVar, "kind");
        l.f(uVar, "proto");
        List list = (List) uVar.u(this.a.g());
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), zVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> c(z.a aVar) {
        int t;
        l.f(aVar, "container");
        List list = (List) aVar.f().u(this.a.a());
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> d(q qVar, kotlin.reflect.x.internal.l0.e.z.c cVar) {
        int t;
        l.f(qVar, "proto");
        l.f(cVar, "nameResolver");
        List list = (List) qVar.u(this.a.k());
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> f(z zVar, kotlin.reflect.x.internal.l0.e.g gVar) {
        int t;
        l.f(zVar, "container");
        l.f(gVar, "proto");
        List list = (List) gVar.u(this.a.d());
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), zVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> g(z zVar, n nVar) {
        List<c> i2;
        l.f(zVar, "container");
        l.f(nVar, "proto");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> h(z zVar, o oVar, b bVar) {
        List<c> i2;
        l.f(zVar, "container");
        l.f(oVar, "proto");
        l.f(bVar, "kind");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> i(z zVar, n nVar) {
        List<c> i2;
        l.f(zVar, "container");
        l.f(nVar, "proto");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.f
    public List<c> j(z zVar, o oVar, b bVar) {
        List list;
        int t;
        l.f(zVar, "container");
        l.f(oVar, "proto");
        l.f(bVar, "kind");
        if (oVar instanceof kotlin.reflect.x.internal.l0.e.d) {
            list = (List) ((kotlin.reflect.x.internal.l0.e.d) oVar).u(this.a.c());
        } else if (oVar instanceof i) {
            list = (List) ((i) oVar).u(this.a.f());
        } else {
            if (!(oVar instanceof n)) {
                throw new IllegalStateException(("Unknown message: " + oVar).toString());
            }
            int i2 = a.a[bVar.ordinal()];
            if (i2 == 1) {
                list = (List) ((n) oVar).u(this.a.h());
            } else if (i2 == 2) {
                list = (List) ((n) oVar).u(this.a.i());
            } else if (i2 == 3) {
                list = (List) ((n) oVar).u(this.a.j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (list == null) {
            list = t.i();
        }
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20983b.a((b) it.next(), zVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public g<?> k(z zVar, n nVar, e0 e0Var) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        l.f(e0Var, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g<?> e(z zVar, n nVar, e0 e0Var) {
        l.f(zVar, "container");
        l.f(nVar, "proto");
        l.f(e0Var, "expectedType");
        b.C0320b.c cVar = (b.C0320b.c) e.a(nVar, this.a.b());
        if (cVar == null) {
            return null;
        }
        return this.f20983b.f(e0Var, cVar, zVar.b());
    }
}
