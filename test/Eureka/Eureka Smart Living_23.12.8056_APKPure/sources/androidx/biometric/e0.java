package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e0 {
    public static /* synthetic */ BiometricPrompt.CryptoObject a(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
