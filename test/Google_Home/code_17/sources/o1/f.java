package O1;

import N1.q;
import N1.s;
import R1.m;
import R1.y;
import R1.z;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class f extends z implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f7840d;

    /* renamed from: e, reason: collision with root package name */
    private final RSAPublicKey f7841e;

    public f(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // N1.s
    public boolean b(q qVar, byte[] bArr, c2.c cVar) {
        if (!this.f7840d.d(qVar)) {
            return false;
        }
        Signature a8 = y.a(qVar.t(), d().a());
        try {
            a8.initVerify(this.f7841e);
            try {
                a8.update(bArr);
                return a8.verify(cVar.a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e8) {
            throw new N1.f("Invalid public RSA key: " + e8.getMessage(), e8);
        }
    }

    public f(RSAPublicKey rSAPublicKey, Set set) {
        m mVar = new m();
        this.f7840d = mVar;
        if (rSAPublicKey != null) {
            this.f7841e = rSAPublicKey;
            mVar.e(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
