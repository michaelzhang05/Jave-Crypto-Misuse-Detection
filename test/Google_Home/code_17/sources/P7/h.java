package P7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONArray f8903a;

    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            this.f8903a = new JSONArray(jsonString);
            return new B5.e(b());
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new B5.e(null, 1);
        }
    }

    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f8903a;
        if (jSONArray == null) {
            AbstractC3255y.y("googleVendorsJson");
            jSONArray = null;
        }
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONArray jSONArray2 = this.f8903a;
            if (jSONArray2 == null) {
                AbstractC3255y.y("googleVendorsJson");
                jSONArray2 = null;
            }
            String string = jSONArray2.getString(i8);
            if (string == null) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            JSONArray jSONArray3 = this.f8903a;
            if (jSONArray3 == null) {
                AbstractC3255y.y("googleVendorsJson");
                jSONArray3 = null;
            }
            JSONObject jSONObject = jSONArray3.getJSONObject(i8);
            String string2 = jSONObject.getString("provider_id");
            AbstractC3255y.h(string2, "googleVendor.getString(\"provider_id\")");
            int parseInt = Integer.parseInt(string2);
            String string3 = jSONObject.getString("provider_name");
            AbstractC3255y.h(string3, "googleVendor.getString(\"provider_name\")");
            String string4 = jSONObject.getString("policy_url");
            AbstractC3255y.h(string4, "googleVendor.getString(\"policy_url\")");
            String string5 = jSONObject.getString("domains");
            AbstractC3255y.h(string5, "googleVendor.getString(\"domains\")");
            linkedHashMap.put(string, new B5.f(parseInt, string3, string4, string5));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
