package V3;

import java.io.Serializable;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface k extends Serializable {
    JSONObject G(String str, SecretKey secretKey);

    String V(JSONObject jSONObject, SecretKey secretKey);
}
