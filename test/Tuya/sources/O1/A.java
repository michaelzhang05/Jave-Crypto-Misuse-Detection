package O1;

import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class A {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) {
        try {
            Cipher a8 = i.a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            a8.init(1, rSAPublicKey, new SecureRandom());
            return a8.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e8) {
            throw new K1.f("RSA block size exception: The RSA key is too short, try a longer one", e8);
        } catch (Exception e9) {
            throw new K1.f(e9.getMessage(), e9);
        }
    }
}
