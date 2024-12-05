package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ FingerprintManager.CryptoObject a(Mac mac) {
        return new FingerprintManager.CryptoObject(mac);
    }
}
