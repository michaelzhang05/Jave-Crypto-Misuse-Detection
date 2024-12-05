package X2;

import L5.r;
import L5.x;
import M5.Q;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.u;
import i4.AbstractC2781a;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.G;
import m4.P;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f12222a = new c();

    private c() {
    }

    public final Map a(u.c cVar, p pVar, q qVar) {
        Map h8;
        Map h9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        u.a b8;
        u.a b9;
        u.a b10;
        u.a b11;
        u.a b12;
        u.a b13;
        if (pVar == null || (h8 = AbstractC2781a.c(pVar.y())) == null) {
            h8 = Q.h();
        }
        if (qVar != null) {
            Map c8 = AbstractC2781a.c(qVar.y());
            h9 = new LinkedHashMap(Q.d(c8.size()));
            for (Map.Entry entry : c8.entrySet()) {
                h9.put(G.g0((G) entry.getKey(), null, false, P.b.f35191a, 3, null), entry.getValue());
            }
        } else {
            h9 = Q.h();
        }
        G.b bVar = G.Companion;
        G r8 = bVar.r();
        String str9 = null;
        if (cVar != null) {
            str = cVar.e();
        } else {
            str = null;
        }
        r a8 = x.a(r8, str);
        G n8 = bVar.n();
        if (cVar != null) {
            str2 = cVar.c();
        } else {
            str2 = null;
        }
        r a9 = x.a(n8, str2);
        G t8 = bVar.t();
        if (cVar != null) {
            str3 = cVar.f();
        } else {
            str3 = null;
        }
        r a10 = x.a(t8, str3);
        G p8 = bVar.p();
        if (cVar != null && (b13 = cVar.b()) != null) {
            str4 = b13.e();
        } else {
            str4 = null;
        }
        r a11 = x.a(p8, str4);
        G q8 = bVar.q();
        if (cVar != null && (b12 = cVar.b()) != null) {
            str5 = b12.f();
        } else {
            str5 = null;
        }
        r a12 = x.a(q8, str5);
        G k8 = bVar.k();
        if (cVar != null && (b11 = cVar.b()) != null) {
            str6 = b11.b();
        } else {
            str6 = null;
        }
        r a13 = x.a(k8, str6);
        G z8 = bVar.z();
        if (cVar != null && (b10 = cVar.b()) != null) {
            str7 = b10.j();
        } else {
            str7 = null;
        }
        r a14 = x.a(z8, str7);
        G l8 = bVar.l();
        if (cVar != null && (b9 = cVar.b()) != null) {
            str8 = b9.c();
        } else {
            str8 = null;
        }
        r a15 = x.a(l8, str8);
        G u8 = bVar.u();
        if (cVar != null && (b8 = cVar.b()) != null) {
            str9 = b8.i();
        }
        return Q.q(Q.q(Q.k(a8, a9, a10, a11, a12, a13, a14, a15, x.a(u8, str9)), h8), h9);
    }
}
