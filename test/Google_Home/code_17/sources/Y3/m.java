package Y3;

import O5.s;
import O5.t;
import R1.p;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class m implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final a f13563b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f13564a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public m(X3.c errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13564a = errorReporter;
    }

    @Override // Y3.d
    public SecretKey p(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object b8;
        AbstractC3255y.i(acsPublicKey, "acsPublicKey");
        AbstractC3255y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3255y.i(agreementInfo, "agreementInfo");
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(new R1.k("SHA-256").j(p.a(acsPublicKey, sdkPrivateKey, null), 256, R1.k.o(null), R1.k.k(null), R1.k.k(c2.c.d(agreementInfo)), R1.k.m(256), R1.k.n()));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f13564a.l(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3255y.h(b8, "getOrElse(...)");
            return (SecretKey) b8;
        }
        throw new U3.b(e9);
    }
}
