package E3;

import B3.f;
import O5.x;
import P5.Q;
import com.stripe.android.model.a;
import com.stripe.android.paymentsheet.u;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

/* loaded from: classes4.dex */
public abstract class h {
    public static final com.stripe.android.model.a a(u.a aVar) {
        AbstractC3255y.i(aVar, "<this>");
        String g8 = aVar.g();
        String h8 = aVar.h();
        return new com.stripe.android.model.a(aVar.a(), aVar.b(), g8, h8, aVar.i(), aVar.l());
    }

    public static final Map b(com.stripe.android.model.a aVar) {
        AbstractC3255y.i(aVar, "<this>");
        G.b bVar = G.Companion;
        return Q.k(x.a(bVar.p(), aVar.g()), x.a(bVar.q(), aVar.h()), x.a(bVar.k(), aVar.a()), x.a(bVar.z(), aVar.l()), x.a(bVar.l(), aVar.b()), x.a(bVar.u(), aVar.i()));
    }

    public static final f.a c(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                return f.a.f808b;
            }
            return f.a.f809c;
        }
        return f.a.f810d;
    }

    public static final com.stripe.android.model.a d(a.b bVar, Map formFieldValues) {
        AbstractC3255y.i(bVar, "<this>");
        AbstractC3255y.i(formFieldValues, "formFieldValues");
        G.b bVar2 = G.Companion;
        String str = (String) formFieldValues.get(bVar2.p());
        String str2 = (String) formFieldValues.get(bVar2.q());
        return new com.stripe.android.model.a((String) formFieldValues.get(bVar2.k()), (String) formFieldValues.get(bVar2.l()), str, str2, (String) formFieldValues.get(bVar2.u()), (String) formFieldValues.get(bVar2.z()));
    }
}
