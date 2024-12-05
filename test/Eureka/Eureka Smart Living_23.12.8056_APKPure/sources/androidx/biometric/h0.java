package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h0 {
    public static /* synthetic */ BiometricPrompt.CryptoObject a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }
}
