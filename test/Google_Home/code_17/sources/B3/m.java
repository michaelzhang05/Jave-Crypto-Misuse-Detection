package B3;

import O5.s;
import O5.t;
import P5.AbstractC1378t;
import P5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(n nVar) {
        return AbstractC1378t.d0(a0.i(StripeIntent.Status.f25204c, StripeIntent.Status.f25209h, StripeIntent.Status.f25210i), nVar.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(u uVar) {
        return AbstractC1378t.d0(a0.i(StripeIntent.Status.f25204c, StripeIntent.Status.f25209h), uVar.getStatus());
    }

    public static final L3.j e(StripeIntent stripeIntent) {
        Object b8;
        AbstractC3255y.i(stripeIntent, "<this>");
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(l.f881a.a(stripeIntent));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            return L3.k.a(e8);
        }
        return null;
    }
}
