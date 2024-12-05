package a4;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f13918h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f13919a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13920b;

    /* renamed from: c, reason: collision with root package name */
    private final PublicKey f13921c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13922d;

    /* renamed from: e, reason: collision with root package name */
    private final q f13923e;

    /* renamed from: f, reason: collision with root package name */
    private final KeyPair f13924f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13925g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public r(d areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        AbstractC3255y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3255y.i(directoryServerId, "directoryServerId");
        AbstractC3255y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f13919a = areqParamsFactory;
        this.f13920b = directoryServerId;
        this.f13921c = directoryServerPublicKey;
        this.f13922d = str;
        this.f13923e = sdkTransactionId;
        this.f13924f = sdkKeyPair;
        this.f13925g = sdkReferenceNumber;
    }

    @Override // a4.s
    public Object a(S5.d dVar) {
        d dVar2 = this.f13919a;
        String str = this.f13920b;
        PublicKey publicKey = this.f13921c;
        String str2 = this.f13922d;
        q c8 = c();
        PublicKey publicKey2 = this.f13924f.getPublic();
        AbstractC3255y.h(publicKey2, "getPublic(...)");
        return dVar2.a(str, publicKey, str2, c8, publicKey2, dVar);
    }

    @Override // a4.s
    public m b(e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3255y.i(challengeParameters, "challengeParameters");
        AbstractC3255y.i(intentData, "intentData");
        return new m(this.f13925g, this.f13924f, challengeParameters, g6.m.d(i8, 5), intentData);
    }

    public q c() {
        return this.f13923e;
    }
}
