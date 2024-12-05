package Y3;

import O5.s;
import O5.t;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f13557a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyFactory f13558b;

    public f(X3.c errorReporter) {
        Object b8;
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13557a = errorReporter;
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(KeyFactory.getInstance("EC"));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f13557a.l(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3255y.h(b8, "getOrElse(...)");
            this.f13558b = (KeyFactory) b8;
            return;
        }
        throw new U3.b(e9);
    }

    public final ECPrivateKey a(byte[] privateKeyEncoded) {
        Object b8;
        AbstractC3255y.i(privateKeyEncoded, "privateKeyEncoded");
        try {
            s.a aVar = s.f8302b;
            PrivateKey generatePrivate = this.f13558b.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            AbstractC3255y.g(generatePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            b8 = s.b((ECPrivateKey) generatePrivate);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 == null) {
            return (ECPrivateKey) b8;
        }
        throw new U3.b(e8);
    }

    public final ECPublicKey b(byte[] publicKeyEncoded) {
        Object b8;
        AbstractC3255y.i(publicKeyEncoded, "publicKeyEncoded");
        try {
            s.a aVar = s.f8302b;
            PublicKey generatePublic = this.f13558b.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            AbstractC3255y.g(generatePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            b8 = s.b((ECPublicKey) generatePublic);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f13557a.l(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            return (ECPublicKey) b8;
        }
        throw new U3.b(e9);
    }
}
