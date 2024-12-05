package P7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class g implements j {
    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("country");
            AbstractC3255y.h(optString, "json.optString(\"country\")");
            String optString2 = jSONObject.optString(TtmlNode.TAG_REGION);
            AbstractC3255y.h(optString2, "json.optString(\"region\")");
            String optString3 = jSONObject.optString("city");
            AbstractC3255y.h(optString3, "json.optString(\"city\")");
            return new M5.b(optString, optString2, optString3);
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new M5.b(null, null, null, 7);
        }
    }
}
