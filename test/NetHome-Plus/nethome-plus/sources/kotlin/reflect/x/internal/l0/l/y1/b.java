package kotlin.reflect.x.internal.l0.l.y1;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.i.q.a.d;
import kotlin.reflect.x.internal.l0.l.b0;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.f1;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.k1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.p1;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.x.e.l0.l.y1.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0359b extends Lambda implements Function1<q1, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0359b f21390f = new C0359b();

        C0359b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q1 q1Var) {
            l.e(q1Var, "it");
            return Boolean.valueOf(d.d(q1Var));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f1 {
        c() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.f1
        public g1 k(e1 e1Var) {
            l.f(e1Var, RoomNotification.KEY);
            kotlin.reflect.x.internal.l0.i.q.a.b bVar = e1Var instanceof kotlin.reflect.x.internal.l0.i.q.a.b ? (kotlin.reflect.x.internal.l0.i.q.a.b) e1Var : null;
            if (bVar == null) {
                return null;
            }
            if (bVar.f().c()) {
                return new i1(r1.OUT_VARIANCE, bVar.f().getType());
            }
            return bVar.f();
        }
    }

    public static final kotlin.reflect.x.internal.l0.l.y1.a<e0> a(e0 e0Var) {
        List<Pair> F0;
        Object e2;
        l.f(e0Var, "type");
        if (b0.b(e0Var)) {
            kotlin.reflect.x.internal.l0.l.y1.a<e0> a2 = a(b0.c(e0Var));
            kotlin.reflect.x.internal.l0.l.y1.a<e0> a3 = a(b0.d(e0Var));
            return new kotlin.reflect.x.internal.l0.l.y1.a<>(p1.b(f0.d(b0.c(a2.c()), b0.d(a3.c())), e0Var), p1.b(f0.d(b0.c(a2.d()), b0.d(a3.d())), e0Var));
        }
        e1 O0 = e0Var.O0();
        if (d.d(e0Var)) {
            l.d(O0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            g1 f2 = ((kotlin.reflect.x.internal.l0.i.q.a.b) O0).f();
            e0 type = f2.getType();
            l.e(type, "typeProjection.type");
            e0 b2 = b(type, e0Var);
            int i2 = a.a[f2.a().ordinal()];
            if (i2 == 2) {
                m0 I = kotlin.reflect.x.internal.l0.l.x1.a.h(e0Var).I();
                l.e(I, "type.builtIns.nullableAnyType");
                return new kotlin.reflect.x.internal.l0.l.y1.a<>(b2, I);
            }
            if (i2 == 3) {
                m0 H = kotlin.reflect.x.internal.l0.l.x1.a.h(e0Var).H();
                l.e(H, "type.builtIns.nothingType");
                return new kotlin.reflect.x.internal.l0.l.y1.a<>(b(H, e0Var), b2);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + f2);
        }
        if (!e0Var.M0().isEmpty() && e0Var.M0().size() == O0.getParameters().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<g1> M0 = e0Var.M0();
            List<kotlin.reflect.jvm.internal.impl.descriptors.e1> parameters = O0.getParameters();
            l.e(parameters, "typeConstructor.parameters");
            F0 = kotlin.collections.b0.F0(M0, parameters);
            for (Pair pair : F0) {
                g1 g1Var = (g1) pair.a();
                kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var = (kotlin.reflect.jvm.internal.impl.descriptors.e1) pair.b();
                l.e(e1Var, "typeParameter");
                kotlin.reflect.x.internal.l0.l.y1.c g2 = g(g1Var, e1Var);
                if (g1Var.c()) {
                    arrayList.add(g2);
                    arrayList2.add(g2);
                } else {
                    kotlin.reflect.x.internal.l0.l.y1.a<kotlin.reflect.x.internal.l0.l.y1.c> d2 = d(g2);
                    kotlin.reflect.x.internal.l0.l.y1.c a4 = d2.a();
                    kotlin.reflect.x.internal.l0.l.y1.c b3 = d2.b();
                    arrayList.add(a4);
                    arrayList2.add(b3);
                }
            }
            boolean z = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((kotlin.reflect.x.internal.l0.l.y1.c) it.next()).d()) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                e2 = kotlin.reflect.x.internal.l0.l.x1.a.h(e0Var).H();
                l.e(e2, "type.builtIns.nothingType");
            } else {
                e2 = e(e0Var, arrayList);
            }
            return new kotlin.reflect.x.internal.l0.l.y1.a<>(e2, e(e0Var, arrayList2));
        }
        return new kotlin.reflect.x.internal.l0.l.y1.a<>(e0Var, e0Var);
    }

    private static final e0 b(e0 e0Var, e0 e0Var2) {
        e0 q = n1.q(e0Var, e0Var2.P0());
        l.e(q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q;
    }

    public static final g1 c(g1 g1Var, boolean z) {
        if (g1Var == null) {
            return null;
        }
        if (g1Var.c()) {
            return g1Var;
        }
        e0 type = g1Var.getType();
        l.e(type, "typeProjection.type");
        if (!n1.c(type, C0359b.f21390f)) {
            return g1Var;
        }
        r1 a2 = g1Var.a();
        l.e(a2, "typeProjection.projectionKind");
        if (a2 == r1.OUT_VARIANCE) {
            return new i1(a2, a(type).d());
        }
        if (z) {
            return new i1(a2, a(type).c());
        }
        return f(g1Var);
    }

    private static final kotlin.reflect.x.internal.l0.l.y1.a<kotlin.reflect.x.internal.l0.l.y1.c> d(kotlin.reflect.x.internal.l0.l.y1.c cVar) {
        kotlin.reflect.x.internal.l0.l.y1.a<e0> a2 = a(cVar.a());
        e0 a3 = a2.a();
        e0 b2 = a2.b();
        kotlin.reflect.x.internal.l0.l.y1.a<e0> a4 = a(cVar.b());
        return new kotlin.reflect.x.internal.l0.l.y1.a<>(new kotlin.reflect.x.internal.l0.l.y1.c(cVar.c(), b2, a4.a()), new kotlin.reflect.x.internal.l0.l.y1.c(cVar.c(), a3, a4.b()));
    }

    private static final e0 e(e0 e0Var, List<kotlin.reflect.x.internal.l0.l.y1.c> list) {
        int t;
        e0Var.M0().size();
        list.size();
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((kotlin.reflect.x.internal.l0.l.y1.c) it.next()));
        }
        return k1.e(e0Var, arrayList, null, null, 6, null);
    }

    private static final g1 f(g1 g1Var) {
        l1 g2 = l1.g(new c());
        l.e(g2, "create(object : TypeCons…ojection\n        }\n    })");
        return g2.t(g1Var);
    }

    private static final kotlin.reflect.x.internal.l0.l.y1.c g(g1 g1Var, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var) {
        int i2 = a.a[l1.c(e1Var.n(), g1Var).ordinal()];
        if (i2 == 1) {
            e0 type = g1Var.getType();
            l.e(type, "type");
            e0 type2 = g1Var.getType();
            l.e(type2, "type");
            return new kotlin.reflect.x.internal.l0.l.y1.c(e1Var, type, type2);
        }
        if (i2 == 2) {
            e0 type3 = g1Var.getType();
            l.e(type3, "type");
            m0 I = kotlin.reflect.x.internal.l0.i.t.a.f(e1Var).I();
            l.e(I, "typeParameter.builtIns.nullableAnyType");
            return new kotlin.reflect.x.internal.l0.l.y1.c(e1Var, type3, I);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        m0 H = kotlin.reflect.x.internal.l0.i.t.a.f(e1Var).H();
        l.e(H, "typeParameter.builtIns.nothingType");
        e0 type4 = g1Var.getType();
        l.e(type4, "type");
        return new kotlin.reflect.x.internal.l0.l.y1.c(e1Var, H, type4);
    }

    private static final g1 h(kotlin.reflect.x.internal.l0.l.y1.c cVar) {
        cVar.d();
        if (!l.a(cVar.a(), cVar.b())) {
            r1 n = cVar.c().n();
            r1 r1Var = r1.IN_VARIANCE;
            if (n != r1Var) {
                if (!h.m0(cVar.a()) || cVar.c().n() == r1Var) {
                    return h.o0(cVar.b()) ? new i1(i(cVar, r1Var), cVar.a()) : new i1(i(cVar, r1.OUT_VARIANCE), cVar.b());
                }
                return new i1(i(cVar, r1.OUT_VARIANCE), cVar.b());
            }
        }
        return new i1(cVar.a());
    }

    private static final r1 i(kotlin.reflect.x.internal.l0.l.y1.c cVar, r1 r1Var) {
        return r1Var == cVar.c().n() ? r1.INVARIANT : r1Var;
    }
}
