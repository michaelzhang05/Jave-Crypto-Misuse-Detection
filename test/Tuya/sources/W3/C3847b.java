package w3;

import c4.InterfaceC1925a;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3847b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3847b f39007a = new C3847b();

    private C3847b() {
    }

    public final A3.a a(String paymentMethodCode, B2.a configuration, String merchantName, InterfaceC1925a cbcEligibility) {
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        return new A3.a(paymentMethodCode, cbcEligibility, merchantName, null, configuration.f(), null, configuration.e(), 40, null);
    }

    public final A3.a b(String paymentMethodCode, Y2.d metadata) {
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3159y.i(metadata, "metadata");
        return new A3.a(paymentMethodCode, metadata.u(), metadata.Q(), metadata.f(), metadata.z(), metadata.t(), metadata.s());
    }
}
