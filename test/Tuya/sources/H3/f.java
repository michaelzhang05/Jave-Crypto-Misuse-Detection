package H3;

import L5.p;
import b3.v;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f {
    private static final String b(u.i iVar) {
        u.h b8 = iVar.b();
        if (b8 instanceof u.h.a) {
            return ((u.h.a) iVar.b()).F();
        }
        if (b8 instanceof u.h.b) {
            return null;
        }
        throw new p();
    }

    public static final v c(u.l lVar, u.i iVar, List externalPaymentMethods, String str) {
        String str2;
        AbstractC3159y.i(lVar, "<this>");
        AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
        if (iVar != null) {
            str2 = b(iVar);
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (lVar instanceof u.l.b) {
            return new v.b(((u.l.b) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof u.l.c) {
            return new v.c(((u.l.c) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof u.l.a) {
            return new v.a(null, com.stripe.android.paymentsheet.d.b(((u.l.a) lVar).c()), externalPaymentMethods, str, str3, 1, null);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent d(StripeIntent stripeIntent) {
        com.stripe.android.model.u b8;
        n b9;
        List g8 = stripeIntent.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g8) {
            if (!AbstractC3159y.d((String) obj, o.p.f24510C.f24550a)) {
                arrayList.add(obj);
            }
        }
        if (stripeIntent instanceof n) {
            b9 = r2.b((r44 & 1) != 0 ? r2.f24327a : null, (r44 & 2) != 0 ? r2.f24328b : arrayList, (r44 & 4) != 0 ? r2.f24329c : null, (r44 & 8) != 0 ? r2.f24330d : 0L, (r44 & 16) != 0 ? r2.f24331e : null, (r44 & 32) != 0 ? r2.f24332f : null, (r44 & 64) != 0 ? r2.f24333g : null, (r44 & 128) != 0 ? r2.f24334h : null, (r44 & 256) != 0 ? r2.f24335i : null, (r44 & 512) != 0 ? r2.f24336j : 0L, (r44 & 1024) != 0 ? r2.f24337k : null, (r44 & 2048) != 0 ? r2.f24338l : null, (r44 & 4096) != 0 ? r2.f24339m : false, (r44 & 8192) != 0 ? r2.f24340n : null, (r44 & 16384) != 0 ? r2.f24341o : null, (r44 & 32768) != 0 ? r2.f24342p : null, (r44 & 65536) != 0 ? r2.f24343q : null, (r44 & 131072) != 0 ? r2.f24344r : null, (r44 & 262144) != 0 ? r2.f24345s : null, (r44 & 524288) != 0 ? r2.f24346t : null, (r44 & 1048576) != 0 ? r2.f24347u : null, (r44 & 2097152) != 0 ? r2.f24348v : null, (r44 & 4194304) != 0 ? r2.f24349w : null, (r44 & 8388608) != 0 ? ((n) stripeIntent).f24350x : null);
            return b9;
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            b8 = r2.b((r36 & 1) != 0 ? r2.f24690a : null, (r36 & 2) != 0 ? r2.f24691b : null, (r36 & 4) != 0 ? r2.f24692c : 0L, (r36 & 8) != 0 ? r2.f24693d : null, (r36 & 16) != 0 ? r2.f24694e : null, (r36 & 32) != 0 ? r2.f24695f : null, (r36 & 64) != 0 ? r2.f24696g : false, (r36 & 128) != 0 ? r2.f24697h : null, (r36 & 256) != 0 ? r2.f24698i : null, (r36 & 512) != 0 ? r2.f24699j : arrayList, (r36 & 1024) != 0 ? r2.f24700k : null, (r36 & 2048) != 0 ? r2.f24701l : null, (r36 & 4096) != 0 ? r2.f24702m : null, (r36 & 8192) != 0 ? r2.f24703n : null, (r36 & 16384) != 0 ? r2.f24704o : null, (r36 & 32768) != 0 ? r2.f24705p : null, (r36 & 65536) != 0 ? ((com.stripe.android.model.u) stripeIntent).f24706q : null);
            return b8;
        }
        throw new p();
    }
}
