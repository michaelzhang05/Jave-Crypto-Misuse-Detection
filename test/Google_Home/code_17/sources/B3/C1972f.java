package b3;

import O5.InterfaceC1355k;
import O5.l;
import P5.AbstractC1378t;
import P5.a0;
import c3.C2015B;
import c3.C2018a;
import c3.C2020c;
import c3.C2022e;
import c3.C2024g;
import c3.C2026i;
import c3.C2028k;
import c3.C2030m;
import c3.C2032o;
import c3.C2034q;
import c3.C2035s;
import c3.C2037u;
import c3.C2039w;
import c3.C2042z;
import c3.E;
import c3.G;
import c3.I;
import c3.K;
import c3.M;
import c3.O;
import c3.Q;
import c3.T;
import c3.V;
import c3.X;
import c3.Z;
import c3.b0;
import c3.d0;
import c3.f0;
import c3.h0;
import c3.j0;
import c3.l0;
import c3.n0;
import c3.p0;
import c3.r0;
import c3.t0;
import c3.v0;
import c3.x0;
import g6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1972f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1972f f15335a = new C1972f();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f15336b = a0.i(C2018a.f15623a, C2020c.f15631a, C2022e.f15639a, C2024g.f15647a, C2026i.f15655a, C2028k.f15663a, C2030m.f15671a, C2032o.f15679a, C2034q.f15687a, C2035s.f15695a, C2037u.f15703a, C2039w.f15711a, C2042z.f15721a, C2015B.f15574a, E.f15580a, G.f15584a, I.f15588a, K.f15592a, M.f15596a, O.f15600a, Q.f15604a, T.f15608a, V.f15612a, X.f15616a, Z.f15620a, b0.f15628a, d0.f15636a, f0.f15644a, h0.f15652a, j0.f15660a, l0.f15668a, n0.f15676a, p0.f15684a, r0.f15692a, t0.f15700a, v0.f15708a, x0.f15716a);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1355k f15337c = l.b(a.f15339a);

    /* renamed from: d, reason: collision with root package name */
    public static final int f15338d = 8;

    /* renamed from: b3.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15339a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            Set a8 = C1972f.f15335a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(P5.Q.d(AbstractC1378t.x(a8, 10)), 16));
            for (Object obj : a8) {
                linkedHashMap.put(((InterfaceC1968b) obj).getType().f25605a, obj);
            }
            return linkedHashMap;
        }
    }

    private C1972f() {
    }

    public final Set a() {
        return f15336b;
    }

    public final Map b() {
        return (Map) f15337c.getValue();
    }
}
