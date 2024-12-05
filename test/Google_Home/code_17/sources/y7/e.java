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
import n7.C3488a;
import n7.C3489b;
import p7.C3785b;
import p7.C3786c;

/* loaded from: classes5.dex */
public class e extends KeyFactorySpi implements InterfaceC3231a {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                Z6.b m8 = Z6.b.m(AbstractC1460s.p(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (n7.e.f35683n.o(m8.n().l())) {
                        C3488a o8 = C3488a.o(m8.q());
                        return new a(new C3785b(o8.q(), o8.p(), o8.m(), o8.n(), o8.r(), g.b(o8.l()).e()));
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
                C1678b m8 = C1678b.m(AbstractC1460s.p(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (n7.e.f35683n.o(m8.l().l())) {
                        C3489b n8 = C3489b.n(m8.o());
                        return new b(new C3786c(n8.o(), n8.p(), n8.m(), g.b(n8.l()).e()));
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
