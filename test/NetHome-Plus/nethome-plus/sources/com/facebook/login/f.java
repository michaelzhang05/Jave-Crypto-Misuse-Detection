package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import com.facebook.t.m;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginLogger.java */
/* loaded from: classes.dex */
public class f {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private String f9357b;

    /* renamed from: c, reason: collision with root package name */
    private String f9358c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, String str) {
        PackageInfo packageInfo;
        this.f9357b = str;
        this.a = new m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f9358c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static Bundle i(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("2_result", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("5_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("4_error_code", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("6_extras", HttpUrl.FRAGMENT_ENCODE_SET);
        return bundle;
    }

    public String a() {
        return this.f9357b;
    }

    public void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle i2 = i(str);
        if (str3 != null) {
            i2.putString("2_result", str3);
        }
        if (str4 != null) {
            i2.putString("5_error_message", str4);
        }
        if (str5 != null) {
            i2.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            i2.putString("6_extras", new JSONObject(map).toString());
        }
        i2.putString("3_method", str2);
        this.a.i("fb_mobile_login_method_complete", i2);
    }

    public void c(String str, String str2) {
        Bundle i2 = i(str);
        i2.putString("3_method", str2);
        this.a.i("fb_mobile_login_method_not_tried", i2);
    }

    public void d(String str, String str2) {
        Bundle i2 = i(str);
        i2.putString("3_method", str2);
        this.a.i("fb_mobile_login_method_start", i2);
    }

    public void e(String str, Map<String, String> map, LoginClient.Result.b bVar, Map<String, String> map2, Exception exc) {
        Bundle i2 = i(str);
        if (bVar != null) {
            i2.putString("2_result", bVar.d());
        }
        if (exc != null && exc.getMessage() != null) {
            i2.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = map.isEmpty() ? null : new JSONObject(map);
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            i2.putString("6_extras", jSONObject.toString());
        }
        this.a.i("fb_mobile_login_complete", i2);
    }

    public void f(LoginClient.Request request) {
        Bundle i2 = i(request.b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.g().toString());
            jSONObject.put("request_code", LoginClient.q());
            jSONObject.put("permissions", TextUtils.join(",", request.h()));
            jSONObject.put("default_audience", request.d().toString());
            jSONObject.put("isReauthorize", request.j());
            String str = this.f9358c;
            if (str != null) {
                jSONObject.put("facebookVersion", str);
            }
            i2.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.a.j("fb_mobile_login_start", null, i2);
    }

    public void g(String str, String str2) {
        h(str, str2, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void h(String str, String str2, String str3) {
        Bundle i2 = i(HttpUrl.FRAGMENT_ENCODE_SET);
        i2.putString("2_result", LoginClient.Result.b.ERROR.d());
        i2.putString("5_error_message", str2);
        i2.putString("3_method", str3);
        this.a.i(str, i2);
    }
}
