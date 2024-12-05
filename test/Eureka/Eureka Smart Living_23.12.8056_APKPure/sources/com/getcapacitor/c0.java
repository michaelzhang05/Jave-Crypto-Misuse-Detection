package com.getcapacitor;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    private String f4277b;

    /* renamed from: e, reason: collision with root package name */
    private String[] f4280e;

    /* renamed from: f, reason: collision with root package name */
    private String f4281f;

    /* renamed from: g, reason: collision with root package name */
    private String f4282g;

    /* renamed from: h, reason: collision with root package name */
    private String f4283h;

    /* renamed from: q, reason: collision with root package name */
    private String f4292q;

    /* renamed from: r, reason: collision with root package name */
    private String f4293r;

    /* renamed from: a, reason: collision with root package name */
    private boolean f4276a = true;

    /* renamed from: c, reason: collision with root package name */
    private String f4278c = "localhost";

    /* renamed from: d, reason: collision with root package name */
    private String f4279d = "http";

    /* renamed from: i, reason: collision with root package name */
    private boolean f4284i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4285j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4286k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4287l = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4288m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4289n = false;

    /* renamed from: o, reason: collision with root package name */
    private int f4290o = 60;

    /* renamed from: p, reason: collision with root package name */
    private int f4291p = 10;

    /* renamed from: s, reason: collision with root package name */
    private Map f4294s = null;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f4295t = new JSONObject();

    private c0() {
    }

    private void a(Context context) {
        boolean z5 = (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
        this.f4276a = a1.c.b(this.f4295t, "server.html5mode", this.f4276a);
        this.f4277b = a1.c.g(this.f4295t, "server.url", null);
        this.f4278c = a1.c.g(this.f4295t, "server.hostname", this.f4278c);
        this.f4292q = a1.c.g(this.f4295t, "server.errorPath", null);
        String g6 = a1.c.g(this.f4295t, "server.androidScheme", this.f4279d);
        if (x(g6)) {
            this.f4279d = g6;
        }
        this.f4280e = a1.c.a(this.f4295t, "server.allowNavigation", null);
        JSONObject jSONObject = this.f4295t;
        this.f4281f = a1.c.g(jSONObject, "android.overrideUserAgent", a1.c.g(jSONObject, "overrideUserAgent", null));
        JSONObject jSONObject2 = this.f4295t;
        this.f4282g = a1.c.g(jSONObject2, "android.appendUserAgent", a1.c.g(jSONObject2, "appendUserAgent", null));
        JSONObject jSONObject3 = this.f4295t;
        this.f4283h = a1.c.g(jSONObject3, "android.backgroundColor", a1.c.g(jSONObject3, "backgroundColor", null));
        JSONObject jSONObject4 = this.f4295t;
        this.f4284i = a1.c.b(jSONObject4, "android.allowMixedContent", a1.c.b(jSONObject4, "allowMixedContent", this.f4284i));
        this.f4290o = a1.c.e(this.f4295t, "android.minWebViewVersion", 60);
        this.f4291p = a1.c.e(this.f4295t, "android.minHuaweiWebViewVersion", 10);
        this.f4285j = a1.c.b(this.f4295t, "android.captureInput", this.f4285j);
        this.f4289n = a1.c.b(this.f4295t, "android.useLegacyBridge", this.f4289n);
        this.f4286k = a1.c.b(this.f4295t, "android.webContentsDebuggingEnabled", z5);
        JSONObject jSONObject5 = this.f4295t;
        String lowerCase = a1.c.g(jSONObject5, "android.loggingBehavior", a1.c.g(jSONObject5, "loggingBehavior", "debug")).toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        if (lowerCase.equals(NetworkManager.TYPE_NONE)) {
            this.f4287l = false;
        } else if (lowerCase.equals("production")) {
            this.f4287l = true;
        } else {
            this.f4287l = z5;
        }
        this.f4288m = a1.c.b(this.f4295t, "android.initialFocus", this.f4288m);
        this.f4294s = b(a1.c.f(this.f4295t, "plugins"));
    }

    private static Map b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, new w0(jSONObject.getJSONObject(next)));
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        return hashMap;
    }

    private void v(AssetManager assetManager, String str) {
        String str2;
        if (str == null) {
            str = "";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        try {
            this.f4295t = new JSONObject(d0.k(assetManager, str + "capacitor.config.json"));
        } catch (IOException e6) {
            e = e6;
            str2 = "Unable to load capacitor.config.json. Run npx cap copy first";
            l0.e(str2, e);
        } catch (JSONException e7) {
            e = e7;
            str2 = "Unable to parse capacitor.config.json. Make sure it's valid json";
            l0.e(str2, e);
        }
    }

    public static c0 w(Context context) {
        c0 c0Var = new c0();
        if (context == null) {
            l0.c("Capacitor Config could not be created from file. Context must not be null.");
            return c0Var;
        }
        c0Var.v(context.getAssets(), null);
        c0Var.a(context);
        return c0Var;
    }

    private boolean x(String str) {
        if (!Arrays.asList("file", "ftp", "ftps", "ws", "wss", "about", "blob", "data").contains(str)) {
            return true;
        }
        l0.n(str + " is not an allowed scheme.  Defaulting to http.");
        return false;
    }

    public String[] c() {
        return this.f4280e;
    }

    public String d() {
        return this.f4279d;
    }

    public String e() {
        return this.f4282g;
    }

    public String f() {
        return this.f4283h;
    }

    public String g() {
        return this.f4292q;
    }

    public String h() {
        return this.f4278c;
    }

    public int i() {
        int i6 = this.f4291p;
        if (i6 >= 10) {
            return i6;
        }
        l0.n("Specified minimum Huawei webview version is too low, defaulting to 10");
        return 10;
    }

    public int j() {
        int i6 = this.f4290o;
        if (i6 >= 55) {
            return i6;
        }
        l0.n("Specified minimum webview version is too low, defaulting to 55");
        return 55;
    }

    public String k() {
        return this.f4281f;
    }

    public w0 l(String str) {
        w0 w0Var = (w0) this.f4294s.get(str);
        return w0Var == null ? new w0(new JSONObject()) : w0Var;
    }

    public String m() {
        return this.f4277b;
    }

    public String n() {
        return this.f4293r;
    }

    public boolean o() {
        return this.f4276a;
    }

    public boolean p() {
        return this.f4288m;
    }

    public boolean q() {
        return this.f4285j;
    }

    public boolean r() {
        return this.f4287l;
    }

    public boolean s() {
        return this.f4284i;
    }

    public boolean t() {
        return this.f4289n;
    }

    public boolean u() {
        return this.f4286k;
    }
}
