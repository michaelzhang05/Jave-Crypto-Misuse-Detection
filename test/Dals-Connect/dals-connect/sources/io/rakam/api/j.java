package io.rakam.api;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public class j {
    private static h a = h.d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e2) {
            a.b("io.rakam.api.Utils", e2.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = jSONArray.optString(i2);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e3) {
            a.b("io.rakam.api.Utils", e3.toString());
            return null;
        }
    }

    static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences("io.rakam.api." + str + "." + context.getPackageName(), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Context context, String str, String str2) {
        return b(context, str).getString(str2, null);
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str) {
        if (d(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = b(context, str).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
