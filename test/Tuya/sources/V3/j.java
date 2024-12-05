package V3;

import K1.m;
import K1.w;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class j {
    public final K1.n a(String payload, String str) {
        AbstractC3159y.i(payload, "payload");
        return new K1.n(new m.a(K1.i.f5754f, K1.d.f5729e).m(str).d(), new w(payload));
    }

    public final String b(String payload, RSAPublicKey publicKey, String str) {
        AbstractC3159y.i(payload, "payload");
        AbstractC3159y.i(publicKey, "publicKey");
        K1.n a8 = a(payload, str);
        a8.g(new L1.e(publicKey));
        String t8 = a8.t();
        AbstractC3159y.h(t8, "serialize(...)");
        return t8;
    }
}
