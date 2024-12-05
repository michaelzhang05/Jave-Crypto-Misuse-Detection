package B3;

import L5.x;
import M5.Q;
import com.stripe.android.model.a;
import com.stripe.android.paymentsheet.u;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class h {
    public static final com.stripe.android.model.a a(u.a aVar) {
        AbstractC3159y.i(aVar, "<this>");
        String e8 = aVar.e();
        String f8 = aVar.f();
        return new com.stripe.android.model.a(aVar.b(), aVar.c(), e8, f8, aVar.i(), aVar.j());
    }

    public static final Map b(com.stripe.android.model.a aVar) {
        AbstractC3159y.i(aVar, "<this>");
        G.b bVar = G.Companion;
        return Q.k(x.a(bVar.p(), aVar.e()), x.a(bVar.q(), aVar.f()), x.a(bVar.k(), aVar.b()), x.a(bVar.z(), aVar.j()), x.a(bVar.l(), aVar.c()), x.a(bVar.u(), aVar.i()));
    }

    public static final AbstractC3991f.a c(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                return AbstractC3991f.a.f39764b;
            }
            return AbstractC3991f.a.f39765c;
        }
        return AbstractC3991f.a.f39766d;
    }

    public static final com.stripe.android.model.a d(a.b bVar, Map formFieldValues) {
        AbstractC3159y.i(bVar, "<this>");
        AbstractC3159y.i(formFieldValues, "formFieldValues");
        G.b bVar2 = G.Companion;
        String str = (String) formFieldValues.get(bVar2.p());
        String str2 = (String) formFieldValues.get(bVar2.q());
        return new com.stripe.android.model.a((String) formFieldValues.get(bVar2.k()), (String) formFieldValues.get(bVar2.l()), str, str2, (String) formFieldValues.get(bVar2.u()), (String) formFieldValues.get(bVar2.z()));
    }
}
