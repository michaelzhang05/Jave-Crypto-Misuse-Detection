package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.b0;
import androidx.biometric.c0;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final KeyGenParameterSpec f3672a = a("_androidx_security_master_key_");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3673b = new Object();

    private static KeyGenParameterSpec a(String str) {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec build;
        c0.a();
        blockModes = b0.a(str, 3).setBlockModes("GCM");
        encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
        keySize = encryptionPaddings.setKeySize(256);
        build = keySize.build();
        return build;
    }

    private static void b(KeyGenParameterSpec keyGenParameterSpec) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e6) {
            throw new GeneralSecurityException(e6.getMessage(), e6);
        }
    }

    public static String c(KeyGenParameterSpec keyGenParameterSpec) {
        String keystoreAlias;
        String keystoreAlias2;
        e(keyGenParameterSpec);
        synchronized (f3673b) {
            keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            if (!d(keystoreAlias)) {
                b(keyGenParameterSpec);
            }
        }
        keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
        return keystoreAlias2;
    }

    private static boolean d(String str) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    static void e(KeyGenParameterSpec keyGenParameterSpec) {
        int keySize;
        int keySize2;
        String[] blockModes;
        String[] blockModes2;
        int purposes;
        int purposes2;
        String[] encryptionPaddings;
        String[] encryptionPaddings2;
        boolean isUserAuthenticationRequired;
        int userAuthenticationValidityDurationSeconds;
        keySize = keyGenParameterSpec.getKeySize();
        if (keySize != 256) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid key size, want 256 bits got ");
            keySize2 = keyGenParameterSpec.getKeySize();
            sb.append(keySize2);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString());
        }
        blockModes = keyGenParameterSpec.getBlockModes();
        if (!Arrays.equals(blockModes, new String[]{"GCM"})) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid block mode, want GCM got ");
            blockModes2 = keyGenParameterSpec.getBlockModes();
            sb2.append(Arrays.toString(blockModes2));
            throw new IllegalArgumentException(sb2.toString());
        }
        purposes = keyGenParameterSpec.getPurposes();
        if (purposes != 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            purposes2 = keyGenParameterSpec.getPurposes();
            sb3.append(purposes2);
            throw new IllegalArgumentException(sb3.toString());
        }
        encryptionPaddings = keyGenParameterSpec.getEncryptionPaddings();
        if (!Arrays.equals(encryptionPaddings, new String[]{"NoPadding"})) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("invalid padding mode, want NoPadding got ");
            encryptionPaddings2 = keyGenParameterSpec.getEncryptionPaddings();
            sb4.append(Arrays.toString(encryptionPaddings2));
            throw new IllegalArgumentException(sb4.toString());
        }
        isUserAuthenticationRequired = keyGenParameterSpec.isUserAuthenticationRequired();
        if (isUserAuthenticationRequired) {
            userAuthenticationValidityDurationSeconds = keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
            if (userAuthenticationValidityDurationSeconds < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        }
    }
}
