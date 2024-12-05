package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            KeyGenParameterSpec build;
            build = builder.build();
            return build;
        }

        static KeyGenParameterSpec.Builder b(String str, int i6) {
            c0.a();
            return b0.a(str, i6);
        }

        static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        static BiometricPrompt.CryptoObject a(Signature signature) {
            f0.a();
            return h0.a(signature);
        }

        static BiometricPrompt.CryptoObject b(Cipher cipher) {
            f0.a();
            return g0.a(cipher);
        }

        static BiometricPrompt.CryptoObject c(Mac mac) {
            f0.a();
            return e0.a(mac);
        }

        static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            Cipher cipher;
            cipher = cryptoObject.getCipher();
            return cipher;
        }

        static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            Mac mac;
            mac = cryptoObject.getMac();
            return mac;
        }

        static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            Signature signature;
            signature = cryptoObject.getSignature();
            return signature;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            f0.a();
            return l0.a(identityCredential);
        }

        static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            IdentityCredential identityCredential;
            identityCredential = cryptoObject.getIdentityCredential();
            return identityCredential;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b6 = a.b("androidxBiometric", 3);
            a.d(b6);
            a.e(b6);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(b6));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new BiometricPrompt.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e6) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.c b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential b6;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d6 = b.d(cryptoObject);
        if (d6 != null) {
            return new BiometricPrompt.c(d6);
        }
        Signature f6 = b.f(cryptoObject);
        if (f6 != null) {
            return new BiometricPrompt.c(f6);
        }
        Mac e6 = b.e(cryptoObject);
        if (e6 != null) {
            return new BiometricPrompt.c(e6);
        }
        if (Build.VERSION.SDK_INT < 30 || (b6 = c.b(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.c(b6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.c c(a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher a6 = eVar.a();
        if (a6 != null) {
            return new BiometricPrompt.c(a6);
        }
        Signature c6 = eVar.c();
        if (c6 != null) {
            return new BiometricPrompt.c(c6);
        }
        Mac b6 = eVar.b();
        if (b6 != null) {
            return new BiometricPrompt.c(b6);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject d(BiometricPrompt.c cVar) {
        IdentityCredential b6;
        if (cVar == null) {
            return null;
        }
        Cipher a6 = cVar.a();
        if (a6 != null) {
            return b.b(a6);
        }
        Signature d6 = cVar.d();
        if (d6 != null) {
            return b.a(d6);
        }
        Mac c6 = cVar.c();
        if (c6 != null) {
            return b.c(c6);
        }
        if (Build.VERSION.SDK_INT < 30 || (b6 = cVar.b()) == null) {
            return null;
        }
        return c.a(b6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a.e e(BiometricPrompt.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher a6 = cVar.a();
        if (a6 != null) {
            return new a.e(a6);
        }
        Signature d6 = cVar.d();
        if (d6 != null) {
            return new a.e(d6);
        }
        Mac c6 = cVar.c();
        if (c6 != null) {
            return new a.e(c6);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
