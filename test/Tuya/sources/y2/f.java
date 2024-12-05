package Y2;

import L5.InterfaceC1227k;
import L5.l;
import M5.AbstractC1246t;
import M5.a0;
import Z2.B;
import Z2.C1518a;
import Z2.C1520c;
import Z2.C1522e;
import Z2.C1524g;
import Z2.C1526i;
import Z2.C1528k;
import Z2.C1530m;
import Z2.C1532o;
import Z2.C1534q;
import Z2.C1535s;
import Z2.C1537u;
import Z2.C1539w;
import Z2.C1542z;
import Z2.E;
import Z2.G;
import Z2.I;
import Z2.K;
import Z2.M;
import Z2.O;
import Z2.Q;
import Z2.T;
import Z2.V;
import Z2.X;
import Z2.Z;
import Z2.b0;
import Z2.d0;
import Z2.f0;
import Z2.h0;
import Z2.j0;
import Z2.l0;
import Z2.n0;
import Z2.p0;
import Z2.r0;
import Z2.t0;
import Z2.v0;
import Z2.x0;
import d6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f13050a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f13051b = a0.i(C1518a.f13299a, C1520c.f13307a, C1522e.f13315a, C1524g.f13323a, C1526i.f13331a, C1528k.f13339a, C1530m.f13347a, C1532o.f13355a, C1534q.f13363a, C1535s.f13371a, C1537u.f13379a, C1539w.f13387a, C1542z.f13397a, B.f13250a, E.f13256a, G.f13260a, I.f13264a, K.f13268a, M.f13272a, O.f13276a, Q.f13280a, T.f13284a, V.f13288a, X.f13292a, Z.f13296a, b0.f13304a, d0.f13312a, f0.f13320a, h0.f13328a, j0.f13336a, l0.f13344a, n0.f13352a, p0.f13360a, r0.f13368a, t0.f13376a, v0.f13384a, x0.f13392a);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1227k f13052c = l.b(a.f13054a);

    /* renamed from: d, reason: collision with root package name */
    public static final int f13053d = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13054a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            Set a8 = f.f13050a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(M5.Q.d(AbstractC1246t.x(a8, 10)), 16));
            for (Object obj : a8) {
                linkedHashMap.put(((b) obj).getType().f24550a, obj);
            }
            return linkedHashMap;
        }
    }

    private f() {
    }

    public final Set a() {
        return f13051b;
    }

    public final Map b() {
        return (Map) f13052c.getValue();
    }
}
