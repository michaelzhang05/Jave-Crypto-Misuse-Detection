package y7;

import U6.AbstractC1460s;
import a7.C1678b;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import k7.InterfaceC3231a;
import n7.C3490c;
import p7.C3789f;
import p7.C3790g;

/* loaded from: classes5.dex */
public class f extends KeyFactorySpi implements InterfaceC3231a {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                Z6.b m8 = Z6.b.m(AbstractC1460s.p(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (n7.e.f35682m.o(m8.n().l())) {
                        C3490c n8 = C3490c.n(m8.q());
                        return new c(new C3789f(n8.p(), n8.o(), n8.l(), n8.m(), n8.q(), n8.r(), n8.t()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e8) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e8);
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C1678b m8 = C1678b.m(AbstractC1460s.p(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (n7.e.f35682m.o(m8.l().l())) {
                        n7.d m9 = n7.d.m(m8.o());
                        return new d(new C3790g(m9.n(), m9.o(), m9.l()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e8) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e8.getMessage());
                }
            } catch (IOException e9) {
                throw new InvalidKeySpecException(e9.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        return null;
    }
}
