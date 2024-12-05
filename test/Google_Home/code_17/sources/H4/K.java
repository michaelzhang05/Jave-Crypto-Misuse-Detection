package h4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.w0;

/* loaded from: classes4.dex */
public abstract class K implements p4.w0, p4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final AutofillType f32348a;

    public /* synthetic */ K(AbstractC3247p abstractC3247p) {
        this();
    }

    @Override // p4.w0, p4.j0
    public void c(boolean z8, p4.k0 k0Var, Modifier modifier, Set set, p4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // p4.w0
    public InterfaceC3698L f() {
        return w0.a.c(this);
    }

    @Override // p4.w0
    public AutofillType p() {
        return this.f32348a;
    }

    @Override // p4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    public abstract InterfaceC3698L v();

    public abstract boolean w();

    public abstract InterfaceC3698L x();

    public final void y(CardScanSheetResult cardScanSheetResult) {
        AbstractC3255y.i(cardScanSheetResult, "cardScanSheetResult");
    }

    private K() {
        this.f32348a = AutofillType.CreditCardNumber;
    }
}
