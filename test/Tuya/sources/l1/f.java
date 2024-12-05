package L1;

import K1.q;
import K1.s;
import O1.m;
import O1.y;
import O1.z;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class f extends z implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f6049d;

    /* renamed from: e, reason: collision with root package name */
    private final RSAPublicKey f6050e;

    public f(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // K1.s
    public boolean d(q qVar, byte[] bArr, Z1.c cVar) {
        if (!this.f6049d.d(qVar)) {
            return false;
        }
        Signature a8 = y.a(qVar.t(), e().a());
        try {
            a8.initVerify(this.f6050e);
            try {
                a8.update(bArr);
                return a8.verify(cVar.a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e8) {
            throw new K1.f("Invalid public RSA key: " + e8.getMessage(), e8);
        }
    }

    public f(RSAPublicKey rSAPublicKey, Set set) {
        m mVar = new m();
        this.f6049d = mVar;
        if (rSAPublicKey != null) {
            this.f6050e = rSAPublicKey;
            mVar.e(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
