package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ FingerprintManager.CryptoObject a(Cipher cipher) {
        return new FingerprintManager.CryptoObject(cipher);
    }
}
