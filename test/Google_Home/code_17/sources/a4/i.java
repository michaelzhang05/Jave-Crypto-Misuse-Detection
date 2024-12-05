package a4;

import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    private final d f13895a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.g f13896b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13897c;

    public i(d areqParamsFactory, Y3.g ephemeralKeyPairGenerator, String sdkReferenceNumber) {
        AbstractC3255y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3255y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f13895a = areqParamsFactory;
        this.f13896b = ephemeralKeyPairGenerator;
        this.f13897c = sdkReferenceNumber;
    }

    @Override // a4.t
    public s a(String directoryServerId, List rootCerts, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, boolean z8, com.stripe.android.stripe3ds2.views.a brand) {
        AbstractC3255y.i(directoryServerId, "directoryServerId");
        AbstractC3255y.i(rootCerts, "rootCerts");
        AbstractC3255y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(brand, "brand");
        return new r(this.f13895a, directoryServerId, directoryServerPublicKey, str, sdkTransactionId, this.f13896b.a(), this.f13897c);
    }
}
