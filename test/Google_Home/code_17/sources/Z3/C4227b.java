package z3;

import b3.C1970d;
import f4.InterfaceC2835a;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4227b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4227b f41130a = new C4227b();

    private C4227b() {
    }

    public final D3.a a(String paymentMethodCode, E2.a configuration, String merchantName, InterfaceC2835a cbcEligibility) {
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        return new D3.a(paymentMethodCode, cbcEligibility, merchantName, null, configuration.h(), null, configuration.g(), 40, null);
    }

    public final D3.a b(String paymentMethodCode, C1970d metadata) {
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3255y.i(metadata, "metadata");
        return new D3.a(paymentMethodCode, metadata.w(), metadata.J(), metadata.h(), metadata.x(), metadata.q(), metadata.v());
    }
}
