package e4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.w0;

/* loaded from: classes4.dex */
public abstract class K implements m4.w0, m4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final AutofillType f30427a;

    public /* synthetic */ K(AbstractC3151p abstractC3151p) {
        this();
    }

    @Override // m4.w0
    public InterfaceC3349K e() {
        return w0.a.c(this);
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, m4.k0 k0Var, Modifier modifier, Set set, m4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f30427a;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    public abstract InterfaceC3349K v();

    public abstract boolean w();

    public abstract InterfaceC3349K x();

    public final void y(CardScanSheetResult cardScanSheetResult) {
        AbstractC3159y.i(cardScanSheetResult, "cardScanSheetResult");
    }

    private K() {
        this.f30427a = AutofillType.CreditCardNumber;
    }
}
