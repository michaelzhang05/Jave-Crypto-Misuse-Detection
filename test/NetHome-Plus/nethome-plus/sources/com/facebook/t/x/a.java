package com.facebook.t.x;

import android.util.Patterns;
import cm.aptoide.pt.root.execution.Command;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureExtractor.java */
/* loaded from: classes.dex */
final class a {
    private static Map<String, String> a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, String> f9677b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, String> f9678c = null;

    /* renamed from: d, reason: collision with root package name */
    private static JSONObject f9679d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f9680e = false;

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        JSONObject b2;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            if (!f9680e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                lowerCase = str.toLowerCase();
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                optString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                j(jSONObject2, jSONArray);
                m(fArr, i(jSONObject2));
                b2 = b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (b2 == null) {
                return null;
            }
            m(fArr, h(b2, jSONArray, optString, jSONObject2.toString(), lowerCase));
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject b2 = b(optJSONArray.getJSONObject(i2));
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str, String str2, String str3) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(File file) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            try {
                f9679d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f9679d = new JSONObject(new String(bArr, "UTF-8"));
                HashMap hashMap = new HashMap();
                a = hashMap;
                hashMap.put("ENGLISH", "1");
                a.put("GERMAN", "2");
                a.put("SPANISH", "3");
                a.put("JAPANESE", "4");
                HashMap hashMap2 = new HashMap();
                f9677b = hashMap2;
                hashMap2.put("VIEW_CONTENT", "0");
                f9677b.put("SEARCH", "1");
                f9677b.put("ADD_TO_CART", "2");
                f9677b.put("ADD_TO_WISHLIST", "3");
                f9677b.put("INITIATE_CHECKOUT", "4");
                f9677b.put("ADD_PAYMENT_INFO", "5");
                f9677b.put("PURCHASE", "6");
                f9677b.put("LEAD", "7");
                f9677b.put("COMPLETE_REGISTRATION", "8");
                HashMap hashMap3 = new HashMap();
                f9678c = hashMap3;
                hashMap3.put("BUTTON_TEXT", "1");
                f9678c.put("PAGE_TITLE", "2");
                f9678c.put("RESOLVED_DOCUMENT_LINK", "3");
                f9678c.put("BUTTON_ID", "4");
                f9680e = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static boolean e(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return (jSONObject.optInt("classtypebitmask") & 32) > 0;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return f9680e;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    private static boolean g(String[] strArr, String[] strArr2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    private static float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            fArr[3] = jSONArray.length() > 1 ? r11 - 1 : 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    if (e(jSONArray.getJSONObject(i2))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    private static float[] i(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString(Command.CommandHandler.TEXT).toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                double d2 = fArr[0];
                Double.isNaN(d2);
                fArr[0] = (float) (d2 + 1.0d);
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                double d3 = fArr[1];
                Double.isNaN(d3);
                fArr[1] = (float) (d3 + 1.0d);
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                double d4 = fArr[2];
                Double.isNaN(d4);
                fArr[2] = (float) (d4 + 1.0d);
            }
            if (g(new String[]{"search"}, strArr)) {
                double d5 = fArr[4];
                Double.isNaN(d5);
                fArr[4] = (float) (d5 + 1.0d);
            }
            if (optInt >= 0) {
                double d6 = fArr[5];
                Double.isNaN(d6);
                fArr[5] = (float) (d6 + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                double d7 = fArr[6];
                Double.isNaN(d7);
                fArr[6] = (float) (d7 + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                double d8 = fArr[7];
                Double.isNaN(d8);
                fArr[7] = (float) (d8 + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                double d9 = fArr[8];
                Double.isNaN(d9);
                fArr[8] = (float) (d9 + 1.0d);
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                double d10 = fArr[10];
                Double.isNaN(d10);
                fArr[10] = (float) (d10 + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                double d11 = fArr[12];
                Double.isNaN(d11);
                fArr[12] = (float) (d11 + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    m(fArr, i(optJSONArray.getJSONObject(i2)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    private static boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i2 = 0;
            while (true) {
                if (i2 >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                }
                if (optJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                }
                i2++;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    jSONArray.put(optJSONArray.getJSONObject(i3));
                }
            } else {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    if (j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    private static boolean k(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    private static boolean l(String str, String str2, String str3, String str4) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return k(f9679d.optJSONObject("rulesForLanguage").optJSONObject(a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f9677b.get(str2)).optJSONObject("positiveRules").optString(f9678c.get(str3)), str4);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    private static void m(float[] fArr, float[] fArr2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            try {
                fArr[i2] = fArr[i2] + fArr2[i2];
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, a.class);
                return;
            }
        }
    }

    private static void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString(Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase();
            if (!lowerCase.isEmpty()) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (!lowerCase2.isEmpty()) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    n(optJSONArray.getJSONObject(i2), sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }
}
