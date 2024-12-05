package V3;

import K1.m;
import K1.w;
import R1.b;
import a2.C1555a;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f11921a;

    /* renamed from: b, reason: collision with root package name */
    private final d f11922b;

    private h(g gVar, d dVar) {
        this.f11921a = gVar;
        this.f11922b = dVar;
    }

    public final String a(String payload, ECPublicKey acsPublicKey, String directoryServerId) {
        AbstractC3159y.i(payload, "payload");
        AbstractC3159y.i(acsPublicKey, "acsPublicKey");
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        C1555a.e(payload);
        KeyPair a8 = this.f11921a.a();
        d dVar = this.f11922b;
        PrivateKey privateKey = a8.getPrivate();
        AbstractC3159y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey z8 = dVar.z(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        R1.a aVar = R1.a.f8627d;
        PublicKey publicKey = a8.getPublic();
        AbstractC3159y.g(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        K1.n nVar = new K1.n(new m.a(K1.i.f5760l, K1.d.f5729e).i(R1.b.x(new b.a(aVar, (ECPublicKey) publicKey).a().o())).d(), new w(payload));
        nVar.g(new L1.b(z8));
        String t8 = nVar.t();
        AbstractC3159y.h(t8, "serialize(...)");
        return t8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(g ephemeralKeyPairGenerator, U3.c errorReporter) {
        this(ephemeralKeyPairGenerator, new m(errorReporter));
        AbstractC3159y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3159y.i(errorReporter, "errorReporter");
    }
}
