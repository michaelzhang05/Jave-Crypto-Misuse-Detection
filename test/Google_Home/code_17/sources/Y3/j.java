package Y3;

import N1.m;
import N1.w;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class j {
    public final N1.n a(String payload, String str) {
        AbstractC3255y.i(payload, "payload");
        return new N1.n(new m.a(N1.i.f7533f, N1.d.f7508e).m(str).d(), new w(payload));
    }

    public final String b(String payload, RSAPublicKey publicKey, String str) {
        AbstractC3255y.i(payload, "payload");
        AbstractC3255y.i(publicKey, "publicKey");
        N1.n a8 = a(payload, str);
        a8.g(new O1.e(publicKey));
        String t8 = a8.t();
        AbstractC3255y.h(t8, "serialize(...)");
        return t8;
    }
}
