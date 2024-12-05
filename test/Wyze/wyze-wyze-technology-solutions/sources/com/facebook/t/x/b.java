package com.facebook.t.x;

import android.content.SharedPreferences;
import android.view.View;
import cm.aptoide.pt.root.execution.Command;
import com.facebook.internal.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PredictionHistoryManager.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f9681b;
    private static final Map<String, String> a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f9682c = new AtomicBoolean(false);

    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            if (!f9682c.get()) {
                c();
            }
            Map<String, String> map = a;
            map.put(str, str2);
            f9681b.edit().putString("SUGGESTED_EVENTS_HISTORY", x.X(map)).apply();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(View view, String str) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Command.CommandHandler.TEXT, str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = com.facebook.t.r.g.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return x.q0(jSONObject.toString());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    private static void c() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f9682c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = com.facebook.f.e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            f9681b = sharedPreferences;
            a.putAll(x.a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", HttpUrl.FRAGMENT_ENCODE_SET)));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            Map<String, String> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }
}
