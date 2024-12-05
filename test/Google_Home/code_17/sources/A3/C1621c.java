package a3;

import O5.r;
import O5.x;
import P5.Q;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.u;
import java.util.LinkedHashMap;
import java.util.Map;
import l4.AbstractC3316a;
import p4.G;
import p4.P;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1621c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1621c f13843a = new C1621c();

    private C1621c() {
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
        u.a a8;
        u.a a9;
        u.a a10;
        u.a a11;
        u.a a12;
        u.a a13;
        if (pVar == null || (h8 = AbstractC3316a.c(pVar.B())) == null) {
            h8 = Q.h();
        }
        if (qVar != null) {
            Map c8 = AbstractC3316a.c(qVar.B());
            h9 = new LinkedHashMap(Q.d(c8.size()));
            for (Map.Entry entry : c8.entrySet()) {
                h9.put(G.g0((G) entry.getKey(), null, false, P.b.f37217a, 3, null), entry.getValue());
            }
        } else {
            h9 = Q.h();
        }
        G.b bVar = G.Companion;
        G r8 = bVar.r();
        String str9 = null;
        if (cVar != null) {
            str = cVar.g();
        } else {
            str = null;
        }
        r a14 = x.a(r8, str);
        G n8 = bVar.n();
        if (cVar != null) {
            str2 = cVar.b();
        } else {
            str2 = null;
        }
        r a15 = x.a(n8, str2);
        G t8 = bVar.t();
        if (cVar != null) {
            str3 = cVar.h();
        } else {
            str3 = null;
        }
        r a16 = x.a(t8, str3);
        G p8 = bVar.p();
        if (cVar != null && (a13 = cVar.a()) != null) {
            str4 = a13.g();
        } else {
            str4 = null;
        }
        r a17 = x.a(p8, str4);
        G q8 = bVar.q();
        if (cVar != null && (a12 = cVar.a()) != null) {
            str5 = a12.h();
        } else {
            str5 = null;
        }
        r a18 = x.a(q8, str5);
        G k8 = bVar.k();
        if (cVar != null && (a11 = cVar.a()) != null) {
            str6 = a11.a();
        } else {
            str6 = null;
        }
        r a19 = x.a(k8, str6);
        G z8 = bVar.z();
        if (cVar != null && (a10 = cVar.a()) != null) {
            str7 = a10.l();
        } else {
            str7 = null;
        }
        r a20 = x.a(z8, str7);
        G l8 = bVar.l();
        if (cVar != null && (a9 = cVar.a()) != null) {
            str8 = a9.b();
        } else {
            str8 = null;
        }
        r a21 = x.a(l8, str8);
        G u8 = bVar.u();
        if (cVar != null && (a8 = cVar.a()) != null) {
            str9 = a8.i();
        }
        return Q.q(Q.q(Q.k(a14, a15, a16, a17, a18, a19, a20, a21, x.a(u8, str9)), h8), h9);
    }
}
