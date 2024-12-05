package O1;

import N1.p;
import N1.q;
import N1.s;
import R1.m;
import R1.r;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class c extends r implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f7835d;

    /* renamed from: e, reason: collision with root package name */
    private final ECPublicKey f7836e;

    public c(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    @Override // N1.s
    public boolean b(q qVar, byte[] bArr, c2.c cVar) {
        p t8 = qVar.t();
        if (g().contains(t8)) {
            if (!this.f7835d.d(qVar)) {
                return false;
            }
            byte[] a8 = cVar.a();
            if (R1.q.a(qVar.t()) != a8.length) {
                return false;
            }
            try {
                byte[] e8 = R1.q.e(a8);
                Signature b8 = R1.q.b(t8, d().a());
                try {
                    b8.initVerify(this.f7836e);
                    b8.update(bArr);
                    return b8.verify(e8);
                } catch (InvalidKeyException e9) {
                    throw new N1.f("Invalid EC public key: " + e9.getMessage(), e9);
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (N1.f unused2) {
                return false;
            }
        }
        throw new N1.f(R1.e.d(t8, g()));
    }

    public c(ECPublicKey eCPublicKey, Set set) {
        super(R1.q.d(eCPublicKey));
        m mVar = new m();
        this.f7835d = mVar;
        this.f7836e = eCPublicKey;
        if (S1.b.b(eCPublicKey, ((U1.a) U1.a.b(h()).iterator().next()).f())) {
            mVar.e(set);
            return;
        }
        throw new N1.f("Curve / public key parameters mismatch");
    }
}
