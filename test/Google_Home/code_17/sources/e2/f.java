package E2;

import P5.AbstractC1378t;
import com.stripe.android.model.o;
import f4.InterfaceC2835a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class f {
    public static final boolean a(boolean z8, List savedPaymentMethods, InterfaceC2835a cbcEligibility) {
        AbstractC3255y.i(savedPaymentMethods, "savedPaymentMethods");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        if (z8) {
            if (savedPaymentMethods.isEmpty()) {
                return false;
            }
        } else {
            if (savedPaymentMethods.size() == 1) {
                return b((o) AbstractC1378t.m0(savedPaymentMethods), cbcEligibility);
            }
            if (savedPaymentMethods.size() <= 1) {
                return false;
            }
        }
        return true;
    }

    private static final boolean b(o oVar, InterfaceC2835a interfaceC2835a) {
        boolean z8;
        o.g.c cVar;
        Set a8;
        o.g gVar = oVar.f25470h;
        if (gVar != null && (cVar = gVar.f25540k) != null && (a8 = cVar.a()) != null && a8.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!(interfaceC2835a instanceof InterfaceC2835a.b) || !z8) {
            return false;
        }
        return true;
    }
}
