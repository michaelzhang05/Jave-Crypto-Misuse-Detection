package X2;

import L5.p;
import Y2.g;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f {
    public static final boolean a(String code, Y2.g paymentMethodSaveConsentBehavior, StripeIntent intent, boolean z8) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC3159y.i(intent, "intent");
        if (!(paymentMethodSaveConsentBehavior instanceof g.a)) {
            if (!(paymentMethodSaveConsentBehavior instanceof g.b)) {
                if (paymentMethodSaveConsentBehavior instanceof g.c) {
                    if (intent instanceof n) {
                        if (!((n) intent).o(code)) {
                            return z8;
                        }
                    } else if (!(intent instanceof u)) {
                        throw new p();
                    }
                } else {
                    throw new p();
                }
            } else {
                return z8;
            }
        }
        return false;
    }
}
