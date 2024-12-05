package a1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    public static String[] a(JSONObject jSONObject, String str, String[] strArr) {
        try {
            JSONArray jSONArray = d(jSONObject, str).getJSONArray(c(str));
            if (jSONArray == null) {
                return strArr;
            }
            int length = jSONArray.length();
            String[] strArr2 = new String[length];
            for (int i6 = 0; i6 < length; i6++) {
                strArr2[i6] = (String) jSONArray.get(i6);
            }
            return strArr2;
        } catch (JSONException unused) {
            return strArr;
        }
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z5) {
        try {
            return d(jSONObject, str).getBoolean(c(str));
        } catch (JSONException unused) {
            return z5;
        }
    }

    private static String c(String str) {
        String[] split = str.split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject, String str) {
        String[] split = str.split("\\.");
        for (int i6 = 0; i6 < split.length - 1; i6++) {
            jSONObject = jSONObject.getJSONObject(split[i6]);
        }
        return jSONObject;
    }

    public static int e(JSONObject jSONObject, String str, int i6) {
        try {
            return d(jSONObject, str).getInt(c(str));
        } catch (JSONException unused) {
            return i6;
        }
    }

    public static JSONObject f(JSONObject jSONObject, String str) {
        try {
            return d(jSONObject, str).getJSONObject(c(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String g(JSONObject jSONObject, String str, String str2) {
        try {
            String string = d(jSONObject, str).getString(c(str));
            return string == null ? str2 : string;
        } catch (JSONException unused) {
            return str2;
        }
    }
}
