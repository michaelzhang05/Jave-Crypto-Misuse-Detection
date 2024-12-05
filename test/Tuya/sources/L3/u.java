package L3;

import M5.AbstractC1246t;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3649b;
import q3.C3658k;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6429a = new u();

    private u() {
    }

    public final List a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder) {
        AbstractC3991f.e eVar;
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(customerStateHolder, "customerStateHolder");
        List h02 = paymentMethodMetadata.h0();
        if (h02.size() == 1 && ((List) customerStateHolder.c().getValue()).isEmpty()) {
            return AbstractC1246t.e(new InterfaceC4021c.l(d.f6205l.a((String) AbstractC1246t.m0(h02), viewModel, paymentMethodMetadata, customerStateHolder), true));
        }
        List c8 = AbstractC1246t.c();
        c8.add(new InterfaceC4021c.k(c.f6150A.a(viewModel, paymentMethodMetadata, customerStateHolder)));
        Object value = viewModel.y().getValue();
        if (value instanceof AbstractC3991f.e) {
            eVar = (AbstractC3991f.e) value;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            String o8 = eVar.f().o();
            if (C3658k.f37340g.a(viewModel, q3.m.f37350h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata).d(o8)) {
                c8.add(new InterfaceC4021c.l(d.f6205l.a(o8, viewModel, paymentMethodMetadata, customerStateHolder), false, 2, null));
            }
        }
        return AbstractC1246t.a(c8);
    }
}
