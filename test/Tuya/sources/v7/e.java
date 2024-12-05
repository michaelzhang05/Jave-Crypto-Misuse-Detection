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
import k7.C3133a;
import k7.C3134b;
import m7.C3442b;
import m7.C3443c;

/* loaded from: classes5.dex */
public class e extends KeyFactorySpi implements InterfaceC2764a {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                W6.b p8 = W6.b.p(AbstractC1351s.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (k7.e.f33691n.r(p8.q().m())) {
                        C3133a r8 = C3133a.r(p8.t());
                        return new a(new C3442b(r8.t(), r8.s(), r8.p(), r8.q(), r8.u(), g.b(r8.m()).e()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
                    if (k7.e.f33691n.r(p8.m().m())) {
                        C3134b q8 = C3134b.q(p8.r());
                        return new b(new C3443c(q8.r(), q8.s(), q8.p(), g.b(q8.m()).e()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
