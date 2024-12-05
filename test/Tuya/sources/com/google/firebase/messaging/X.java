package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class X {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f17388a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f17389d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f17390a;

        /* renamed from: b, reason: collision with root package name */
        final String f17391b;

        /* renamed from: c, reason: collision with root package name */
        final long f17392c;

        private a(String str, String str2, long j8) {
            this.f17390a = str;
            this.f17391b = str2;
            this.f17392c = j8;
        }

        static String a(String str, String str2, long j8) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j8);
                return jSONObject.toString();
            } catch (JSONException e8) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e8);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(CampaignEx.JSON_KEY_TIMESTAMP));
                } catch (JSONException e8) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e8);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            if (System.currentTimeMillis() <= this.f17392c + f17389d && str.equals(this.f17391b)) {
                return false;
            }
            return true;
        }
    }

    public X(Context context) {
        this.f17388a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !e()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                c();
            }
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e8.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f17388a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f17388a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f17388a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a8 = a.a(str3, str4, System.currentTimeMillis());
        if (a8 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f17388a.edit();
        edit.putString(b(str, str2), a8);
        edit.commit();
    }
}
