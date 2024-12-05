package P7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f8902a;

    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f8902a = jSONObject;
            return new J5.c(jSONObject.optString("language"), a(), b());
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new J5.c(null, null, null, 7);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f8902a;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
            jSONObject = null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("purposes");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                Integer valueOf = Integer.valueOf(jSONObject2.optInt("id"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("banner");
                AbstractC3255y.h(jSONObject3, "gbcPurpose.getJSONObject(\"banner\")");
                String optString = jSONObject3.optString(CampaignEx.JSON_KEY_TITLE);
                AbstractC3255y.h(optString, "jsonObject.optString(\"title\")");
                arrayList.add(new J5.b(valueOf, new J5.a(optString, null, null, null, 14)));
                i8 = i9;
            }
        }
        return arrayList;
    }

    public final J5.a a() {
        JSONObject jSONObject = this.f8902a;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("banner");
        String optString = jSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
        String a8 = d.a(optString, "bannerDetails.optString(\"title\")", jSONObject2, "sectionTitle", "bannerDetails.optString(\"sectionTitle\")");
        String optString2 = jSONObject2.optString("description");
        return new J5.a(optString, a8, optString2, d.a(optString2, "bannerDetails.optString(\"description\")", jSONObject2, "confirm", "bannerDetails.optString(\"confirm\")"));
    }
}
