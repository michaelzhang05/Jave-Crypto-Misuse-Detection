package V3;

import L5.s;
import L5.t;
import O1.p;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class m implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final a f11925b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f11926a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public m(U3.c errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f11926a = errorReporter;
    }

    @Override // V3.d
    public SecretKey z(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object b8;
        AbstractC3159y.i(acsPublicKey, "acsPublicKey");
        AbstractC3159y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3159y.i(agreementInfo, "agreementInfo");
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(new O1.k("SHA-256").j(p.a(acsPublicKey, sdkPrivateKey, null), 256, O1.k.o(null), O1.k.k(null), O1.k.k(Z1.c.d(agreementInfo)), O1.k.m(256), O1.k.n()));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f11926a.i(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3159y.h(b8, "getOrElse(...)");
            return (SecretKey) b8;
        }
        throw new R3.b(e9);
    }
}
