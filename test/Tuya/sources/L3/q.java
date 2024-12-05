package L3;

import c4.InterfaceC1925a;
import com.stripe.android.model.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3654g;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class q {
    public static final C3654g a(com.stripe.android.model.o oVar, Function1 providePaymentMethodName, Y2.d dVar) {
        String str;
        AbstractC3159y.i(oVar, "<this>");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        o.p pVar = oVar.f24412e;
        InterfaceC1925a interfaceC1925a = null;
        if (pVar != null) {
            str = pVar.f24550a;
        } else {
            str = null;
        }
        InterfaceC3983b interfaceC3983b = (InterfaceC3983b) providePaymentMethodName.invoke(str);
        if (dVar != null) {
            interfaceC1925a = dVar.u();
        }
        return new C3654g(interfaceC3983b, oVar, interfaceC1925a instanceof InterfaceC1925a.b);
    }
}
