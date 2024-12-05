package Z2;

import M5.AbstractC1246t;
import com.stripe.android.paymentsheet.u;
import e4.C2587A;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import m4.Q;

/* renamed from: Z2.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1540x {

    /* renamed from: Z2.x$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13391a;

        static {
            int[] iArr = new int[u.d.a.values().length];
            try {
                iArr[u.d.a.f26391a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.d.a.f26392b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.d.a.f26393c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13391a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m4.D c(b4.c cVar, Map map, Map map2) {
        m4.e0 e0Var;
        Boolean L02;
        if (map2 != null) {
            G.b bVar = m4.G.Companion;
            String str = (String) map2.get(bVar.w());
            if (str != null && (L02 = g6.n.L0(str)) != null) {
                e0Var = new m4.e0(bVar.w(), new m4.d0(L02.booleanValue()));
                return m4.h0.f35513f.a(AbstractC1246t.r(new C2587A(m4.G.Companion.a("credit_billing"), map, v2.d.f38784a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(b4.n.f14732j));
            }
        }
        e0Var = null;
        return m4.h0.f35513f.a(AbstractC1246t.r(new C2587A(m4.G.Companion.a("credit_billing"), map, v2.d.f38784a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(b4.n.f14732j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m4.D d(Map map, boolean z8, boolean z9) {
        G.b bVar = m4.G.Companion;
        e4.X x8 = new e4.X(null, (String) map.get(bVar.n()), null, 5, null);
        if (!z8) {
            x8 = null;
        }
        m4.G t8 = bVar.t();
        Q.a aVar = m4.Q.f35194r;
        String str = (String) map.get(bVar.t());
        if (str == null) {
            str = "";
        }
        m4.S s8 = new m4.S(t8, Q.a.b(aVar, str, null, null, false, false, 30, null));
        if (!z9) {
            s8 = null;
        }
        List r8 = AbstractC1246t.r(x8, s8);
        if (r8.isEmpty()) {
            return null;
        }
        return m4.h0.f35513f.a(r8, Integer.valueOf(b4.n.f14740n));
    }

    public static final b4.c e(u.d.a aVar) {
        AbstractC3159y.i(aVar, "<this>");
        int i8 = a.f13391a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return b4.c.f14611c;
                }
                throw new L5.p();
            }
            return b4.c.f14610b;
        }
        return b4.c.f14609a;
    }
}
