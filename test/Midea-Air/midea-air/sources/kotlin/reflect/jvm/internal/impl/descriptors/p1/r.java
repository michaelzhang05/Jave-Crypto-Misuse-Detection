package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.x.internal.l0.i.w.h;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes2.dex */
public class r extends j implements p0 {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21777h = {kotlin.jvm.internal.b0.g(new kotlin.jvm.internal.v(kotlin.jvm.internal.b0.b(r.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.b0.g(new kotlin.jvm.internal.v(kotlin.jvm.internal.b0.b(r.class), "empty", "getEmpty()Z"))};

    /* renamed from: i, reason: collision with root package name */
    private final x f21778i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f21779j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f21780k;
    private final kotlin.reflect.x.internal.l0.k.i l;
    private final kotlin.reflect.x.internal.l0.i.w.h m;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.n0.b(r.this.v0().R0(), r.this.d()));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.k0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.k0> invoke() {
            return kotlin.reflect.jvm.internal.impl.descriptors.n0.c(r.this.v0().R0(), r.this.d());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<kotlin.reflect.x.internal.l0.i.w.h> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.i.w.h invoke() {
            int t;
            List l0;
            if (r.this.isEmpty()) {
                return h.b.f20931b;
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.k0> I = r.this.I();
            t = kotlin.collections.u.t(I, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = I.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.k0) it.next()).q());
            }
            l0 = kotlin.collections.b0.l0(arrayList, new h0(r.this.v0(), r.this.d()));
            return kotlin.reflect.x.internal.l0.i.w.b.f20906b.a("package view scope for " + r.this.d() + " in " + r.this.v0().getName(), l0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.k.n nVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), cVar.h());
        kotlin.jvm.internal.l.f(xVar, "module");
        kotlin.jvm.internal.l.f(cVar, "fqName");
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        this.f21778i = xVar;
        this.f21779j = cVar;
        this.f21780k = nVar.d(new b());
        this.l = nVar.d(new a());
        this.m = new kotlin.reflect.x.internal.l0.i.w.g(nVar, new c());
    }

    protected final boolean A0() {
        return ((Boolean) kotlin.reflect.x.internal.l0.k.m.a(this.l, this, f21777h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public List<kotlin.reflect.jvm.internal.impl.descriptors.k0> I() {
        return (List) kotlin.reflect.x.internal.l0.k.m.a(this.f21780k, this, f21777h[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public p0 b() {
        if (d().d()) {
            return null;
        }
        x v0 = v0();
        kotlin.reflect.x.internal.l0.f.c e2 = d().e();
        kotlin.jvm.internal.l.e(e2, "fqName.parent()");
        return v0.N(e2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        kotlin.jvm.internal.l.f(oVar, "visitor");
        return oVar.c(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public x v0() {
        return this.f21778i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public kotlin.reflect.x.internal.l0.f.c d() {
        return this.f21779j;
    }

    public boolean equals(Object obj) {
        p0 p0Var = obj instanceof p0 ? (p0) obj : null;
        return p0Var != null && kotlin.jvm.internal.l.a(d(), p0Var.d()) && kotlin.jvm.internal.l.a(v0(), p0Var.v0());
    }

    public int hashCode() {
        return (v0().hashCode() * 31) + d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public boolean isEmpty() {
        return A0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
    public kotlin.reflect.x.internal.l0.i.w.h q() {
        return this.m;
    }
}
