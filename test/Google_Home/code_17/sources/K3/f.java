package K3;

import O5.p;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import e3.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class f {
    private static final String b(u.i iVar) {
        u.h a8 = iVar.a();
        if (a8 instanceof u.h.a) {
            return ((u.h.a) iVar.a()).I();
        }
        if (a8 instanceof u.h.b) {
            return null;
        }
        throw new p();
    }

    public static final v c(u.l lVar, u.i iVar, List externalPaymentMethods, String str) {
        String str2;
        AbstractC3255y.i(lVar, "<this>");
        AbstractC3255y.i(externalPaymentMethods, "externalPaymentMethods");
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
            return new v.a(null, com.stripe.android.paymentsheet.d.b(((u.l.a) lVar).b()), externalPaymentMethods, str, str3, 1, null);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent d(StripeIntent stripeIntent) {
        com.stripe.android.model.u a8;
        n a9;
        List e8 = stripeIntent.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e8) {
            if (!AbstractC3255y.d((String) obj, o.p.f25565C.f25605a)) {
                arrayList.add(obj);
            }
        }
        if (stripeIntent instanceof n) {
            a9 = r2.a((r44 & 1) != 0 ? r2.f25382a : null, (r44 & 2) != 0 ? r2.f25383b : arrayList, (r44 & 4) != 0 ? r2.f25384c : null, (r44 & 8) != 0 ? r2.f25385d : 0L, (r44 & 16) != 0 ? r2.f25386e : null, (r44 & 32) != 0 ? r2.f25387f : null, (r44 & 64) != 0 ? r2.f25388g : null, (r44 & 128) != 0 ? r2.f25389h : null, (r44 & 256) != 0 ? r2.f25390i : null, (r44 & 512) != 0 ? r2.f25391j : 0L, (r44 & 1024) != 0 ? r2.f25392k : null, (r44 & 2048) != 0 ? r2.f25393l : null, (r44 & 4096) != 0 ? r2.f25394m : false, (r44 & 8192) != 0 ? r2.f25395n : null, (r44 & 16384) != 0 ? r2.f25396o : null, (r44 & 32768) != 0 ? r2.f25397p : null, (r44 & 65536) != 0 ? r2.f25398q : null, (r44 & 131072) != 0 ? r2.f25399r : null, (r44 & 262144) != 0 ? r2.f25400s : null, (r44 & 524288) != 0 ? r2.f25401t : null, (r44 & 1048576) != 0 ? r2.f25402u : null, (r44 & 2097152) != 0 ? r2.f25403v : null, (r44 & 4194304) != 0 ? r2.f25404w : null, (r44 & 8388608) != 0 ? ((n) stripeIntent).f25405x : null);
            return a9;
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            a8 = r2.a((r36 & 1) != 0 ? r2.f25745a : null, (r36 & 2) != 0 ? r2.f25746b : null, (r36 & 4) != 0 ? r2.f25747c : 0L, (r36 & 8) != 0 ? r2.f25748d : null, (r36 & 16) != 0 ? r2.f25749e : null, (r36 & 32) != 0 ? r2.f25750f : null, (r36 & 64) != 0 ? r2.f25751g : false, (r36 & 128) != 0 ? r2.f25752h : null, (r36 & 256) != 0 ? r2.f25753i : null, (r36 & 512) != 0 ? r2.f25754j : arrayList, (r36 & 1024) != 0 ? r2.f25755k : null, (r36 & 2048) != 0 ? r2.f25756l : null, (r36 & 4096) != 0 ? r2.f25757m : null, (r36 & 8192) != 0 ? r2.f25758n : null, (r36 & 16384) != 0 ? r2.f25759o : null, (r36 & 32768) != 0 ? r2.f25760p : null, (r36 & 65536) != 0 ? ((com.stripe.android.model.u) stripeIntent).f25761q : null);
            return a8;
        }
        throw new p();
    }
}
