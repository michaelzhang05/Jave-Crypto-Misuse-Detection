package M7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class i {
    public static final List a(JSONObject jSONObject, String key) {
        AbstractC3159y.i(jSONObject, "<this>");
        AbstractC3159y.i(key, "key");
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(key);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + 1;
                    int optInt = jSONArray.optInt(i8);
                    Integer valueOf = Integer.valueOf(optInt);
                    if (optInt == 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(Integer.valueOf(valueOf.intValue()));
                    }
                    i8 = i9;
                }
                return arrayList;
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final List b(JSONObject jSONObject, String key) {
        AbstractC3159y.i(jSONObject, "<this>");
        AbstractC3159y.i(key, "key");
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(key);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + 1;
                    String item = jSONArray.optString(i8);
                    AbstractC3159y.h(item, "item");
                    if (item.length() <= 0) {
                        item = null;
                    }
                    if (item != null) {
                        arrayList.add(item);
                    }
                    i8 = i9;
                }
                return arrayList;
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }
}
