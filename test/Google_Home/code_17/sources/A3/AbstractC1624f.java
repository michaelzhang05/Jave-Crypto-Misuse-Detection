package a3;

import O5.p;
import b3.InterfaceC1973g;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: a3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1624f {
    public static final boolean a(String code, InterfaceC1973g paymentMethodSaveConsentBehavior, StripeIntent intent, boolean z8) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC3255y.i(intent, "intent");
        if (!(paymentMethodSaveConsentBehavior instanceof InterfaceC1973g.a)) {
            if (!(paymentMethodSaveConsentBehavior instanceof InterfaceC1973g.b)) {
                if (paymentMethodSaveConsentBehavior instanceof InterfaceC1973g.c) {
                    if (intent instanceof n) {
                        if (!((n) intent).u(code)) {
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
