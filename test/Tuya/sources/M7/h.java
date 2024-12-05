package M7;

import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;
import y5.C3998e;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONArray f7079a;

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            this.f7079a = new JSONArray(jsonString);
            return new C3998e(b());
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new C3998e(null, 1);
        }
    }

    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f7079a;
        if (jSONArray == null) {
            AbstractC3159y.y("googleVendorsJson");
            jSONArray = null;
        }
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONArray jSONArray2 = this.f7079a;
            if (jSONArray2 == null) {
                AbstractC3159y.y("googleVendorsJson");
                jSONArray2 = null;
            }
            String string = jSONArray2.getString(i8);
            if (string == null) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            JSONArray jSONArray3 = this.f7079a;
            if (jSONArray3 == null) {
                AbstractC3159y.y("googleVendorsJson");
                jSONArray3 = null;
            }
            JSONObject jSONObject = jSONArray3.getJSONObject(i8);
            String string2 = jSONObject.getString("provider_id");
            AbstractC3159y.h(string2, "googleVendor.getString(\"provider_id\")");
            int parseInt = Integer.parseInt(string2);
            String string3 = jSONObject.getString("provider_name");
            AbstractC3159y.h(string3, "googleVendor.getString(\"provider_name\")");
            String string4 = jSONObject.getString("policy_url");
            AbstractC3159y.h(string4, "googleVendor.getString(\"policy_url\")");
            String string5 = jSONObject.getString("domains");
            AbstractC3159y.h(string5, "googleVendor.getString(\"domains\")");
            linkedHashMap.put(string, new y5.f(parseInt, string3, string4, string5));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
