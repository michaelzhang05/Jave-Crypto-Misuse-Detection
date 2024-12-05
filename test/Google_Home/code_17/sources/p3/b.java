package P3;

import P5.AbstractC1378t;
import a6.InterfaceC1670p;
import com.stripe.android.paymentsheet.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import y4.g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f8779a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f8780b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f8781c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f8782d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f8783e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8784f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f8785g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1670p {
        a() {
            super(4);
        }

        public final List a(L3.a aVar, Boolean bool, boolean z8, boolean z9) {
            List m8;
            b bVar = b.this;
            if (aVar == null || (m8 = aVar.h()) == null) {
                m8 = AbstractC1378t.m();
            }
            List b8 = bVar.b(m8, bool, z8, z9);
            if (b8 == null) {
                return AbstractC1378t.m();
            }
            return b8;
        }

        @Override // a6.InterfaceC1670p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((L3.a) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    public b(InterfaceC3698L customerState, InterfaceC3698L isGooglePayReady, InterfaceC3698L isLinkEnabled, InterfaceC3698L canRemovePaymentMethods, Function1 nameProvider, boolean z8, Function0 isCbcEligible) {
        AbstractC3255y.i(customerState, "customerState");
        AbstractC3255y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3255y.i(isLinkEnabled, "isLinkEnabled");
        AbstractC3255y.i(canRemovePaymentMethods, "canRemovePaymentMethods");
        AbstractC3255y.i(nameProvider, "nameProvider");
        AbstractC3255y.i(isCbcEligible, "isCbcEligible");
        this.f8779a = customerState;
        this.f8780b = isGooglePayReady;
        this.f8781c = isLinkEnabled;
        this.f8782d = canRemovePaymentMethods;
        this.f8783e = nameProvider;
        this.f8784f = z8;
        this.f8785g = isCbcEligible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(List list, Boolean bool, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        if (bool == null) {
            return null;
        }
        r rVar = r.f27402a;
        if (z8 && this.f8784f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bool.booleanValue() && this.f8784f) {
            z11 = true;
        } else {
            z11 = false;
        }
        return rVar.b(list, z10, z11, this.f8783e, z9, ((Boolean) this.f8785g.invoke()).booleanValue());
    }

    public final InterfaceC3698L c() {
        return g.f(this.f8779a, this.f8781c, this.f8780b, this.f8782d, new a());
    }
}
