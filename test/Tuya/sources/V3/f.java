package V3;

import L5.s;
import L5.t;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f11919a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyFactory f11920b;

    public f(U3.c errorReporter) {
        Object b8;
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f11919a = errorReporter;
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(KeyFactory.getInstance("EC"));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f11919a.i(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3159y.h(b8, "getOrElse(...)");
            this.f11920b = (KeyFactory) b8;
            return;
        }
        throw new R3.b(e9);
    }

    public final ECPrivateKey a(byte[] privateKeyEncoded) {
        Object b8;
        AbstractC3159y.i(privateKeyEncoded, "privateKeyEncoded");
        try {
            s.a aVar = s.f6511b;
            PrivateKey generatePrivate = this.f11920b.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            AbstractC3159y.g(generatePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            b8 = s.b((ECPrivateKey) generatePrivate);
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 == null) {
            return (ECPrivateKey) b8;
        }
        throw new R3.b(e8);
    }

    public final ECPublicKey b(byte[] publicKeyEncoded) {
        Object b8;
        AbstractC3159y.i(publicKeyEncoded, "publicKeyEncoded");
        try {
            s.a aVar = s.f6511b;
            PublicKey generatePublic = this.f11920b.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            AbstractC3159y.g(generatePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            b8 = s.b((ECPublicKey) generatePublic);
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f11919a.i(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            return (ECPublicKey) b8;
        }
        throw new R3.b(e9);
    }
}
