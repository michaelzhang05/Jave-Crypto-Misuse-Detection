package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.d.a.l0.c;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.b0;
import kotlin.reflect.x.internal.l0.l.b1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.q0;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class d {
    private final c a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final e0 a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20119b;

        public a(e0 e0Var, int i2) {
            this.a = e0Var;
            this.f20119b = i2;
        }

        public final int a() {
            return this.f20119b;
        }

        public final e0 b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final m0 a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20120b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f20121c;

        public b(m0 m0Var, int i2, boolean z) {
            this.a = m0Var;
            this.f20120b = i2;
            this.f20121c = z;
        }

        public final boolean a() {
            return this.f20121c;
        }

        public final int b() {
            return this.f20120b;
        }

        public final m0 c() {
            return this.a;
        }
    }

    public d(c cVar) {
        l.f(cVar, "javaResolverSettings");
        this.a = cVar;
    }

    private final b b(m0 m0Var, Function1<? super Integer, e> function1, int i2, o oVar, boolean z, boolean z2) {
        h g2;
        Boolean h2;
        e1 O0;
        int t;
        int t2;
        c cVar;
        c cVar2;
        List n;
        g f2;
        int t3;
        int t4;
        boolean z3;
        boolean z4;
        a aVar;
        g1 s;
        Function1<? super Integer, e> function12 = function1;
        boolean a2 = p.a(oVar);
        boolean z5 = (z2 && z) ? false : true;
        e0 e0Var = null;
        if (!a2 && m0Var.M0().isEmpty()) {
            return new b(null, 1, false);
        }
        h w = m0Var.O0().w();
        if (w == null) {
            return new b(null, 1, false);
        }
        e invoke = function12.invoke(Integer.valueOf(i2));
        g2 = r.g(w, invoke, oVar);
        h2 = r.h(invoke, oVar);
        if (g2 == null || (O0 = g2.g()) == null) {
            O0 = m0Var.O0();
        }
        e1 e1Var = O0;
        l.e(e1Var, "enhancedClassifier?.typeConstructor ?: constructor");
        int i3 = i2 + 1;
        List<g1> M0 = m0Var.M0();
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> parameters = e1Var.getParameters();
        l.e(parameters, "typeConstructor.parameters");
        Iterator<T> it = M0.iterator();
        Iterator<T> it2 = parameters.iterator();
        t = u.t(M0, 10);
        t2 = u.t(parameters, 10);
        ArrayList arrayList = new ArrayList(Math.min(t, t2));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var2 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) it2.next();
            g1 g1Var = (g1) next;
            if (!z5) {
                z4 = z5;
                aVar = new a(e0Var, 0);
            } else {
                z4 = z5;
                if (!g1Var.c()) {
                    aVar = d(g1Var.getType().R0(), function12, i3, z2);
                } else if (function12.invoke(Integer.valueOf(i3)).d() == h.FORCE_FLEXIBILITY) {
                    q1 R0 = g1Var.getType().R0();
                    aVar = new a(f0.d(b0.c(R0).S0(false), b0.d(R0).S0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            }
            i3 += aVar.a();
            if (aVar.b() != null) {
                e0 b2 = aVar.b();
                r1 a3 = g1Var.a();
                l.e(a3, "arg.projectionKind");
                s = kotlin.reflect.x.internal.l0.l.x1.a.e(b2, a3, e1Var2);
            } else if (g2 == null || g1Var.c()) {
                s = g2 != null ? n1.s(e1Var2) : null;
            } else {
                e0 type = g1Var.getType();
                l.e(type, "arg.type");
                r1 a4 = g1Var.a();
                l.e(a4, "arg.projectionKind");
                s = kotlin.reflect.x.internal.l0.l.x1.a.e(type, a4, e1Var2);
            }
            arrayList.add(s);
            function12 = function1;
            z5 = z4;
            e0Var = null;
        }
        int i4 = i3 - i2;
        if (g2 == null && h2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!(((g1) it3.next()) == null)) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                return new b(null, i4, false);
            }
        }
        g[] gVarArr = new g[3];
        gVarArr[0] = m0Var.getAnnotations();
        cVar = r.f20191b;
        if (!(g2 != null)) {
            cVar = null;
        }
        gVarArr[1] = cVar;
        cVar2 = r.a;
        if (!(h2 != null)) {
            cVar2 = null;
        }
        gVarArr[2] = cVar2;
        n = t.n(gVarArr);
        f2 = r.f(n);
        a1 b3 = b1.b(f2);
        List<g1> M02 = m0Var.M0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = M02.iterator();
        t3 = u.t(arrayList, 10);
        t4 = u.t(M02, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(t3, t4));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            g1 g1Var2 = (g1) it5.next();
            g1 g1Var3 = (g1) next2;
            if (g1Var3 != null) {
                g1Var2 = g1Var3;
            }
            arrayList2.add(g1Var2);
        }
        m0 i5 = f0.i(b3, e1Var, arrayList2, h2 != null ? h2.booleanValue() : m0Var.P0(), null, 16, null);
        if (invoke.b()) {
            i5 = e(i5);
        }
        return new b(i5, i4, h2 != null && invoke.e());
    }

    static /* synthetic */ b c(d dVar, m0 m0Var, Function1 function1, int i2, o oVar, boolean z, boolean z2, int i3, Object obj) {
        return dVar.b(m0Var, function1, i2, oVar, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.f0.x.e.l0.d.a.o0.d.a d(kotlin.reflect.x.internal.l0.l.q1 r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.x.internal.l0.d.a.o0.e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = kotlin.reflect.x.internal.l0.l.g0.a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            kotlin.f0.x.e.l0.d.a.o0.d$a r12 = new kotlin.f0.x.e.l0.d.a.o0.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof kotlin.reflect.x.internal.l0.l.y
            if (r0 == 0) goto Laf
            boolean r0 = r12 instanceof kotlin.reflect.x.internal.l0.l.l0
            r9 = r12
            kotlin.f0.x.e.l0.l.y r9 = (kotlin.reflect.x.internal.l0.l.y) r9
            kotlin.f0.x.e.l0.l.m0 r3 = r9.W0()
            kotlin.f0.x.e.l0.d.a.o0.o r6 = kotlin.reflect.x.internal.l0.d.a.o0.o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.f0.x.e.l0.d.a.o0.d$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            kotlin.f0.x.e.l0.l.m0 r3 = r9.X0()
            kotlin.f0.x.e.l0.d.a.o0.o r6 = kotlin.reflect.x.internal.l0.d.a.o0.o.FLEXIBLE_UPPER
            kotlin.f0.x.e.l0.d.a.o0.d$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            int r14 = r10.b()
            int r15 = r13.b()
            kotlin.f0.x.e.l0.l.m0 r14 = r10.c()
            if (r14 != 0) goto L45
            kotlin.f0.x.e.l0.l.m0 r14 = r13.c()
            if (r14 != 0) goto L45
            goto La5
        L45:
            boolean r14 = r10.a()
            if (r14 != 0) goto L87
            boolean r14 = r13.a()
            if (r14 == 0) goto L52
            goto L87
        L52:
            if (r0 == 0) goto L6e
            kotlin.f0.x.e.l0.d.a.l0.m.f r1 = new kotlin.f0.x.e.l0.d.a.l0.m.f
            kotlin.f0.x.e.l0.l.m0 r12 = r10.c()
            if (r12 != 0) goto L60
            kotlin.f0.x.e.l0.l.m0 r12 = r9.W0()
        L60:
            kotlin.f0.x.e.l0.l.m0 r13 = r13.c()
            if (r13 != 0) goto L6a
            kotlin.f0.x.e.l0.l.m0 r13 = r9.X0()
        L6a:
            r1.<init>(r12, r13)
            goto La5
        L6e:
            kotlin.f0.x.e.l0.l.m0 r12 = r10.c()
            if (r12 != 0) goto L78
            kotlin.f0.x.e.l0.l.m0 r12 = r9.W0()
        L78:
            kotlin.f0.x.e.l0.l.m0 r13 = r13.c()
            if (r13 != 0) goto L82
            kotlin.f0.x.e.l0.l.m0 r13 = r9.X0()
        L82:
            kotlin.f0.x.e.l0.l.q1 r1 = kotlin.reflect.x.internal.l0.l.f0.d(r12, r13)
            goto La5
        L87:
            kotlin.f0.x.e.l0.l.m0 r13 = r13.c()
            if (r13 == 0) goto L9a
            kotlin.f0.x.e.l0.l.m0 r14 = r10.c()
            if (r14 != 0) goto L94
            r14 = r13
        L94:
            kotlin.f0.x.e.l0.l.q1 r13 = kotlin.reflect.x.internal.l0.l.f0.d(r14, r13)
            if (r13 != 0) goto La1
        L9a:
            kotlin.f0.x.e.l0.l.m0 r13 = r10.c()
            kotlin.jvm.internal.l.c(r13)
        La1:
            kotlin.f0.x.e.l0.l.q1 r1 = kotlin.reflect.x.internal.l0.l.p1.d(r12, r13)
        La5:
            kotlin.f0.x.e.l0.d.a.o0.d$a r12 = new kotlin.f0.x.e.l0.d.a.o0.d$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto Le1
        Laf:
            boolean r0 = r12 instanceof kotlin.reflect.x.internal.l0.l.m0
            if (r0 == 0) goto Le2
            r2 = r12
            kotlin.f0.x.e.l0.l.m0 r2 = (kotlin.reflect.x.internal.l0.l.m0) r2
            kotlin.f0.x.e.l0.d.a.o0.o r5 = kotlin.reflect.x.internal.l0.d.a.o0.o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            kotlin.f0.x.e.l0.d.a.o0.d$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.f0.x.e.l0.d.a.o0.d$a r14 = new kotlin.f0.x.e.l0.d.a.o0.d$a
            boolean r15 = r13.a()
            if (r15 == 0) goto Ld5
            kotlin.f0.x.e.l0.l.m0 r15 = r13.c()
            kotlin.f0.x.e.l0.l.q1 r12 = kotlin.reflect.x.internal.l0.l.p1.d(r12, r15)
            goto Ld9
        Ld5:
            kotlin.f0.x.e.l0.l.m0 r12 = r13.c()
        Ld9:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        Le1:
            return r12
        Le2:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.o0.d.d(kotlin.f0.x.e.l0.l.q1, kotlin.a0.c.l, int, boolean):kotlin.f0.x.e.l0.d.a.o0.d$a");
    }

    private final m0 e(m0 m0Var) {
        if (this.a.a()) {
            return q0.h(m0Var, true);
        }
        return new g(m0Var);
    }

    public final e0 a(e0 e0Var, Function1<? super Integer, e> function1, boolean z) {
        l.f(e0Var, "<this>");
        l.f(function1, "qualifiers");
        return d(e0Var.R0(), function1, 0, z).b();
    }
}
