package c3;

import P5.AbstractC1378t;
import com.stripe.android.paymentsheet.u;
import h4.C2907A;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;
import p4.Q;

/* renamed from: c3.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2040x {

    /* renamed from: c3.x$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15715a;

        static {
            int[] iArr = new int[u.d.a.values().length];
            try {
                iArr[u.d.a.f27446a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.d.a.f27447b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.d.a.f27448c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15715a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p4.D c(e4.c cVar, Map map, Map map2) {
        p4.e0 e0Var;
        Boolean L02;
        if (map2 != null) {
            G.b bVar = p4.G.Companion;
            String str = (String) map2.get(bVar.w());
            if (str != null && (L02 = j6.n.L0(str)) != null) {
                e0Var = new p4.e0(bVar.w(), new p4.d0(L02.booleanValue()));
                return p4.h0.f37539f.a(AbstractC1378t.r(new C2907A(p4.G.Companion.a("credit_billing"), map, y2.d.f40915a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(e4.n.f31738j));
            }
        }
        e0Var = null;
        return p4.h0.f37539f.a(AbstractC1378t.r(new C2907A(p4.G.Companion.a("credit_billing"), map, y2.d.f40915a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(e4.n.f31738j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p4.D d(Map map, boolean z8, boolean z9) {
        G.b bVar = p4.G.Companion;
        h4.X x8 = new h4.X(null, (String) map.get(bVar.n()), null, 5, null);
        if (!z8) {
            x8 = null;
        }
        p4.G t8 = bVar.t();
        Q.a aVar = p4.Q.f37220r;
        String str = (String) map.get(bVar.t());
        if (str == null) {
            str = "";
        }
        p4.S s8 = new p4.S(t8, Q.a.b(aVar, str, null, null, false, false, 30, null));
        if (!z9) {
            s8 = null;
        }
        List r8 = AbstractC1378t.r(x8, s8);
        if (r8.isEmpty()) {
            return null;
        }
        return p4.h0.f37539f.a(r8, Integer.valueOf(e4.n.f31746n));
    }

    public static final e4.c e(u.d.a aVar) {
        AbstractC3255y.i(aVar, "<this>");
        int i8 = a.f15715a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return e4.c.f31617c;
                }
                throw new O5.p();
            }
            return e4.c.f31616b;
        }
        return e4.c.f31615a;
    }
}
