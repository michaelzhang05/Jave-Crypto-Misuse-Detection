package r3;

import L5.r;
import L5.x;
import M5.Q;
import com.stripe.android.model.a;
import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.u;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3687b {
    public static final b.d a(C3686a c3686a) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC3159y.i(c3686a, "<this>");
        String c8 = c3686a.c();
        if (c8 == null) {
            c8 = "";
        }
        String str6 = c8;
        a.C0498a c0498a = new a.C0498a();
        u.a b8 = c3686a.b();
        String str7 = null;
        if (b8 != null) {
            str = b8.e();
        } else {
            str = null;
        }
        a.C0498a e8 = c0498a.e(str);
        u.a b9 = c3686a.b();
        if (b9 != null) {
            str2 = b9.f();
        } else {
            str2 = null;
        }
        a.C0498a f8 = e8.f(str2);
        u.a b10 = c3686a.b();
        if (b10 != null) {
            str3 = b10.b();
        } else {
            str3 = null;
        }
        a.C0498a b11 = f8.b(str3);
        u.a b12 = c3686a.b();
        if (b12 != null) {
            str4 = b12.j();
        } else {
            str4 = null;
        }
        a.C0498a h8 = b11.h(str4);
        u.a b13 = c3686a.b();
        if (b13 != null) {
            str5 = b13.c();
        } else {
            str5 = null;
        }
        a.C0498a c9 = h8.c(str5);
        u.a b14 = c3686a.b();
        if (b14 != null) {
            str7 = b14.i();
        }
        return new b.d(c9.g(str7).a(), str6, null, c3686a.e(), null, 20, null);
    }

    public static final Map b(C3686a c3686a, u.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC3159y.i(c3686a, "<this>");
        if (cVar != null && cVar.i()) {
            return Q.h();
        }
        G.b bVar = G.Companion;
        r a8 = x.a(bVar.r(), c3686a.c());
        G p8 = bVar.p();
        u.a b8 = c3686a.b();
        Map map = null;
        if (b8 != null) {
            str = b8.e();
        } else {
            str = null;
        }
        r a9 = x.a(p8, str);
        G q8 = bVar.q();
        u.a b9 = c3686a.b();
        if (b9 != null) {
            str2 = b9.f();
        } else {
            str2 = null;
        }
        r a10 = x.a(q8, str2);
        G k8 = bVar.k();
        u.a b10 = c3686a.b();
        if (b10 != null) {
            str3 = b10.b();
        } else {
            str3 = null;
        }
        r a11 = x.a(k8, str3);
        G z8 = bVar.z();
        u.a b11 = c3686a.b();
        if (b11 != null) {
            str4 = b11.j();
        } else {
            str4 = null;
        }
        r a12 = x.a(z8, str4);
        G u8 = bVar.u();
        u.a b12 = c3686a.b();
        if (b12 != null) {
            str5 = b12.i();
        } else {
            str5 = null;
        }
        r a13 = x.a(u8, str5);
        G l8 = bVar.l();
        u.a b13 = c3686a.b();
        if (b13 != null) {
            str6 = b13.c();
        } else {
            str6 = null;
        }
        Map k9 = Q.k(a8, a9, a10, a11, a12, a13, x.a(l8, str6), x.a(bVar.t(), c3686a.e()));
        G w8 = bVar.w();
        Boolean f8 = c3686a.f();
        if (f8 != null) {
            str7 = f8.toString();
        } else {
            str7 = null;
        }
        Map e8 = Q.e(x.a(w8, str7));
        if (c3686a.f() != null) {
            map = e8;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k9, map);
    }

    public static /* synthetic */ Map c(C3686a c3686a, u.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = null;
        }
        return b(c3686a, cVar);
    }
}
