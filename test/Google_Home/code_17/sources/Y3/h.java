package Y3;

import N1.m;
import N1.w;
import U1.b;
import d2.C2735a;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f13559a;

    /* renamed from: b, reason: collision with root package name */
    private final d f13560b;

    private h(g gVar, d dVar) {
        this.f13559a = gVar;
        this.f13560b = dVar;
    }

    public final String a(String payload, ECPublicKey acsPublicKey, String directoryServerId) {
        AbstractC3255y.i(payload, "payload");
        AbstractC3255y.i(acsPublicKey, "acsPublicKey");
        AbstractC3255y.i(directoryServerId, "directoryServerId");
        C2735a.e(payload);
        KeyPair a8 = this.f13559a.a();
        d dVar = this.f13560b;
        PrivateKey privateKey = a8.getPrivate();
        AbstractC3255y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey p8 = dVar.p(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        U1.a aVar = U1.a.f10253d;
        PublicKey publicKey = a8.getPublic();
        AbstractC3255y.g(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        N1.n nVar = new N1.n(new m.a(N1.i.f7539l, N1.d.f7508e).i(U1.b.x(new b.a(aVar, (ECPublicKey) publicKey).a().o())).d(), new w(payload));
        nVar.g(new O1.b(p8));
        String t8 = nVar.t();
        AbstractC3255y.h(t8, "serialize(...)");
        return t8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(g ephemeralKeyPairGenerator, X3.c errorReporter) {
        this(ephemeralKeyPairGenerator, new m(errorReporter));
        AbstractC3255y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3255y.i(errorReporter, "errorReporter");
    }
}
