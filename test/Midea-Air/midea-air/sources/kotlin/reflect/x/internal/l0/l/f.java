package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.utils.e;
import kotlin.reflect.x.internal.l0.l.d1;
import kotlin.reflect.x.internal.l0.l.w1.d;
import kotlin.reflect.x.internal.l0.l.w1.h;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.k;
import kotlin.reflect.x.internal.l0.l.w1.m;
import kotlin.reflect.x.internal.l0.l.w1.n;
import kotlin.reflect.x.internal.l0.l.w1.o;
import kotlin.reflect.x.internal.l0.l.w1.p;
import kotlin.reflect.x.internal.l0.l.w1.u;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final f a = new f();

    /* renamed from: b */
    public static boolean f21214b;

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f21215b;

        static {
            int[] iArr = new int[u.values().length];
            iArr[u.INV.ordinal()] = 1;
            iArr[u.OUT.ordinal()] = 2;
            iArr[u.IN.ordinal()] = 3;
            a = iArr;
            int[] iArr2 = new int[d1.b.values().length];
            iArr2[d1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[d1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[d1.b.SKIP_LOWER.ordinal()] = 3;
            f21215b = iArr2;
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<d1.a, kotlin.u> {

        /* renamed from: f */
        final /* synthetic */ List<k> f21216f;

        /* renamed from: g */
        final /* synthetic */ d1 f21217g;

        /* renamed from: h */
        final /* synthetic */ p f21218h;

        /* renamed from: i */
        final /* synthetic */ k f21219i;

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f */
            final /* synthetic */ d1 f21220f;

            /* renamed from: g */
            final /* synthetic */ p f21221g;

            /* renamed from: h */
            final /* synthetic */ k f21222h;

            /* renamed from: i */
            final /* synthetic */ k f21223i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d1 d1Var, p pVar, k kVar, k kVar2) {
                super(0);
                this.f21220f = d1Var;
                this.f21221g = pVar;
                this.f21222h = kVar;
                this.f21223i = kVar2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final Boolean invoke() {
                return Boolean.valueOf(f.a.q(this.f21220f, this.f21221g.r(this.f21222h), this.f21223i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends k> list, d1 d1Var, p pVar, k kVar) {
            super(1);
            this.f21216f = list;
            this.f21217g = d1Var;
            this.f21218h = pVar;
            this.f21219i = kVar;
        }

        public final void b(d1.a aVar) {
            l.f(aVar, "$this$runForkingPoint");
            Iterator<k> it = this.f21216f.iterator();
            while (it.hasNext()) {
                aVar.a(new a(this.f21217g, this.f21218h, it.next(), this.f21219i));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.u invoke(d1.a aVar) {
            b(aVar);
            return kotlin.u.a;
        }
    }

    private f() {
    }

    private final Boolean a(d1 d1Var, k kVar, k kVar2) {
        p j2 = d1Var.j();
        if (!j2.J(kVar) && !j2.J(kVar2)) {
            return null;
        }
        if (d(j2, kVar) && d(j2, kVar2)) {
            return Boolean.TRUE;
        }
        if (j2.J(kVar)) {
            if (e(j2, d1Var, kVar, kVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j2.J(kVar2) && (c(j2, kVar) || e(j2, d1Var, kVar2, kVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(p pVar, k kVar) {
        if (!(kVar instanceof d)) {
            return false;
        }
        m S = pVar.S(pVar.d0((d) kVar));
        return !pVar.L(S) && pVar.J(pVar.T(pVar.x0(S)));
    }

    private static final boolean c(p pVar, k kVar) {
        boolean z;
        n c2 = pVar.c(kVar);
        if (c2 instanceof h) {
            Collection<i> t = pVar.t(c2);
            if (!(t instanceof Collection) || !t.isEmpty()) {
                Iterator<T> it = t.iterator();
                while (it.hasNext()) {
                    k a2 = pVar.a((i) it.next());
                    if (a2 != null && pVar.J(a2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static final boolean d(p pVar, k kVar) {
        return pVar.J(kVar) || b(pVar, kVar);
    }

    private static final boolean e(p pVar, d1 d1Var, k kVar, k kVar2, boolean z) {
        Collection<i> v = pVar.v(kVar);
        if (!(v instanceof Collection) || !v.isEmpty()) {
            for (i iVar : v) {
                if (l.a(pVar.w(iVar), pVar.c(kVar2)) || (z && t(a, d1Var, kVar2, iVar, false, 8, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        if (r10 != false) goto L191;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean f(kotlin.reflect.x.internal.l0.l.d1 r15, kotlin.reflect.x.internal.l0.l.w1.k r16, kotlin.reflect.x.internal.l0.l.w1.k r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.f.f(kotlin.f0.x.e.l0.l.d1, kotlin.f0.x.e.l0.l.w1.k, kotlin.f0.x.e.l0.l.w1.k):java.lang.Boolean");
    }

    private final List<k> g(d1 d1Var, k kVar, n nVar) {
        String b0;
        d1.c A;
        List<k> i2;
        List<k> e2;
        List<k> i3;
        p j2 = d1Var.j();
        List<k> n = j2.n(kVar, nVar);
        if (n != null) {
            return n;
        }
        if (!j2.V(nVar) && j2.v0(kVar)) {
            i3 = t.i();
            return i3;
        }
        if (j2.u0(nVar)) {
            if (j2.A0(j2.c(kVar), nVar)) {
                k r0 = j2.r0(kVar, kotlin.reflect.x.internal.l0.l.w1.b.FOR_SUBTYPING);
                if (r0 != null) {
                    kVar = r0;
                }
                e2 = s.e(kVar);
                return e2;
            }
            i2 = t.i();
            return i2;
        }
        e eVar = new e();
        d1Var.k();
        ArrayDeque<k> h2 = d1Var.h();
        l.c(h2);
        Set<k> i4 = d1Var.i();
        l.c(i4);
        h2.push(kVar);
        while (!h2.isEmpty()) {
            if (i4.size() <= 1000) {
                k pop = h2.pop();
                l.e(pop, "current");
                if (i4.add(pop)) {
                    k r02 = j2.r0(pop, kotlin.reflect.x.internal.l0.l.w1.b.FOR_SUBTYPING);
                    if (r02 == null) {
                        r02 = pop;
                    }
                    if (j2.A0(j2.c(r02), nVar)) {
                        eVar.add(r02);
                        A = d1.c.C0353c.a;
                    } else if (j2.j(r02) == 0) {
                        A = d1.c.b.a;
                    } else {
                        A = d1Var.j().A(r02);
                    }
                    if (!(!l.a(A, d1.c.C0353c.a))) {
                        A = null;
                    }
                    if (A != null) {
                        p j3 = d1Var.j();
                        Iterator<i> it = j3.t(j3.c(pop)).iterator();
                        while (it.hasNext()) {
                            h2.add(A.a(d1Var, it.next()));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(kVar);
                sb.append(". Supertypes = ");
                b0 = b0.b0(i4, null, null, null, 0, null, null, 63, null);
                sb.append(b0);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        d1Var.e();
        return eVar;
    }

    private final List<k> h(d1 d1Var, k kVar, n nVar) {
        return w(d1Var, g(d1Var, kVar, nVar));
    }

    private final boolean i(d1 d1Var, i iVar, i iVar2, boolean z) {
        p j2 = d1Var.j();
        i o = d1Var.o(d1Var.p(iVar));
        i o2 = d1Var.o(d1Var.p(iVar2));
        f fVar = a;
        Boolean f2 = fVar.f(d1Var, j2.h0(o), j2.T(o2));
        if (f2 != null) {
            boolean booleanValue = f2.booleanValue();
            d1Var.c(o, o2, z);
            return booleanValue;
        }
        Boolean c2 = d1Var.c(o, o2, z);
        return c2 != null ? c2.booleanValue() : fVar.u(d1Var, j2.h0(o), j2.T(o2));
    }

    private final o m(p pVar, i iVar, i iVar2) {
        i x0;
        int j2 = pVar.j(iVar);
        int i2 = 0;
        while (true) {
            if (i2 >= j2) {
                return null;
            }
            m g0 = pVar.g0(iVar, i2);
            m mVar = pVar.L(g0) ^ true ? g0 : null;
            if (mVar != null && (x0 = pVar.x0(mVar)) != null) {
                boolean z = pVar.B(pVar.h0(x0)) && pVar.B(pVar.h0(iVar2));
                if (l.a(x0, iVar2) || (z && l.a(pVar.w(x0), pVar.w(iVar2)))) {
                    break;
                }
                o m = m(pVar, x0, iVar2);
                if (m != null) {
                    return m;
                }
            }
            i2++;
        }
        return pVar.D(pVar.w(iVar), i2);
    }

    private final boolean n(d1 d1Var, k kVar) {
        String b0;
        d1.c cVar;
        p j2 = d1Var.j();
        n c2 = j2.c(kVar);
        if (j2.V(c2)) {
            return j2.p(c2);
        }
        if (j2.p(j2.c(kVar))) {
            return true;
        }
        d1Var.k();
        ArrayDeque<k> h2 = d1Var.h();
        l.c(h2);
        Set<k> i2 = d1Var.i();
        l.c(i2);
        h2.push(kVar);
        while (!h2.isEmpty()) {
            if (i2.size() <= 1000) {
                k pop = h2.pop();
                l.e(pop, "current");
                if (i2.add(pop)) {
                    if (j2.v0(pop)) {
                        cVar = d1.c.C0353c.a;
                    } else {
                        cVar = d1.c.b.a;
                    }
                    if (!(!l.a(cVar, d1.c.C0353c.a))) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        p j3 = d1Var.j();
                        Iterator<i> it = j3.t(j3.c(pop)).iterator();
                        while (it.hasNext()) {
                            k a2 = cVar.a(d1Var, it.next());
                            if (j2.p(j2.c(a2))) {
                                d1Var.e();
                                return true;
                            }
                            h2.add(a2);
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(kVar);
                sb.append(". Supertypes = ");
                b0 = b0.b0(i2, null, null, null, 0, null, null, 63, null);
                sb.append(b0);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        d1Var.e();
        return false;
    }

    private final boolean o(p pVar, i iVar) {
        return (!pVar.x(pVar.w(iVar)) || pVar.s(iVar) || pVar.C(iVar) || pVar.I(iVar) || !l.a(pVar.c(pVar.h0(iVar)), pVar.c(pVar.T(iVar)))) ? false : true;
    }

    private final boolean p(p pVar, k kVar, k kVar2) {
        k kVar3;
        k kVar4;
        kotlin.reflect.x.internal.l0.l.w1.e s0 = pVar.s0(kVar);
        if (s0 == null || (kVar3 = pVar.H(s0)) == null) {
            kVar3 = kVar;
        }
        kotlin.reflect.x.internal.l0.l.w1.e s02 = pVar.s0(kVar2);
        if (s02 == null || (kVar4 = pVar.H(s02)) == null) {
            kVar4 = kVar2;
        }
        if (pVar.c(kVar3) != pVar.c(kVar4)) {
            return false;
        }
        if (pVar.C(kVar) || !pVar.C(kVar2)) {
            return !pVar.W(kVar) || pVar.W(kVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(f fVar, d1 d1Var, i iVar, i iVar2, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return fVar.s(d1Var, iVar, iVar2, z);
    }

    private final boolean u(d1 d1Var, k kVar, k kVar2) {
        int t;
        int t2;
        i x0;
        p j2 = d1Var.j();
        if (f21214b) {
            if (!j2.b(kVar) && !j2.Z(j2.c(kVar))) {
                d1Var.l(kVar);
            }
            if (!j2.b(kVar2)) {
                d1Var.l(kVar2);
            }
        }
        if (!c.a.d(d1Var, kVar, kVar2)) {
            return false;
        }
        f fVar = a;
        Boolean a2 = fVar.a(d1Var, j2.h0(kVar), j2.T(kVar2));
        if (a2 != null) {
            boolean booleanValue = a2.booleanValue();
            d1.d(d1Var, kVar, kVar2, false, 4, null);
            return booleanValue;
        }
        n c2 = j2.c(kVar2);
        if ((j2.A0(j2.c(kVar), c2) && j2.h(c2) == 0) || j2.k0(j2.c(kVar2))) {
            return true;
        }
        List<k> l = fVar.l(d1Var, kVar, c2);
        int i2 = 10;
        t = kotlin.collections.u.t(l, 10);
        ArrayList<k> arrayList = new ArrayList(t);
        for (k kVar3 : l) {
            k a3 = j2.a(d1Var.o(kVar3));
            if (a3 != null) {
                kVar3 = a3;
            }
            arrayList.add(kVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return a.n(d1Var, kVar);
        }
        if (size != 1) {
            kotlin.reflect.x.internal.l0.l.w1.a aVar = new kotlin.reflect.x.internal.l0.l.w1.a(j2.h(c2));
            int h2 = j2.h(c2);
            int i3 = 0;
            boolean z = false;
            while (i3 < h2) {
                z = z || j2.N(j2.D(c2, i3)) != u.OUT;
                if (!z) {
                    t2 = kotlin.collections.u.t(arrayList, i2);
                    ArrayList arrayList2 = new ArrayList(t2);
                    for (k kVar4 : arrayList) {
                        m D0 = j2.D0(kVar4, i3);
                        if (D0 != null) {
                            if (!(j2.j0(D0) == u.INV)) {
                                D0 = null;
                            }
                            if (D0 != null && (x0 = j2.x0(D0)) != null) {
                                arrayList2.add(x0);
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + kVar4 + ", subType: " + kVar + ", superType: " + kVar2).toString());
                    }
                    aVar.add(j2.c0(j2.O(arrayList2)));
                }
                i3++;
                i2 = 10;
            }
            if (z || !a.q(d1Var, aVar, kVar2)) {
                return d1Var.q(new b(arrayList, d1Var, j2, kVar2));
            }
            return true;
        }
        return a.q(d1Var, j2.r((k) r.R(arrayList)), kVar2);
    }

    private final boolean v(p pVar, i iVar, i iVar2, n nVar) {
        o m0;
        k a2 = pVar.a(iVar);
        if (!(a2 instanceof d)) {
            return false;
        }
        d dVar = (d) a2;
        if (pVar.q(dVar) || !pVar.L(pVar.S(pVar.d0(dVar))) || pVar.P(dVar) != kotlin.reflect.x.internal.l0.l.w1.b.FOR_SUBTYPING) {
            return false;
        }
        n w = pVar.w(iVar2);
        kotlin.reflect.x.internal.l0.l.w1.t tVar = w instanceof kotlin.reflect.x.internal.l0.l.w1.t ? (kotlin.reflect.x.internal.l0.l.w1.t) w : null;
        return (tVar == null || (m0 = pVar.m0(tVar)) == null || !pVar.o(m0, nVar)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<k> w(d1 d1Var, List<? extends k> list) {
        p j2 = d1Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kotlin.reflect.x.internal.l0.l.w1.l r = j2.r((k) next);
            int R = j2.R(r);
            int i2 = 0;
            while (true) {
                if (i2 >= R) {
                    break;
                }
                if (!(j2.M(j2.x0(j2.u(r, i2))) == null)) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    public final u j(u uVar, u uVar2) {
        l.f(uVar, "declared");
        l.f(uVar2, "useSite");
        u uVar3 = u.INV;
        if (uVar == uVar3) {
            return uVar2;
        }
        if (uVar2 == uVar3 || uVar == uVar2) {
            return uVar;
        }
        return null;
    }

    public final boolean k(d1 d1Var, i iVar, i iVar2) {
        l.f(d1Var, "state");
        l.f(iVar, "a");
        l.f(iVar2, "b");
        p j2 = d1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        f fVar = a;
        if (fVar.o(j2, iVar) && fVar.o(j2, iVar2)) {
            i o = d1Var.o(d1Var.p(iVar));
            i o2 = d1Var.o(d1Var.p(iVar2));
            k h0 = j2.h0(o);
            if (!j2.A0(j2.w(o), j2.w(o2))) {
                return false;
            }
            if (j2.j(h0) == 0) {
                return j2.z(o) || j2.z(o2) || j2.W(h0) == j2.W(j2.h0(o2));
            }
        }
        return t(fVar, d1Var, iVar, iVar2, false, 8, null) && t(fVar, d1Var, iVar2, iVar, false, 8, null);
    }

    public final List<k> l(d1 d1Var, k kVar, n nVar) {
        String b0;
        d1.c cVar;
        l.f(d1Var, "state");
        l.f(kVar, "subType");
        l.f(nVar, "superConstructor");
        p j2 = d1Var.j();
        if (j2.v0(kVar)) {
            return a.h(d1Var, kVar, nVar);
        }
        if (!j2.V(nVar) && !j2.q0(nVar)) {
            return a.g(d1Var, kVar, nVar);
        }
        e<k> eVar = new e();
        d1Var.k();
        ArrayDeque<k> h2 = d1Var.h();
        l.c(h2);
        Set<k> i2 = d1Var.i();
        l.c(i2);
        h2.push(kVar);
        while (!h2.isEmpty()) {
            if (i2.size() <= 1000) {
                k pop = h2.pop();
                l.e(pop, "current");
                if (i2.add(pop)) {
                    if (j2.v0(pop)) {
                        eVar.add(pop);
                        cVar = d1.c.C0353c.a;
                    } else {
                        cVar = d1.c.b.a;
                    }
                    if (!(!l.a(cVar, d1.c.C0353c.a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        p j3 = d1Var.j();
                        Iterator<i> it = j3.t(j3.c(pop)).iterator();
                        while (it.hasNext()) {
                            h2.add(cVar.a(d1Var, it.next()));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(kVar);
                sb.append(". Supertypes = ");
                b0 = b0.b0(i2, null, null, null, 0, null, null, 63, null);
                sb.append(b0);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        d1Var.e();
        ArrayList arrayList = new ArrayList();
        for (k kVar2 : eVar) {
            f fVar = a;
            l.e(kVar2, "it");
            y.y(arrayList, fVar.h(d1Var, kVar2, nVar));
        }
        return arrayList;
    }

    public final boolean q(d1 d1Var, kotlin.reflect.x.internal.l0.l.w1.l lVar, k kVar) {
        int i2;
        int i3;
        boolean k2;
        int i4;
        l.f(d1Var, "<this>");
        l.f(lVar, "capturedSubArguments");
        l.f(kVar, "superType");
        p j2 = d1Var.j();
        n c2 = j2.c(kVar);
        int R = j2.R(lVar);
        int h2 = j2.h(c2);
        if (R != h2 || R != j2.j(kVar)) {
            return false;
        }
        for (int i5 = 0; i5 < h2; i5++) {
            m g0 = j2.g0(kVar, i5);
            if (!j2.L(g0)) {
                i x0 = j2.x0(g0);
                m u = j2.u(lVar, i5);
                j2.j0(u);
                u uVar = u.INV;
                i x02 = j2.x0(u);
                f fVar = a;
                u j3 = fVar.j(j2.N(j2.D(c2, i5)), j2.j0(g0));
                if (j3 == null) {
                    return d1Var.m();
                }
                if (j3 == uVar && (fVar.v(j2, x02, x0, c2) || fVar.v(j2, x0, x02, c2))) {
                    continue;
                } else {
                    i2 = d1Var.f21201g;
                    if (i2 <= 100) {
                        i3 = d1Var.f21201g;
                        d1Var.f21201g = i3 + 1;
                        int i6 = a.a[j3.ordinal()];
                        if (i6 == 1) {
                            k2 = fVar.k(d1Var, x02, x0);
                        } else if (i6 != 2) {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            k2 = t(fVar, d1Var, x0, x02, false, 8, null);
                        } else {
                            k2 = t(fVar, d1Var, x02, x0, false, 8, null);
                        }
                        i4 = d1Var.f21201g;
                        d1Var.f21201g = i4 - 1;
                        if (!k2) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + x02).toString());
                    }
                }
            }
        }
        return true;
    }

    public final boolean r(d1 d1Var, i iVar, i iVar2) {
        l.f(d1Var, "state");
        l.f(iVar, "subType");
        l.f(iVar2, "superType");
        return t(this, d1Var, iVar, iVar2, false, 8, null);
    }

    public final boolean s(d1 d1Var, i iVar, i iVar2, boolean z) {
        l.f(d1Var, "state");
        l.f(iVar, "subType");
        l.f(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (d1Var.f(iVar, iVar2)) {
            return i(d1Var, iVar, iVar2, z);
        }
        return false;
    }
}
