package u3;

import O5.r;
import O5.x;
import P5.Q;
import com.stripe.android.model.a;
import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.u;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4060b {
    public static final b.d a(C4059a c4059a) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC3255y.i(c4059a, "<this>");
        String b8 = c4059a.b();
        if (b8 == null) {
            b8 = "";
        }
        String str6 = b8;
        a.C0494a c0494a = new a.C0494a();
        u.a a8 = c4059a.a();
        String str7 = null;
        if (a8 != null) {
            str = a8.g();
        } else {
            str = null;
        }
        a.C0494a e8 = c0494a.e(str);
        u.a a9 = c4059a.a();
        if (a9 != null) {
            str2 = a9.h();
        } else {
            str2 = null;
        }
        a.C0494a f8 = e8.f(str2);
        u.a a10 = c4059a.a();
        if (a10 != null) {
            str3 = a10.a();
        } else {
            str3 = null;
        }
        a.C0494a b9 = f8.b(str3);
        u.a a11 = c4059a.a();
        if (a11 != null) {
            str4 = a11.l();
        } else {
            str4 = null;
        }
        a.C0494a h8 = b9.h(str4);
        u.a a12 = c4059a.a();
        if (a12 != null) {
            str5 = a12.b();
        } else {
            str5 = null;
        }
        a.C0494a c8 = h8.c(str5);
        u.a a13 = c4059a.a();
        if (a13 != null) {
            str7 = a13.i();
        }
        return new b.d(c8.g(str7).a(), str6, null, c4059a.g(), null, 20, null);
    }

    public static final Map b(C4059a c4059a, u.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC3255y.i(c4059a, "<this>");
        if (cVar != null && cVar.i()) {
            return Q.h();
        }
        G.b bVar = G.Companion;
        r a8 = x.a(bVar.r(), c4059a.b());
        G p8 = bVar.p();
        u.a a9 = c4059a.a();
        Map map = null;
        if (a9 != null) {
            str = a9.g();
        } else {
            str = null;
        }
        r a10 = x.a(p8, str);
        G q8 = bVar.q();
        u.a a11 = c4059a.a();
        if (a11 != null) {
            str2 = a11.h();
        } else {
            str2 = null;
        }
        r a12 = x.a(q8, str2);
        G k8 = bVar.k();
        u.a a13 = c4059a.a();
        if (a13 != null) {
            str3 = a13.a();
        } else {
            str3 = null;
        }
        r a14 = x.a(k8, str3);
        G z8 = bVar.z();
        u.a a15 = c4059a.a();
        if (a15 != null) {
            str4 = a15.l();
        } else {
            str4 = null;
        }
        r a16 = x.a(z8, str4);
        G u8 = bVar.u();
        u.a a17 = c4059a.a();
        if (a17 != null) {
            str5 = a17.i();
        } else {
            str5 = null;
        }
        r a18 = x.a(u8, str5);
        G l8 = bVar.l();
        u.a a19 = c4059a.a();
        if (a19 != null) {
            str6 = a19.b();
        } else {
            str6 = null;
        }
        Map k9 = Q.k(a8, a10, a12, a14, a16, a18, x.a(l8, str6), x.a(bVar.t(), c4059a.g()));
        G w8 = bVar.w();
        Boolean h8 = c4059a.h();
        if (h8 != null) {
            str7 = h8.toString();
        } else {
            str7 = null;
        }
        Map e8 = Q.e(x.a(w8, str7));
        if (c4059a.h() != null) {
            map = e8;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k9, map);
    }

    public static /* synthetic */ Map c(C4059a c4059a, u.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = null;
        }
        return b(c4059a, cVar);
    }
}
