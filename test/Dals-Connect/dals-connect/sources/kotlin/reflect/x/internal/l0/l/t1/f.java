package kotlin.reflect.x.internal.l0.l.t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.x.internal.l0.i.q.a.c;
import kotlin.reflect.x.internal.l0.i.r.p;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.d0;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.h;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.p1;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.y;

/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes2.dex */
public abstract class f extends h {

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        public static final a a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements Function1<kotlin.reflect.x.internal.l0.l.w1.i, q1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(f.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final q1 invoke(kotlin.reflect.x.internal.l0.l.w1.i iVar) {
            l.f(iVar, "p0");
            return ((f) this.receiver).a(iVar);
        }
    }

    private final m0 c(m0 m0Var) {
        int t;
        int t2;
        List i2;
        int t3;
        e0 type;
        e1 O0 = m0Var.O0();
        boolean z = false;
        d0 d0Var = null;
        r5 = null;
        q1 q1Var = null;
        if (O0 instanceof c) {
            c cVar = (c) O0;
            g1 f2 = cVar.f();
            if (!(f2.a() == r1.IN_VARIANCE)) {
                f2 = null;
            }
            if (f2 != null && (type = f2.getType()) != null) {
                q1Var = type.R0();
            }
            q1 q1Var2 = q1Var;
            if (cVar.h() == null) {
                g1 f3 = cVar.f();
                Collection<e0> a2 = cVar.a();
                t3 = u.t(a2, 10);
                ArrayList arrayList = new ArrayList(t3);
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e0) it.next()).R0());
                }
                cVar.j(new j(f3, arrayList, null, 4, null));
            }
            kotlin.reflect.x.internal.l0.l.w1.b bVar = kotlin.reflect.x.internal.l0.l.w1.b.FOR_SUBTYPING;
            j h2 = cVar.h();
            l.c(h2);
            return new i(bVar, h2, q1Var2, m0Var.N0(), m0Var.P0(), false, 32, null);
        }
        if (O0 instanceof p) {
            Collection<e0> a3 = ((p) O0).a();
            t2 = u.t(a3, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            Iterator<T> it2 = a3.iterator();
            while (it2.hasNext()) {
                e0 p = n1.p((e0) it2.next(), m0Var.P0());
                l.e(p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(p);
            }
            d0 d0Var2 = new d0(arrayList2);
            a1 N0 = m0Var.N0();
            i2 = t.i();
            return f0.j(N0, d0Var2, i2, false, m0Var.q());
        }
        if (!(O0 instanceof d0) || !m0Var.P0()) {
            return m0Var;
        }
        d0 d0Var3 = (d0) O0;
        Collection<e0> a4 = d0Var3.a();
        t = u.t(a4, 10);
        ArrayList arrayList3 = new ArrayList(t);
        Iterator<T> it3 = a4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(kotlin.reflect.x.internal.l0.l.x1.a.t((e0) it3.next()));
            z = true;
        }
        if (z) {
            e0 i3 = d0Var3.i();
            d0Var = new d0(arrayList3).m(i3 != null ? kotlin.reflect.x.internal.l0.l.x1.a.t(i3) : null);
        }
        if (d0Var != null) {
            d0Var3 = d0Var;
        }
        return d0Var3.h();
    }

    @Override // kotlin.reflect.x.internal.l0.l.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q1 a(kotlin.reflect.x.internal.l0.l.w1.i iVar) {
        q1 d2;
        l.f(iVar, "type");
        if (iVar instanceof e0) {
            q1 R0 = ((e0) iVar).R0();
            if (R0 instanceof m0) {
                d2 = c((m0) R0);
            } else if (R0 instanceof y) {
                y yVar = (y) R0;
                m0 c2 = c(yVar.W0());
                m0 c3 = c(yVar.X0());
                d2 = (c2 == yVar.W0() && c3 == yVar.X0()) ? R0 : f0.d(c2, c3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return p1.c(d2, R0, new b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
