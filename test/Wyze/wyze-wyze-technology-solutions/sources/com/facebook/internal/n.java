package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.internal.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.java */
/* loaded from: classes.dex */
public final class n {
    private static final String a = "n";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9187b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, m> f9188c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<d> f9189d = new AtomicReference<>(d.NOT_LOADED);

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<e> f9190e = new ConcurrentLinkedQueue<>();

    /* renamed from: f, reason: collision with root package name */
    private static boolean f9191f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f9192g = false;

    /* renamed from: h, reason: collision with root package name */
    private static JSONArray f9193h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f9194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9195g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9196h;

        a(Context context, String str, String str2) {
            this.f9194f = context;
            this.f9195g = str;
            this.f9196h = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f9194f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                m mVar = null;
                String string = sharedPreferences.getString(this.f9195g, null);
                if (!x.Q(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        x.U("FacebookSDK", e2);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        mVar = n.l(this.f9196h, jSONObject);
                    }
                }
                JSONObject i2 = n.i(this.f9196h);
                if (i2 != null) {
                    n.l(this.f9196h, i2);
                    sharedPreferences.edit().putString(this.f9195g, i2.toString()).apply();
                }
                if (mVar != null) {
                    String i3 = mVar.i();
                    if (!n.f9191f && i3 != null && i3.length() > 0) {
                        boolean unused = n.f9191f = true;
                        Log.w(n.a, i3);
                    }
                }
                l.m(this.f9196h, true);
                com.facebook.t.u.d.d();
                com.facebook.t.u.h.h();
                n.f9189d.set(n.f9188c.containsKey(this.f9196h) ? d.SUCCESS : d.ERROR);
                n.n();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f9197f;

        b(e eVar) {
            this.f9197f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                this.f9197f.onError();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f9198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m f9199g;

        c(e eVar, m mVar) {
            this.f9198f = eVar;
            this.f9199g = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                this.f9198f.a(this.f9199g);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.java */
    /* loaded from: classes.dex */
    public enum d {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: FetchedAppSettingsManager.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(m mVar);

        void onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f9187b))));
        GraphRequest J = GraphRequest.J(null, str, null);
        J.b0(true);
        J.a0(bundle);
        return J.g().h();
    }

    public static m j(String str) {
        if (str != null) {
            return f9188c.get(str);
        }
        return null;
    }

    public static void k() {
        Context e2 = com.facebook.f.e();
        String f2 = com.facebook.f.f();
        if (x.Q(f2)) {
            f9189d.set(d.ERROR);
            n();
            return;
        }
        if (f9188c.containsKey(f2)) {
            f9189d.set(d.SUCCESS);
            n();
            return;
        }
        AtomicReference<d> atomicReference = f9189d;
        d dVar = d.NOT_LOADED;
        d dVar2 = d.LOADING;
        if (!(atomicReference.compareAndSet(dVar, dVar2) || atomicReference.compareAndSet(d.ERROR, dVar2))) {
            n();
        } else {
            com.facebook.f.m().execute(new a(e2, String.format("com.facebook.internal.APP_SETTINGS.%s", f2), f2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m l(String str, JSONObject jSONObject) {
        h b2;
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            b2 = h.c();
        } else {
            b2 = h.b(optJSONArray);
        }
        h hVar = b2;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f9193h = optJSONArray2;
        if (optJSONArray2 != null && p.b()) {
            com.facebook.t.r.g.e.b(optJSONArray2.toString());
        }
        m mVar = new m(jSONObject.optBoolean("supports_implicit_sdk_logging", false), jSONObject.optString("gdpv4_nux_content", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optBoolean("gdpv4_nux_enabled", false), jSONObject.optInt("app_events_session_timeout", com.facebook.t.u.e.a()), w.f(jSONObject.optLong("seamless_login")), m(jSONObject.optJSONObject("android_dialog_configs")), z, hVar, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject.optString("sdk_update_message"), z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f9188c.put(str, mVar);
        return mVar;
    }

    private static Map<String, Map<String, m.a>> m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                m.a c2 = m.a.c(optJSONArray.optJSONObject(i2));
                if (c2 != null) {
                    String a2 = c2.a();
                    Map map = (Map) hashMap.get(a2);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a2, map);
                    }
                    map.put(c2.b(), c2);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void n() {
        synchronized (n.class) {
            d dVar = f9189d.get();
            if (!d.NOT_LOADED.equals(dVar) && !d.LOADING.equals(dVar)) {
                m mVar = f9188c.get(com.facebook.f.f());
                Handler handler = new Handler(Looper.getMainLooper());
                if (d.ERROR.equals(dVar)) {
                    while (true) {
                        ConcurrentLinkedQueue<e> concurrentLinkedQueue = f9190e;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        } else {
                            handler.post(new b(concurrentLinkedQueue.poll()));
                        }
                    }
                } else {
                    while (true) {
                        ConcurrentLinkedQueue<e> concurrentLinkedQueue2 = f9190e;
                        if (concurrentLinkedQueue2.isEmpty()) {
                            return;
                        } else {
                            handler.post(new c(concurrentLinkedQueue2.poll(), mVar));
                        }
                    }
                }
            }
        }
    }

    public static m o(String str, boolean z) {
        if (!z) {
            Map<String, m> map = f9188c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject i2 = i(str);
        if (i2 == null) {
            return null;
        }
        m l = l(str, i2);
        if (str.equals(com.facebook.f.f())) {
            f9189d.set(d.SUCCESS);
            n();
        }
        return l;
    }
}
