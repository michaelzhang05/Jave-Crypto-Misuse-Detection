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
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f8904a;

    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f8904a = jSONObject;
            return new F6.a(jSONObject.optString("jurisdiction"), null, b(), null, 10);
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new F6.a(null, null, null, null, 15);
        }
    }

    public final List b() {
        J5.a aVar;
        JSONArray jSONArray;
        JSONObject jSONObject = this.f8904a;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
            jSONObject = null;
        }
        String str = "purposes";
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                Integer valueOf = Integer.valueOf(optJSONObject.optInt("id"));
                Boolean valueOf2 = Boolean.valueOf(optJSONObject.optBoolean("defaultValue"));
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("consentBanner");
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    aVar = new J5.a(null, null, null, null, 15);
                } else {
                    String optString = optJSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
                    jSONArray = optJSONArray;
                    aVar = new J5.a(optString, null, d.a(optString, "it.optString(\"title\")", optJSONObject2, "description", "it.optString(\"description\")"), null, 10);
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray(str);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = i10 + 1;
                        JSONObject mspaSensitivePurpose = optJSONArray2.optJSONObject(i10);
                        Integer valueOf3 = Integer.valueOf(mspaSensitivePurpose.optInt("id"));
                        Integer valueOf4 = Integer.valueOf(mspaSensitivePurpose.optInt("order"));
                        String optString2 = mspaSensitivePurpose.optString(CampaignEx.JSON_KEY_TITLE);
                        String optString3 = mspaSensitivePurpose.optString("description");
                        AbstractC3255y.h(mspaSensitivePurpose, "mspaSensitivePurpose");
                        arrayList2.add(new F6.f(valueOf3, valueOf4, optString2, null, optString3, i.a(mspaSensitivePurpose, "nationalIds"), 8));
                        i10 = i11;
                        optJSONArray2 = optJSONArray2;
                        str = str;
                    }
                }
                String str2 = str;
                arrayList.add(new F6.e(valueOf, null, valueOf2, null, aVar, arrayList2, null, 74));
                i8 = i9;
                optJSONArray = jSONArray;
                str = str2;
            }
        }
        return arrayList;
    }
}