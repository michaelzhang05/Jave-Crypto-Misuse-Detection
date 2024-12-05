package V3;

import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public interface d extends Serializable {
    SecretKey z(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, String str);
}
