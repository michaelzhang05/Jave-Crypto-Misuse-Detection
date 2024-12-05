package kotlin.reflect.x.internal.l0.d.a.l0.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.l0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.t1.e;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.y;
import kotlin.text.v;

/* compiled from: RawType.kt */
/* loaded from: classes2.dex */
public final class f extends y implements l0 {

    /* compiled from: RawType.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20096f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            l.f(str, "it");
            return "(raw) " + str;
        }
    }

    private f(m0 m0Var, m0 m0Var2, boolean z) {
        super(m0Var, m0Var2);
        if (z) {
            return;
        }
        e.a.d(m0Var, m0Var2);
    }

    private static final boolean b1(String str, String str2) {
        String g0;
        g0 = v.g0(str2, "out ");
        return l.a(str, g0) || l.a(str2, "*");
    }

    private static final List<String> c1(c cVar, e0 e0Var) {
        int t;
        List<g1> M0 = e0Var.M0();
        t = u.t(M0, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = M0.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.x((g1) it.next()));
        }
        return arrayList;
    }

    private static final String d1(String str, String str2) {
        boolean E;
        String F0;
        String C0;
        E = v.E(str, '<', false, 2, null);
        if (!E) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        F0 = v.F0(str, '<', null, 2, null);
        sb.append(F0);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        C0 = v.C0(str, '>', null, 2, null);
        sb.append(C0);
        return sb.toString();
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public m0 V0() {
        return W0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String Y0(c cVar, kotlin.reflect.x.internal.l0.h.f fVar) {
        String b0;
        List F0;
        l.f(cVar, "renderer");
        l.f(fVar, "options");
        String w = cVar.w(W0());
        String w2 = cVar.w(X0());
        if (fVar.n()) {
            return "raw (" + w + ".." + w2 + ')';
        }
        if (X0().M0().isEmpty()) {
            return cVar.t(w, w2, kotlin.reflect.x.internal.l0.l.x1.a.h(this));
        }
        List<String> c1 = c1(cVar, W0());
        List<String> c12 = c1(cVar, X0());
        b0 = b0.b0(c1, ", ", null, null, 0, null, a.f20096f, 30, null);
        F0 = b0.F0(c1, c12);
        boolean z = true;
        if (!(F0 instanceof Collection) || !F0.isEmpty()) {
            Iterator it = F0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!b1((String) pair.c(), (String) pair.d())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            w2 = d1(w2, b0);
        }
        String d1 = d1(w, b0);
        return l.a(d1, w2) ? d1 : cVar.t(d1, w2, kotlin.reflect.x.internal.l0.l.x1.a.h(this));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public f S0(boolean z) {
        return new f(W0().S0(z), X0().S0(z));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public y Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        e0 a2 = gVar.a(W0());
        l.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 a3 = gVar.a(X0());
        l.d(a3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new f((m0) a2, (m0) a3, true);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public f U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new f(W0().U0(a1Var), X0().U0(a1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.x.internal.l0.l.y, kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        kotlin.reflect.jvm.internal.impl.descriptors.h w = O0().w();
        g gVar = null;
        Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) w : null;
        if (eVar != null) {
            h a0 = eVar.a0(new e(gVar, 1, objArr == true ? 1 : 0));
            l.e(a0, "classDescriptor.getMemberScope(RawSubstitution())");
            return a0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + O0().w()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(m0 m0Var, m0 m0Var2) {
        this(m0Var, m0Var2, false);
        l.f(m0Var, "lowerBound");
        l.f(m0Var2, "upperBound");
    }
}
