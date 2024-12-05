package M3;

import M5.AbstractC1246t;
import X5.p;
import com.stripe.android.paymentsheet.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import v4.g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f6955a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f6956b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f6957c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f6958d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f6959e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6960f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f6961g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements p {
        a() {
            super(4);
        }

        public final List a(I3.a aVar, Boolean bool, boolean z8, boolean z9) {
            List m8;
            b bVar = b.this;
            if (aVar == null || (m8 = aVar.f()) == null) {
                m8 = AbstractC1246t.m();
            }
            List b8 = bVar.b(m8, bool, z8, z9);
            if (b8 == null) {
                return AbstractC1246t.m();
            }
            return b8;
        }

        @Override // X5.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((I3.a) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    public b(InterfaceC3349K customerState, InterfaceC3349K isGooglePayReady, InterfaceC3349K isLinkEnabled, InterfaceC3349K canRemovePaymentMethods, Function1 nameProvider, boolean z8, Function0 isCbcEligible) {
        AbstractC3159y.i(customerState, "customerState");
        AbstractC3159y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3159y.i(isLinkEnabled, "isLinkEnabled");
        AbstractC3159y.i(canRemovePaymentMethods, "canRemovePaymentMethods");
        AbstractC3159y.i(nameProvider, "nameProvider");
        AbstractC3159y.i(isCbcEligible, "isCbcEligible");
        this.f6955a = customerState;
        this.f6956b = isGooglePayReady;
        this.f6957c = isLinkEnabled;
        this.f6958d = canRemovePaymentMethods;
        this.f6959e = nameProvider;
        this.f6960f = z8;
        this.f6961g = isCbcEligible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(List list, Boolean bool, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        if (bool == null) {
            return null;
        }
        r rVar = r.f26347a;
        if (z8 && this.f6960f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bool.booleanValue() && this.f6960f) {
            z11 = true;
        } else {
            z11 = false;
        }
        return rVar.b(list, z10, z11, this.f6959e, z9, ((Boolean) this.f6961g.invoke()).booleanValue());
    }

    public final InterfaceC3349K c() {
        return g.f(this.f6955a, this.f6957c, this.f6956b, this.f6958d, new a());
    }
}
