package O3;

import b3.C1970d;
import com.stripe.android.model.o;
import f4.InterfaceC2835a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import t3.C4033g;

/* loaded from: classes4.dex */
public abstract class q {
    public static final C4033g a(com.stripe.android.model.o oVar, Function1 providePaymentMethodName, C1970d c1970d) {
        String str;
        AbstractC3255y.i(oVar, "<this>");
        AbstractC3255y.i(providePaymentMethodName, "providePaymentMethodName");
        o.p pVar = oVar.f25467e;
        InterfaceC2835a interfaceC2835a = null;
        if (pVar != null) {
            str = pVar.f25605a;
        } else {
            str = null;
        }
        B2.b bVar = (B2.b) providePaymentMethodName.invoke(str);
        if (c1970d != null) {
            interfaceC2835a = c1970d.w();
        }
        return new C4033g(bVar, oVar, interfaceC2835a instanceof InterfaceC2835a.b);
    }
}
