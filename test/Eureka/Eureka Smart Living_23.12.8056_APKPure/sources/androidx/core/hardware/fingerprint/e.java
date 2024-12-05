package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import java.security.Signature;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ FingerprintManager.CryptoObject a(Signature signature) {
        return new FingerprintManager.CryptoObject(signature);
    }
}
