package O3;

import B3.f;
import C3.c;
import P5.AbstractC1378t;
import androidx.lifecycle.ViewModelKt;
import b3.C1970d;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import t3.C4028b;
import t3.C4037k;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f8220a = new u();

    private u() {
    }

    public final List a(P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder) {
        f.e eVar;
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(customerStateHolder, "customerStateHolder");
        List h02 = paymentMethodMetadata.h0();
        if (h02.size() == 1 && ((List) customerStateHolder.c().getValue()).isEmpty()) {
            return AbstractC1378t.e(new c.l(d.f7996l.a((String) AbstractC1378t.m0(h02), viewModel, paymentMethodMetadata, customerStateHolder), true));
        }
        List c8 = AbstractC1378t.c();
        c8.add(new c.k(c.f7941A.a(viewModel, paymentMethodMetadata, customerStateHolder)));
        Object value = viewModel.y().getValue();
        if (value instanceof f.e) {
            eVar = (f.e) value;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            String u8 = eVar.h().u();
            if (C4037k.f39662g.a(viewModel, t3.m.f39672h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata).d(u8)) {
                c8.add(new c.l(d.f7996l.a(u8, viewModel, paymentMethodMetadata, customerStateHolder), false, 2, null));
            }
        }
        return AbstractC1378t.a(c8);
    }
}
