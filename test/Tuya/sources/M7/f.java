package M7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f7078a;

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f7078a = jSONObject;
            return new G5.c(jSONObject.optString("language"), a(), b());
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new G5.c(null, null, null, 7);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f7078a;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
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
                AbstractC3159y.h(jSONObject3, "gbcPurpose.getJSONObject(\"banner\")");
                String optString = jSONObject3.optString(CampaignEx.JSON_KEY_TITLE);
                AbstractC3159y.h(optString, "jsonObject.optString(\"title\")");
                arrayList.add(new G5.b(valueOf, new G5.a(optString, null, null, null, 14)));
                i8 = i9;
            }
        }
        return arrayList;
    }

    public final G5.a a() {
        JSONObject jSONObject = this.f7078a;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("banner");
        String optString = jSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
        String a8 = d.a(optString, "bannerDetails.optString(\"title\")", jSONObject2, "sectionTitle", "bannerDetails.optString(\"sectionTitle\")");
        String optString2 = jSONObject2.optString("description");
        return new G5.a(optString, a8, optString2, d.a(optString2, "bannerDetails.optString(\"description\")", jSONObject2, "confirm", "bannerDetails.optString(\"confirm\")"));
    }
}
