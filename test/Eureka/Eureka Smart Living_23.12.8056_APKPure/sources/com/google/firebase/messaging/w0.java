package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f6001a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f6002d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f6003a;

        /* renamed from: b, reason: collision with root package name */
        final String f6004b;

        /* renamed from: c, reason: collision with root package name */
        final long f6005c;

        private a(String str, String str2, long j6) {
            this.f6003a = str;
            this.f6004b = str2;
            this.f6005c = j6;
        }

        static String a(String str, String str2, long j6) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j6);
                return jSONObject.toString();
            } catch (JSONException e6) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e6);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e6) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e6);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f6005c + f6002d || !str.equals(this.f6004b);
        }
    }

    public w0(Context context) {
        this.f6001a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e6) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f6001a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b6 = b(str, str2);
        SharedPreferences.Editor edit = this.f6001a.edit();
        edit.remove(b6);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f6001a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f6001a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a6 = a.a(str3, str4, System.currentTimeMillis());
        if (a6 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f6001a.edit();
        edit.putString(b(str, str2), a6);
        edit.commit();
    }
}
