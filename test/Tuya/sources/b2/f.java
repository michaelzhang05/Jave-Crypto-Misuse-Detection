package B2;

import M5.AbstractC1246t;
import c4.InterfaceC1925a;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f {
    public static final boolean a(boolean z8, List savedPaymentMethods, InterfaceC1925a cbcEligibility) {
        AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        if (z8) {
            if (savedPaymentMethods.isEmpty()) {
                return false;
            }
        } else {
            if (savedPaymentMethods.size() == 1) {
                return b((o) AbstractC1246t.m0(savedPaymentMethods), cbcEligibility);
            }
            if (savedPaymentMethods.size() <= 1) {
                return false;
            }
        }
        return true;
    }

    private static final boolean b(o oVar, InterfaceC1925a interfaceC1925a) {
        boolean z8;
        o.g.c cVar;
        Set b8;
        o.g gVar = oVar.f24415h;
        if (gVar != null && (cVar = gVar.f24485k) != null && (b8 = cVar.b()) != null && b8.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!(interfaceC1925a instanceof InterfaceC1925a.b) || !z8) {
            return false;
        }
        return true;
    }
}
