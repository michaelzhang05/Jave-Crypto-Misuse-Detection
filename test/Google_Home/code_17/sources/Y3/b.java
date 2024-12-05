package Y3;

import O5.s;
import O5.t;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final j f13534a;

    /* renamed from: b, reason: collision with root package name */
    private final h f13535b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.c f13536c;

    private b(j jVar, h hVar, X3.c cVar) {
        this.f13534a = jVar;
        this.f13535b = hVar;
        this.f13536c = cVar;
    }

    @Override // Y3.i
    public String a(String payload, PublicKey acsPublicKey, String directoryServerId, String str) {
        Object b8;
        AbstractC3255y.i(payload, "payload");
        AbstractC3255y.i(acsPublicKey, "acsPublicKey");
        AbstractC3255y.i(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            s.a aVar = s.f8302b;
            b8 = s.b(this.f13534a.b(payload, (RSAPublicKey) acsPublicKey, str));
        } else if (acsPublicKey instanceof ECPublicKey) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(this.f13535b.a(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            s.a aVar3 = s.f8302b;
            b8 = s.b(t.a(new U3.b("Unsupported public key algorithm: " + acsPublicKey.getAlgorithm(), null, 2, null)));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f13536c.l(e8);
        }
        t.b(b8);
        return (String) b8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g ephemeralKeyPairGenerator, X3.c errorReporter) {
        this(new j(), new h(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        AbstractC3255y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3255y.i(errorReporter, "errorReporter");
    }
}
