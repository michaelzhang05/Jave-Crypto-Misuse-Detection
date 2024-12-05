package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g0 {
    public static /* synthetic */ BiometricPrompt.CryptoObject a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
