package Y3;

import java.io.Serializable;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface k extends Serializable {
    JSONObject J(String str, SecretKey secretKey);

    String U(JSONObject jSONObject, SecretKey secretKey);
}
