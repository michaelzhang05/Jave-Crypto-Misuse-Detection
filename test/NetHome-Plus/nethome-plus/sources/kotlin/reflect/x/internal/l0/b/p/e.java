package kotlin.reflect.x.internal.l0.b.p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.p;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.m.q;

/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes2.dex */
public final class e extends g0 {
    public static final a J = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final i1 b(e eVar, int i2, e1 e1Var) {
            String lowerCase;
            String f2 = e1Var.getName().f();
            l.e(f2, "typeParameter.name.asString()");
            if (l.a(f2, "T")) {
                lowerCase = "instance";
            } else if (l.a(f2, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = f2.toLowerCase(Locale.ROOT);
                l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
            f r = f.r(lowerCase);
            l.e(r, "identifier(name)");
            m0 s = e1Var.s();
            l.e(s, "typeParameter.defaultType");
            z0 z0Var = z0.a;
            l.e(z0Var, "NO_SOURCE");
            return new l0(eVar, null, i2, b2, r, s, false, false, false, null, z0Var);
        }

        public final e a(b bVar, boolean z) {
            List<w0> i2;
            List<? extends e1> i3;
            Iterable<IndexedValue> E0;
            int t;
            l.f(bVar, "functionClass");
            List<e1> w = bVar.w();
            e eVar = new e(bVar, null, b.a.DECLARATION, z, null);
            w0 K0 = bVar.K0();
            i2 = t.i();
            i3 = t.i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : w) {
                if (!(((e1) obj).n() == r1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            E0 = b0.E0(arrayList);
            t = u.t(E0, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (IndexedValue indexedValue : E0) {
                arrayList2.add(e.J.b(eVar, indexedValue.c(), (e1) indexedValue.d()));
            }
            eVar.S0(null, K0, i2, i3, arrayList2, ((e1) r.d0(w)).s(), d0.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.t.f21863e);
            eVar.a1(true);
            return eVar;
        }
    }

    private e(m mVar, e eVar, b.a aVar, boolean z) {
        super(mVar, eVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), q.f21433i, aVar, z0.a);
        g1(true);
        i1(z);
        Z0(false);
    }

    public /* synthetic */ e(m mVar, e eVar, b.a aVar, boolean z, g gVar) {
        this(mVar, eVar, aVar, z);
    }

    private final y q1(List<f> list) {
        int t;
        f fVar;
        List<Pair> F0;
        boolean z;
        int size = h().size() - list.size();
        boolean z2 = true;
        if (size == 0) {
            List<i1> h2 = h();
            l.e(h2, "valueParameters");
            F0 = b0.F0(list, h2);
            if (!(F0 instanceof Collection) || !F0.isEmpty()) {
                for (Pair pair : F0) {
                    if (!l.a((f) pair.a(), ((i1) pair.b()).getName())) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return this;
            }
        }
        List<i1> h3 = h();
        l.e(h3, "valueParameters");
        t = u.t(h3, 10);
        ArrayList arrayList = new ArrayList(t);
        for (i1 i1Var : h3) {
            f name = i1Var.getName();
            l.e(name, "it.name");
            int f2 = i1Var.f();
            int i2 = f2 - size;
            if (i2 >= 0 && (fVar = list.get(i2)) != null) {
                name = fVar;
            }
            arrayList.add(i1Var.G0(this, name, f2));
        }
        p.c T0 = T0(l1.a);
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((f) it.next()) == null) {
                    break;
                }
            }
        }
        z2 = false;
        p.c h4 = T0.H(z2).c(arrayList).h(a());
        l.e(h4, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        y N0 = super.N0(h4);
        l.c(N0);
        return N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g0, kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    protected p M0(m mVar, y yVar, b.a aVar, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, z0 z0Var) {
        l.f(mVar, "newOwner");
        l.f(aVar, "kind");
        l.f(gVar, "annotations");
        l.f(z0Var, "source");
        return new e(mVar, (e) yVar, aVar, isSuspend());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    public y N0(p.c cVar) {
        int t;
        l.f(cVar, "configuration");
        e eVar = (e) super.N0(cVar);
        if (eVar == null) {
            return null;
        }
        List<i1> h2 = eVar.h();
        l.e(h2, "substituted.valueParameters");
        boolean z = false;
        if (!(h2 instanceof Collection) || !h2.isEmpty()) {
            Iterator<T> it = h2.iterator();
            while (it.hasNext()) {
                e0 type = ((i1) it.next()).getType();
                l.e(type, "it.type");
                if (kotlin.reflect.x.internal.l0.b.g.d(type) != null) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return eVar;
        }
        List<i1> h3 = eVar.h();
        l.e(h3, "substituted.valueParameters");
        t = u.t(h3, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it2 = h3.iterator();
        while (it2.hasNext()) {
            e0 type2 = ((i1) it2.next()).getType();
            l.e(type2, "it.type");
            arrayList.add(kotlin.reflect.x.internal.l0.b.g.d(type2));
        }
        return eVar.q1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean z() {
        return false;
    }
}
