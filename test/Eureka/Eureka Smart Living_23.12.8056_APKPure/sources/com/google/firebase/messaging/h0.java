package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5912a;

    public h0(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f5912a = new Bundle(bundle);
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    private static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f5912a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v5 = v(str);
            if (this.f5912a.containsKey(v5)) {
                return v5;
            }
        }
        return str;
    }

    private static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p6 = p(str);
        return "1".equals(p6) || Boolean.parseBoolean(p6);
    }

    public Integer b(String str) {
        String p6 = p(str);
        if (TextUtils.isEmpty(p6)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p6));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p6 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String p6 = p(str);
        if (TextUtils.isEmpty(p6)) {
            return null;
        }
        try {
            return new JSONArray(p6);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p6 + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        String str;
        JSONArray c6 = c("gcm.n.light_settings");
        if (c6 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c6.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(c6.optString(0));
            iArr[1] = c6.optInt(1);
            iArr[2] = c6.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e6) {
            str = "LightSettings is invalid: " + c6 + ". " + e6.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + c6 + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public Uri f() {
        String p6 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p6)) {
            p6 = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p6)) {
            return null;
        }
        return Uri.parse(p6);
    }

    public Object[] g(String str) {
        JSONArray c6 = c(str + "_loc_args");
        if (c6 == null) {
            return null;
        }
        int length = c6.length();
        String[] strArr = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            strArr[i6] = c6.optString(i6);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h6 = h(str2);
        if (TextUtils.isEmpty(h6)) {
            return null;
        }
        int identifier = resources.getIdentifier(h6, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g6 = g(str2);
        if (g6 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g6);
        } catch (MissingFormatArgumentException e6) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g6) + " Default value will be used.", e6);
            return null;
        }
    }

    public Long j(String str) {
        String p6 = p(str);
        if (TextUtils.isEmpty(p6)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p6));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p6 + ") into a long");
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer l() {
        Integer b6 = b("gcm.n.notification_count");
        if (b6 == null) {
            return null;
        }
        if (b6.intValue() >= 0) {
            return b6;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b6 + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer m() {
        Integer b6 = b("gcm.n.notification_priority");
        if (b6 == null) {
            return null;
        }
        if (b6.intValue() >= -2 && b6.intValue() <= 2) {
            return b6;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b6 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p6 = p(str2);
        return !TextUtils.isEmpty(p6) ? p6 : i(resources, str, str2);
    }

    public String o() {
        String p6 = p("gcm.n.sound2");
        return TextUtils.isEmpty(p6) ? p("gcm.n.sound") : p6;
    }

    public String p(String str) {
        return this.f5912a.getString(w(str));
    }

    public long[] q() {
        JSONArray c6 = c("gcm.n.vibrate_timings");
        if (c6 == null) {
            return null;
        }
        try {
            if (c6.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = c6.length();
            long[] jArr = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                jArr[i6] = c6.optLong(i6);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c6 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer r() {
        Integer b6 = b("gcm.n.visibility");
        if (b6 == null) {
            return null;
        }
        if (b6.intValue() >= -1 && b6.intValue() <= 1) {
            return b6;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b6 + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f5912a);
        for (String str : this.f5912a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f5912a);
        for (String str : this.f5912a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
