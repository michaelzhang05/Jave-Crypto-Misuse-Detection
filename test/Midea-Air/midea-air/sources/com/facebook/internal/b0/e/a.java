package com.facebook.internal.b0.e;

import android.os.Bundle;
import cm.aptoide.pt.BuildConfig;
import cm.aptoide.pt.database.room.RoomNotification;
import com.facebook.GraphRequest;
import com.facebook.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Monitor.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9131c;
    private static final Random a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private static Integer f9130b = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static final com.facebook.internal.b0.c f9132d = b.e(c.c(), d.b());

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Integer> f9133e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Monitor.java */
    /* renamed from: com.facebook.internal.b0.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0135a implements Runnable {
        RunnableC0135a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                JSONObject b2 = a.b();
                if (b2 != null) {
                    a.d(b2);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a() {
        if (f9131c) {
            return;
        }
        f9131c = true;
        c();
        f9132d.a();
    }

    static JSONObject b() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "monitoring_config");
        GraphRequest J = GraphRequest.J(null, f.f(), null);
        J.b0(true);
        J.a0(bundle);
        return J.g().h();
    }

    protected static void c() {
        f.m().execute(new RunnableC0135a());
    }

    static void d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("monitoring_config").getJSONArray("sample_rates");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString(RoomNotification.KEY);
                int i3 = jSONObject2.getInt("value");
                if (BuildConfig.APTOIDE_THEME.equals(string)) {
                    f9130b = Integer.valueOf(i3);
                } else {
                    f9133e.put(string, Integer.valueOf(i3));
                }
            }
        } catch (JSONException unused) {
        }
    }
}
