package y7;

import R6.AbstractC1351s;
import h7.InterfaceC2764a;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import k7.f;
import k7.g;

/* loaded from: classes5.dex */
public class c extends KeyFactorySpi implements InterfaceC2764a {
    public PrivateKey a(W6.b bVar) {
        f q8 = f.q(bVar.t());
        return new a(q8.r(), q8.m(), q8.s(), q8.p(), q8.u(), q8.t());
    }

    public PublicKey b(X6.b bVar) {
        g s8 = g.s(bVar.r());
        return new b(s8.r(), s8.m(), s8.q(), s8.p());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof C7.a) {
            return new a((C7.a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(W6.b.p(AbstractC1351s.s(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof C7.b) {
            return new b((C7.b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(X6.b.p(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C7.a.class.isAssignableFrom(cls)) {
                a aVar = (a) key;
                return new C7.a(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
            }
        } else if (key instanceof b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (C7.b.class.isAssignableFrom(cls)) {
                b bVar = (b) key;
                return new C7.b(bVar.d(), bVar.a(), bVar.c(), bVar.b());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof a) && !(key instanceof b)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
