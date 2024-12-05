package O1;

import N1.i;
import N1.j;
import N1.l;
import N1.m;
import R1.A;
import R1.B;
import R1.w;
import R1.x;
import j$.util.DesugarCollections;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class e extends x implements l {

    /* renamed from: f, reason: collision with root package name */
    private final RSAPublicKey f7838f;

    /* renamed from: g, reason: collision with root package name */
    private final SecretKey f7839g;

    public e(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // N1.l
    public j c(m mVar, byte[] bArr) {
        c2.c e8;
        i t8 = mVar.t();
        N1.d v8 = mVar.v();
        SecretKey secretKey = this.f7839g;
        if (secretKey == null) {
            secretKey = R1.l.d(v8, g().b());
        }
        if (t8.equals(i.f7531d)) {
            e8 = c2.c.e(w.a(this.f7838f, secretKey, g().e()));
        } else if (t8.equals(i.f7532e)) {
            e8 = c2.c.e(A.a(this.f7838f, secretKey, g().e()));
        } else if (t8.equals(i.f7533f)) {
            e8 = c2.c.e(B.a(this.f7838f, secretKey, 256, g().e()));
        } else if (t8.equals(i.f7534g)) {
            e8 = c2.c.e(B.a(this.f7838f, secretKey, 384, g().e()));
        } else if (t8.equals(i.f7535h)) {
            e8 = c2.c.e(B.a(this.f7838f, secretKey, 512, g().e()));
        } else {
            throw new N1.f(R1.e.c(t8, x.f9613d));
        }
        return R1.l.c(mVar, bArr, secretKey, e8, g());
    }

    public e(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f7838f = rSAPublicKey;
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && unmodifiableSet.contains(secretKey.getAlgorithm())) {
                    this.f7839g = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f7839g = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
