package V3;

import L5.s;
import L5.t;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final j f11896a;

    /* renamed from: b, reason: collision with root package name */
    private final h f11897b;

    /* renamed from: c, reason: collision with root package name */
    private final U3.c f11898c;

    private b(j jVar, h hVar, U3.c cVar) {
        this.f11896a = jVar;
        this.f11897b = hVar;
        this.f11898c = cVar;
    }

    @Override // V3.i
    public String a(String payload, PublicKey acsPublicKey, String directoryServerId, String str) {
        Object b8;
        AbstractC3159y.i(payload, "payload");
        AbstractC3159y.i(acsPublicKey, "acsPublicKey");
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            s.a aVar = s.f6511b;
            b8 = s.b(this.f11896a.b(payload, (RSAPublicKey) acsPublicKey, str));
        } else if (acsPublicKey instanceof ECPublicKey) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(this.f11897b.a(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            s.a aVar3 = s.f6511b;
            b8 = s.b(t.a(new R3.b("Unsupported public key algorithm: " + acsPublicKey.getAlgorithm(), null, 2, null)));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f11898c.i(e8);
        }
        t.b(b8);
        return (String) b8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g ephemeralKeyPairGenerator, U3.c errorReporter) {
        this(new j(), new h(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        AbstractC3159y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3159y.i(errorReporter, "errorReporter");
    }
}
