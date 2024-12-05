package X3;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12297h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f12298a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12299b;

    /* renamed from: c, reason: collision with root package name */
    private final PublicKey f12300c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12301d;

    /* renamed from: e, reason: collision with root package name */
    private final q f12302e;

    /* renamed from: f, reason: collision with root package name */
    private final KeyPair f12303f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12304g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public r(d areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        AbstractC3159y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        AbstractC3159y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f12298a = areqParamsFactory;
        this.f12299b = directoryServerId;
        this.f12300c = directoryServerPublicKey;
        this.f12301d = str;
        this.f12302e = sdkTransactionId;
        this.f12303f = sdkKeyPair;
        this.f12304g = sdkReferenceNumber;
    }

    @Override // X3.s
    public m a(e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3159y.i(challengeParameters, "challengeParameters");
        AbstractC3159y.i(intentData, "intentData");
        return new m(this.f12304g, this.f12303f, challengeParameters, d6.m.d(i8, 5), intentData);
    }

    @Override // X3.s
    public Object b(P5.d dVar) {
        d dVar2 = this.f12298a;
        String str = this.f12299b;
        PublicKey publicKey = this.f12300c;
        String str2 = this.f12301d;
        q c8 = c();
        PublicKey publicKey2 = this.f12303f.getPublic();
        AbstractC3159y.h(publicKey2, "getPublic(...)");
        return dVar2.a(str, publicKey, str2, c8, publicKey2, dVar);
    }

    public q c() {
        return this.f12302e;
    }
}
