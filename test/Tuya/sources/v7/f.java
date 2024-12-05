package v7;

import R6.AbstractC1351s;
import h7.InterfaceC2764a;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import k7.C3135c;
import m7.C3446f;
import m7.C3447g;

/* loaded from: classes5.dex */
public class f extends KeyFactorySpi implements InterfaceC2764a {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                W6.b p8 = W6.b.p(AbstractC1351s.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (k7.e.f33690m.r(p8.q().m())) {
                        C3135c q8 = C3135c.q(p8.t());
                        return new c(new C3446f(q8.s(), q8.r(), q8.m(), q8.p(), q8.t(), q8.u(), q8.v()));
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
                X6.b p8 = X6.b.p(AbstractC1351s.s(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (k7.e.f33690m.r(p8.m().m())) {
                        k7.d p9 = k7.d.p(p8.r());
                        return new d(new C3447g(p9.q(), p9.r(), p9.m()));
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
