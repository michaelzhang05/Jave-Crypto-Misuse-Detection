package P7;

import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f8901a;

    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            this.f8901a = new JSONObject(jsonString);
            return new M7.d(b());
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new M7.d(null, 1);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f8901a;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
            jSONObject = null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("disclosures");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONObject disclosure = jSONArray.getJSONObject(i8);
            String optString = disclosure.optString("identifier");
            String a8 = d.a(optString, "disclosure.optString(\"identifier\")", disclosure, "type", "disclosure.optString(\"type\")");
            int optInt = disclosure.optInt("maxAgeSeconds");
            String optString2 = disclosure.optString("domain");
            AbstractC3255y.h(optString2, "disclosure.optString(\"domain\")");
            AbstractC3255y.h(disclosure, "disclosure");
            arrayList.add(new M7.f(optString, a8, optInt, optString2, i.a(disclosure, "purposes")));
            i8 = i9;
        }
        return arrayList;
    }
}
