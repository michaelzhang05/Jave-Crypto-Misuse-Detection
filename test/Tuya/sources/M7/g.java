package M7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class g implements j {
    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("country");
            AbstractC3159y.h(optString, "json.optString(\"country\")");
            String optString2 = jSONObject.optString(TtmlNode.TAG_REGION);
            AbstractC3159y.h(optString2, "json.optString(\"region\")");
            String optString3 = jSONObject.optString("city");
            AbstractC3159y.h(optString3, "json.optString(\"city\")");
            return new J5.b(optString, optString2, optString3);
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new J5.b(null, null, null, 7);
        }
    }
}
