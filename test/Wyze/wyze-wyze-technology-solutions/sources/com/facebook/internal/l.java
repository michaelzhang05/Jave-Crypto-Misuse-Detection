package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.pt.database.room.RoomNotification;
import com.facebook.GraphRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager.java */
/* loaded from: classes.dex */
public final class l {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<c> f9167b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, JSONObject> f9168c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static Long f9169d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppGateKeepersManager.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9170f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f9171g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9172h;

        a(String str, Context context, String str2) {
            this.f9170f = str;
            this.f9171g = context;
            this.f9172h = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                JSONObject f2 = l.f(this.f9170f);
                if (f2 != null) {
                    l.k(this.f9170f, f2);
                    this.f9171g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f9172h, f2.toString()).apply();
                    Long unused = l.f9169d = Long.valueOf(System.currentTimeMillis());
                }
                l.l();
                l.a.set(false);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppGateKeepersManager.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f9173f;

        b(c cVar) {
            this.f9173f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                this.f9173f.onCompleted();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: FetchedAppGateKeepersManager.java */
    /* loaded from: classes.dex */
    public interface c {
        void onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", com.facebook.f.t());
        bundle.putString("fields", "gatekeepers");
        GraphRequest J = GraphRequest.J(null, String.format("%s/%s", str, "mobile_sdk_gk"), null);
        J.b0(true);
        J.a0(bundle);
        return J.g().h();
    }

    public static boolean g(String str, String str2, boolean z) {
        i();
        if (str2 != null) {
            Map<String, JSONObject> map = f9168c;
            if (map.containsKey(str2)) {
                return map.get(str2).optBoolean(str, z);
            }
        }
        return z;
    }

    private static boolean h(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    static void i() {
        j(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void j(c cVar) {
        synchronized (l.class) {
            if (cVar != null) {
                f9167b.add(cVar);
            }
            if (h(f9169d)) {
                l();
                return;
            }
            Context e2 = com.facebook.f.e();
            String f2 = com.facebook.f.f();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", f2);
            if (e2 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = e2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!x.Q(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e3) {
                    x.U("FacebookSDK", e3);
                }
                if (jSONObject != null) {
                    k(f2, jSONObject);
                }
            }
            Executor m = com.facebook.f.m();
            if (m == null) {
                return;
            }
            if (a.compareAndSet(false, true)) {
                m.execute(new a(f2, e2, format));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized JSONObject k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (l.class) {
            Map<String, JSONObject> map = f9168c;
            if (map.containsKey(str)) {
                jSONObject2 = map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
            if (optJSONObject != null && optJSONObject.optJSONArray("gatekeepers") != null) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                        jSONObject2.put(jSONObject3.getString(RoomNotification.KEY), jSONObject3.getBoolean("value"));
                    } catch (JSONException e2) {
                        x.U("FacebookSDK", e2);
                    }
                }
            }
            f9168c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = f9167b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            c poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new b(poll));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject m(String str, boolean z) {
        if (!z) {
            Map<String, JSONObject> map = f9168c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject f2 = f(str);
        if (f2 == null) {
            return null;
        }
        com.facebook.f.e().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str), f2.toString()).apply();
        return k(str, f2);
    }
}
