package L1;

import K1.p;
import K1.q;
import K1.s;
import O1.m;
import O1.r;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class c extends r implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f6044d;

    /* renamed from: e, reason: collision with root package name */
    private final ECPublicKey f6045e;

    public c(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    @Override // K1.s
    public boolean d(q qVar, byte[] bArr, Z1.c cVar) {
        p t8 = qVar.t();
        if (g().contains(t8)) {
            if (!this.f6044d.d(qVar)) {
                return false;
            }
            byte[] a8 = cVar.a();
            if (O1.q.a(qVar.t()) != a8.length) {
                return false;
            }
            try {
                byte[] e8 = O1.q.e(a8);
                Signature b8 = O1.q.b(t8, e().a());
                try {
                    b8.initVerify(this.f6045e);
                    b8.update(bArr);
                    return b8.verify(e8);
                } catch (InvalidKeyException e9) {
                    throw new K1.f("Invalid EC public key: " + e9.getMessage(), e9);
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (K1.f unused2) {
                return false;
            }
        }
        throw new K1.f(O1.e.d(t8, g()));
    }

    public c(ECPublicKey eCPublicKey, Set set) {
        super(O1.q.d(eCPublicKey));
        m mVar = new m();
        this.f6044d = mVar;
        this.f6045e = eCPublicKey;
        if (P1.b.b(eCPublicKey, ((R1.a) R1.a.b(h()).iterator().next()).f())) {
            mVar.e(set);
            return;
        }
        throw new K1.f("Curve / public key parameters mismatch");
    }
}
