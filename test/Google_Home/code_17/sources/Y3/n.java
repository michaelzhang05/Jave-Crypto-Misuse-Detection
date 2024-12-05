package Y3;

import O5.s;
import O5.t;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class n implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final a f13565b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f13566c = Y3.a.f13529b.toString();

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f13567a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public n(X3.c errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13567a = errorReporter;
    }

    @Override // Y3.g
    public KeyPair a() {
        Object b8;
        try {
            s.a aVar = s.f8302b;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f13566c);
            keyPairGenerator.initialize(new ECGenParameterSpec(U1.a.f10253d.d()));
            b8 = s.b(keyPairGenerator.generateKeyPair());
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f13567a.l(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3255y.h(b8, "getOrElse(...)");
            return (KeyPair) b8;
        }
        throw new U3.b(e9);
    }
}
