package kotlin.reflect.x.internal.l0.b.p;

import cm.aptoide.pt.dataprovider.model.v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IntIterator;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.descriptors.p1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f19739k = new a(null);
    private static final kotlin.reflect.x.internal.l0.f.b l = new kotlin.reflect.x.internal.l0.f.b(k.r, f.r("Function"));
    private static final kotlin.reflect.x.internal.l0.f.b m = new kotlin.reflect.x.internal.l0.f.b(k.o, f.r("KFunction"));
    private final n n;
    private final k0 o;
    private final c p;
    private final int q;
    private final C0281b r;
    private final d s;
    private final List<e1> t;

    /* compiled from: FunctionClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.f0.x.e.l0.b.p.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private final class C0281b extends kotlin.reflect.x.internal.l0.l.b {

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: kotlin.f0.x.e.l0.b.p.b$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.f19742g.ordinal()] = 1;
                iArr[c.f19744i.ordinal()] = 2;
                iArr[c.f19743h.ordinal()] = 3;
                iArr[c.f19745j.ordinal()] = 4;
                a = iArr;
            }
        }

        public C0281b() {
            super(b.this.n);
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.x.internal.l0.l.e1
        public List<e1> getParameters() {
            return b.this.t;
        }

        @Override // kotlin.reflect.x.internal.l0.l.g
        protected Collection<e0> l() {
            List<kotlin.reflect.x.internal.l0.f.b> e2;
            int t;
            List y0;
            List u0;
            int t2;
            int i2 = a.a[b.this.V0().ordinal()];
            if (i2 == 1) {
                e2 = s.e(b.l);
            } else if (i2 == 2) {
                e2 = t.l(b.m, new kotlin.reflect.x.internal.l0.f.b(k.r, c.f19742g.n(b.this.R0())));
            } else if (i2 == 3) {
                e2 = s.e(b.l);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                e2 = t.l(b.m, new kotlin.reflect.x.internal.l0.f.b(k.f19708j, c.f19743h.n(b.this.R0())));
            }
            g0 b2 = b.this.o.b();
            t = u.t(e2, 10);
            ArrayList arrayList = new ArrayList(t);
            for (kotlin.reflect.x.internal.l0.f.b bVar : e2) {
                e a2 = x.a(b2, bVar);
                if (a2 != null) {
                    u0 = b0.u0(getParameters(), a2.g().getParameters().size());
                    t2 = u.t(u0, 10);
                    ArrayList arrayList2 = new ArrayList(t2);
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new i1(((e1) it.next()).s()));
                    }
                    arrayList.add(f0.g(a1.f21185g.h(), a2, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            y0 = b0.y0(arrayList);
            return y0;
        }

        @Override // kotlin.reflect.x.internal.l0.l.g
        protected c1 q() {
            return c1.a.a;
        }

        public String toString() {
            return w().toString();
        }

        @Override // kotlin.reflect.x.internal.l0.l.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b w() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, k0 k0Var, c cVar, int i2) {
        super(nVar, cVar.n(i2));
        int t;
        List<e1> y0;
        l.f(nVar, "storageManager");
        l.f(k0Var, "containingDeclaration");
        l.f(cVar, "functionKind");
        this.n = nVar;
        this.o = k0Var;
        this.p = cVar;
        this.q = i2;
        this.r = new C0281b();
        this.s = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i2);
        t = u.t(intRange, 10);
        ArrayList arrayList2 = new ArrayList(t);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int a2 = ((IntIterator) it).a();
            r1 r1Var = r1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(a2);
            L0(arrayList, this, r1Var, sb.toString());
            arrayList2.add(kotlin.u.a);
        }
        L0(arrayList, this, r1.OUT_VARIANCE, "R");
        y0 = b0.y0(arrayList);
        this.t = y0;
    }

    private static final void L0(ArrayList<e1> arrayList, b bVar, r1 r1Var, String str) {
        arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.p1.k0.S0(bVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), false, r1Var, f.r(str), arrayList.size(), bVar.n));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public /* bridge */ /* synthetic */ d R() {
        return (d) Z0();
    }

    public final int R0() {
        return this.q;
    }

    public Void S0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public List<d> k() {
        List<d> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public /* bridge */ /* synthetic */ e U() {
        return (e) S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public k0 b() {
        return this.o;
    }

    public final c V0() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public List<e> J() {
        List<e> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public h.b S() {
        return h.b.f20931b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.t
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public d H(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this.s;
    }

    public Void Z0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.e1 g() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f21863e;
        l.e(uVar, Store.PUBLIC_ACCESS);
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f i() {
        return kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public d0 j() {
        return d0.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean m() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    public z0 t() {
        z0 z0Var = z0.a;
        l.e(z0Var, "NO_SOURCE");
        return z0Var;
    }

    public String toString() {
        String f2 = getName().f();
        l.e(f2, "name.asString()");
        return f2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    public List<e1> w() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public g1<m0> z0() {
        return null;
    }
}
