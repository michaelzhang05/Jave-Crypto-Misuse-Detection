package L1;

import K1.i;
import K1.j;
import K1.l;
import K1.m;
import O1.A;
import O1.B;
import O1.w;
import O1.x;
import j$.util.DesugarCollections;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class e extends x implements l {

    /* renamed from: f, reason: collision with root package name */
    private final RSAPublicKey f6047f;

    /* renamed from: g, reason: collision with root package name */
    private final SecretKey f6048g;

    public e(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // K1.l
    public j b(m mVar, byte[] bArr) {
        Z1.c e8;
        i t8 = mVar.t();
        K1.d v8 = mVar.v();
        SecretKey secretKey = this.f6048g;
        if (secretKey == null) {
            secretKey = O1.l.d(v8, g().b());
        }
        if (t8.equals(i.f5752d)) {
            e8 = Z1.c.e(w.a(this.f6047f, secretKey, g().e()));
        } else if (t8.equals(i.f5753e)) {
            e8 = Z1.c.e(A.a(this.f6047f, secretKey, g().e()));
        } else if (t8.equals(i.f5754f)) {
            e8 = Z1.c.e(B.a(this.f6047f, secretKey, 256, g().e()));
        } else if (t8.equals(i.f5755g)) {
            e8 = Z1.c.e(B.a(this.f6047f, secretKey, 384, g().e()));
        } else if (t8.equals(i.f5756h)) {
            e8 = Z1.c.e(B.a(this.f6047f, secretKey, 512, g().e()));
        } else {
            throw new K1.f(O1.e.c(t8, x.f7757d));
        }
        return O1.l.c(mVar, bArr, secretKey, e8, g());
    }

    public e(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f6047f = rSAPublicKey;
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && unmodifiableSet.contains(secretKey.getAlgorithm())) {
                    this.f6048g = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f6048g = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
